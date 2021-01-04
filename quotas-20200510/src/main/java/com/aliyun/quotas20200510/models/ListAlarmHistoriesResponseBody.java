// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListAlarmHistoriesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("AlarmHistories")
    public java.util.List<ListAlarmHistoriesResponseBodyAlarmHistories> alarmHistories;

    public static ListAlarmHistoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmHistoriesResponseBody self = new ListAlarmHistoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlarmHistoriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public ListAlarmHistoriesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAlarmHistoriesResponseBody setAlarmHistories(java.util.List<ListAlarmHistoriesResponseBodyAlarmHistories> alarmHistories) {
        this.alarmHistories = alarmHistories;
        return this;
    }
    public java.util.List<ListAlarmHistoriesResponseBodyAlarmHistories> getAlarmHistories() {
        return this.alarmHistories;
    }

    public static class ListAlarmHistoriesResponseBodyAlarmHistories extends TeaModel {
        @NameInMap("QuotaUsage")
        public Float quotaUsage;

        @NameInMap("ThresholdPercent")
        public Float thresholdPercent;

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

        @NameInMap("Threshold")
        public Float threshold;

        @NameInMap("ProductCode")
        public String productCode;

        public static ListAlarmHistoriesResponseBodyAlarmHistories build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmHistoriesResponseBodyAlarmHistories self = new ListAlarmHistoriesResponseBodyAlarmHistories();
            return TeaModel.build(map, self);
        }

        public ListAlarmHistoriesResponseBodyAlarmHistories setQuotaUsage(Float quotaUsage) {
            this.quotaUsage = quotaUsage;
            return this;
        }
        public Float getQuotaUsage() {
            return this.quotaUsage;
        }

        public ListAlarmHistoriesResponseBodyAlarmHistories setThresholdPercent(Float thresholdPercent) {
            this.thresholdPercent = thresholdPercent;
            return this;
        }
        public Float getThresholdPercent() {
            return this.thresholdPercent;
        }

        public ListAlarmHistoriesResponseBodyAlarmHistories setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAlarmHistoriesResponseBodyAlarmHistories setQuotaActionCode(String quotaActionCode) {
            this.quotaActionCode = quotaActionCode;
            return this;
        }
        public String getQuotaActionCode() {
            return this.quotaActionCode;
        }

        public ListAlarmHistoriesResponseBodyAlarmHistories setAlarmName(String alarmName) {
            this.alarmName = alarmName;
            return this;
        }
        public String getAlarmName() {
            return this.alarmName;
        }

        public ListAlarmHistoriesResponseBodyAlarmHistories setNotifyTarget(String notifyTarget) {
            this.notifyTarget = notifyTarget;
            return this;
        }
        public String getNotifyTarget() {
            return this.notifyTarget;
        }

        public ListAlarmHistoriesResponseBodyAlarmHistories setNotifyChannels(java.util.List<String> notifyChannels) {
            this.notifyChannels = notifyChannels;
            return this;
        }
        public java.util.List<String> getNotifyChannels() {
            return this.notifyChannels;
        }

        public ListAlarmHistoriesResponseBodyAlarmHistories setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public ListAlarmHistoriesResponseBodyAlarmHistories setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

}
