// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqTopicSubDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryMqSofamqTopicSubDetailResponseBodyData data;

    public static QueryMqSofamqTopicSubDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqTopicSubDetailResponseBody self = new QueryMqSofamqTopicSubDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqTopicSubDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMqSofamqTopicSubDetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMqSofamqTopicSubDetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMqSofamqTopicSubDetailResponseBody setData(QueryMqSofamqTopicSubDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMqSofamqTopicSubDetailResponseBodyData getData() {
        return this.data;
    }

    public static class QueryMqSofamqTopicSubDetailResponseBodyDataSubscriptionDataList extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("MessageModel")
        public String messageModel;

        @NameInMap("SubString")
        public String subString;

        public static QueryMqSofamqTopicSubDetailResponseBodyDataSubscriptionDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryMqSofamqTopicSubDetailResponseBodyDataSubscriptionDataList self = new QueryMqSofamqTopicSubDetailResponseBodyDataSubscriptionDataList();
            return TeaModel.build(map, self);
        }

        public QueryMqSofamqTopicSubDetailResponseBodyDataSubscriptionDataList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryMqSofamqTopicSubDetailResponseBodyDataSubscriptionDataList setMessageModel(String messageModel) {
            this.messageModel = messageModel;
            return this;
        }
        public String getMessageModel() {
            return this.messageModel;
        }

        public QueryMqSofamqTopicSubDetailResponseBodyDataSubscriptionDataList setSubString(String subString) {
            this.subString = subString;
            return this;
        }
        public String getSubString() {
            return this.subString;
        }

    }

    public static class QueryMqSofamqTopicSubDetailResponseBodyData extends TeaModel {
        @NameInMap("LatestSendTime")
        public Long latestSendTime;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("SubscriptionDataList")
        public java.util.List<QueryMqSofamqTopicSubDetailResponseBodyDataSubscriptionDataList> subscriptionDataList;

        public static QueryMqSofamqTopicSubDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMqSofamqTopicSubDetailResponseBodyData self = new QueryMqSofamqTopicSubDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMqSofamqTopicSubDetailResponseBodyData setLatestSendTime(Long latestSendTime) {
            this.latestSendTime = latestSendTime;
            return this;
        }
        public Long getLatestSendTime() {
            return this.latestSendTime;
        }

        public QueryMqSofamqTopicSubDetailResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public QueryMqSofamqTopicSubDetailResponseBodyData setSubscriptionDataList(java.util.List<QueryMqSofamqTopicSubDetailResponseBodyDataSubscriptionDataList> subscriptionDataList) {
            this.subscriptionDataList = subscriptionDataList;
            return this;
        }
        public java.util.List<QueryMqSofamqTopicSubDetailResponseBodyDataSubscriptionDataList> getSubscriptionDataList() {
            return this.subscriptionDataList;
        }

    }

}
