// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class GetSubscriptionResponseBody extends TeaModel {
    /**
     * <p>The request status. <code>OK</code> indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The subscription details.</p>
     */
    @NameInMap("Data")
    public GetSubscriptionResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance af81a389-91f0-4157-8d82-720edd02b66a
     *  does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Dynamic parameters used in the error message.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7401D698-0AAC-5909-B68E-88C68805FFB8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionResponseBody self = new GetSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSubscriptionResponseBody setData(GetSubscriptionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSubscriptionResponseBodyData getData() {
        return this.data;
    }

    public GetSubscriptionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSubscriptionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSubscriptionResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSubscriptionResponseBodyDataEventList extends TeaModel {
        /**
         * <p>Specifies whether pushes for this event are disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The event\&quot;s display name.</p>
         * 
         * <strong>example:</strong>
         * <p>通话结束</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The event name.</p>
         * 
         * <strong>example:</strong>
         * <p>Released</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetSubscriptionResponseBodyDataEventList build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionResponseBodyDataEventList self = new GetSubscriptionResponseBodyDataEventList();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionResponseBodyDataEventList setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public GetSubscriptionResponseBodyDataEventList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetSubscriptionResponseBodyDataEventList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetSubscriptionResponseBodyData extends TeaModel {
        /**
         * <p>Specifies whether the subscription is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The message queue endpoint. This parameter is required if <code>MqType</code> is set to <code>ROCKET_MQ_4</code> or <code>ROCKET_MQ_5</code>. The example endpoint is for the China (Hangzhou) region.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-l4p89zajz67.cn-hangzhou.rmq.aliyuncs.com:8080</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>A list of subscribed events.</p>
         */
        @NameInMap("EventList")
        public java.util.List<GetSubscriptionResponseBodyDataEventList> eventList;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The RocketMQ instance ID. This parameter is required if <code>MqType</code> is set to <code>ROCKET_MQ_5</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-l4p89zajz67.cn</p>
         */
        @NameInMap("MqInstanceId")
        public String mqInstanceId;

        /**
         * <p>The message queue type.</p>
         * 
         * <strong>example:</strong>
         * <p>ROCKET_MQ_4</p>
         */
        @NameInMap("MqType")
        public String mqType;

        /**
         * <p>The password for authentication. This parameter is required if <code>MqType</code> is set to <code>ROCKET_MQ_5</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>pwd</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The producer ID. This parameter is required if <code>MqType</code> is set to <code>ROCKET_MQ_4</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("ProducerId")
        public String producerId;

        /**
         * <p>The message queue topic. This parameter is required if <code>MqType</code> is set to <code>ROCKET_MQ_4</code> or <code>ROCKET_MQ_5</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The username for authentication. This parameter is required if <code>MqType</code> is set to <code>ROCKET_MQ_5</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static GetSubscriptionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionResponseBodyData self = new GetSubscriptionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionResponseBodyData setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public GetSubscriptionResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetSubscriptionResponseBodyData setEventList(java.util.List<GetSubscriptionResponseBodyDataEventList> eventList) {
            this.eventList = eventList;
            return this;
        }
        public java.util.List<GetSubscriptionResponseBodyDataEventList> getEventList() {
            return this.eventList;
        }

        public GetSubscriptionResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetSubscriptionResponseBodyData setMqInstanceId(String mqInstanceId) {
            this.mqInstanceId = mqInstanceId;
            return this;
        }
        public String getMqInstanceId() {
            return this.mqInstanceId;
        }

        public GetSubscriptionResponseBodyData setMqType(String mqType) {
            this.mqType = mqType;
            return this;
        }
        public String getMqType() {
            return this.mqType;
        }

        public GetSubscriptionResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public GetSubscriptionResponseBodyData setProducerId(String producerId) {
            this.producerId = producerId;
            return this;
        }
        public String getProducerId() {
            return this.producerId;
        }

        public GetSubscriptionResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public GetSubscriptionResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
