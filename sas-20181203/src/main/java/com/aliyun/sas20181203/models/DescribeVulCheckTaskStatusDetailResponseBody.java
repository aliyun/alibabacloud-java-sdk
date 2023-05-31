// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulCheckTaskStatusDetailResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the status information about the vulnerability scan tasks on the server.</p>
     */
    @NameInMap("TaskStatuses")
    public java.util.List<DescribeVulCheckTaskStatusDetailResponseBodyTaskStatuses> taskStatuses;

    /**
     * <p>The total number of vulnerability scan tasks on the server.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeVulCheckTaskStatusDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulCheckTaskStatusDetailResponseBody self = new DescribeVulCheckTaskStatusDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVulCheckTaskStatusDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVulCheckTaskStatusDetailResponseBody setTaskStatuses(java.util.List<DescribeVulCheckTaskStatusDetailResponseBodyTaskStatuses> taskStatuses) {
        this.taskStatuses = taskStatuses;
        return this;
    }
    public java.util.List<DescribeVulCheckTaskStatusDetailResponseBodyTaskStatuses> getTaskStatuses() {
        return this.taskStatuses;
    }

    public DescribeVulCheckTaskStatusDetailResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeVulCheckTaskStatusDetailResponseBodyTaskStatusesTaskStatusList extends TeaModel {
        /**
         * <p>The error code returned.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The status of the subtask. Valid values:</p>
         * <br>
         * <p>*   **0**: unhandled</p>
         * <p>*   **1**: collecting</p>
         * <p>*   **2**: collected</p>
         * <p>*   **3**: matching</p>
         * <p>*   **4**: complete</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the vulnerability. Valid values:</p>
         * <br>
         * <p>*   **cve**: Linux software vulnerability</p>
         * <p>*   **sys**: Windows system vulnerability</p>
         * <p>*   **cms**: Web-CMS vulnerability</p>
         * <p>*   **sca**: vulnerability that is detected based on software component analysis</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeVulCheckTaskStatusDetailResponseBodyTaskStatusesTaskStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulCheckTaskStatusDetailResponseBodyTaskStatusesTaskStatusList self = new DescribeVulCheckTaskStatusDetailResponseBodyTaskStatusesTaskStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeVulCheckTaskStatusDetailResponseBodyTaskStatusesTaskStatusList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeVulCheckTaskStatusDetailResponseBodyTaskStatusesTaskStatusList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVulCheckTaskStatusDetailResponseBodyTaskStatusesTaskStatusList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeVulCheckTaskStatusDetailResponseBodyTaskStatuses extends TeaModel {
        /**
         * <p>The ID of the main task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>An array that consists of status information about the vulnerability scan subtask.</p>
         */
        @NameInMap("TaskStatusList")
        public java.util.List<DescribeVulCheckTaskStatusDetailResponseBodyTaskStatusesTaskStatusList> taskStatusList;

        public static DescribeVulCheckTaskStatusDetailResponseBodyTaskStatuses build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulCheckTaskStatusDetailResponseBodyTaskStatuses self = new DescribeVulCheckTaskStatusDetailResponseBodyTaskStatuses();
            return TeaModel.build(map, self);
        }

        public DescribeVulCheckTaskStatusDetailResponseBodyTaskStatuses setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeVulCheckTaskStatusDetailResponseBodyTaskStatuses setTaskStatusList(java.util.List<DescribeVulCheckTaskStatusDetailResponseBodyTaskStatusesTaskStatusList> taskStatusList) {
            this.taskStatusList = taskStatusList;
            return this;
        }
        public java.util.List<DescribeVulCheckTaskStatusDetailResponseBodyTaskStatusesTaskStatusList> getTaskStatusList() {
            return this.taskStatusList;
        }

    }

}
