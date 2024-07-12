// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetDatasourceTableResponseBody extends TeaModel {
    @NameInMap("Fields")
    public java.util.List<GetDatasourceTableResponseBodyFields> fields;

    /**
     * <strong>example:</strong>
     * <p>D7B2F8C4-49C7-5CFA-8075-9D715A114873</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
        @NameInMap("Attributes")
        public java.util.List<String> attributes;

        /**
         * <strong>example:</strong>
         * <p>field1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
