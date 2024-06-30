// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaAlarmsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of records that are returned for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the position at which the query ends.</p>
     * <blockquote>
     * <p>An empty value indicates that all data is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
     * 
     * <strong>example:</strong>
     * <p>87F3B755-3BD2-4C76-B36A-93247002918C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of quota alerts.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
         * 
         * <strong>example:</strong>
         * <p>a2efa7fc-832f-47bb-8054-39e28012****</p>
         */
        @NameInMap("AlarmId")
        public String alarmId;

        /**
         * <p>The name of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>rules</p>
         */
        @NameInMap("AlarmName")
        public String alarmName;

        /**
         * <p>The time when the quota alert was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-27T07:23:34Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Indicates whether the alert threshold was reached. Valid values:</p>
         * <ul>
         * <li>false</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ExceedThreshold")
        public Boolean exceedThreshold;

        /**
         * <p>The alert notification methods.</p>
         */
        @NameInMap("NotifyChannels")
        public java.util.List<String> notifyChannels;

        /**
         * <p>The alert contact. The value is accountContact.</p>
         * 
         * <strong>example:</strong>
         * <p>accountContact</p>
         */
        @NameInMap("NotifyTarget")
        public String notifyTarget;

        /**
         * <p>The abbreviation of the Alibaba Cloud service name.</p>
         * 
         * <strong>example:</strong>
         * <p>config</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>q_hvnoqv</p>
         */
        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        /**
         * <p>The quota dimensions.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;regionId&quot;:&quot;cn-hangzhou&quot;}</p>
         */
        @NameInMap("QuotaDimensions")
        public java.util.Map<String, ?> quotaDimensions;

        /**
         * <p>The used quota.</p>
         * 
         * <strong>example:</strong>
         * <p>73</p>
         */
        @NameInMap("QuotaUsage")
        public Float quotaUsage;

        /**
         * <p>The value of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("QuotaValue")
        public Float quotaValue;

        /**
         * <p>The numeric value of the alert threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>160</p>
         */
        @NameInMap("Threshold")
        public Float threshold;

        /**
         * <p>The percentage of the alert threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ThresholdPercent")
        public Float thresholdPercent;

        /**
         * <p>The type of the quota alert. Valid values:</p>
         * <ul>
         * <li>used: The alert is created for the used quota.</li>
         * <li>usable: The alert is created for the available quota.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>used</p>
         */
        @NameInMap("ThresholdType")
        public String thresholdType;

        /**
         * <p>The webhook URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com/webhook">https://www.aliyun.com/webhook</a></p>
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
