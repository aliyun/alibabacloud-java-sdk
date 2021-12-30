// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListSystemAlarmsResponseBody extends TeaModel {
    @NameInMap("Alarms")
    public java.util.List<ListSystemAlarmsResponseBodyAlarms> alarms;

    @NameInMap("RequestId")
    public String requestId;

    public static ListSystemAlarmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSystemAlarmsResponseBody self = new ListSystemAlarmsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSystemAlarmsResponseBody setAlarms(java.util.List<ListSystemAlarmsResponseBodyAlarms> alarms) {
        this.alarms = alarms;
        return this;
    }
    public java.util.List<ListSystemAlarmsResponseBodyAlarms> getAlarms() {
        return this.alarms;
    }

    public ListSystemAlarmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSystemAlarmsResponseBodyAlarms extends TeaModel {
        @NameInMap("AlarmDetail")
        public String alarmDetail;

        @NameInMap("AlarmId")
        public Integer alarmId;

        @NameInMap("AlarmType")
        public String alarmType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ReadMark")
        public Integer readMark;

        public static ListSystemAlarmsResponseBodyAlarms build(java.util.Map<String, ?> map) throws Exception {
            ListSystemAlarmsResponseBodyAlarms self = new ListSystemAlarmsResponseBodyAlarms();
            return TeaModel.build(map, self);
        }

        public ListSystemAlarmsResponseBodyAlarms setAlarmDetail(String alarmDetail) {
            this.alarmDetail = alarmDetail;
            return this;
        }
        public String getAlarmDetail() {
            return this.alarmDetail;
        }

        public ListSystemAlarmsResponseBodyAlarms setAlarmId(Integer alarmId) {
            this.alarmId = alarmId;
            return this;
        }
        public Integer getAlarmId() {
            return this.alarmId;
        }

        public ListSystemAlarmsResponseBodyAlarms setAlarmType(String alarmType) {
            this.alarmType = alarmType;
            return this;
        }
        public String getAlarmType() {
            return this.alarmType;
        }

        public ListSystemAlarmsResponseBodyAlarms setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSystemAlarmsResponseBodyAlarms setReadMark(Integer readMark) {
            this.readMark = readMark;
            return this;
        }
        public Integer getReadMark() {
            return this.readMark;
        }

    }

}
