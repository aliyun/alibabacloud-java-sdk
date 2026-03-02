// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class QueryProfileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryProfileResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EDD6123F-0122-5FBF-9A7E-097F319CF478</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>147235</p>
         */
        @NameInMap("AttributeId")
        public String attributeId;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>21D419945-01</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("Immutable")
        public String immutable;

        /**
         * <strong>example:</strong>
         * <p>20250724</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>29C606055</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>ttt</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>384dc4786b9d4f5a8cab0d83112cd5a8</p>
         */
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
