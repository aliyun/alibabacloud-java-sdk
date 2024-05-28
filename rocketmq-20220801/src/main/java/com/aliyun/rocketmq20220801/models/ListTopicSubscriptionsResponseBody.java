// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListTopicSubscriptionsResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListTopicSubscriptionsResponseBodyData> data;

    @NameInMap("dynamicCode")
    public String dynamicCode;

    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListTopicSubscriptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTopicSubscriptionsResponseBody self = new ListTopicSubscriptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTopicSubscriptionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTopicSubscriptionsResponseBody setData(java.util.List<ListTopicSubscriptionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTopicSubscriptionsResponseBodyData> getData() {
        return this.data;
    }

    public ListTopicSubscriptionsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListTopicSubscriptionsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListTopicSubscriptionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTopicSubscriptionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTopicSubscriptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTopicSubscriptionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTopicSubscriptionsResponseBodyData extends TeaModel {
        @NameInMap("consistency")
        public String consistency;

        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        @NameInMap("filterExpression")
        public String filterExpression;

        @NameInMap("filterExpressionType")
        public String filterExpressionType;

        @NameInMap("messageModel")
        public String messageModel;

        @NameInMap("subscriptionStatus")
        public String subscriptionStatus;

        @NameInMap("topicName")
        public String topicName;

        public static ListTopicSubscriptionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTopicSubscriptionsResponseBodyData self = new ListTopicSubscriptionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTopicSubscriptionsResponseBodyData setConsistency(String consistency) {
            this.consistency = consistency;
            return this;
        }
        public String getConsistency() {
            return this.consistency;
        }

        public ListTopicSubscriptionsResponseBodyData setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public ListTopicSubscriptionsResponseBodyData setFilterExpression(String filterExpression) {
            this.filterExpression = filterExpression;
            return this;
        }
        public String getFilterExpression() {
            return this.filterExpression;
        }

        public ListTopicSubscriptionsResponseBodyData setFilterExpressionType(String filterExpressionType) {
            this.filterExpressionType = filterExpressionType;
            return this;
        }
        public String getFilterExpressionType() {
            return this.filterExpressionType;
        }

        public ListTopicSubscriptionsResponseBodyData setMessageModel(String messageModel) {
            this.messageModel = messageModel;
            return this;
        }
        public String getMessageModel() {
            return this.messageModel;
        }

        public ListTopicSubscriptionsResponseBodyData setSubscriptionStatus(String subscriptionStatus) {
            this.subscriptionStatus = subscriptionStatus;
            return this;
        }
        public String getSubscriptionStatus() {
            return this.subscriptionStatus;
        }

        public ListTopicSubscriptionsResponseBodyData setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

}
