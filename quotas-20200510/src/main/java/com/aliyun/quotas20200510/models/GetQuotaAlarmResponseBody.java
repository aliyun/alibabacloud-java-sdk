// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetQuotaAlarmResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("QuotaAlarm")
    public GetQuotaAlarmResponseBodyQuotaAlarm quotaAlarm;

    public static GetQuotaAlarmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaAlarmResponseBody self = new GetQuotaAlarmResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQuotaAlarmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQuotaAlarmResponseBody setQuotaAlarm(GetQuotaAlarmResponseBodyQuotaAlarm quotaAlarm) {
        this.quotaAlarm = quotaAlarm;
        return this;
    }
    public GetQuotaAlarmResponseBodyQuotaAlarm getQuotaAlarm() {
        return this.quotaAlarm;
    }

    public static class GetQuotaAlarmResponseBodyQuotaAlarm extends TeaModel {
        @NameInMap("ThresholdPercent")
        public Float thresholdPercent;

        @NameInMap("QuotaDimension")
        public java.util.Map<String, ?> quotaDimension;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        @NameInMap("AlarmName")
        public String alarmName;

        @NameInMap("NotifyTarget")
        public String notifyTarget;

        @NameInMap("NotifyChannels")
        public java.util.List<String> notifyChannels;

        @NameInMap("QuotaUsage")
        public Float quotaUsage;

        @NameInMap("QuotaValue")
        public Float quotaValue;

        @NameInMap("AlarmId")
        public String alarmId;

        @NameInMap("Threshold")
        public Float threshold;

        @NameInMap("ProductCode")
        public String productCode;

        public static GetQuotaAlarmResponseBodyQuotaAlarm build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaAlarmResponseBodyQuotaAlarm self = new GetQuotaAlarmResponseBodyQuotaAlarm();
            return TeaModel.build(map, self);
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setThresholdPercent(Float thresholdPercent) {
            this.thresholdPercent = thresholdPercent;
            return this;
        }
        public Float getThresholdPercent() {
            return this.thresholdPercent;
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setQuotaDimension(java.util.Map<String, ?> quotaDimension) {
            this.quotaDimension = quotaDimension;
            return this;
        }
        public java.util.Map<String, ?> getQuotaDimension() {
            return this.quotaDimension;
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setQuotaActionCode(String quotaActionCode) {
            this.quotaActionCode = quotaActionCode;
            return this;
        }
        public String getQuotaActionCode() {
            return this.quotaActionCode;
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setAlarmName(String alarmName) {
            this.alarmName = alarmName;
            return this;
        }
        public String getAlarmName() {
            return this.alarmName;
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setNotifyTarget(String notifyTarget) {
            this.notifyTarget = notifyTarget;
            return this;
        }
        public String getNotifyTarget() {
            return this.notifyTarget;
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setNotifyChannels(java.util.List<String> notifyChannels) {
            this.notifyChannels = notifyChannels;
            return this;
        }
        public java.util.List<String> getNotifyChannels() {
            return this.notifyChannels;
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setQuotaUsage(Float quotaUsage) {
            this.quotaUsage = quotaUsage;
            return this;
        }
        public Float getQuotaUsage() {
            return this.quotaUsage;
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setQuotaValue(Float quotaValue) {
            this.quotaValue = quotaValue;
            return this;
        }
        public Float getQuotaValue() {
            return this.quotaValue;
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setAlarmId(String alarmId) {
            this.alarmId = alarmId;
            return this;
        }
        public String getAlarmId() {
            return this.alarmId;
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public GetQuotaAlarmResponseBodyQuotaAlarm setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

}
