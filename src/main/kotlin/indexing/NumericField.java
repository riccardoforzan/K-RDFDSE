package indexing;

import org.apache.lucene.document.Field;
import org.apache.lucene.document.FieldType;
import org.apache.lucene.index.IndexOptions;

public class NumericField extends Field {
    private static final FieldType type = new FieldType();

    static {
        type.setIndexOptions(IndexOptions.DOCS);
        type.setStored(true);
    }

    public NumericField(final String key, final String value) {
        super(key, value, type);
    }
}
