// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class QueryUserProfileResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryUserProfileResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

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

        @NameInMap("Description")
        public String description;

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
