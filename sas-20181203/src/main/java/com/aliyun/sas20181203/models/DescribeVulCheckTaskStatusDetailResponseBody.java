// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulCheckTaskStatusDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskStatuses")
    public java.util.List<DescribeVulCheckTaskStatusDetailResponseBodyTaskStatuses> taskStatuses;

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
        @NameInMap("Code")
        public String code;

        @NameInMap("Status")
        public String status;

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
        @NameInMap("TaskId")
        public String taskId;

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
