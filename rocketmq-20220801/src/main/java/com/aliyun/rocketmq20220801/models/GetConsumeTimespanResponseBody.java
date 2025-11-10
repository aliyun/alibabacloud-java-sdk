// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetConsumeTimespanResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>MissingInstanceId</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetConsumeTimespanResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Parameter instanceId is mandatory for this action .</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>C115601B-8736-5BBF-AC99-7FEAE1245A80</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetConsumeTimespanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConsumeTimespanResponseBody self = new GetConsumeTimespanResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConsumeTimespanResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetConsumeTimespanResponseBody setData(GetConsumeTimespanResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetConsumeTimespanResponseBodyData getData() {
        return this.data;
    }

    public GetConsumeTimespanResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetConsumeTimespanResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetConsumeTimespanResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetConsumeTimespanResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetConsumeTimespanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConsumeTimespanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetConsumeTimespanResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1570761026400</p>
         */
        @NameInMap("consumeTimestamp")
        public Long consumeTimestamp;

        /**
         * <strong>example:</strong>
         * <p>CID-TEST</p>
         */
        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        /**
         * <strong>example:</strong>
         * <p>rmq-cn-7e22ody****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>1570761026833</p>
         */
        @NameInMap("maxTimestamp")
        public Long maxTimestamp;

        /**
         * <strong>example:</strong>
         * <p>1570761026222</p>
         */
        @NameInMap("minTimestamp")
        public Long minTimestamp;

        /**
         * <strong>example:</strong>
         * <p>topic_test</p>
         */
        @NameInMap("topicName")
        public String topicName;

        public static GetConsumeTimespanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetConsumeTimespanResponseBodyData self = new GetConsumeTimespanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetConsumeTimespanResponseBodyData setConsumeTimestamp(Long consumeTimestamp) {
            this.consumeTimestamp = consumeTimestamp;
            return this;
        }
        public Long getConsumeTimestamp() {
            return this.consumeTimestamp;
        }

        public GetConsumeTimespanResponseBodyData setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public GetConsumeTimespanResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetConsumeTimespanResponseBodyData setMaxTimestamp(Long maxTimestamp) {
            this.maxTimestamp = maxTimestamp;
            return this;
        }
        public Long getMaxTimestamp() {
            return this.maxTimestamp;
        }

        public GetConsumeTimespanResponseBodyData setMinTimestamp(Long minTimestamp) {
            this.minTimestamp = minTimestamp;
            return this;
        }
        public Long getMinTimestamp() {
            return this.minTimestamp;
        }

        public GetConsumeTimespanResponseBodyData setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

}
