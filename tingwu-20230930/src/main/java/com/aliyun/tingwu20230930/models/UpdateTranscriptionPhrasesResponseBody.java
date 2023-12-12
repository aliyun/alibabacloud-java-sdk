// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20230930.models;

import com.aliyun.tea.*;

public class UpdateTranscriptionPhrasesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateTranscriptionPhrasesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTranscriptionPhrasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTranscriptionPhrasesResponseBody self = new UpdateTranscriptionPhrasesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTranscriptionPhrasesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateTranscriptionPhrasesResponseBody setData(UpdateTranscriptionPhrasesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateTranscriptionPhrasesResponseBodyData getData() {
        return this.data;
    }

    public UpdateTranscriptionPhrasesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateTranscriptionPhrasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateTranscriptionPhrasesResponseBodyData extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Status")
        public String status;

        public static UpdateTranscriptionPhrasesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateTranscriptionPhrasesResponseBodyData self = new UpdateTranscriptionPhrasesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateTranscriptionPhrasesResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public UpdateTranscriptionPhrasesResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public UpdateTranscriptionPhrasesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
