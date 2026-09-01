// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSoarTaskAndActionsResponseBody extends TeaModel {
    /**
     * <p>The details of the task execution.</p>
     */
    @NameInMap("Details")
    public DescribeSoarTaskAndActionsResponseBodyDetails details;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("Page")
    public DescribeSoarTaskAndActionsResponseBodyPage page;

    /**
     * <p>The ID of the request.</p>
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

    public DescribeSoarTaskAndActionsResponseBody setPage(DescribeSoarTaskAndActionsResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public DescribeSoarTaskAndActionsResponseBodyPage getPage() {
        return this.page;
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
         * <p>The name of the component action.</p>
         * 
         * <strong>example:</strong>
         * <p>formatdata</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The UUID of the component action execution record.</p>
         * 
         * <strong>example:</strong>
         * <p>091be399-a937-4276-af78-xxxxxxxx</p>
         */
        @NameInMap("ActionUuid")
        public String actionUuid;

        /**
         * <p>The name of the asset used by the component.</p>
         * 
         * <strong>example:</strong>
         * <p>SLS Asset</p>
         */
        @NameInMap("AssetName")
        public String assetName;

        /**
         * <p>The name of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>DataFormat</p>
         */
        @NameInMap("Component")
        public String component;

        /**
         * <p>The end time of the component run. This is a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1699868848766</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The custom node name of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>DataFormat_1</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The start time of the component run. This is a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1699868848731</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The result of the component run. Valid values:</p>
         * <ul>
         * <li><p><strong>success</strong>: The run was successful.</p>
         * </li>
         * <li><p><strong>fail</strong>: The run failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

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

    }

    public static class DescribeSoarTaskAndActionsResponseBodyDetails extends TeaModel {
        /**
         * <p>The total number of action logs.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ActionLogNum")
        public Integer actionLogNum;

        /**
         * <p>The list of component actions executed in the playbook.</p>
         */
        @NameInMap("Actions")
        public java.util.List<DescribeSoarTaskAndActionsResponseBodyDetailsActions> actions;

        /**
         * <p>The end time of the playbook run. This is a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1699868848767</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The error message for the playbook task. This field is empty if the task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>stime not match</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The request parameters of the playbook task.</p>
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
         * <p>The request ID of the playbook task. This is the unique ID for each task run.</p>
         * 
         * <strong>example:</strong>
         * <p>17f75844-75cc-4174-86da-cec07a690142</p>
         */
        @NameInMap("RequestUuid")
        public String requestUuid;

        /**
         * <p>The start time of the playbook run. This is a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1699868848645</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the playbook task. Valid values:</p>
         * <ul>
         * <li><p><strong>success</strong>: The task was successful.</p>
         * </li>
         * <li><p><strong>fail</strong>: The task failed.</p>
         * </li>
         * <li><p><strong>running</strong>: The task is running.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The MD5 value of the playbook configuration that was run.</p>
         * 
         * <strong>example:</strong>
         * <p>ed127287-6699-4e4d-b986-9f770879xxx</p>
         */
        @NameInMap("TaskFlowMd5")
        public String taskFlowMd5;

        /**
         * <p>The name of the playbook task. This is the same as the playbook UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>92af3c79-1754-4646-9366-9ddbd1e45536</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The trigger type. Valid values:</p>
         * <ul>
         * <li><p><strong>debug</strong>: A task for debugging a playbook.</p>
         * </li>
         * <li><p><strong>manual</strong>: A manually triggered task.</p>
         * </li>
         * <li><p><strong>siem</strong>: An event-triggered task.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>siem</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        /**
         * <p>The ID of the Alibaba Cloud account that triggered the playbook task.</p>
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

        public DescribeSoarTaskAndActionsResponseBodyDetails setActionLogNum(Integer actionLogNum) {
            this.actionLogNum = actionLogNum;
            return this;
        }
        public Integer getActionLogNum() {
            return this.actionLogNum;
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

    public static class DescribeSoarTaskAndActionsResponseBodyPage extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public String pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalCount")
        public String totalCount;

        public static DescribeSoarTaskAndActionsResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            DescribeSoarTaskAndActionsResponseBodyPage self = new DescribeSoarTaskAndActionsResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public DescribeSoarTaskAndActionsResponseBodyPage setPageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public String getPageNumber() {
            return this.pageNumber;
        }

        public DescribeSoarTaskAndActionsResponseBodyPage setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public DescribeSoarTaskAndActionsResponseBodyPage setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}
