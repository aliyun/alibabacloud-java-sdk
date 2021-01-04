// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaAlarmsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("QuotaAlarms")
    public java.util.List<ListQuotaAlarmsResponseBodyQuotaAlarms> quotaAlarms;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    public static ListQuotaAlarmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaAlarmsResponseBody self = new ListQuotaAlarmsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQuotaAlarmsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListQuotaAlarmsResponseBody setQuotaAlarms(java.util.List<ListQuotaAlarmsResponseBodyQuotaAlarms> quotaAlarms) {
        this.quotaAlarms = quotaAlarms;
        return this;
    }
    public java.util.List<ListQuotaAlarmsResponseBodyQuotaAlarms> getQuotaAlarms() {
        return this.quotaAlarms;
    }

    public ListQuotaAlarmsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListQuotaAlarmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQuotaAlarmsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public static class ListQuotaAlarmsResponseBodyQuotaAlarms extends TeaModel {
        @NameInMap("ThresholdPercent")
        public Float thresholdPercent;

        @NameInMap("QuotaDimensions")
        public java.util.Map<String, ?> quotaDimensions;

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

        @NameInMap("WebHook")
        public String webHook;

        @NameInMap("ExceedThreshold")
        public Boolean exceedThreshold;

        public static ListQuotaAlarmsResponseBodyQuotaAlarms build(java.util.Map<String, ?> map) throws Exception {
            ListQuotaAlarmsResponseBodyQuotaAlarms self = new ListQuotaAlarmsResponseBodyQuotaAlarms();
            return TeaModel.build(map, self);
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setThresholdPercent(Float thresholdPercent) {
            this.thresholdPercent = thresholdPercent;
            return this;
        }
        public Float getThresholdPercent() {
            return this.thresholdPercent;
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setQuotaDimensions(java.util.Map<String, ?> quotaDimensions) {
            this.quotaDimensions = quotaDimensions;
            return this;
        }
        public java.util.Map<String, ?> getQuotaDimensions() {
            return this.quotaDimensions;
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setQuotaActionCode(String quotaActionCode) {
            this.quotaActionCode = quotaActionCode;
            return this;
        }
        public String getQuotaActionCode() {
            return this.quotaActionCode;
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setAlarmName(String alarmName) {
            this.alarmName = alarmName;
            return this;
        }
        public String getAlarmName() {
            return this.alarmName;
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setNotifyTarget(String notifyTarget) {
            this.notifyTarget = notifyTarget;
            return this;
        }
        public String getNotifyTarget() {
            return this.notifyTarget;
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setNotifyChannels(java.util.List<String> notifyChannels) {
            this.notifyChannels = notifyChannels;
            return this;
        }
        public java.util.List<String> getNotifyChannels() {
            return this.notifyChannels;
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setQuotaUsage(Float quotaUsage) {
            this.quotaUsage = quotaUsage;
            return this;
        }
        public Float getQuotaUsage() {
            return this.quotaUsage;
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setQuotaValue(Float quotaValue) {
            this.quotaValue = quotaValue;
            return this;
        }
        public Float getQuotaValue() {
            return this.quotaValue;
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setAlarmId(String alarmId) {
            this.alarmId = alarmId;
            return this;
        }
        public String getAlarmId() {
            return this.alarmId;
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setWebHook(String webHook) {
            this.webHook = webHook;
            return this;
        }
        public String getWebHook() {
            return this.webHook;
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setExceedThreshold(Boolean exceedThreshold) {
            this.exceedThreshold = exceedThreshold;
            return this;
        }
        public Boolean getExceedThreshold() {
            return this.exceedThreshold;
        }

    }

}
