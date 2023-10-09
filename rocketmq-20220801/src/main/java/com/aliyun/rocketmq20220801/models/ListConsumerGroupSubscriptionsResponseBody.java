// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListConsumerGroupSubscriptionsResponseBody extends TeaModel {
    /**
     * <p>The returned error code.</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public java.util.List<ListConsumerGroupSubscriptionsResponseBodyData> data;

    /**
     * <p>The returned dynamic error code.</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <p>The returned dynamic error message.</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The returned HTTP status code.</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned error message.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListConsumerGroupSubscriptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerGroupSubscriptionsResponseBody self = new ListConsumerGroupSubscriptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConsumerGroupSubscriptionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListConsumerGroupSubscriptionsResponseBody setData(java.util.List<ListConsumerGroupSubscriptionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListConsumerGroupSubscriptionsResponseBodyData> getData() {
        return this.data;
    }

    public ListConsumerGroupSubscriptionsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListConsumerGroupSubscriptionsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListConsumerGroupSubscriptionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListConsumerGroupSubscriptionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListConsumerGroupSubscriptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConsumerGroupSubscriptionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListConsumerGroupSubscriptionsResponseBodyData extends TeaModel {
        /**
         * <p>The consumer group ID.</p>
         */
        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        /**
         * <p>The filter expression.</p>
         */
        @NameInMap("filterExpression")
        public String filterExpression;

        /**
         * <p>The type of the filter expression. Valid values: SQL, TAG, and UNSPECIFIED.</p>
         */
        @NameInMap("filterExpressionType")
        public String filterExpressionType;

        /**
         * <p>The consumption mode. Valid values: BROADCASTING and CLUSTERING.</p>
         */
        @NameInMap("messageModel")
        public String messageModel;

        /**
         * <p>The subscription status. Valid values: ONLINE and OFFLINE.</p>
         */
        @NameInMap("subscriptionStatus")
        public String subscriptionStatus;

        /**
         * <p>Indicates whether the topic is created.</p>
         */
        @NameInMap("topicCreated")
        public Boolean topicCreated;

        /**
         * <p>The topic to which the consumer group subscribes.</p>
         */
        @NameInMap("topicName")
        public String topicName;

        public static ListConsumerGroupSubscriptionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListConsumerGroupSubscriptionsResponseBodyData self = new ListConsumerGroupSubscriptionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListConsumerGroupSubscriptionsResponseBodyData setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public ListConsumerGroupSubscriptionsResponseBodyData setFilterExpression(String filterExpression) {
            this.filterExpression = filterExpression;
            return this;
        }
        public String getFilterExpression() {
            return this.filterExpression;
        }

        public ListConsumerGroupSubscriptionsResponseBodyData setFilterExpressionType(String filterExpressionType) {
            this.filterExpressionType = filterExpressionType;
            return this;
        }
        public String getFilterExpressionType() {
            return this.filterExpressionType;
        }

        public ListConsumerGroupSubscriptionsResponseBodyData setMessageModel(String messageModel) {
            this.messageModel = messageModel;
            return this;
        }
        public String getMessageModel() {
            return this.messageModel;
        }

        public ListConsumerGroupSubscriptionsResponseBodyData setSubscriptionStatus(String subscriptionStatus) {
            this.subscriptionStatus = subscriptionStatus;
            return this;
        }
        public String getSubscriptionStatus() {
            return this.subscriptionStatus;
        }

        public ListConsumerGroupSubscriptionsResponseBodyData setTopicCreated(Boolean topicCreated) {
            this.topicCreated = topicCreated;
            return this;
        }
        public Boolean getTopicCreated() {
            return this.topicCreated;
        }

        public ListConsumerGroupSubscriptionsResponseBodyData setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

}
