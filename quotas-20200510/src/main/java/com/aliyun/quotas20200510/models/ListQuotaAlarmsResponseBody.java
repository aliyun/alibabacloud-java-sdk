// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaAlarmsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of records that are returned for the query.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the position at which the query ends.</p>
     * <br>
     * <p>> An empty value indicates that all data is returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The details about the quota alert.</p>
     */
    @NameInMap("QuotaAlarms")
    public java.util.List<ListQuotaAlarmsResponseBodyQuotaAlarms> quotaAlarms;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of quota alerts.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListQuotaAlarmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaAlarmsResponseBody self = new ListQuotaAlarmsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQuotaAlarmsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListQuotaAlarmsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListQuotaAlarmsResponseBody setQuotaAlarms(java.util.List<ListQuotaAlarmsResponseBodyQuotaAlarms> quotaAlarms) {
        this.quotaAlarms = quotaAlarms;
        return this;
    }
    public java.util.List<ListQuotaAlarmsResponseBodyQuotaAlarms> getQuotaAlarms() {
        return this.quotaAlarms;
    }

    public ListQuotaAlarmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQuotaAlarmsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListQuotaAlarmsResponseBodyQuotaAlarms extends TeaModel {
        /**
         * <p>The ID of the alert.</p>
         */
        @NameInMap("AlarmId")
        public String alarmId;

        /**
         * <p>The name of the alert event.</p>
         */
        @NameInMap("AlarmName")
        public String alarmName;

        /**
         * <p>The time when the quota alert was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Indicates whether the alert threshold was reached. Valid values:</p>
         * <br>
         * <p>*   false</p>
         * <p>*   true</p>
         */
        @NameInMap("ExceedThreshold")
        public Boolean exceedThreshold;

        @NameInMap("NotifyChannels")
        public java.util.List<String> notifyChannels;

        /**
         * <p>The alert contact. The value is accountContact.</p>
         */
        @NameInMap("NotifyTarget")
        public String notifyTarget;

        /**
         * <p>The abbreviation of the Alibaba Cloud service name.</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID of the quota.</p>
         */
        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        /**
         * <p>The quota dimensions.</p>
         */
        @NameInMap("QuotaDimensions")
        public java.util.Map<String, ?> quotaDimensions;

        /**
         * <p>The used quota.</p>
         */
        @NameInMap("QuotaUsage")
        public Float quotaUsage;

        /**
         * <p>The value of the quota.</p>
         */
        @NameInMap("QuotaValue")
        public Float quotaValue;

        /**
         * <p>The numeric value of the alert threshold.</p>
         */
        @NameInMap("Threshold")
        public Float threshold;

        /**
         * <p>The percentage of the alert threshold.</p>
         */
        @NameInMap("ThresholdPercent")
        public Float thresholdPercent;

        /**
         * <p>The type of the quota alert. Valid values:</p>
         * <br>
         * <p>*   used: The alert is created for the used quota.</p>
         * <p>*   usable: The alert is created for the available quota.</p>
         */
        @NameInMap("ThresholdType")
        public String thresholdType;

        /**
         * <p>The webhook URL.</p>
         */
        @NameInMap("WebHook")
        public String webHook;

        public static ListQuotaAlarmsResponseBodyQuotaAlarms build(java.util.Map<String, ?> map) throws Exception {
            ListQuotaAlarmsResponseBodyQuotaAlarms self = new ListQuotaAlarmsResponseBodyQuotaAlarms();
            return TeaModel.build(map, self);
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setAlarmId(String alarmId) {
            this.alarmId = alarmId;
            return this;
        }
        public String getAlarmId() {
            return this.alarmId;
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setAlarmName(String alarmName) {
            this.alarmName = alarmName;
            return this;
        }
        public String getAlarmName() {
            return this.alarmName;
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setExceedThreshold(Boolean exceedThreshold) {
            this.exceedThreshold = exceedThreshold;
            return this;
        }
        public Boolean getExceedThreshold() {
            return this.exceedThreshold;
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setNotifyChannels(java.util.List<String> notifyChannels) {
            this.notifyChannels = notifyChannels;
            return this;
        }
        public java.util.List<String> getNotifyChannels() {
            return this.notifyChannels;
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setNotifyTarget(String notifyTarget) {
            this.notifyTarget = notifyTarget;
            return this;
        }
        public String getNotifyTarget() {
            return this.notifyTarget;
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setQuotaActionCode(String quotaActionCode) {
            this.quotaActionCode = quotaActionCode;
            return this;
        }
        public String getQuotaActionCode() {
            return this.quotaActionCode;
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setQuotaDimensions(java.util.Map<String, ?> quotaDimensions) {
            this.quotaDimensions = quotaDimensions;
            return this;
        }
        public java.util.Map<String, ?> getQuotaDimensions() {
            return this.quotaDimensions;
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

        public ListQuotaAlarmsResponseBodyQuotaAlarms setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setThresholdPercent(Float thresholdPercent) {
            this.thresholdPercent = thresholdPercent;
            return this;
        }
        public Float getThresholdPercent() {
            return this.thresholdPercent;
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setThresholdType(String thresholdType) {
            this.thresholdType = thresholdType;
            return this;
        }
        public String getThresholdType() {
            return this.thresholdType;
        }

        public ListQuotaAlarmsResponseBodyQuotaAlarms setWebHook(String webHook) {
            this.webHook = webHook;
            return this;
        }
        public String getWebHook() {
            return this.webHook;
        }

    }

}
