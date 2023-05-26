// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqGroupSubDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryMqSofamqGroupSubDetailResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static QueryMqSofamqGroupSubDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqGroupSubDetailResponseBody self = new QueryMqSofamqGroupSubDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqGroupSubDetailResponseBody setData(QueryMqSofamqGroupSubDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMqSofamqGroupSubDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryMqSofamqGroupSubDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMqSofamqGroupSubDetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMqSofamqGroupSubDetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class QueryMqSofamqGroupSubDetailResponseBodyDataSubscriptionDataList extends TeaModel {
        @NameInMap("Online")
        public Boolean online;

        @NameInMap("SubString")
        public String subString;

        @NameInMap("Topic")
        public String topic;

        public static QueryMqSofamqGroupSubDetailResponseBodyDataSubscriptionDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryMqSofamqGroupSubDetailResponseBodyDataSubscriptionDataList self = new QueryMqSofamqGroupSubDetailResponseBodyDataSubscriptionDataList();
            return TeaModel.build(map, self);
        }

        public QueryMqSofamqGroupSubDetailResponseBodyDataSubscriptionDataList setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public QueryMqSofamqGroupSubDetailResponseBodyDataSubscriptionDataList setSubString(String subString) {
            this.subString = subString;
            return this;
        }
        public String getSubString() {
            return this.subString;
        }

        public QueryMqSofamqGroupSubDetailResponseBodyDataSubscriptionDataList setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class QueryMqSofamqGroupSubDetailResponseBodyData extends TeaModel {
        /**
         * <p>Group ID</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("MessageModel")
        public String messageModel;

        @NameInMap("Online")
        public Boolean online;

        @NameInMap("SubscriptionDataList")
        public java.util.List<QueryMqSofamqGroupSubDetailResponseBodyDataSubscriptionDataList> subscriptionDataList;

        public static QueryMqSofamqGroupSubDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMqSofamqGroupSubDetailResponseBodyData self = new QueryMqSofamqGroupSubDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMqSofamqGroupSubDetailResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryMqSofamqGroupSubDetailResponseBodyData setMessageModel(String messageModel) {
            this.messageModel = messageModel;
            return this;
        }
        public String getMessageModel() {
            return this.messageModel;
        }

        public QueryMqSofamqGroupSubDetailResponseBodyData setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public QueryMqSofamqGroupSubDetailResponseBodyData setSubscriptionDataList(java.util.List<QueryMqSofamqGroupSubDetailResponseBodyDataSubscriptionDataList> subscriptionDataList) {
            this.subscriptionDataList = subscriptionDataList;
            return this;
        }
        public java.util.List<QueryMqSofamqGroupSubDetailResponseBodyDataSubscriptionDataList> getSubscriptionDataList() {
            return this.subscriptionDataList;
        }

    }

}
