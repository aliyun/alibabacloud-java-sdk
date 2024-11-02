// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSoarTaskAndActionsResponseBody extends TeaModel {
    /**
     * <p>The execution details of each task.</p>
     */
    @NameInMap("Details")
    public DescribeSoarTaskAndActionsResponseBodyDetails details;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>18017A93-3D5D-503A-8308-914543F1CBA3</p>
     */
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
        /**
         * <p>The action name of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>formatdata</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The UUID of the component execution record.</p>
         * 
         * <strong>example:</strong>
         * <p>091be399-a937-4276-af78-xxxxxxxx</p>
         */
        @NameInMap("ActionUuid")
        public String actionUuid;

        /**
         * <p>The name of the asset that is used by the component.</p>
         * 
         * <strong>example:</strong>
         * <p>SLS Asset</p>
         */
        @NameInMap("AssetName")
        public String assetName;

        /**
         * <p>The component name.</p>
         * 
         * <strong>example:</strong>
         * <p>DataFormat</p>
         */
        @NameInMap("Component")
        public String component;

        /**
         * <p>The end of the time range during which the component is run. The value is a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1699868848766</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The custom name of the node in the component.</p>
         * 
         * <strong>example:</strong>
         * <p>DataFormat_1</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The request ID of the task. The value is unique.</p>
         * 
         * <strong>example:</strong>
         * <p>8dac16c6-7411-4116-8d70-xxxxxxx</p>
         */
        @NameInMap("RequestUuid")
        public String requestUuid;

        /**
         * <p>The beginning of the time range during which the component is run. The value is a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1699868848731</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The running result of the component. Valid values:</p>
         * <ul>
         * <li><strong>success</strong></li>
         * <li><strong>fail</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the task. The value is the same as the playbook UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>ed127287-6699-4e4d-b986-xxxxxxx</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The status of the triggered component action.</p>
         * <blockquote>
         * <p> This parameter is disabled and left empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>NULL</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to execute the task.</p>
         * 
         * <strong>example:</strong>
         * <p>127xxxx4392</p>
         */
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
        /**
         * <p>The list of component actions during the running of the playbook.</p>
         */
        @NameInMap("Actions")
        public java.util.List<DescribeSoarTaskAndActionsResponseBodyDetailsActions> actions;

        /**
         * <p>The end of the time range during which the playbook is run. The value is a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1699868848767</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The error message of the task. If the task is successful, this field is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>stime not match</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The request parameters of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;input1&quot;: &quot;xx.xx.xx.xx&quot;,
         *     &quot;input2&quot;: &quot;7d&quot;
         * }</p>
         */
        @NameInMap("RawEventReq")
        public String rawEventReq;

        /**
         * <p>The request ID of the task. The value is unique.</p>
         * 
         * <strong>example:</strong>
         * <p>17f75844-75cc-4174-86da-cec07a690142</p>
         */
        @NameInMap("RequestUuid")
        public String requestUuid;

        /**
         * <p>The flag of the task. For debugging tasks, the value is <strong>DEBUG</strong>. For other tasks, the parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>DEBUG</p>
         */
        @NameInMap("ResultLevel")
        public String resultLevel;

        /**
         * <p>The returned information about the playbook. You can define the value in the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>deubug playbook finished</p>
         */
        @NameInMap("ResultMessage")
        public String resultMessage;

        /**
         * <p>The beginning of the time range during which the playbook is run. The value is a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1699868848645</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><strong>success</strong></li>
         * <li><strong>fail</strong></li>
         * <li><strong>running</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The MD5 value of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>ed127287-6699-4e4d-b986-9f770879xxx</p>
         */
        @NameInMap("TaskFlowMd5")
        public String taskFlowMd5;

        /**
         * <p>The name of the task. The value is the same as the playbook UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>92af3c79-1754-4646-9366-9ddbd1e45536</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The ID of the Alibaba Cloud account to which the task belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>127xxxx4392</p>
         */
        @NameInMap("TaskTenantId")
        public String taskTenantId;

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li><strong>debug</strong>: a debugging task</li>
         * <li><strong>manual</strong>: a manual task</li>
         * <li><strong>siem</strong>: an event-triggered task</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>siem</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        /**
         * <p>The ID of the Alibaba Cloud account that triggers the task.</p>
         * 
         * <strong>example:</strong>
         * <p>127xxxx4392</p>
         */
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
