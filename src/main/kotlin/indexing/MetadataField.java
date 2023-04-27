package indexing;

import org.apache.lucene.document.Field;
import org.apache.lucene.document.FieldType;
import org.apache.lucene.index.IndexOptions;

public class MetadataField extends Field {

    private static final FieldType type = new FieldType();

    static {
        type.setIndexOptions(IndexOptions.DOCS_AND_FREQS_AND_POSITIONS_AND_OFFSETS);
        type.setTokenized(true);
        type.setStored(false);
        type.setStoreTermVectors(true);
    }

    public MetadataField(final String key, final String value) {
        super(key, value, type);
    }
}
