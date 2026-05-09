// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBatchTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>925B84D9-CA72-432C-95CF-738C22******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskList")
    public java.util.List<DescribeBatchTasksResponseBodyTaskList> taskList;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeBatchTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchTasksResponseBody self = new DescribeBatchTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBatchTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBatchTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBatchTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBatchTasksResponseBody setTaskList(java.util.List<DescribeBatchTasksResponseBodyTaskList> taskList) {
        this.taskList = taskList;
        return this;
    }
    public java.util.List<DescribeBatchTasksResponseBodyTaskList> getTaskList() {
        return this.taskList;
    }

    public DescribeBatchTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBatchTasksResponseBodyTaskList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pcb-xxx</p>
         */
        @NameInMap("BatchId")
        public String batchId;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        /**
         * <strong>example:</strong>
         * <p>2026-04-06 20:51:44</p>
         */
        @NameInMap("TaskBegin")
        public String taskBegin;

        /**
         * <strong>example:</strong>
         * <p>2026-04-06 22:43:26</p>
         */
        @NameInMap("TaskEnd")
        public String taskEnd;

        /**
         * <strong>example:</strong>
         * <p>batch_task_test</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <strong>example:</strong>
         * <p>polarclaw_install_skills</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeBatchTasksResponseBodyTaskList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchTasksResponseBodyTaskList self = new DescribeBatchTasksResponseBodyTaskList();
            return TeaModel.build(map, self);
        }

        public DescribeBatchTasksResponseBodyTaskList setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }
        public String getBatchId() {
            return this.batchId;
        }

        public DescribeBatchTasksResponseBodyTaskList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBatchTasksResponseBodyTaskList setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public DescribeBatchTasksResponseBodyTaskList setTaskBegin(String taskBegin) {
            this.taskBegin = taskBegin;
            return this;
        }
        public String getTaskBegin() {
            return this.taskBegin;
        }

        public DescribeBatchTasksResponseBodyTaskList setTaskEnd(String taskEnd) {
            this.taskEnd = taskEnd;
            return this;
        }
        public String getTaskEnd() {
            return this.taskEnd;
        }

        public DescribeBatchTasksResponseBodyTaskList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeBatchTasksResponseBodyTaskList setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeBatchTasksResponseBodyTaskList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
