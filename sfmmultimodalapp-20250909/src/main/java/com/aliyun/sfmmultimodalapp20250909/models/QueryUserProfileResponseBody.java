// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class QueryUserProfileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryUserProfileResponseBodyData data;

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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BE6BCB9B-7D90-5A56-96C8-A5E990D85B21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryUserProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUserProfileResponseBody self = new QueryUserProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUserProfileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUserProfileResponseBody setData(QueryUserProfileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryUserProfileResponseBodyData getData() {
        return this.data;
    }

    public QueryUserProfileResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryUserProfileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUserProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUserProfileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryUserProfileResponseBodyDataAttributes extends TeaModel {
        /**
         * <p>id</p>
         * 
         * <strong>example:</strong>
         * <p>babadd60b9e74d4f9d12cdf954f2c667</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("Value")
        public String value;

        public static QueryUserProfileResponseBodyDataAttributes build(java.util.Map<String, ?> map) throws Exception {
            QueryUserProfileResponseBodyDataAttributes self = new QueryUserProfileResponseBodyDataAttributes();
            return TeaModel.build(map, self);
        }

        public QueryUserProfileResponseBodyDataAttributes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryUserProfileResponseBodyDataAttributes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryUserProfileResponseBodyDataAttributes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryUserProfileResponseBodyData extends TeaModel {
        @NameInMap("Attributes")
        public java.util.List<QueryUserProfileResponseBodyDataAttributes> attributes;

        /**
         * <strong>example:</strong>
         * <p>project name pass the check</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>cert-15192707</p>
         */
        @NameInMap("Name")
        public String name;

        public static QueryUserProfileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryUserProfileResponseBodyData self = new QueryUserProfileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryUserProfileResponseBodyData setAttributes(java.util.List<QueryUserProfileResponseBodyDataAttributes> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<QueryUserProfileResponseBodyDataAttributes> getAttributes() {
            return this.attributes;
        }

        public QueryUserProfileResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryUserProfileResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
