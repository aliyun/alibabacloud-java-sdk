// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class GetSubscriptionResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
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
     * <p>Instance does not exist. Instance=ob-1234567890</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of variable values in the error message.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FDAC7-13C5-1B64-A853-999DF105B9EF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

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

    public GetSubscriptionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSubscriptionResponseBodyDataEventList extends TeaModel {
        /**
         * <p>Indicates whether the event push is disabled. A value of true indicates disabled, and a value of false indicates enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>Ringing</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>Ringing</p>
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
         * <p>Indicates whether the event push is disabled. A value of true indicates disabled, and a value of false indicates enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-h964u01wh12.cn-hangzhou.rmq.aliyuncs.com:8080</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The list of push content.</p>
         */
        @NameInMap("EventList")
        public java.util.List<GetSubscriptionResponseBodyDataEventList> eventList;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The MQ instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-3g84vpf3712</p>
         */
        @NameInMap("MqInstanceId")
        public String mqInstanceId;

        /**
         * <p>The MSMQ type.</p>
         * 
         * <strong>example:</strong>
         * <p>ROCKET_MQ_4</p>
         */
        @NameInMap("MqType")
        public String mqType;

        /**
         * <p>The password.</p>
         * 
         * <strong>example:</strong>
         * <p>pa44w0rd</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The producer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_123456</p>
         */
        @NameInMap("ProducerId")
        public String producerId;

        /**
         * <p>The topic.</p>
         * 
         * <strong>example:</strong>
         * <p>OUTBOUND_BOT_TOPIC</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
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
