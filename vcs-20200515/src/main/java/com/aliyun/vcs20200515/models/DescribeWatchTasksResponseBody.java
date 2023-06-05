// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeWatchTasksResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeWatchTasksResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeWatchTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWatchTasksResponseBody self = new DescribeWatchTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWatchTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeWatchTasksResponseBody setData(DescribeWatchTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeWatchTasksResponseBodyData getData() {
        return this.data;
    }

    public DescribeWatchTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeWatchTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWatchTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeWatchTasksResponseBodyDataRecords extends TeaModel {
        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("Description")
        public String description;

        @NameInMap("DeviceList")
        public String deviceList;

        @NameInMap("MessageReceiver")
        public String messageReceiver;

        @NameInMap("ScheduleCycleDates")
        public String scheduleCycleDates;

        @NameInMap("ScheduleTimes")
        public String scheduleTimes;

        @NameInMap("ScheduleType")
        public String scheduleType;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("WatchPolicyIds")
        public String watchPolicyIds;

        @NameInMap("WatchTaskId")
        public String watchTaskId;

        public static DescribeWatchTasksResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeWatchTasksResponseBodyDataRecords self = new DescribeWatchTasksResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public DescribeWatchTasksResponseBodyDataRecords setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public DescribeWatchTasksResponseBodyDataRecords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeWatchTasksResponseBodyDataRecords setDeviceList(String deviceList) {
            this.deviceList = deviceList;
            return this;
        }
        public String getDeviceList() {
            return this.deviceList;
        }

        public DescribeWatchTasksResponseBodyDataRecords setMessageReceiver(String messageReceiver) {
            this.messageReceiver = messageReceiver;
            return this;
        }
        public String getMessageReceiver() {
            return this.messageReceiver;
        }

        public DescribeWatchTasksResponseBodyDataRecords setScheduleCycleDates(String scheduleCycleDates) {
            this.scheduleCycleDates = scheduleCycleDates;
            return this;
        }
        public String getScheduleCycleDates() {
            return this.scheduleCycleDates;
        }

        public DescribeWatchTasksResponseBodyDataRecords setScheduleTimes(String scheduleTimes) {
            this.scheduleTimes = scheduleTimes;
            return this;
        }
        public String getScheduleTimes() {
            return this.scheduleTimes;
        }

        public DescribeWatchTasksResponseBodyDataRecords setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public DescribeWatchTasksResponseBodyDataRecords setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeWatchTasksResponseBodyDataRecords setWatchPolicyIds(String watchPolicyIds) {
            this.watchPolicyIds = watchPolicyIds;
            return this;
        }
        public String getWatchPolicyIds() {
            return this.watchPolicyIds;
        }

        public DescribeWatchTasksResponseBodyDataRecords setWatchTaskId(String watchTaskId) {
            this.watchTaskId = watchTaskId;
            return this;
        }
        public String getWatchTaskId() {
            return this.watchTaskId;
        }

    }

    public static class DescribeWatchTasksResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Records")
        public java.util.List<DescribeWatchTasksResponseBodyDataRecords> records;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeWatchTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeWatchTasksResponseBodyData self = new DescribeWatchTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeWatchTasksResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeWatchTasksResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeWatchTasksResponseBodyData setRecords(java.util.List<DescribeWatchTasksResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<DescribeWatchTasksResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public DescribeWatchTasksResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
