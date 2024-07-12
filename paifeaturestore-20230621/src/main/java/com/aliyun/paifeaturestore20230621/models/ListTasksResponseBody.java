// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C33E160C-BFCA-5719-B958-942850E949F6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tasks")
    public java.util.List<ListTasksResponseBodyTasks> tasks;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTasksResponseBody self = new ListTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTasksResponseBody setTasks(java.util.List<ListTasksResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ListTasksResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public ListTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTasksResponseBodyTasks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-07-04T11:26:09.036+08:00</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>2023-07-04T11:26:09.036+08:00</p>
         */
        @NameInMap("GmtExecutedTime")
        public String gmtExecutedTime;

        /**
         * <strong>example:</strong>
         * <p>2023-07-04T11:26:09.036+08:00</p>
         */
        @NameInMap("GmtFinishedTime")
        public String gmtFinishedTime;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ObjectId")
        public String objectId;

        /**
         * <strong>example:</strong>
         * <p>ModelFeature</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>project_1</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>OfflineToOnline</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyTasks self = new ListTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyTasks setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListTasksResponseBodyTasks setGmtExecutedTime(String gmtExecutedTime) {
            this.gmtExecutedTime = gmtExecutedTime;
            return this;
        }
        public String getGmtExecutedTime() {
            return this.gmtExecutedTime;
        }

        public ListTasksResponseBodyTasks setGmtFinishedTime(String gmtFinishedTime) {
            this.gmtFinishedTime = gmtFinishedTime;
            return this;
        }
        public String getGmtFinishedTime() {
            return this.gmtFinishedTime;
        }

        public ListTasksResponseBodyTasks setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public ListTasksResponseBodyTasks setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public ListTasksResponseBodyTasks setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListTasksResponseBodyTasks setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListTasksResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTasksResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListTasksResponseBodyTasks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
