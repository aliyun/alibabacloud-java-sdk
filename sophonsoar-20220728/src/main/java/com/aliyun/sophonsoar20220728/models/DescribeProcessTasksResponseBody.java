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
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
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
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The name of the handling entity.</p>
         */
        @NameInMap("EntityName")
        public String entityName;

        /**
         * <p>The type of the handling entity.</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <p>The creation time of the handling task. The value is a 13-digit timestamp.</p>
         */
        @NameInMap("GmtCreateMillis")
        public Long gmtCreateMillis;

        /**
         * <p>The modification time of the handling task. The value is a 13-digit timestamp.</p>
         */
        @NameInMap("GmtModifiedMillis")
        public Long gmtModifiedMillis;

        /**
         * <p>The input parameter of the handling task.</p>
         */
        @NameInMap("InputParams")
        public String inputParams;

        /**
         * <p>The ID of the associated policy.</p>
         */
        @NameInMap("ProcessStrategyUuid")
        public String processStrategyUuid;

        /**
         * <p>The delivery time of the handling task. The value is a 13-digit timestamp.</p>
         */
        @NameInMap("ProcessTime")
        public Long processTime;

        /**
         * <p>The unblocking time of the handling task. The value is a 13-digit timestamp.</p>
         */
        @NameInMap("RemoveTime")
        public Long removeTime;

        /**
         * <p>The scenario code of the handling task.</p>
         */
        @NameInMap("SceneCode")
        public String sceneCode;

        /**
         * <p>The scenario name of the handling task.</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>The ID of the Alibaba Cloud account that is specified in the handling task.</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The submission source of the handling task.</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The unique identifier of the handling task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The status of the handling task.</p>
         */
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        /**
         * <p>The code of the cloud service that is associated with the handling task.</p>
         */
        @NameInMap("YunCode")
        public String yunCode;

        @NameInMap("errCode")
        public String errCode;

        @NameInMap("errMsg")
        public String errMsg;

        @NameInMap("errTip")
        public String errTip;

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

        public DescribeProcessTasksResponseBodyProcessTasks setYunCode(String yunCode) {
            this.yunCode = yunCode;
            return this;
        }
        public String getYunCode() {
            return this.yunCode;
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

    }

}
