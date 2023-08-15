// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetTopicResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The result data that is returned.</p>
     */
    @NameInMap("data")
    public GetTopicResponseBodyData data;

    /**
     * <p>The dynamic error code.</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message.</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The ID of the request. The system generates a unique ID for each request. You can troubleshoot issues based on the request ID.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTopicResponseBody self = new GetTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTopicResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTopicResponseBody setData(GetTopicResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTopicResponseBodyData getData() {
        return this.data;
    }

    public GetTopicResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetTopicResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetTopicResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTopicResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTopicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTopicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTopicResponseBodyData extends TeaModel {
        /**
         * <p>The time when the topic was created.</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The message type of the topic.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   TRANSACTION: transactional message</p>
         * <p>*   FIFO: ordered message</p>
         * <p>*   DELAY: scheduled or delayed message</p>
         * <p>*   NORMAL: normal message</p>
         */
        @NameInMap("messageType")
        public String messageType;

        /**
         * <p>The ID of the region in which the instance resides.</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The remarks on the topic.</p>
         */
        @NameInMap("remark")
        public String remark;

        /**
         * <p>The state of the topic.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   RUNNING: The topic is running.</p>
         * <p>*   CREATING: The topic is being created.</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The name of the topic.</p>
         */
        @NameInMap("topicName")
        public String topicName;

        /**
         * <p>The time when the topic was last updated.</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static GetTopicResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTopicResponseBodyData self = new GetTopicResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTopicResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetTopicResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetTopicResponseBodyData setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

        public GetTopicResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetTopicResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetTopicResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTopicResponseBodyData setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public GetTopicResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
