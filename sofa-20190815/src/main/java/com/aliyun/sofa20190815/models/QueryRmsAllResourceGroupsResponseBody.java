// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAllResourceGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsAllResourceGroupsResponseBodyResponse response;

    public static QueryRmsAllResourceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAllResourceGroupsResponseBody self = new QueryRmsAllResourceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsAllResourceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsAllResourceGroupsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsAllResourceGroupsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsAllResourceGroupsResponseBody setResponse(QueryRmsAllResourceGroupsResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsAllResourceGroupsResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsAllResourceGroupsResponseBodyResponseEntitiesEntity extends TeaModel {
        @NameInMap("ResId")
        public String resId;

        @NameInMap("ResName")
        public String resName;

        public static QueryRmsAllResourceGroupsResponseBodyResponseEntitiesEntity build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAllResourceGroupsResponseBodyResponseEntitiesEntity self = new QueryRmsAllResourceGroupsResponseBodyResponseEntitiesEntity();
            return TeaModel.build(map, self);
        }

        public QueryRmsAllResourceGroupsResponseBodyResponseEntitiesEntity setResId(String resId) {
            this.resId = resId;
            return this;
        }
        public String getResId() {
            return this.resId;
        }

        public QueryRmsAllResourceGroupsResponseBodyResponseEntitiesEntity setResName(String resName) {
            this.resName = resName;
            return this;
        }
        public String getResName() {
            return this.resName;
        }

    }

    public static class QueryRmsAllResourceGroupsResponseBodyResponseEntities extends TeaModel {
        @NameInMap("Entity")
        public QueryRmsAllResourceGroupsResponseBodyResponseEntitiesEntity entity;

        public static QueryRmsAllResourceGroupsResponseBodyResponseEntities build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAllResourceGroupsResponseBodyResponseEntities self = new QueryRmsAllResourceGroupsResponseBodyResponseEntities();
            return TeaModel.build(map, self);
        }

        public QueryRmsAllResourceGroupsResponseBodyResponseEntities setEntity(QueryRmsAllResourceGroupsResponseBodyResponseEntitiesEntity entity) {
            this.entity = entity;
            return this;
        }
        public QueryRmsAllResourceGroupsResponseBodyResponseEntitiesEntity getEntity() {
            return this.entity;
        }

    }

    public static class QueryRmsAllResourceGroupsResponseBodyResponseMeta extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryRmsAllResourceGroupsResponseBodyResponseMeta build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAllResourceGroupsResponseBodyResponseMeta self = new QueryRmsAllResourceGroupsResponseBodyResponseMeta();
            return TeaModel.build(map, self);
        }

        public QueryRmsAllResourceGroupsResponseBodyResponseMeta setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryRmsAllResourceGroupsResponseBodyResponseMeta setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryRmsAllResourceGroupsResponseBodyResponse extends TeaModel {
        @NameInMap("ErrCode")
        public String errCode;

        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("ErrResolution")
        public String errResolution;

        @NameInMap("Entities")
        public java.util.List<QueryRmsAllResourceGroupsResponseBodyResponseEntities> entities;

        @NameInMap("Meta")
        public java.util.List<QueryRmsAllResourceGroupsResponseBodyResponseMeta> meta;

        public static QueryRmsAllResourceGroupsResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAllResourceGroupsResponseBodyResponse self = new QueryRmsAllResourceGroupsResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsAllResourceGroupsResponseBodyResponse setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public QueryRmsAllResourceGroupsResponseBodyResponse setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public QueryRmsAllResourceGroupsResponseBodyResponse setErrResolution(String errResolution) {
            this.errResolution = errResolution;
            return this;
        }
        public String getErrResolution() {
            return this.errResolution;
        }

        public QueryRmsAllResourceGroupsResponseBodyResponse setEntities(java.util.List<QueryRmsAllResourceGroupsResponseBodyResponseEntities> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<QueryRmsAllResourceGroupsResponseBodyResponseEntities> getEntities() {
            return this.entities;
        }

        public QueryRmsAllResourceGroupsResponseBodyResponse setMeta(java.util.List<QueryRmsAllResourceGroupsResponseBodyResponseMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<QueryRmsAllResourceGroupsResponseBodyResponseMeta> getMeta() {
            return this.meta;
        }

    }

}
