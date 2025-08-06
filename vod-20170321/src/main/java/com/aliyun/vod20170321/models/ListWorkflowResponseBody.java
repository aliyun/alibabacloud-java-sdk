// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListWorkflowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WorkflowInfoList")
    public java.util.List<ListWorkflowResponseBodyWorkflowInfoList> workflowInfoList;

    public static ListWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowResponseBody self = new ListWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkflowResponseBody setWorkflowInfoList(java.util.List<ListWorkflowResponseBodyWorkflowInfoList> workflowInfoList) {
        this.workflowInfoList = workflowInfoList;
        return this;
    }
    public java.util.List<ListWorkflowResponseBodyWorkflowInfoList> getWorkflowInfoList() {
        return this.workflowInfoList;
    }

    public static class ListWorkflowResponseBodyWorkflowInfoList extends TeaModel {
        @NameInMap("ActionList")
        public String actionList;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("State")
        public String state;

        @NameInMap("WorkflowId")
        public String workflowId;

        public static ListWorkflowResponseBodyWorkflowInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowResponseBodyWorkflowInfoList self = new ListWorkflowResponseBodyWorkflowInfoList();
            return TeaModel.build(map, self);
        }

        public ListWorkflowResponseBodyWorkflowInfoList setActionList(String actionList) {
            this.actionList = actionList;
            return this;
        }
        public String getActionList() {
            return this.actionList;
        }

        public ListWorkflowResponseBodyWorkflowInfoList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListWorkflowResponseBodyWorkflowInfoList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListWorkflowResponseBodyWorkflowInfoList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListWorkflowResponseBodyWorkflowInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkflowResponseBodyWorkflowInfoList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListWorkflowResponseBodyWorkflowInfoList setWorkflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public String getWorkflowId() {
            return this.workflowId;
        }

    }

}
