// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetInventorySchemaResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("Schemas")
    public java.util.List<GetInventorySchemaResponseBodySchemas> schemas;

    public static GetInventorySchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInventorySchemaResponseBody self = new GetInventorySchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInventorySchemaResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetInventorySchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInventorySchemaResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public GetInventorySchemaResponseBody setSchemas(java.util.List<GetInventorySchemaResponseBodySchemas> schemas) {
        this.schemas = schemas;
        return this;
    }
    public java.util.List<GetInventorySchemaResponseBodySchemas> getSchemas() {
        return this.schemas;
    }

    public static class GetInventorySchemaResponseBodySchemasAttributes extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("DataType")
        public String dataType;

        public static GetInventorySchemaResponseBodySchemasAttributes build(java.util.Map<String, ?> map) throws Exception {
            GetInventorySchemaResponseBodySchemasAttributes self = new GetInventorySchemaResponseBodySchemasAttributes();
            return TeaModel.build(map, self);
        }

        public GetInventorySchemaResponseBodySchemasAttributes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInventorySchemaResponseBodySchemasAttributes setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

    }

    public static class GetInventorySchemaResponseBodySchemas extends TeaModel {
        @NameInMap("Version")
        public String version;

        @NameInMap("TypeName")
        public String typeName;

        @NameInMap("Attributes")
        public java.util.List<GetInventorySchemaResponseBodySchemasAttributes> attributes;

        public static GetInventorySchemaResponseBodySchemas build(java.util.Map<String, ?> map) throws Exception {
            GetInventorySchemaResponseBodySchemas self = new GetInventorySchemaResponseBodySchemas();
            return TeaModel.build(map, self);
        }

        public GetInventorySchemaResponseBodySchemas setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetInventorySchemaResponseBodySchemas setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

        public GetInventorySchemaResponseBodySchemas setAttributes(java.util.List<GetInventorySchemaResponseBodySchemasAttributes> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<GetInventorySchemaResponseBodySchemasAttributes> getAttributes() {
            return this.attributes;
        }

    }

}
