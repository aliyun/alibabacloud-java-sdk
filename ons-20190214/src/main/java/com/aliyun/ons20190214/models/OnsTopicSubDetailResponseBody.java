// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicSubDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public OnsTopicSubDetailResponseBodyData data;

    public static OnsTopicSubDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicSubDetailResponseBody self = new OnsTopicSubDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsTopicSubDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsTopicSubDetailResponseBody setData(OnsTopicSubDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsTopicSubDetailResponseBodyData getData() {
        return this.data;
    }

    public static class OnsTopicSubDetailResponseBodyDataSubscriptionDataListSubscriptionDataList extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("MessageModel")
        public String messageModel;

        @NameInMap("SubString")
        public String subString;

        public static OnsTopicSubDetailResponseBodyDataSubscriptionDataListSubscriptionDataList build(java.util.Map<String, ?> map) throws Exception {
            OnsTopicSubDetailResponseBodyDataSubscriptionDataListSubscriptionDataList self = new OnsTopicSubDetailResponseBodyDataSubscriptionDataListSubscriptionDataList();
            return TeaModel.build(map, self);
        }

        public OnsTopicSubDetailResponseBodyDataSubscriptionDataListSubscriptionDataList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public OnsTopicSubDetailResponseBodyDataSubscriptionDataListSubscriptionDataList setMessageModel(String messageModel) {
            this.messageModel = messageModel;
            return this;
        }
        public String getMessageModel() {
            return this.messageModel;
        }

        public OnsTopicSubDetailResponseBodyDataSubscriptionDataListSubscriptionDataList setSubString(String subString) {
            this.subString = subString;
            return this;
        }
        public String getSubString() {
            return this.subString;
        }

    }

    public static class OnsTopicSubDetailResponseBodyDataSubscriptionDataList extends TeaModel {
        @NameInMap("SubscriptionDataList")
        public java.util.List<OnsTopicSubDetailResponseBodyDataSubscriptionDataListSubscriptionDataList> subscriptionDataList;

        public static OnsTopicSubDetailResponseBodyDataSubscriptionDataList build(java.util.Map<String, ?> map) throws Exception {
            OnsTopicSubDetailResponseBodyDataSubscriptionDataList self = new OnsTopicSubDetailResponseBodyDataSubscriptionDataList();
            return TeaModel.build(map, self);
        }

        public OnsTopicSubDetailResponseBodyDataSubscriptionDataList setSubscriptionDataList(java.util.List<OnsTopicSubDetailResponseBodyDataSubscriptionDataListSubscriptionDataList> subscriptionDataList) {
            this.subscriptionDataList = subscriptionDataList;
            return this;
        }
        public java.util.List<OnsTopicSubDetailResponseBodyDataSubscriptionDataListSubscriptionDataList> getSubscriptionDataList() {
            return this.subscriptionDataList;
        }

    }

    public static class OnsTopicSubDetailResponseBodyData extends TeaModel {
        @NameInMap("SubscriptionDataList")
        public OnsTopicSubDetailResponseBodyDataSubscriptionDataList subscriptionDataList;

        @NameInMap("Topic")
        public String topic;

        public static OnsTopicSubDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsTopicSubDetailResponseBodyData self = new OnsTopicSubDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsTopicSubDetailResponseBodyData setSubscriptionDataList(OnsTopicSubDetailResponseBodyDataSubscriptionDataList subscriptionDataList) {
            this.subscriptionDataList = subscriptionDataList;
            return this;
        }
        public OnsTopicSubDetailResponseBodyDataSubscriptionDataList getSubscriptionDataList() {
            return this.subscriptionDataList;
        }

        public OnsTopicSubDetailResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

}
