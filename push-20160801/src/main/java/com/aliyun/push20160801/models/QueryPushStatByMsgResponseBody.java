// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryPushStatByMsgResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PushStats")
    public QueryPushStatByMsgResponseBodyPushStats pushStats;

    public static QueryPushStatByMsgResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPushStatByMsgResponseBody self = new QueryPushStatByMsgResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPushStatByMsgResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPushStatByMsgResponseBody setPushStats(QueryPushStatByMsgResponseBodyPushStats pushStats) {
        this.pushStats = pushStats;
        return this;
    }
    public QueryPushStatByMsgResponseBodyPushStats getPushStats() {
        return this.pushStats;
    }

    public static class QueryPushStatByMsgResponseBodyPushStatsPushStat extends TeaModel {
        @NameInMap("MessageId")
        public String messageId;

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

        public static QueryPushStatByMsgResponseBodyPushStatsPushStat build(java.util.Map<String, ?> map) throws Exception {
            QueryPushStatByMsgResponseBodyPushStatsPushStat self = new QueryPushStatByMsgResponseBodyPushStatsPushStat();
            return TeaModel.build(map, self);
        }

        public QueryPushStatByMsgResponseBodyPushStatsPushStat setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public QueryPushStatByMsgResponseBodyPushStatsPushStat setDeletedCount(Long deletedCount) {
            this.deletedCount = deletedCount;
            return this;
        }
        public Long getDeletedCount() {
            return this.deletedCount;
        }

        public QueryPushStatByMsgResponseBodyPushStatsPushStat setOpenedCount(Long openedCount) {
            this.openedCount = openedCount;
            return this;
        }
        public Long getOpenedCount() {
            return this.openedCount;
        }

        public QueryPushStatByMsgResponseBodyPushStatsPushStat setSmsReceiveSuccessCount(Long smsReceiveSuccessCount) {
            this.smsReceiveSuccessCount = smsReceiveSuccessCount;
            return this;
        }
        public Long getSmsReceiveSuccessCount() {
            return this.smsReceiveSuccessCount;
        }

        public QueryPushStatByMsgResponseBodyPushStatsPushStat setSmsSkipCount(Long smsSkipCount) {
            this.smsSkipCount = smsSkipCount;
            return this;
        }
        public Long getSmsSkipCount() {
            return this.smsSkipCount;
        }

        public QueryPushStatByMsgResponseBodyPushStatsPushStat setSmsReceiveFailedCount(Long smsReceiveFailedCount) {
            this.smsReceiveFailedCount = smsReceiveFailedCount;
            return this;
        }
        public Long getSmsReceiveFailedCount() {
            return this.smsReceiveFailedCount;
        }

        public QueryPushStatByMsgResponseBodyPushStatsPushStat setSmsFailedCount(Long smsFailedCount) {
            this.smsFailedCount = smsFailedCount;
            return this;
        }
        public Long getSmsFailedCount() {
            return this.smsFailedCount;
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

        public QueryPushStatByMsgResponseBodyPushStatsPushStat setSmsSentCount(Long smsSentCount) {
            this.smsSentCount = smsSentCount;
            return this;
        }
        public Long getSmsSentCount() {
            return this.smsSentCount;
        }

        public QueryPushStatByMsgResponseBodyPushStatsPushStat setAcceptCount(Long acceptCount) {
            this.acceptCount = acceptCount;
            return this;
        }
        public Long getAcceptCount() {
            return this.acceptCount;
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
