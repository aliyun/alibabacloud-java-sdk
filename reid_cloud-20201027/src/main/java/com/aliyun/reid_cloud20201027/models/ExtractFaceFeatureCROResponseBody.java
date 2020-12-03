// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201027.models;

import com.aliyun.tea.*;

public class ExtractFaceFeatureCROResponseBody extends TeaModel {
    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    // 错误信息
    @NameInMap("ErrCode")
    public ExtractFaceFeatureCROResponseBodyErrCode errCode;

    // 错误信息
    @NameInMap("Message")
    public String message;

    // 数据对象
    @NameInMap("Result")
    public java.util.List<Float> result;

    @NameInMap("RequestId")
    public String requestId;

    public static ExtractFaceFeatureCROResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExtractFaceFeatureCROResponseBody self = new ExtractFaceFeatureCROResponseBody();
        return TeaModel.build(map, self);
    }

    public ExtractFaceFeatureCROResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExtractFaceFeatureCROResponseBody setErrCode(ExtractFaceFeatureCROResponseBodyErrCode errCode) {
        this.errCode = errCode;
        return this;
    }
    public ExtractFaceFeatureCROResponseBodyErrCode getErrCode() {
        return this.errCode;
    }

    public ExtractFaceFeatureCROResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExtractFaceFeatureCROResponseBody setResult(java.util.List<Float> result) {
        this.result = result;
        return this;
    }
    public java.util.List<Float> getResult() {
        return this.result;
    }

    public ExtractFaceFeatureCROResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ExtractFaceFeatureCROResponseBodyErrCode extends TeaModel {
        // 错误消息
        @NameInMap("ErrorMsg")
        public String errorMsg;

        // 错误码
        @NameInMap("ErrorCode")
        public Float errorCode;

        // 错误名
        @NameInMap("ErrorName")
        public String errorName;

        public static ExtractFaceFeatureCROResponseBodyErrCode build(java.util.Map<String, ?> map) throws Exception {
            ExtractFaceFeatureCROResponseBodyErrCode self = new ExtractFaceFeatureCROResponseBodyErrCode();
            return TeaModel.build(map, self);
        }

        public ExtractFaceFeatureCROResponseBodyErrCode setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public ExtractFaceFeatureCROResponseBodyErrCode setErrorCode(Float errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public Float getErrorCode() {
            return this.errorCode;
        }

        public ExtractFaceFeatureCROResponseBodyErrCode setErrorName(String errorName) {
            this.errorName = errorName;
            return this;
        }
        public String getErrorName() {
            return this.errorName;
        }

    }

}
