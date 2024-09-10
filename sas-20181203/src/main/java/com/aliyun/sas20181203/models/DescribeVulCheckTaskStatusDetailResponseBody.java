// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulCheckTaskStatusDetailResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BE120DAB-F4E7-4C53-ADC3-A97578ABF384</p>
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
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>push_command_failed</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The status of the subtask. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: unhandled</li>
         * <li><strong>1</strong>: collecting</li>
         * <li><strong>2</strong>: collected</li>
         * <li><strong>3</strong>: matching</li>
         * <li><strong>4</strong>: complete</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerability</li>
         * <li><strong>sys</strong>: Windows system vulnerability</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability</li>
         * <li><strong>sca</strong>: vulnerability that is detected based on software component analysis</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
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
         * 
         * <strong>example:</strong>
         * <p>16190385</p>
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
