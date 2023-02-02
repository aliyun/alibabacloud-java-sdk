// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupSubDetailResponseBody extends TeaModel {
    /**
     * <p>The data that is returned.</p>
     */
    @NameInMap("Data")
    public OnsGroupSubDetailResponseBodyData data;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsGroupSubDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsGroupSubDetailResponseBody self = new OnsGroupSubDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsGroupSubDetailResponseBody setData(OnsGroupSubDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsGroupSubDetailResponseBodyData getData() {
        return this.data;
    }

    public OnsGroupSubDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class OnsGroupSubDetailResponseBodyDataSubscriptionDataListSubscriptionDataList extends TeaModel {
        /**
         * <p>The expression based on which consumers in the consumer group subscribe to the topic.</p>
         */
        @NameInMap("SubString")
        public String subString;

        /**
         * <p>The name of the topic to which consumers in the consumer group subscribe.</p>
         */
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
        /**
         * <p>The ID of the consumer group that you want to query.</p>
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
         * <p>Indicates whether consumers in the group are online.</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <p>The topics to which consumers in the consumer group subscribe. If all consumers in the specified group are offline, no topics are returned.</p>
         */
        @NameInMap("SubscriptionDataList")
        public OnsGroupSubDetailResponseBodyDataSubscriptionDataList subscriptionDataList;

        public static OnsGroupSubDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsGroupSubDetailResponseBodyData self = new OnsGroupSubDetailResponseBodyData();
            return TeaModel.build(map, self);
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

        public OnsGroupSubDetailResponseBodyData setSubscriptionDataList(OnsGroupSubDetailResponseBodyDataSubscriptionDataList subscriptionDataList) {
            this.subscriptionDataList = subscriptionDataList;
            return this;
        }
        public OnsGroupSubDetailResponseBodyDataSubscriptionDataList getSubscriptionDataList() {
            return this.subscriptionDataList;
        }

    }

}
