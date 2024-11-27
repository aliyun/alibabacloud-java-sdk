// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListAlarmEventResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public ListAlarmEventResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Parameter check error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>27B1345D-5F71-5972-8E4C-AABA6C6232F0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAlarmEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmEventResponseBody self = new ListAlarmEventResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlarmEventResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListAlarmEventResponseBody setData(ListAlarmEventResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAlarmEventResponseBodyData getData() {
        return this.data;
    }

    public ListAlarmEventResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAlarmEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlarmEventResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAlarmEventResponseBodyDataRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>webhook</p>
         */
        @NameInMap("AlarmChannel")
        public String alarmChannel;

        /**
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("AlarmContacts")
        public String alarmContacts;

        @NameInMap("AlarmMessage")
        public String alarmMessage;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        /**
         * <strong>example:</strong>
         * <p>schedulerx3_fail_alarm</p>
         */
        @NameInMap("AlarmType")
        public String alarmType;

        /**
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>test-job</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <strong>example:</strong>
         * <p>2024-10-31 16:43:51</p>
         */
        @NameInMap("Time")
        public String time;

        public static ListAlarmEventResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmEventResponseBodyDataRecords self = new ListAlarmEventResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListAlarmEventResponseBodyDataRecords setAlarmChannel(String alarmChannel) {
            this.alarmChannel = alarmChannel;
            return this;
        }
        public String getAlarmChannel() {
            return this.alarmChannel;
        }

        public ListAlarmEventResponseBodyDataRecords setAlarmContacts(String alarmContacts) {
            this.alarmContacts = alarmContacts;
            return this;
        }
        public String getAlarmContacts() {
            return this.alarmContacts;
        }

        public ListAlarmEventResponseBodyDataRecords setAlarmMessage(String alarmMessage) {
            this.alarmMessage = alarmMessage;
            return this;
        }
        public String getAlarmMessage() {
            return this.alarmMessage;
        }

        public ListAlarmEventResponseBodyDataRecords setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        public ListAlarmEventResponseBodyDataRecords setAlarmType(String alarmType) {
            this.alarmType = alarmType;
            return this;
        }
        public String getAlarmType() {
            return this.alarmType;
        }

        public ListAlarmEventResponseBodyDataRecords setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAlarmEventResponseBodyDataRecords setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListAlarmEventResponseBodyDataRecords setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class ListAlarmEventResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Records")
        public java.util.List<ListAlarmEventResponseBodyDataRecords> records;

        /**
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListAlarmEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmEventResponseBodyData self = new ListAlarmEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAlarmEventResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListAlarmEventResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAlarmEventResponseBodyData setRecords(java.util.List<ListAlarmEventResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListAlarmEventResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListAlarmEventResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
