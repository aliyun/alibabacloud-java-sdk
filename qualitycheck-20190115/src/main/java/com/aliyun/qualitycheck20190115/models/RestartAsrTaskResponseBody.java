// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RestartAsrTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RestartAsrTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RestartAsrTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartAsrTaskResponseBody self = new RestartAsrTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartAsrTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RestartAsrTaskResponseBody setData(RestartAsrTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RestartAsrTaskResponseBodyData getData() {
        return this.data;
    }

    public RestartAsrTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RestartAsrTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RestartAsrTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RestartAsrTaskResponseBodyDataRestartResult extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static RestartAsrTaskResponseBodyDataRestartResult build(java.util.Map<String, ?> map) throws Exception {
            RestartAsrTaskResponseBodyDataRestartResult self = new RestartAsrTaskResponseBodyDataRestartResult();
            return TeaModel.build(map, self);
        }

        public RestartAsrTaskResponseBodyDataRestartResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public RestartAsrTaskResponseBodyDataRestartResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RestartAsrTaskResponseBodyDataRestartResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class RestartAsrTaskResponseBodyData extends TeaModel {
        @NameInMap("RestartResult")
        public java.util.List<RestartAsrTaskResponseBodyDataRestartResult> restartResult;

        public static RestartAsrTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RestartAsrTaskResponseBodyData self = new RestartAsrTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RestartAsrTaskResponseBodyData setRestartResult(java.util.List<RestartAsrTaskResponseBodyDataRestartResult> restartResult) {
            this.restartResult = restartResult;
            return this;
        }
        public java.util.List<RestartAsrTaskResponseBodyDataRestartResult> getRestartResult() {
            return this.restartResult;
        }

    }

}
