// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSoarTaskAndActionsResponseBody extends TeaModel {
    @NameInMap("Details")
    public DescribeSoarTaskAndActionsResponseBodyDetails details;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSoarTaskAndActionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarTaskAndActionsResponseBody self = new DescribeSoarTaskAndActionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSoarTaskAndActionsResponseBody setDetails(DescribeSoarTaskAndActionsResponseBodyDetails details) {
        this.details = details;
        return this;
    }
    public DescribeSoarTaskAndActionsResponseBodyDetails getDetails() {
        return this.details;
    }

    public DescribeSoarTaskAndActionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSoarTaskAndActionsResponseBodyDetailsActions extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("ActionUuid")
        public String actionUuid;

        @NameInMap("AssetName")
        public String assetName;

        @NameInMap("Component")
        public String component;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("RequestUuid")
        public String requestUuid;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("TriggerUser")
        public String triggerUser;

        public static DescribeSoarTaskAndActionsResponseBodyDetailsActions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSoarTaskAndActionsResponseBodyDetailsActions self = new DescribeSoarTaskAndActionsResponseBodyDetailsActions();
            return TeaModel.build(map, self);
        }

        public DescribeSoarTaskAndActionsResponseBodyDetailsActions setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeSoarTaskAndActionsResponseBodyDetailsActions setActionUuid(String actionUuid) {
            this.actionUuid = actionUuid;
            return this;
        }
        public String getActionUuid() {
            return this.actionUuid;
        }

        public DescribeSoarTaskAndActionsResponseBodyDetailsActions setAssetName(String assetName) {
            this.assetName = assetName;
            return this;
        }
        public String getAssetName() {
            return this.assetName;
        }

        public DescribeSoarTaskAndActionsResponseBodyDetailsActions setComponent(String component) {
            this.component = component;
            return this;
        }
        public String getComponent() {
            return this.component;
        }

        public DescribeSoarTaskAndActionsResponseBodyDetailsActions setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeSoarTaskAndActionsResponseBodyDetailsActions setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeSoarTaskAndActionsResponseBodyDetailsActions setRequestUuid(String requestUuid) {
            this.requestUuid = requestUuid;
            return this;
        }
        public String getRequestUuid() {
            return this.requestUuid;
        }

        public DescribeSoarTaskAndActionsResponseBodyDetailsActions setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeSoarTaskAndActionsResponseBodyDetailsActions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSoarTaskAndActionsResponseBodyDetailsActions setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeSoarTaskAndActionsResponseBodyDetailsActions setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public DescribeSoarTaskAndActionsResponseBodyDetailsActions setTriggerUser(String triggerUser) {
            this.triggerUser = triggerUser;
            return this;
        }
        public String getTriggerUser() {
            return this.triggerUser;
        }

    }

    public static class DescribeSoarTaskAndActionsResponseBodyDetails extends TeaModel {
        @NameInMap("Actions")
        public java.util.List<DescribeSoarTaskAndActionsResponseBodyDetailsActions> actions;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("RawEventReq")
        public String rawEventReq;

        @NameInMap("RequestUuid")
        public String requestUuid;

        @NameInMap("ResultLevel")
        public String resultLevel;

        @NameInMap("ResultMessage")
        public String resultMessage;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskFlowMd5")
        public String taskFlowMd5;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskTenantId")
        public String taskTenantId;

        @NameInMap("TriggerType")
        public String triggerType;

        @NameInMap("TriggerUser")
        public String triggerUser;

        public static DescribeSoarTaskAndActionsResponseBodyDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeSoarTaskAndActionsResponseBodyDetails self = new DescribeSoarTaskAndActionsResponseBodyDetails();
            return TeaModel.build(map, self);
        }

        public DescribeSoarTaskAndActionsResponseBodyDetails setActions(java.util.List<DescribeSoarTaskAndActionsResponseBodyDetailsActions> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<DescribeSoarTaskAndActionsResponseBodyDetailsActions> getActions() {
            return this.actions;
        }

        public DescribeSoarTaskAndActionsResponseBodyDetails setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeSoarTaskAndActionsResponseBodyDetails setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeSoarTaskAndActionsResponseBodyDetails setRawEventReq(String rawEventReq) {
            this.rawEventReq = rawEventReq;
            return this;
        }
        public String getRawEventReq() {
            return this.rawEventReq;
        }

        public DescribeSoarTaskAndActionsResponseBodyDetails setRequestUuid(String requestUuid) {
            this.requestUuid = requestUuid;
            return this;
        }
        public String getRequestUuid() {
            return this.requestUuid;
        }

        public DescribeSoarTaskAndActionsResponseBodyDetails setResultLevel(String resultLevel) {
            this.resultLevel = resultLevel;
            return this;
        }
        public String getResultLevel() {
            return this.resultLevel;
        }

        public DescribeSoarTaskAndActionsResponseBodyDetails setResultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }
        public String getResultMessage() {
            return this.resultMessage;
        }

        public DescribeSoarTaskAndActionsResponseBodyDetails setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeSoarTaskAndActionsResponseBodyDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSoarTaskAndActionsResponseBodyDetails setTaskFlowMd5(String taskFlowMd5) {
            this.taskFlowMd5 = taskFlowMd5;
            return this;
        }
        public String getTaskFlowMd5() {
            return this.taskFlowMd5;
        }

        public DescribeSoarTaskAndActionsResponseBodyDetails setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeSoarTaskAndActionsResponseBodyDetails setTaskTenantId(String taskTenantId) {
            this.taskTenantId = taskTenantId;
            return this;
        }
        public String getTaskTenantId() {
            return this.taskTenantId;
        }

        public DescribeSoarTaskAndActionsResponseBodyDetails setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public DescribeSoarTaskAndActionsResponseBodyDetails setTriggerUser(String triggerUser) {
            this.triggerUser = triggerUser;
            return this;
        }
        public String getTriggerUser() {
            return this.triggerUser;
        }

    }

}
