// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ListImportTasksResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<ListImportTasksResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1E43AAE0-BEE8-43DA-860D-EAF2AA0724DC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListImportTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImportTasksResponseBody self = new ListImportTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImportTasksResponseBody setItems(java.util.List<ListImportTasksResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListImportTasksResponseBodyItems> getItems() {
        return this.items;
    }

    public ListImportTasksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListImportTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListImportTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListImportTasksResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2018-05-30T14:30:00Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <strong>example:</strong>
         * <p>5.7</p>
         */
        @NameInMap("DbVersion")
        public String dbVersion;

        /**
         * <strong>example:</strong>
         * <p>Importing</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>rm-bp*****</p>
         */
        @NameInMap("TargetInstanceName")
        public String targetInstanceName;

        /**
         * <strong>example:</strong>
         * <p>342900000</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <strong>example:</strong>
         * <p>362c6c7a-4d20-4eac-898c-1495ceab374c</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <strong>example:</strong>
         * <p>import</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static ListImportTasksResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListImportTasksResponseBodyItems self = new ListImportTasksResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListImportTasksResponseBodyItems setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListImportTasksResponseBodyItems setDbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            return this;
        }
        public String getDbVersion() {
            return this.dbVersion;
        }

        public ListImportTasksResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListImportTasksResponseBodyItems setTargetInstanceName(String targetInstanceName) {
            this.targetInstanceName = targetInstanceName;
            return this;
        }
        public String getTargetInstanceName() {
            return this.targetInstanceName;
        }

        public ListImportTasksResponseBodyItems setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public ListImportTasksResponseBodyItems setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListImportTasksResponseBodyItems setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
