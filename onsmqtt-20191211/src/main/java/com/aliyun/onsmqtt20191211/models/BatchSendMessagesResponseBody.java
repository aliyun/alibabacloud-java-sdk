// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20191211.models;

import com.aliyun.tea.*;

public class BatchSendMessagesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Responses")
    public java.util.List<BatchSendMessagesResponseBodyResponses> responses;

    public static BatchSendMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchSendMessagesResponseBody self = new BatchSendMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchSendMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchSendMessagesResponseBody setResponses(java.util.List<BatchSendMessagesResponseBodyResponses> responses) {
        this.responses = responses;
        return this;
    }
    public java.util.List<BatchSendMessagesResponseBodyResponses> getResponses() {
        return this.responses;
    }

    public static class BatchSendMessagesResponseBodyResponses extends TeaModel {
        @NameInMap("ErrorCode")
        public Integer errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("MsgId")
        public String msgId;

        public static BatchSendMessagesResponseBodyResponses build(java.util.Map<String, ?> map) throws Exception {
            BatchSendMessagesResponseBodyResponses self = new BatchSendMessagesResponseBodyResponses();
            return TeaModel.build(map, self);
        }

        public BatchSendMessagesResponseBodyResponses setErrorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public Integer getErrorCode() {
            return this.errorCode;
        }

        public BatchSendMessagesResponseBodyResponses setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public BatchSendMessagesResponseBodyResponses setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public BatchSendMessagesResponseBodyResponses setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

    }

}
