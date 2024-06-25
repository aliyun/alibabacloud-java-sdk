// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetInstanceResourceTableResponseBody extends TeaModel {
    @NameInMap("Fields")
    public java.util.List<GetInstanceResourceTableResponseBodyFields> fields;

    /**
     * <strong>example:</strong>
     * <p>74D958EF-3598-56FA-8296-FF1575CE43DF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>test_table</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static GetInstanceResourceTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResourceTableResponseBody self = new GetInstanceResourceTableResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResourceTableResponseBody setFields(java.util.List<GetInstanceResourceTableResponseBodyFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<GetInstanceResourceTableResponseBodyFields> getFields() {
        return this.fields;
    }

    public GetInstanceResourceTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceResourceTableResponseBody setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public static class GetInstanceResourceTableResponseBodyFields extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDimensionField")
        public Boolean isDimensionField;

        @NameInMap("IsPartitionField")
        public Boolean isPartitionField;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Meaning")
        public String meaning;

        /**
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>BIGINT</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetInstanceResourceTableResponseBodyFields build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResourceTableResponseBodyFields self = new GetInstanceResourceTableResponseBodyFields();
            return TeaModel.build(map, self);
        }

        public GetInstanceResourceTableResponseBodyFields setIsDimensionField(Boolean isDimensionField) {
            this.isDimensionField = isDimensionField;
            return this;
        }
        public Boolean getIsDimensionField() {
            return this.isDimensionField;
        }

        public GetInstanceResourceTableResponseBodyFields setIsPartitionField(Boolean isPartitionField) {
            this.isPartitionField = isPartitionField;
            return this;
        }
        public Boolean getIsPartitionField() {
            return this.isPartitionField;
        }

        public GetInstanceResourceTableResponseBodyFields setMeaning(String meaning) {
            this.meaning = meaning;
            return this;
        }
        public String getMeaning() {
            return this.meaning;
        }

        public GetInstanceResourceTableResponseBodyFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInstanceResourceTableResponseBodyFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
