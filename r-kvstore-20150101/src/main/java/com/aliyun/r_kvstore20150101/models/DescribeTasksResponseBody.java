// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTasksResponseBody extends TeaModel {
    /**
     * <p>The details of the task.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeTasksResponseBodyItems> items;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>608FAEC9-485E-4C65-82DE-2E5B955E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTasksResponseBody self = new DescribeTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTasksResponseBody setItems(java.util.List<DescribeTasksResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeTasksResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTasksResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeTasksResponseBodyItems extends TeaModel {
        /**
         * <p>The beginning time of the task. The time follows the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-13T06:16:54Z</p>
         */
        @NameInMap("BeginTime")
        public String beginTime;

        /**
         * <p>The name of the subtask.</p>
         * 
         * <strong>example:</strong>
         * <p>init_redis</p>
         */
        @NameInMap("CurrentStepName")
        public String currentStepName;

        /**
         * <p>The end time of the task. The time follows the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-13T06:17:18Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The progress of the task. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public Float progress;

        /**
         * <p>The estimated remaining duration of the task. Unit: seconds.</p>
         * <blockquote>
         * <p> If the task is not running, this parameter is not returned or the returned value is <strong>0</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Remain")
        public Integer remain;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The task is pending.</li>
         * <li><strong>1</strong>: The task is running.</li>
         * <li><strong>2</strong>: The task is complete.</li>
         * <li><strong>4</strong>: The task is closed.</li>
         * <li><strong>7</strong>: The task is paused.</li>
         * <li><strong>8</strong>: The task is interrupted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The progress of the subtask.</p>
         * <blockquote>
         * <p> If the subtask does not exist, this parameter is not returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3/3</p>
         */
        @NameInMap("StepProgressInfo")
        public String stepProgressInfo;

        /**
         * <p>The information about the subtask in the JSON format. This includes the expected remaining duration (<strong>remain</strong>), the name of the subtask (<strong>name</strong>), and the task progress (<strong>progress</strong>).</p>
         * <blockquote>
         * <p> If the subtask does not exist, this parameter is not returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;remain\&quot;:0,\&quot;name\&quot;:\&quot;init_instance\&quot;,\&quot;progress\&quot;:100},{\&quot;remain\&quot;:107,\&quot;name\&quot;:\&quot;init_redis\&quot;,\&quot;progress\&quot;:12.3},{\&quot;remain\&quot;:1881,\&quot;name\&quot;:\&quot;init_config\&quot;,\&quot;progress\&quot;:0}]</p>
         */
        @NameInMap("StepsInfo")
        public String stepsInfo;

        /**
         * <p>The identifier of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>ModifyDBInstanceParameter</p>
         */
        @NameInMap("TaskAction")
        public String taskAction;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>32302****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeTasksResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseBodyItems self = new DescribeTasksResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeTasksResponseBodyItems setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public DescribeTasksResponseBodyItems setCurrentStepName(String currentStepName) {
            this.currentStepName = currentStepName;
            return this;
        }
        public String getCurrentStepName() {
            return this.currentStepName;
        }

        public DescribeTasksResponseBodyItems setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeTasksResponseBodyItems setProgress(Float progress) {
            this.progress = progress;
            return this;
        }
        public Float getProgress() {
            return this.progress;
        }

        public DescribeTasksResponseBodyItems setRemain(Integer remain) {
            this.remain = remain;
            return this;
        }
        public Integer getRemain() {
            return this.remain;
        }

        public DescribeTasksResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeTasksResponseBodyItems setStepProgressInfo(String stepProgressInfo) {
            this.stepProgressInfo = stepProgressInfo;
            return this;
        }
        public String getStepProgressInfo() {
            return this.stepProgressInfo;
        }

        public DescribeTasksResponseBodyItems setStepsInfo(String stepsInfo) {
            this.stepsInfo = stepsInfo;
            return this;
        }
        public String getStepsInfo() {
            return this.stepsInfo;
        }

        public DescribeTasksResponseBodyItems setTaskAction(String taskAction) {
            this.taskAction = taskAction;
            return this;
        }
        public String getTaskAction() {
            return this.taskAction;
        }

        public DescribeTasksResponseBodyItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
