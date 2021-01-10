// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDmsMsgResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryDmsMsgResponseBodyData data;

    public static QueryDmsMsgResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDmsMsgResponseBody self = new QueryDmsMsgResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDmsMsgResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDmsMsgResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDmsMsgResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryDmsMsgResponseBody setData(QueryDmsMsgResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDmsMsgResponseBodyData getData() {
        return this.data;
    }

    public static class QueryDmsMsgResponseBodyData extends TeaModel {
        @NameInMap("DeliveryCount")
        public Long deliveryCount;

        @NameInMap("Eventcode")
        public String eventcode;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtLastDelivery")
        public String gmtLastDelivery;

        @NameInMap("GmtNextDelivery")
        public String gmtNextDelivery;

        @NameInMap("MessageId")
        public String messageId;

        @NameInMap("PublisherGroup")
        public String publisherGroup;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubscriberGroupDelivery")
        public String subscriberGroupDelivery;

        @NameInMap("SubscriberGroupUndelivery")
        public String subscriberGroupUndelivery;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("Transaction")
        public Boolean transaction;

        public static QueryDmsMsgResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDmsMsgResponseBodyData self = new QueryDmsMsgResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDmsMsgResponseBodyData setDeliveryCount(Long deliveryCount) {
            this.deliveryCount = deliveryCount;
            return this;
        }
        public Long getDeliveryCount() {
            return this.deliveryCount;
        }

        public QueryDmsMsgResponseBodyData setEventcode(String eventcode) {
            this.eventcode = eventcode;
            return this;
        }
        public String getEventcode() {
            return this.eventcode;
        }

        public QueryDmsMsgResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryDmsMsgResponseBodyData setGmtLastDelivery(String gmtLastDelivery) {
            this.gmtLastDelivery = gmtLastDelivery;
            return this;
        }
        public String getGmtLastDelivery() {
            return this.gmtLastDelivery;
        }

        public QueryDmsMsgResponseBodyData setGmtNextDelivery(String gmtNextDelivery) {
            this.gmtNextDelivery = gmtNextDelivery;
            return this;
        }
        public String getGmtNextDelivery() {
            return this.gmtNextDelivery;
        }

        public QueryDmsMsgResponseBodyData setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public QueryDmsMsgResponseBodyData setPublisherGroup(String publisherGroup) {
            this.publisherGroup = publisherGroup;
            return this;
        }
        public String getPublisherGroup() {
            return this.publisherGroup;
        }

        public QueryDmsMsgResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryDmsMsgResponseBodyData setSubscriberGroupDelivery(String subscriberGroupDelivery) {
            this.subscriberGroupDelivery = subscriberGroupDelivery;
            return this;
        }
        public String getSubscriberGroupDelivery() {
            return this.subscriberGroupDelivery;
        }

        public QueryDmsMsgResponseBodyData setSubscriberGroupUndelivery(String subscriberGroupUndelivery) {
            this.subscriberGroupUndelivery = subscriberGroupUndelivery;
            return this;
        }
        public String getSubscriberGroupUndelivery() {
            return this.subscriberGroupUndelivery;
        }

        public QueryDmsMsgResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public QueryDmsMsgResponseBodyData setTransaction(Boolean transaction) {
            this.transaction = transaction;
            return this;
        }
        public Boolean getTransaction() {
            return this.transaction;
        }

    }

}
