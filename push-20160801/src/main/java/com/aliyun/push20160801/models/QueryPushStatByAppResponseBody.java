// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryPushStatByAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AppPushStats")
    public QueryPushStatByAppResponseBodyAppPushStats appPushStats;

    public static QueryPushStatByAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPushStatByAppResponseBody self = new QueryPushStatByAppResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPushStatByAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPushStatByAppResponseBody setAppPushStats(QueryPushStatByAppResponseBodyAppPushStats appPushStats) {
        this.appPushStats = appPushStats;
        return this;
    }
    public QueryPushStatByAppResponseBodyAppPushStats getAppPushStats() {
        return this.appPushStats;
    }

    public static class QueryPushStatByAppResponseBodyAppPushStatsAppPushStat extends TeaModel {
        @NameInMap("Time")
        public String time;

        @NameInMap("DeletedCount")
        public Long deletedCount;

        @NameInMap("OpenedCount")
        public Long openedCount;

        @NameInMap("SmsReceiveSuccessCount")
        public Long smsReceiveSuccessCount;

        @NameInMap("SmsSkipCount")
        public Long smsSkipCount;

        @NameInMap("SmsReceiveFailedCount")
        public Long smsReceiveFailedCount;

        @NameInMap("SmsFailedCount")
        public Long smsFailedCount;

        @NameInMap("ReceivedCount")
        public Long receivedCount;

        @NameInMap("SentCount")
        public Long sentCount;

        @NameInMap("SmsSentCount")
        public Long smsSentCount;

        @NameInMap("AcceptCount")
        public Long acceptCount;

        public static QueryPushStatByAppResponseBodyAppPushStatsAppPushStat build(java.util.Map<String, ?> map) throws Exception {
            QueryPushStatByAppResponseBodyAppPushStatsAppPushStat self = new QueryPushStatByAppResponseBodyAppPushStatsAppPushStat();
            return TeaModel.build(map, self);
        }

        public QueryPushStatByAppResponseBodyAppPushStatsAppPushStat setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryPushStatByAppResponseBodyAppPushStatsAppPushStat setDeletedCount(Long deletedCount) {
            this.deletedCount = deletedCount;
            return this;
        }
        public Long getDeletedCount() {
            return this.deletedCount;
        }

        public QueryPushStatByAppResponseBodyAppPushStatsAppPushStat setOpenedCount(Long openedCount) {
            this.openedCount = openedCount;
            return this;
        }
        public Long getOpenedCount() {
            return this.openedCount;
        }

        public QueryPushStatByAppResponseBodyAppPushStatsAppPushStat setSmsReceiveSuccessCount(Long smsReceiveSuccessCount) {
            this.smsReceiveSuccessCount = smsReceiveSuccessCount;
            return this;
        }
        public Long getSmsReceiveSuccessCount() {
            return this.smsReceiveSuccessCount;
        }

        public QueryPushStatByAppResponseBodyAppPushStatsAppPushStat setSmsSkipCount(Long smsSkipCount) {
            this.smsSkipCount = smsSkipCount;
            return this;
        }
        public Long getSmsSkipCount() {
            return this.smsSkipCount;
        }

        public QueryPushStatByAppResponseBodyAppPushStatsAppPushStat setSmsReceiveFailedCount(Long smsReceiveFailedCount) {
            this.smsReceiveFailedCount = smsReceiveFailedCount;
            return this;
        }
        public Long getSmsReceiveFailedCount() {
            return this.smsReceiveFailedCount;
        }

        public QueryPushStatByAppResponseBodyAppPushStatsAppPushStat setSmsFailedCount(Long smsFailedCount) {
            this.smsFailedCount = smsFailedCount;
            return this;
        }
        public Long getSmsFailedCount() {
            return this.smsFailedCount;
        }

        public QueryPushStatByAppResponseBodyAppPushStatsAppPushStat setReceivedCount(Long receivedCount) {
            this.receivedCount = receivedCount;
            return this;
        }
        public Long getReceivedCount() {
            return this.receivedCount;
        }

        public QueryPushStatByAppResponseBodyAppPushStatsAppPushStat setSentCount(Long sentCount) {
            this.sentCount = sentCount;
            return this;
        }
        public Long getSentCount() {
            return this.sentCount;
        }

        public QueryPushStatByAppResponseBodyAppPushStatsAppPushStat setSmsSentCount(Long smsSentCount) {
            this.smsSentCount = smsSentCount;
            return this;
        }
        public Long getSmsSentCount() {
            return this.smsSentCount;
        }

        public QueryPushStatByAppResponseBodyAppPushStatsAppPushStat setAcceptCount(Long acceptCount) {
            this.acceptCount = acceptCount;
            return this;
        }
        public Long getAcceptCount() {
            return this.acceptCount;
        }

    }

    public static class QueryPushStatByAppResponseBodyAppPushStats extends TeaModel {
        @NameInMap("AppPushStat")
        public java.util.List<QueryPushStatByAppResponseBodyAppPushStatsAppPushStat> appPushStat;

        public static QueryPushStatByAppResponseBodyAppPushStats build(java.util.Map<String, ?> map) throws Exception {
            QueryPushStatByAppResponseBodyAppPushStats self = new QueryPushStatByAppResponseBodyAppPushStats();
            return TeaModel.build(map, self);
        }

        public QueryPushStatByAppResponseBodyAppPushStats setAppPushStat(java.util.List<QueryPushStatByAppResponseBodyAppPushStatsAppPushStat> appPushStat) {
            this.appPushStat = appPushStat;
            return this;
        }
        public java.util.List<QueryPushStatByAppResponseBodyAppPushStatsAppPushStat> getAppPushStat() {
            return this.appPushStat;
        }

    }

}
