package onor.food.domain.dataImporter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import onor.food.domain.dataImporter.dto.IngredientDto;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class IngredientImporter {

    private final CsvSchema schema;
    private final CsvMapper mapper;

    public IngredientImporter() {
        mapper = new CsvMapper();
        mapper.configure(JsonGenerator.Feature.IGNORE_UNKNOWN, true);
        schema = CsvSchema.builder().setUseHeader(true)
                .addColumn("id")
                .addColumn("name")
                .addColumn("category")
                .addColumn("subCategory")
                .addColumn("flavor")
                .addColumn("taste")
                .addColumn("wikipediaUrl")
                .build();
    }

    public List<IngredientDto> loadIngredients(InputStream ioStream) throws IOException {
        MappingIterator<IngredientDto> iterator = mapper
                .readerFor(IngredientDto.class)
                .with(schema)
                .readValues(ioStream);
        return iterator.readAll();
    }
}
