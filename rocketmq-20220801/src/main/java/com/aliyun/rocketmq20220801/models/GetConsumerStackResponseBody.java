// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetConsumerStackResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Topic.NotFound</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public GetConsumerStackResponseBodyData data;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message.</p>
     * 
     * <strong>example:</strong>
     * <p>instanceId</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The instance cannot be found.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30F2CBC7-F69D-5D78-9661-0254C9E1FBFA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetConsumerStackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerStackResponseBody self = new GetConsumerStackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConsumerStackResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetConsumerStackResponseBody setData(GetConsumerStackResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetConsumerStackResponseBodyData getData() {
        return this.data;
    }

    public GetConsumerStackResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetConsumerStackResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetConsumerStackResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetConsumerStackResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetConsumerStackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConsumerStackResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetConsumerStackResponseBodyDataStacks extends TeaModel {
        /**
         * <p>Thread id.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("thread")
        public String thread;

        /**
         * <p>Stack Information.</p>
         */
        @NameInMap("tracks")
        public java.util.List<String> tracks;

        public static GetConsumerStackResponseBodyDataStacks build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerStackResponseBodyDataStacks self = new GetConsumerStackResponseBodyDataStacks();
            return TeaModel.build(map, self);
        }

        public GetConsumerStackResponseBodyDataStacks setThread(String thread) {
            this.thread = thread;
            return this;
        }
        public String getThread() {
            return this.thread;
        }

        public GetConsumerStackResponseBodyDataStacks setTracks(java.util.List<String> tracks) {
            this.tracks = tracks;
            return this;
        }
        public java.util.List<String> getTracks() {
            return this.tracks;
        }

    }

    public static class GetConsumerStackResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the consumer group.</p>
         * 
         * <strong>example:</strong>
         * <p>CID-TEST</p>
         */
        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-7e22ody****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>Stack Information.</p>
         */
        @NameInMap("stacks")
        public java.util.List<GetConsumerStackResponseBodyDataStacks> stacks;

        public static GetConsumerStackResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerStackResponseBodyData self = new GetConsumerStackResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetConsumerStackResponseBodyData setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public GetConsumerStackResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetConsumerStackResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetConsumerStackResponseBodyData setStacks(java.util.List<GetConsumerStackResponseBodyDataStacks> stacks) {
            this.stacks = stacks;
            return this;
        }
        public java.util.List<GetConsumerStackResponseBodyDataStacks> getStacks() {
            return this.stacks;
        }

    }

}
