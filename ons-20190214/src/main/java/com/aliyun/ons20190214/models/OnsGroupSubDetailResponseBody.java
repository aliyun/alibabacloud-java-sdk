// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupSubDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public OnsGroupSubDetailResponseBodyData data;

    public static OnsGroupSubDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsGroupSubDetailResponseBody self = new OnsGroupSubDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsGroupSubDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsGroupSubDetailResponseBody setData(OnsGroupSubDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsGroupSubDetailResponseBodyData getData() {
        return this.data;
    }

    public static class OnsGroupSubDetailResponseBodyDataSubscriptionDataListSubscriptionDataList extends TeaModel {
        @NameInMap("SubString")
        public String subString;

        @NameInMap("Topic")
        public String topic;

        public static OnsGroupSubDetailResponseBodyDataSubscriptionDataListSubscriptionDataList build(java.util.Map<String, ?> map) throws Exception {
            OnsGroupSubDetailResponseBodyDataSubscriptionDataListSubscriptionDataList self = new OnsGroupSubDetailResponseBodyDataSubscriptionDataListSubscriptionDataList();
            return TeaModel.build(map, self);
        }

        public OnsGroupSubDetailResponseBodyDataSubscriptionDataListSubscriptionDataList setSubString(String subString) {
            this.subString = subString;
            return this;
        }
        public String getSubString() {
            return this.subString;
        }

        public OnsGroupSubDetailResponseBodyDataSubscriptionDataListSubscriptionDataList setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class OnsGroupSubDetailResponseBodyDataSubscriptionDataList extends TeaModel {
        @NameInMap("SubscriptionDataList")
        public java.util.List<OnsGroupSubDetailResponseBodyDataSubscriptionDataListSubscriptionDataList> subscriptionDataList;

        public static OnsGroupSubDetailResponseBodyDataSubscriptionDataList build(java.util.Map<String, ?> map) throws Exception {
            OnsGroupSubDetailResponseBodyDataSubscriptionDataList self = new OnsGroupSubDetailResponseBodyDataSubscriptionDataList();
            return TeaModel.build(map, self);
        }

        public OnsGroupSubDetailResponseBodyDataSubscriptionDataList setSubscriptionDataList(java.util.List<OnsGroupSubDetailResponseBodyDataSubscriptionDataListSubscriptionDataList> subscriptionDataList) {
            this.subscriptionDataList = subscriptionDataList;
            return this;
        }
        public java.util.List<OnsGroupSubDetailResponseBodyDataSubscriptionDataListSubscriptionDataList> getSubscriptionDataList() {
            return this.subscriptionDataList;
        }

    }

    public static class OnsGroupSubDetailResponseBodyData extends TeaModel {
        @NameInMap("SubscriptionDataList")
        public OnsGroupSubDetailResponseBodyDataSubscriptionDataList subscriptionDataList;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("MessageModel")
        public String messageModel;

        @NameInMap("Online")
        public Boolean online;

        public static OnsGroupSubDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsGroupSubDetailResponseBodyData self = new OnsGroupSubDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsGroupSubDetailResponseBodyData setSubscriptionDataList(OnsGroupSubDetailResponseBodyDataSubscriptionDataList subscriptionDataList) {
            this.subscriptionDataList = subscriptionDataList;
            return this;
        }
        public OnsGroupSubDetailResponseBodyDataSubscriptionDataList getSubscriptionDataList() {
            return this.subscriptionDataList;
        }

        public OnsGroupSubDetailResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public OnsGroupSubDetailResponseBodyData setMessageModel(String messageModel) {
            this.messageModel = messageModel;
            return this;
        }
        public String getMessageModel() {
            return this.messageModel;
        }

        public OnsGroupSubDetailResponseBodyData setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

    }

}
