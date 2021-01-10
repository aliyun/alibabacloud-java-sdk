// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricCloudmsgbinginginfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public java.util.List<QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData> data;

    public static QueryLinkefabricFabricCloudmsgbinginginfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricCloudmsgbinginginfoResponseBody self = new QueryLinkefabricFabricCloudmsgbinginginfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricCloudmsgbinginginfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricCloudmsgbinginginfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricCloudmsgbinginginfoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricCloudmsgbinginginfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricCloudmsgbinginginfoResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricCloudmsgbinginginfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricCloudmsgbinginginfoResponseBody setData(java.util.List<QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("App")
        public String app;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Eventcode")
        public String eventcode;

        @NameInMap("ExchangeType")
        public String exchangeType;

        @NameInMap("Expression")
        public String expression;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Group")
        public String group;

        @NameInMap("Id")
        public String id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Persistence")
        public Boolean persistence;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("Workspace")
        public String workspace;

        @NameInMap("WorkspaceGroup")
        public String workspaceGroup;

        @NameInMap("Zone")
        public String zone;

        @NameInMap("ZoneMode")
        public String zoneMode;

        public static QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData self = new QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData setEventcode(String eventcode) {
            this.eventcode = eventcode;
            return this;
        }
        public String getEventcode() {
            return this.eventcode;
        }

        public QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData setExchangeType(String exchangeType) {
            this.exchangeType = exchangeType;
            return this;
        }
        public String getExchangeType() {
            return this.exchangeType;
        }

        public QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData setPersistence(Boolean persistence) {
            this.persistence = persistence;
            return this;
        }
        public Boolean getPersistence() {
            return this.persistence;
        }

        public QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData setWorkspaceGroup(String workspaceGroup) {
            this.workspaceGroup = workspaceGroup;
            return this;
        }
        public String getWorkspaceGroup() {
            return this.workspaceGroup;
        }

        public QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public QueryLinkefabricFabricCloudmsgbinginginfoResponseBodyData setZoneMode(String zoneMode) {
            this.zoneMode = zoneMode;
            return this;
        }
        public String getZoneMode() {
            return this.zoneMode;
        }

    }

}
