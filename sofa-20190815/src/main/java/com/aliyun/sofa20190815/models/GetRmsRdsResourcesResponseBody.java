// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetRmsRdsResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public GetRmsRdsResourcesResponseBodyResponse response;

    public static GetRmsRdsResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRmsRdsResourcesResponseBody self = new GetRmsRdsResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRmsRdsResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRmsRdsResourcesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetRmsRdsResourcesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetRmsRdsResourcesResponseBody setResponse(GetRmsRdsResourcesResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public GetRmsRdsResourcesResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class GetRmsRdsResourcesResponseBodyResponseEntitiesData extends TeaModel {
        @NameInMap("AlertState")
        public String alertState;

        @NameInMap("Created")
        public String created;

        @NameInMap("CreatedDateTime")
        public Long createdDateTime;

        @NameInMap("DatabaseType")
        public String databaseType;

        @NameInMap("DbId")
        public String dbId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("State")
        public String state;

        @NameInMap("ItemTypeConfig")
        public java.util.List<String> itemTypeConfig;

        @NameInMap("ItemTypeNoneConfig")
        public java.util.List<String> itemTypeNoneConfig;

        public static GetRmsRdsResourcesResponseBodyResponseEntitiesData build(java.util.Map<String, ?> map) throws Exception {
            GetRmsRdsResourcesResponseBodyResponseEntitiesData self = new GetRmsRdsResourcesResponseBodyResponseEntitiesData();
            return TeaModel.build(map, self);
        }

        public GetRmsRdsResourcesResponseBodyResponseEntitiesData setAlertState(String alertState) {
            this.alertState = alertState;
            return this;
        }
        public String getAlertState() {
            return this.alertState;
        }

        public GetRmsRdsResourcesResponseBodyResponseEntitiesData setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public GetRmsRdsResourcesResponseBodyResponseEntitiesData setCreatedDateTime(Long createdDateTime) {
            this.createdDateTime = createdDateTime;
            return this;
        }
        public Long getCreatedDateTime() {
            return this.createdDateTime;
        }

        public GetRmsRdsResourcesResponseBodyResponseEntitiesData setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public GetRmsRdsResourcesResponseBodyResponseEntitiesData setDbId(String dbId) {
            this.dbId = dbId;
            return this;
        }
        public String getDbId() {
            return this.dbId;
        }

        public GetRmsRdsResourcesResponseBodyResponseEntitiesData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetRmsRdsResourcesResponseBodyResponseEntitiesData setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetRmsRdsResourcesResponseBodyResponseEntitiesData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetRmsRdsResourcesResponseBodyResponseEntitiesData setItemTypeConfig(java.util.List<String> itemTypeConfig) {
            this.itemTypeConfig = itemTypeConfig;
            return this;
        }
        public java.util.List<String> getItemTypeConfig() {
            return this.itemTypeConfig;
        }

        public GetRmsRdsResourcesResponseBodyResponseEntitiesData setItemTypeNoneConfig(java.util.List<String> itemTypeNoneConfig) {
            this.itemTypeNoneConfig = itemTypeNoneConfig;
            return this;
        }
        public java.util.List<String> getItemTypeNoneConfig() {
            return this.itemTypeNoneConfig;
        }

    }

    public static class GetRmsRdsResourcesResponseBodyResponseEntities extends TeaModel {
        @NameInMap("Data")
        public GetRmsRdsResourcesResponseBodyResponseEntitiesData data;

        public static GetRmsRdsResourcesResponseBodyResponseEntities build(java.util.Map<String, ?> map) throws Exception {
            GetRmsRdsResourcesResponseBodyResponseEntities self = new GetRmsRdsResourcesResponseBodyResponseEntities();
            return TeaModel.build(map, self);
        }

        public GetRmsRdsResourcesResponseBodyResponseEntities setData(GetRmsRdsResourcesResponseBodyResponseEntitiesData data) {
            this.data = data;
            return this;
        }
        public GetRmsRdsResourcesResponseBodyResponseEntitiesData getData() {
            return this.data;
        }

    }

    public static class GetRmsRdsResourcesResponseBodyResponseMeta extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetRmsRdsResourcesResponseBodyResponseMeta build(java.util.Map<String, ?> map) throws Exception {
            GetRmsRdsResourcesResponseBodyResponseMeta self = new GetRmsRdsResourcesResponseBodyResponseMeta();
            return TeaModel.build(map, self);
        }

        public GetRmsRdsResourcesResponseBodyResponseMeta setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetRmsRdsResourcesResponseBodyResponseMeta setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetRmsRdsResourcesResponseBodyResponse extends TeaModel {
        @NameInMap("ErrCode")
        public String errCode;

        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("ErrResolution")
        public String errResolution;

        @NameInMap("Entities")
        public java.util.List<GetRmsRdsResourcesResponseBodyResponseEntities> entities;

        @NameInMap("Meta")
        public java.util.List<GetRmsRdsResourcesResponseBodyResponseMeta> meta;

        public static GetRmsRdsResourcesResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            GetRmsRdsResourcesResponseBodyResponse self = new GetRmsRdsResourcesResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public GetRmsRdsResourcesResponseBodyResponse setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public GetRmsRdsResourcesResponseBodyResponse setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public GetRmsRdsResourcesResponseBodyResponse setErrResolution(String errResolution) {
            this.errResolution = errResolution;
            return this;
        }
        public String getErrResolution() {
            return this.errResolution;
        }

        public GetRmsRdsResourcesResponseBodyResponse setEntities(java.util.List<GetRmsRdsResourcesResponseBodyResponseEntities> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<GetRmsRdsResourcesResponseBodyResponseEntities> getEntities() {
            return this.entities;
        }

        public GetRmsRdsResourcesResponseBodyResponse setMeta(java.util.List<GetRmsRdsResourcesResponseBodyResponseMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<GetRmsRdsResourcesResponseBodyResponseMeta> getMeta() {
            return this.meta;
        }

    }

}
