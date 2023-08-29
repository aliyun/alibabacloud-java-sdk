// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetDatasourceTableResponseBody extends TeaModel {
    @NameInMap("Fields")
    public java.util.List<GetDatasourceTableResponseBodyFields> fields;

    @NameInMap("RequestId")
    public String requestId;

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

        @NameInMap("Name")
        public String name;

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
