// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetDatasourceTableResponseBody extends TeaModel {
    /**
     * <p>The list of fields.</p>
     */
    @NameInMap("Fields")
    public java.util.List<GetDatasourceTableResponseBodyFields> fields;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D7B2F8C4-49C7-5CFA-8075-9D715A114873</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the data table.</p>
     * 
     * <strong>example:</strong>
     * <p>table1</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static GetDatasourceTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatasourceTableResponseBody self = new GetDatasourceTableResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatasourceTableResponseBody setFields(java.util.List<GetDatasourceTableResponseBodyFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<GetDatasourceTableResponseBodyFields> getFields() {
        return this.fields;
    }

    public GetDatasourceTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatasourceTableResponseBody setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public static class GetDatasourceTableResponseBodyFields extends TeaModel {
        /**
         * <p>The attributes of the field. Valid values:</p>
         * <p>● Partition: indicates that the field is a partition field.</p>
         * <p>● EventTime: indicates that the field is an event time field.</p>
         * <p>● PrimaryKey: indicates that the field is a primary key field.</p>
         */
        @NameInMap("Attributes")
        public java.util.List<String> attributes;

        /**
         * <p>The name of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>field1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The data type of the field. Valid values:</p>
         * <p>● INT32</p>
         * <p>● INT64</p>
         * <p>● FLOAT</p>
         * <p>● DOUBLE</p>
         * <p>● STRING</p>
         * <p>● BOOLEAN</p>
         * <p>● TIMESTAMP</p>
         * 
         * <strong>example:</strong>
         * <p>INT32</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDatasourceTableResponseBodyFields build(java.util.Map<String, ?> map) throws Exception {
            GetDatasourceTableResponseBodyFields self = new GetDatasourceTableResponseBodyFields();
            return TeaModel.build(map, self);
        }

        public GetDatasourceTableResponseBodyFields setAttributes(java.util.List<String> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<String> getAttributes() {
            return this.attributes;
        }

        public GetDatasourceTableResponseBodyFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDatasourceTableResponseBodyFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
