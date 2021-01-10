// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsUsersResponseBodyResponse response;

    public static QueryRmsUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsUsersResponseBody self = new QueryRmsUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsUsersResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsUsersResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsUsersResponseBody setResponse(QueryRmsUsersResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsUsersResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsUsersResponseBodyResponseEntitiesEntity extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("MsgType")
        public String msgType;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("UserNumber")
        public String userNumber;

        public static QueryRmsUsersResponseBodyResponseEntitiesEntity build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsUsersResponseBodyResponseEntitiesEntity self = new QueryRmsUsersResponseBodyResponseEntitiesEntity();
            return TeaModel.build(map, self);
        }

        public QueryRmsUsersResponseBodyResponseEntitiesEntity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryRmsUsersResponseBodyResponseEntitiesEntity setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public QueryRmsUsersResponseBodyResponseEntitiesEntity setMsgType(String msgType) {
            this.msgType = msgType;
            return this;
        }
        public String getMsgType() {
            return this.msgType;
        }

        public QueryRmsUsersResponseBodyResponseEntitiesEntity setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QueryRmsUsersResponseBodyResponseEntitiesEntity setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public QueryRmsUsersResponseBodyResponseEntitiesEntity setUserNumber(String userNumber) {
            this.userNumber = userNumber;
            return this;
        }
        public String getUserNumber() {
            return this.userNumber;
        }

    }

    public static class QueryRmsUsersResponseBodyResponseEntities extends TeaModel {
        @NameInMap("Layer")
        public String layer;

        @NameInMap("Entity")
        public QueryRmsUsersResponseBodyResponseEntitiesEntity entity;

        public static QueryRmsUsersResponseBodyResponseEntities build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsUsersResponseBodyResponseEntities self = new QueryRmsUsersResponseBodyResponseEntities();
            return TeaModel.build(map, self);
        }

        public QueryRmsUsersResponseBodyResponseEntities setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public QueryRmsUsersResponseBodyResponseEntities setEntity(QueryRmsUsersResponseBodyResponseEntitiesEntity entity) {
            this.entity = entity;
            return this;
        }
        public QueryRmsUsersResponseBodyResponseEntitiesEntity getEntity() {
            return this.entity;
        }

    }

    public static class QueryRmsUsersResponseBodyResponseEntitieTests extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("MsgType")
        public String msgType;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("UserNumber")
        public String userNumber;

        public static QueryRmsUsersResponseBodyResponseEntitieTests build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsUsersResponseBodyResponseEntitieTests self = new QueryRmsUsersResponseBodyResponseEntitieTests();
            return TeaModel.build(map, self);
        }

        public QueryRmsUsersResponseBodyResponseEntitieTests setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryRmsUsersResponseBodyResponseEntitieTests setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public QueryRmsUsersResponseBodyResponseEntitieTests setMsgType(String msgType) {
            this.msgType = msgType;
            return this;
        }
        public String getMsgType() {
            return this.msgType;
        }

        public QueryRmsUsersResponseBodyResponseEntitieTests setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QueryRmsUsersResponseBodyResponseEntitieTests setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public QueryRmsUsersResponseBodyResponseEntitieTests setUserNumber(String userNumber) {
            this.userNumber = userNumber;
            return this;
        }
        public String getUserNumber() {
            return this.userNumber;
        }

    }

    public static class QueryRmsUsersResponseBodyResponseMeta extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryRmsUsersResponseBodyResponseMeta build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsUsersResponseBodyResponseMeta self = new QueryRmsUsersResponseBodyResponseMeta();
            return TeaModel.build(map, self);
        }

        public QueryRmsUsersResponseBodyResponseMeta setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryRmsUsersResponseBodyResponseMeta setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryRmsUsersResponseBodyResponse extends TeaModel {
        @NameInMap("Entities")
        public java.util.List<QueryRmsUsersResponseBodyResponseEntities> entities;

        @NameInMap("EntitieTests")
        public java.util.List<QueryRmsUsersResponseBodyResponseEntitieTests> entitieTests;

        @NameInMap("Meta")
        public java.util.List<QueryRmsUsersResponseBodyResponseMeta> meta;

        public static QueryRmsUsersResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsUsersResponseBodyResponse self = new QueryRmsUsersResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsUsersResponseBodyResponse setEntities(java.util.List<QueryRmsUsersResponseBodyResponseEntities> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<QueryRmsUsersResponseBodyResponseEntities> getEntities() {
            return this.entities;
        }

        public QueryRmsUsersResponseBodyResponse setEntitieTests(java.util.List<QueryRmsUsersResponseBodyResponseEntitieTests> entitieTests) {
            this.entitieTests = entitieTests;
            return this;
        }
        public java.util.List<QueryRmsUsersResponseBodyResponseEntitieTests> getEntitieTests() {
            return this.entitieTests;
        }

        public QueryRmsUsersResponseBodyResponse setMeta(java.util.List<QueryRmsUsersResponseBodyResponseMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<QueryRmsUsersResponseBodyResponseMeta> getMeta() {
            return this.meta;
        }

    }

}
