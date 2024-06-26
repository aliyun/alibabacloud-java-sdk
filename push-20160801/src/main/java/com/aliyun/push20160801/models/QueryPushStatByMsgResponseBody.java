// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryPushStatByMsgResponseBody extends TeaModel {
    @NameInMap("PushStats")
    public QueryPushStatByMsgResponseBodyPushStats pushStats;

    /**
     * <strong>example:</strong>
     * <p>CF195C34-98FB-491A-98D7-19CBC1FA880B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryPushStatByMsgResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPushStatByMsgResponseBody self = new QueryPushStatByMsgResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPushStatByMsgResponseBody setPushStats(QueryPushStatByMsgResponseBodyPushStats pushStats) {
        this.pushStats = pushStats;
        return this;
    }
    public QueryPushStatByMsgResponseBodyPushStats getPushStats() {
        return this.pushStats;
    }

    public QueryPushStatByMsgResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryPushStatByMsgResponseBodyPushStatsPushStat extends TeaModel {
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
         * <p>510427</p>
         */
        @NameInMap("MessageId")
        public String messageId;

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

        public static QueryPushStatByMsgResponseBodyPushStatsPushStat build(java.util.Map<String, ?> map) throws Exception {
            QueryPushStatByMsgResponseBodyPushStatsPushStat self = new QueryPushStatByMsgResponseBodyPushStatsPushStat();
            return TeaModel.build(map, self);
        }

        public QueryPushStatByMsgResponseBodyPushStatsPushStat setAcceptCount(Long acceptCount) {
            this.acceptCount = acceptCount;
            return this;
        }
        public Long getAcceptCount() {
            return this.acceptCount;
        }

        public QueryPushStatByMsgResponseBodyPushStatsPushStat setDeletedCount(Long deletedCount) {
            this.deletedCount = deletedCount;
            return this;
        }
        public Long getDeletedCount() {
            return this.deletedCount;
        }

        public QueryPushStatByMsgResponseBodyPushStatsPushStat setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public QueryPushStatByMsgResponseBodyPushStatsPushStat setOpenedCount(Long openedCount) {
            this.openedCount = openedCount;
            return this;
        }
        public Long getOpenedCount() {
            return this.openedCount;
        }

        public QueryPushStatByMsgResponseBodyPushStatsPushStat setReceivedCount(Long receivedCount) {
            this.receivedCount = receivedCount;
            return this;
        }
        public Long getReceivedCount() {
            return this.receivedCount;
        }

        public QueryPushStatByMsgResponseBodyPushStatsPushStat setSentCount(Long sentCount) {
            this.sentCount = sentCount;
            return this;
        }
        public Long getSentCount() {
            return this.sentCount;
        }

        public QueryPushStatByMsgResponseBodyPushStatsPushStat setSmsFailedCount(Long smsFailedCount) {
            this.smsFailedCount = smsFailedCount;
            return this;
        }
        public Long getSmsFailedCount() {
            return this.smsFailedCount;
        }

        public QueryPushStatByMsgResponseBodyPushStatsPushStat setSmsReceiveFailedCount(Long smsReceiveFailedCount) {
            this.smsReceiveFailedCount = smsReceiveFailedCount;
            return this;
        }
        public Long getSmsReceiveFailedCount() {
            return this.smsReceiveFailedCount;
        }

        public QueryPushStatByMsgResponseBodyPushStatsPushStat setSmsReceiveSuccessCount(Long smsReceiveSuccessCount) {
            this.smsReceiveSuccessCount = smsReceiveSuccessCount;
            return this;
        }
        public Long getSmsReceiveSuccessCount() {
            return this.smsReceiveSuccessCount;
        }

        public QueryPushStatByMsgResponseBodyPushStatsPushStat setSmsSentCount(Long smsSentCount) {
            this.smsSentCount = smsSentCount;
            return this;
        }
        public Long getSmsSentCount() {
            return this.smsSentCount;
        }

        public QueryPushStatByMsgResponseBodyPushStatsPushStat setSmsSkipCount(Long smsSkipCount) {
            this.smsSkipCount = smsSkipCount;
            return this;
        }
        public Long getSmsSkipCount() {
            return this.smsSkipCount;
        }

    }

    public static class QueryPushStatByMsgResponseBodyPushStats extends TeaModel {
        @NameInMap("PushStat")
        public java.util.List<QueryPushStatByMsgResponseBodyPushStatsPushStat> pushStat;

        public static QueryPushStatByMsgResponseBodyPushStats build(java.util.Map<String, ?> map) throws Exception {
            QueryPushStatByMsgResponseBodyPushStats self = new QueryPushStatByMsgResponseBodyPushStats();
            return TeaModel.build(map, self);
        }

        public QueryPushStatByMsgResponseBodyPushStats setPushStat(java.util.List<QueryPushStatByMsgResponseBodyPushStatsPushStat> pushStat) {
            this.pushStat = pushStat;
            return this;
        }
        public java.util.List<QueryPushStatByMsgResponseBodyPushStatsPushStat> getPushStat() {
            return this.pushStat;
        }

    }

}
