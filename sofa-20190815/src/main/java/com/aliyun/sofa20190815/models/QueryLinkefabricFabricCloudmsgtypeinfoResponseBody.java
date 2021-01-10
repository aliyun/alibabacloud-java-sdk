// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricCloudmsgtypeinfoResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkefabricFabricCloudmsgtypeinfoResponseBodyData> data;

    public static QueryLinkefabricFabricCloudmsgtypeinfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricCloudmsgtypeinfoResponseBody self = new QueryLinkefabricFabricCloudmsgtypeinfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricCloudmsgtypeinfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricCloudmsgtypeinfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricCloudmsgtypeinfoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricCloudmsgtypeinfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricCloudmsgtypeinfoResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricCloudmsgtypeinfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricCloudmsgtypeinfoResponseBody setData(java.util.List<QueryLinkefabricFabricCloudmsgtypeinfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkefabricFabricCloudmsgtypeinfoResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricCloudmsgtypeinfoResponseBodyData extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("App")
        public String app;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Eventcode")
        public String eventcode;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("Workspace")
        public String workspace;

        @NameInMap("WorkspaceGroup")
        public String workspaceGroup;

        public static QueryLinkefabricFabricCloudmsgtypeinfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricCloudmsgtypeinfoResponseBodyData self = new QueryLinkefabricFabricCloudmsgtypeinfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricCloudmsgtypeinfoResponseBodyData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public QueryLinkefabricFabricCloudmsgtypeinfoResponseBodyData setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public QueryLinkefabricFabricCloudmsgtypeinfoResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryLinkefabricFabricCloudmsgtypeinfoResponseBodyData setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryLinkefabricFabricCloudmsgtypeinfoResponseBodyData setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryLinkefabricFabricCloudmsgtypeinfoResponseBodyData setEventcode(String eventcode) {
            this.eventcode = eventcode;
            return this;
        }
        public String getEventcode() {
            return this.eventcode;
        }

        public QueryLinkefabricFabricCloudmsgtypeinfoResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryLinkefabricFabricCloudmsgtypeinfoResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryLinkefabricFabricCloudmsgtypeinfoResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkefabricFabricCloudmsgtypeinfoResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryLinkefabricFabricCloudmsgtypeinfoResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public QueryLinkefabricFabricCloudmsgtypeinfoResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public QueryLinkefabricFabricCloudmsgtypeinfoResponseBodyData setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public QueryLinkefabricFabricCloudmsgtypeinfoResponseBodyData setWorkspaceGroup(String workspaceGroup) {
            this.workspaceGroup = workspaceGroup;
            return this;
        }
        public String getWorkspaceGroup() {
            return this.workspaceGroup;
        }

    }

}
