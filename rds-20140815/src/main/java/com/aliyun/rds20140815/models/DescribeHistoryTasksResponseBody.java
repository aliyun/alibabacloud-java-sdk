// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHistoryTasksResponseBody extends TeaModel {
    /**
     * <p>The tasks.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeHistoryTasksResponseBodyItems> items;

    /**
     * <p>The page number. Pages start from page 1. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>10 to 100</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique ID of the request. If the request fails, provide this ID for technical support to troubleshoot the failure.</p>
     * 
     * <strong>example:</strong>
     * <p>5CD61041-35F7-10F7-BE94-33A48B22****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of tasks that meet these constraints without taking pagination into account.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeHistoryTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryTasksResponseBody self = new DescribeHistoryTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryTasksResponseBody setItems(java.util.List<DescribeHistoryTasksResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeHistoryTasksResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeHistoryTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHistoryTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHistoryTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHistoryTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeHistoryTasksResponseBodyItems extends TeaModel {
        /**
         * <p>A set of allowed actions that can be taken on the task. The system matches the current step name and status of the task to the available actions specified by ActionInfo. If no matching action is found, the current status of the task does not support any action. Example:</p>
         * <pre><code>  &quot;steps&quot;: [
         *     {
         *       &quot;step_name&quot;: &quot;exec_task&quot;, // The name of the step, which matches CurrentStepName.
         *       &quot;action_info&quot;: {    // The actions supported for this step.
         *         &quot;Waiting&quot;: [      // The status, which matches Status.
         *           &quot;modifySwitchTime&quot; // The action. Multiple actions are supported.
         *         ]
         *       }
         *     },
         *     {
         *       &quot;step_name&quot;: &quot;init_task&quot;, // The name of the step.
         *       &quot;action_info&quot;: {    // The actions supported for this step.
         *         &quot;Running&quot;: [      // The status.
         *           &quot;cancel&quot;,       // The action.
         *           &quot;pause&quot;
         *         ]
         *       }
         *     }
         *   ]
         * }
         * </code></pre>
         * <p>The system may support the following actions: retry cancel modifySwitchTime: changes the switching or restoration time.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;steps\&quot;:[{\&quot;action_info\&quot;:{\&quot;Waiting\&quot;:[\&quot;modifySwitchTime\&quot;]},\&quot;step_name\&quot;:\&quot;exec_task\&quot;}]}</p>
         */
        @NameInMap("ActionInfo")
        public String actionInfo;

        /**
         * <p>The ID of the user who made the request. If CallerSource is set to User, CallerUid indicates the unique ID (UID) of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>141345906006****</p>
         */
        @NameInMap("CallerSource")
        public String callerSource;

        /**
         * <p>The request source. Valid values: System User</p>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        @NameInMap("CallerUid")
        public String callerUid;

        /**
         * <p>The name of the current step. If this parameter is left empty, the task is not started.</p>
         * 
         * <strong>example:</strong>
         * <p>exec_task</p>
         */
        @NameInMap("CurrentStepName")
        public String currentStepName;

        /**
         * <p>The database type.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The end time of the task. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-03T12:06:17Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The instance ID. Example: rm-xxx.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf62br2491p5l****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name, which is a user-defined alias.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The type of the instance. Example: user instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The product. Example: rds.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The task progress. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>79.0</p>
         */
        @NameInMap("Progress")
        public Float progress;

        /**
         * <p>The reason why the current task was initiated.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The estimated amount of time remaining to complete the task. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("RemainTime")
        public Integer remainTime;

        /**
         * <p>The start time of the task. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-03T11:31:03Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the task.</p>
         * <ul>
         * <li>Scheduled</li>
         * <li>Running</li>
         * <li>Succeed</li>
         * <li>Failed</li>
         * <li>Cancelling</li>
         * <li>Canceled</li>
         * <li>Waiting</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task details provided in the form of a JSON string. The JSON string can be customized and extended to include additional information about the task. The details vary based on the task type.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;callerUid\&quot;:\&quot;test\&quot;}</p>
         */
        @NameInMap("TaskDetail")
        public String taskDetail;

        /**
         * <p>The task ID in the t-\<em>\</em>\* format.</p>
         * 
         * <strong>example:</strong>
         * <p>t-83br18hloy3faf****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task type or name.</p>
         * 
         * <strong>example:</strong>
         * <p>autotest_dispatch_cases</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The ID of the user to which the resources belong.</p>
         * 
         * <strong>example:</strong>
         * <p>141345906006****</p>
         */
        @NameInMap("Uid")
        public String uid;

        public static DescribeHistoryTasksResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryTasksResponseBodyItems self = new DescribeHistoryTasksResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryTasksResponseBodyItems setActionInfo(String actionInfo) {
            this.actionInfo = actionInfo;
            return this;
        }
        public String getActionInfo() {
            return this.actionInfo;
        }

        public DescribeHistoryTasksResponseBodyItems setCallerSource(String callerSource) {
            this.callerSource = callerSource;
            return this;
        }
        public String getCallerSource() {
            return this.callerSource;
        }

        public DescribeHistoryTasksResponseBodyItems setCallerUid(String callerUid) {
            this.callerUid = callerUid;
            return this;
        }
        public String getCallerUid() {
            return this.callerUid;
        }

        public DescribeHistoryTasksResponseBodyItems setCurrentStepName(String currentStepName) {
            this.currentStepName = currentStepName;
            return this;
        }
        public String getCurrentStepName() {
            return this.currentStepName;
        }

        public DescribeHistoryTasksResponseBodyItems setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeHistoryTasksResponseBodyItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeHistoryTasksResponseBodyItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeHistoryTasksResponseBodyItems setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeHistoryTasksResponseBodyItems setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeHistoryTasksResponseBodyItems setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeHistoryTasksResponseBodyItems setProgress(Float progress) {
            this.progress = progress;
            return this;
        }
        public Float getProgress() {
            return this.progress;
        }

        public DescribeHistoryTasksResponseBodyItems setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public DescribeHistoryTasksResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeHistoryTasksResponseBodyItems setRemainTime(Integer remainTime) {
            this.remainTime = remainTime;
            return this;
        }
        public Integer getRemainTime() {
            return this.remainTime;
        }

        public DescribeHistoryTasksResponseBodyItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeHistoryTasksResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHistoryTasksResponseBodyItems setTaskDetail(String taskDetail) {
            this.taskDetail = taskDetail;
            return this;
        }
        public String getTaskDetail() {
            return this.taskDetail;
        }

        public DescribeHistoryTasksResponseBodyItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeHistoryTasksResponseBodyItems setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeHistoryTasksResponseBodyItems setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
