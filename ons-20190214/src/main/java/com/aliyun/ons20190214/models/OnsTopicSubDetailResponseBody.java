// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicSubDetailResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public OnsTopicSubDetailResponseBodyData data;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsTopicSubDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicSubDetailResponseBody self = new OnsTopicSubDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsTopicSubDetailResponseBody setData(OnsTopicSubDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsTopicSubDetailResponseBodyData getData() {
        return this.data;
    }

    public OnsTopicSubDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class OnsTopicSubDetailResponseBodyDataSubscriptionDataListSubscriptionDataList extends TeaModel {
        /**
         * <p>The ID of the consumer group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The consumption mode. Valid values:</p>
         * <br>
         * <p>*   **CLUSTERING**: the clustering consumption mode</p>
         * <p>*   **BROADCASTING**: the broadcasting consumption mode</p>
         * <br>
         * <p>For more information about consumption modes, see [Clustering consumption and broadcasting consumption](~~43163~~).</p>
         */
        @NameInMap("MessageModel")
        public String messageModel;

        /**
         * <p>The expression based on which consumers in the consumer group subscribe to the topic.</p>
         */
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
        /**
         * <p>The information about the online consumer groups that subscribe to the topic.</p>
         */
        @NameInMap("SubscriptionDataList")
        public OnsTopicSubDetailResponseBodyDataSubscriptionDataList subscriptionDataList;

        /**
         * <p>The name of the topic.</p>
         */
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
