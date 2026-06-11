// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class QueryProfileResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryProfileResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryProfileResponseBody self = new QueryProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryProfileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryProfileResponseBody setData(QueryProfileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryProfileResponseBodyData getData() {
        return this.data;
    }

    public QueryProfileResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryProfileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProfileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryProfileResponseBodyDataAttributes extends TeaModel {
        @NameInMap("AttributeId")
        public String attributeId;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("Immutable")
        public String immutable;

        @NameInMap("Name")
        public String name;

        public static QueryProfileResponseBodyDataAttributes build(java.util.Map<String, ?> map) throws Exception {
            QueryProfileResponseBodyDataAttributes self = new QueryProfileResponseBodyDataAttributes();
            return TeaModel.build(map, self);
        }

        public QueryProfileResponseBodyDataAttributes setAttributeId(String attributeId) {
            this.attributeId = attributeId;
            return this;
        }
        public String getAttributeId() {
            return this.attributeId;
        }

        public QueryProfileResponseBodyDataAttributes setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public QueryProfileResponseBodyDataAttributes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryProfileResponseBodyDataAttributes setImmutable(String immutable) {
            this.immutable = immutable;
            return this;
        }
        public String getImmutable() {
            return this.immutable;
        }

        public QueryProfileResponseBodyDataAttributes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryProfileResponseBodyData extends TeaModel {
        @NameInMap("Attributes")
        public java.util.List<QueryProfileResponseBodyDataAttributes> attributes;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("SchemaId")
        public String schemaId;

        public static QueryProfileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryProfileResponseBodyData self = new QueryProfileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryProfileResponseBodyData setAttributes(java.util.List<QueryProfileResponseBodyDataAttributes> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<QueryProfileResponseBodyDataAttributes> getAttributes() {
            return this.attributes;
        }

        public QueryProfileResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryProfileResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryProfileResponseBodyData setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

}
