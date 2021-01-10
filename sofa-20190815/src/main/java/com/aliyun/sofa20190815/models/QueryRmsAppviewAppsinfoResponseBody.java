// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAppviewAppsinfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsAppviewAppsinfoResponseBodyResponse response;

    public static QueryRmsAppviewAppsinfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAppviewAppsinfoResponseBody self = new QueryRmsAppviewAppsinfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsAppviewAppsinfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsAppviewAppsinfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsAppviewAppsinfoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsAppviewAppsinfoResponseBody setResponse(QueryRmsAppviewAppsinfoResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsAppviewAppsinfoResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsAppviewAppsinfoResponseBodyResponseEntityData extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("UtcCreated")
        public String utcCreated;

        @NameInMap("UtcModified")
        public String utcModified;

        public static QueryRmsAppviewAppsinfoResponseBodyResponseEntityData build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAppviewAppsinfoResponseBodyResponseEntityData self = new QueryRmsAppviewAppsinfoResponseBodyResponseEntityData();
            return TeaModel.build(map, self);
        }

        public QueryRmsAppviewAppsinfoResponseBodyResponseEntityData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryRmsAppviewAppsinfoResponseBodyResponseEntityData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryRmsAppviewAppsinfoResponseBodyResponseEntityData setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

        public QueryRmsAppviewAppsinfoResponseBodyResponseEntityData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryRmsAppviewAppsinfoResponseBodyResponseEntity extends TeaModel {
        @NameInMap("Data")
        public java.util.List<QueryRmsAppviewAppsinfoResponseBodyResponseEntityData> data;

        public static QueryRmsAppviewAppsinfoResponseBodyResponseEntity build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAppviewAppsinfoResponseBodyResponseEntity self = new QueryRmsAppviewAppsinfoResponseBodyResponseEntity();
            return TeaModel.build(map, self);
        }

        public QueryRmsAppviewAppsinfoResponseBodyResponseEntity setData(java.util.List<QueryRmsAppviewAppsinfoResponseBodyResponseEntityData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryRmsAppviewAppsinfoResponseBodyResponseEntityData> getData() {
            return this.data;
        }

    }

    public static class QueryRmsAppviewAppsinfoResponseBodyResponse extends TeaModel {
        @NameInMap("Entity")
        public QueryRmsAppviewAppsinfoResponseBodyResponseEntity entity;

        public static QueryRmsAppviewAppsinfoResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAppviewAppsinfoResponseBodyResponse self = new QueryRmsAppviewAppsinfoResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsAppviewAppsinfoResponseBodyResponse setEntity(QueryRmsAppviewAppsinfoResponseBodyResponseEntity entity) {
            this.entity = entity;
            return this;
        }
        public QueryRmsAppviewAppsinfoResponseBodyResponseEntity getEntity() {
            return this.entity;
        }

    }

}
