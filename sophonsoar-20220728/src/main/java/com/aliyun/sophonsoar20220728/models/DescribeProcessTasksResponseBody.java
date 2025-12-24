// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeProcessTasksResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("Page")
    public DescribeProcessTasksResponseBodyPage page;

    /**
     * <p>The handling tasks.</p>
     */
    @NameInMap("ProcessTasks")
    public java.util.List<DescribeProcessTasksResponseBodyProcessTasks> processTasks;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E7698CFB-4E1C-5840-8EC9-691B86729E94</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeProcessTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessTasksResponseBody self = new DescribeProcessTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProcessTasksResponseBody setPage(DescribeProcessTasksResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public DescribeProcessTasksResponseBodyPage getPage() {
        return this.page;
    }

    public DescribeProcessTasksResponseBody setProcessTasks(java.util.List<DescribeProcessTasksResponseBodyProcessTasks> processTasks) {
        this.processTasks = processTasks;
        return this;
    }
    public java.util.List<DescribeProcessTasksResponseBodyProcessTasks> getProcessTasks() {
        return this.processTasks;
    }

    public DescribeProcessTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeProcessTasksResponseBodyPage extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeProcessTasksResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessTasksResponseBodyPage self = new DescribeProcessTasksResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public DescribeProcessTasksResponseBodyPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeProcessTasksResponseBodyPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeProcessTasksResponseBodyPage setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeProcessTasksResponseBodyProcessTasks extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account that is used to submit the handling task.</p>
         * 
         * <strong>example:</strong>
         * <p>123xxxx355</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The name of the handling entity.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.x</p>
         */
        @NameInMap("EntityName")
        public String entityName;

        /**
         * <p>The type of the handling entity.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>The UUID of the handling entity.</p>
         * 
         * <strong>example:</strong>
         * <p>69d189e2-ec17-4676-a2fe-02969234****</p>
         */
        @NameInMap("EntityUuid")
        public String entityUuid;

        /**
         * <p>The error code returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>sts_openapi.Info.DefenseSceneNotSupported</p>
         */
        @NameInMap("ErrCode")
        public String errCode;

        /**
         * <p>The error message returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>ParamError : The parameters of your request are invalid</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        /**
         * <p>The error tip returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Verify that the input parameters of the components are correct</p>
         */
        @NameInMap("ErrTip")
        public String errTip;

        /**
         * <p>The UUID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>c1020ce1-d6a5-11e8-8298-00163e10****</p>
         */
        @NameInMap("EventUuid")
        public String eventUuid;

        /**
         * <p>The creation time of the handling task. The value is a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1700031183572</p>
         */
        @NameInMap("GmtCreateMillis")
        public Long gmtCreateMillis;

        /**
         * <p>The modification time of the handling task. The value is a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1700031183572</p>
         */
        @NameInMap("GmtModifiedMillis")
        public Long gmtModifiedMillis;

        /**
         * <p>The input parameter of the handling task.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;groupuuid&quot;:&quot;c6a9b1df-f4ac-4078-bef4-99xxxxxx&quot;}</p>
         */
        @NameInMap("InputParams")
        public String inputParams;

        /**
         * <p>The ID of the associated policy.</p>
         * 
         * <strong>example:</strong>
         * <p>92af3c79-1754-4646-9366-9ddbd1e45536_xxxx</p>
         */
        @NameInMap("ProcessStrategyUuid")
        public String processStrategyUuid;

        /**
         * <p>The delivery time of the handling task. The value is a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1700031183572</p>
         */
        @NameInMap("ProcessTime")
        public Long processTime;

        /**
         * <p>The unblocking time of the handling task. The value is a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1700031183572</p>
         */
        @NameInMap("RemoveTime")
        public Long removeTime;

        /**
         * <p>The UUID of the playbook execution record.</p>
         * 
         * <strong>example:</strong>
         * <p>93e5df20-3d03-42e1-b44b-58197c71****</p>
         */
        @NameInMap("ReqUuid")
        public String reqUuid;

        /**
         * <p>The scenario code of the handling task.</p>
         * 
         * <strong>example:</strong>
         * <p>event_xxx_whole_process</p>
         */
        @NameInMap("SceneCode")
        public String sceneCode;

        /**
         * <p>The scenario name of the handling task.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_whole_process</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>The ID of the Alibaba Cloud account that is specified in the handling task.</p>
         * 
         * <strong>example:</strong>
         * <p>123xxxxx234</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The submission source of the handling task.</p>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The unique identifier of the handling task.</p>
         * 
         * <strong>example:</strong>
         * <p>150xxxxxxxxx95066</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The status of the handling task.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        /**
         * <p>The triggering source of the handling task. Valid values:</p>
         * <ul>
         * <li><strong>system</strong>: triggered when you manually handle an event.</li>
         * <li><strong>custom</strong>: triggered by an event based on an automatic response rule.</li>
         * <li><strong>custom_alert</strong>: triggered by an alert based on an automatic response rule.</li>
         * <li><strong>soar-manual</strong>: triggered when you use SOAR to manually run a playbook.</li>
         * <li><strong>soar-mdr</strong>: triggered by Managed Security Service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("TriggerSource")
        public String triggerSource;

        /**
         * <p>The code of the cloud service that is associated with the handling task.</p>
         * 
         * <strong>example:</strong>
         * <p>WAF</p>
         */
        @NameInMap("YunCode")
        public String yunCode;

        public static DescribeProcessTasksResponseBodyProcessTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessTasksResponseBodyProcessTasks self = new DescribeProcessTasksResponseBodyProcessTasks();
            return TeaModel.build(map, self);
        }

        public DescribeProcessTasksResponseBodyProcessTasks setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeProcessTasksResponseBodyProcessTasks setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

        public DescribeProcessTasksResponseBodyProcessTasks setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public DescribeProcessTasksResponseBodyProcessTasks setEntityUuid(String entityUuid) {
            this.entityUuid = entityUuid;
            return this;
        }
        public String getEntityUuid() {
            return this.entityUuid;
        }

        public DescribeProcessTasksResponseBodyProcessTasks setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public DescribeProcessTasksResponseBodyProcessTasks setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public DescribeProcessTasksResponseBodyProcessTasks setErrTip(String errTip) {
            this.errTip = errTip;
            return this;
        }
        public String getErrTip() {
            return this.errTip;
        }

        public DescribeProcessTasksResponseBodyProcessTasks setEventUuid(String eventUuid) {
            this.eventUuid = eventUuid;
            return this;
        }
        public String getEventUuid() {
            return this.eventUuid;
        }

        public DescribeProcessTasksResponseBodyProcessTasks setGmtCreateMillis(Long gmtCreateMillis) {
            this.gmtCreateMillis = gmtCreateMillis;
            return this;
        }
        public Long getGmtCreateMillis() {
            return this.gmtCreateMillis;
        }

        public DescribeProcessTasksResponseBodyProcessTasks setGmtModifiedMillis(Long gmtModifiedMillis) {
            this.gmtModifiedMillis = gmtModifiedMillis;
            return this;
        }
        public Long getGmtModifiedMillis() {
            return this.gmtModifiedMillis;
        }

        public DescribeProcessTasksResponseBodyProcessTasks setInputParams(String inputParams) {
            this.inputParams = inputParams;
            return this;
        }
        public String getInputParams() {
            return this.inputParams;
        }

        public DescribeProcessTasksResponseBodyProcessTasks setProcessStrategyUuid(String processStrategyUuid) {
            this.processStrategyUuid = processStrategyUuid;
            return this;
        }
        public String getProcessStrategyUuid() {
            return this.processStrategyUuid;
        }

        public DescribeProcessTasksResponseBodyProcessTasks setProcessTime(Long processTime) {
            this.processTime = processTime;
            return this;
        }
        public Long getProcessTime() {
            return this.processTime;
        }

        public DescribeProcessTasksResponseBodyProcessTasks setRemoveTime(Long removeTime) {
            this.removeTime = removeTime;
            return this;
        }
        public Long getRemoveTime() {
            return this.removeTime;
        }

        public DescribeProcessTasksResponseBodyProcessTasks setReqUuid(String reqUuid) {
            this.reqUuid = reqUuid;
            return this;
        }
        public String getReqUuid() {
            return this.reqUuid;
        }

        public DescribeProcessTasksResponseBodyProcessTasks setSceneCode(String sceneCode) {
            this.sceneCode = sceneCode;
            return this;
        }
        public String getSceneCode() {
            return this.sceneCode;
        }

        public DescribeProcessTasksResponseBodyProcessTasks setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public DescribeProcessTasksResponseBodyProcessTasks setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeProcessTasksResponseBodyProcessTasks setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeProcessTasksResponseBodyProcessTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeProcessTasksResponseBodyProcessTasks setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public DescribeProcessTasksResponseBodyProcessTasks setTriggerSource(String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }
        public String getTriggerSource() {
            return this.triggerSource;
        }

        public DescribeProcessTasksResponseBodyProcessTasks setYunCode(String yunCode) {
            this.yunCode = yunCode;
            return this;
        }
        public String getYunCode() {
            return this.yunCode;
        }

    }

}
