// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetWorkflowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WorkflowInfo")
    public GetWorkflowResponseBodyWorkflowInfo workflowInfo;

    public static GetWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowResponseBody self = new GetWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkflowResponseBody setWorkflowInfo(GetWorkflowResponseBodyWorkflowInfo workflowInfo) {
        this.workflowInfo = workflowInfo;
        return this;
    }
    public GetWorkflowResponseBodyWorkflowInfo getWorkflowInfo() {
        return this.workflowInfo;
    }

    public static class GetWorkflowResponseBodyWorkflowInfo extends TeaModel {
        @NameInMap("ActionList")
        public String actionList;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("CallbackConfig")
        public String callbackConfig;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("State")
        public String state;

        @NameInMap("WorkflowId")
        public String workflowId;

        public static GetWorkflowResponseBodyWorkflowInfo build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowResponseBodyWorkflowInfo self = new GetWorkflowResponseBodyWorkflowInfo();
            return TeaModel.build(map, self);
        }

        public GetWorkflowResponseBodyWorkflowInfo setActionList(String actionList) {
            this.actionList = actionList;
            return this;
        }
        public String getActionList() {
            return this.actionList;
        }

        public GetWorkflowResponseBodyWorkflowInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetWorkflowResponseBodyWorkflowInfo setCallbackConfig(String callbackConfig) {
            this.callbackConfig = callbackConfig;
            return this;
        }
        public String getCallbackConfig() {
            return this.callbackConfig;
        }

        public GetWorkflowResponseBodyWorkflowInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetWorkflowResponseBodyWorkflowInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetWorkflowResponseBodyWorkflowInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetWorkflowResponseBodyWorkflowInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkflowResponseBodyWorkflowInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetWorkflowResponseBodyWorkflowInfo setWorkflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public String getWorkflowId() {
            return this.workflowId;
        }

    }

}
