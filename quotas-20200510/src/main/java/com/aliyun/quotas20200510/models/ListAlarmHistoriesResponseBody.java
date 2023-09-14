// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListAlarmHistoriesResponseBody extends TeaModel {
    /**
     * <p>The details of the alert records.</p>
     */
    @NameInMap("AlarmHistories")
    public java.util.List<ListAlarmHistoriesResponseBodyAlarmHistories> alarmHistories;

    /**
     * <p>The maximum number of records that are returned for the query.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the position at which the query ends. An empty value indicates that all data is returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records that are returned for the query.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAlarmHistoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmHistoriesResponseBody self = new ListAlarmHistoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlarmHistoriesResponseBody setAlarmHistories(java.util.List<ListAlarmHistoriesResponseBodyAlarmHistories> alarmHistories) {
        this.alarmHistories = alarmHistories;
        return this;
    }
    public java.util.List<ListAlarmHistoriesResponseBodyAlarmHistories> getAlarmHistories() {
        return this.alarmHistories;
    }

    public ListAlarmHistoriesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAlarmHistoriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAlarmHistoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlarmHistoriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAlarmHistoriesResponseBodyAlarmHistories extends TeaModel {
        /**
         * <p>The name of the quota alert.</p>
         */
        @NameInMap("AlarmName")
        public String alarmName;

        /**
         * <p>The time when the quota alert was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("NotifyChannels")
        public java.util.List<String> notifyChannels;

        /**
         * <p>The alert contact.</p>
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
         * <p>The used quota.</p>
         */
        @NameInMap("QuotaUsage")
        public Float quotaUsage;

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

        public static ListAlarmHistoriesResponseBodyAlarmHistories build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmHistoriesResponseBodyAlarmHistories self = new ListAlarmHistoriesResponseBodyAlarmHistories();
            return TeaModel.build(map, self);
        }

        public ListAlarmHistoriesResponseBodyAlarmHistories setAlarmName(String alarmName) {
            this.alarmName = alarmName;
            return this;
        }
        public String getAlarmName() {
            return this.alarmName;
        }

        public ListAlarmHistoriesResponseBodyAlarmHistories setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAlarmHistoriesResponseBodyAlarmHistories setNotifyChannels(java.util.List<String> notifyChannels) {
            this.notifyChannels = notifyChannels;
            return this;
        }
        public java.util.List<String> getNotifyChannels() {
            return this.notifyChannels;
        }

        public ListAlarmHistoriesResponseBodyAlarmHistories setNotifyTarget(String notifyTarget) {
            this.notifyTarget = notifyTarget;
            return this;
        }
        public String getNotifyTarget() {
            return this.notifyTarget;
        }

        public ListAlarmHistoriesResponseBodyAlarmHistories setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListAlarmHistoriesResponseBodyAlarmHistories setQuotaActionCode(String quotaActionCode) {
            this.quotaActionCode = quotaActionCode;
            return this;
        }
        public String getQuotaActionCode() {
            return this.quotaActionCode;
        }

        public ListAlarmHistoriesResponseBodyAlarmHistories setQuotaUsage(Float quotaUsage) {
            this.quotaUsage = quotaUsage;
            return this;
        }
        public Float getQuotaUsage() {
            return this.quotaUsage;
        }

        public ListAlarmHistoriesResponseBodyAlarmHistories setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public ListAlarmHistoriesResponseBodyAlarmHistories setThresholdPercent(Float thresholdPercent) {
            this.thresholdPercent = thresholdPercent;
            return this;
        }
        public Float getThresholdPercent() {
            return this.thresholdPercent;
        }

    }

}
