// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryPushStatByAppResponseBody extends TeaModel {
    @NameInMap("AppPushStats")
    public QueryPushStatByAppResponseBodyAppPushStats appPushStats;

    /**
     * <strong>example:</strong>
     * <p>9998B3CC-ED9E-4CB3-A8FB-DCC61296BFBC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryPushStatByAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPushStatByAppResponseBody self = new QueryPushStatByAppResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPushStatByAppResponseBody setAppPushStats(QueryPushStatByAppResponseBodyAppPushStats appPushStats) {
        this.appPushStats = appPushStats;
        return this;
    }
    public QueryPushStatByAppResponseBodyAppPushStats getAppPushStats() {
        return this.appPushStats;
    }

    public QueryPushStatByAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryPushStatByAppResponseBodyAppPushStatsAppPushStat extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("AcceptCount")
        public Long acceptCount;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DeletedCount")
        public Long deletedCount;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("OpenedCount")
        public Long openedCount;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("ReceivedCount")
        public Long receivedCount;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SentCount")
        public Long sentCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SmsFailedCount")
        public Long smsFailedCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SmsReceiveFailedCount")
        public Long smsReceiveFailedCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SmsReceiveSuccessCount")
        public Long smsReceiveSuccessCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SmsSentCount")
        public Long smsSentCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SmsSkipCount")
        public Long smsSkipCount;

        /**
         * <strong>example:</strong>
         * <p>2016-07-25T00:00:00Z</p>
         */
        @NameInMap("Time")
        public String time;

        public static QueryPushStatByAppResponseBodyAppPushStatsAppPushStat build(java.util.Map<String, ?> map) throws Exception {
            QueryPushStatByAppResponseBodyAppPushStatsAppPushStat self = new QueryPushStatByAppResponseBodyAppPushStatsAppPushStat();
            return TeaModel.build(map, self);
        }

        public QueryPushStatByAppResponseBodyAppPushStatsAppPushStat setAcceptCount(Long acceptCount) {
            this.acceptCount = acceptCount;
            return this;
        }
        public Long getAcceptCount() {
            return this.acceptCount;
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

        public QueryPushStatByAppResponseBodyAppPushStatsAppPushStat setSmsFailedCount(Long smsFailedCount) {
            this.smsFailedCount = smsFailedCount;
            return this;
        }
        public Long getSmsFailedCount() {
            return this.smsFailedCount;
        }

        public QueryPushStatByAppResponseBodyAppPushStatsAppPushStat setSmsReceiveFailedCount(Long smsReceiveFailedCount) {
            this.smsReceiveFailedCount = smsReceiveFailedCount;
            return this;
        }
        public Long getSmsReceiveFailedCount() {
            return this.smsReceiveFailedCount;
        }

        public QueryPushStatByAppResponseBodyAppPushStatsAppPushStat setSmsReceiveSuccessCount(Long smsReceiveSuccessCount) {
            this.smsReceiveSuccessCount = smsReceiveSuccessCount;
            return this;
        }
        public Long getSmsReceiveSuccessCount() {
            return this.smsReceiveSuccessCount;
        }

        public QueryPushStatByAppResponseBodyAppPushStatsAppPushStat setSmsSentCount(Long smsSentCount) {
            this.smsSentCount = smsSentCount;
            return this;
        }
        public Long getSmsSentCount() {
            return this.smsSentCount;
        }

        public QueryPushStatByAppResponseBodyAppPushStatsAppPushStat setSmsSkipCount(Long smsSkipCount) {
            this.smsSkipCount = smsSkipCount;
            return this;
        }
        public Long getSmsSkipCount() {
            return this.smsSkipCount;
        }

        public QueryPushStatByAppResponseBodyAppPushStatsAppPushStat setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
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
