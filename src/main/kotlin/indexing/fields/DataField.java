package indexing.fields;

import org.apache.lucene.document.Field;
import org.apache.lucene.document.FieldType;
import org.apache.lucene.index.IndexOptions;

public class DataField extends Field {

    private static final FieldType type = new FieldType();

    /**
     * @see <a href="https://lucene.apache.org/core/9_5_0/core/org/apache/lucene/index/IndexableFieldType.html">Lucene IndexableFieldType</a>
     */

    static {
        type.setStored(false);
        type.setTokenized(true);
        type.setStoreTermVectors(false);
        type.setStoreTermVectorPositions(false);
        type.setIndexOptions(IndexOptions.DOCS);
    }

    public DataField(final String key, final String value) {
        super(key, value, type);
    }
}