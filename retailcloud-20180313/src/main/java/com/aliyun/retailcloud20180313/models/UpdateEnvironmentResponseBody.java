// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class UpdateEnvironmentResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpdateEnvironmentResponseBodyResult result;

    public static UpdateEnvironmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvironmentResponseBody self = new UpdateEnvironmentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEnvironmentResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateEnvironmentResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public UpdateEnvironmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateEnvironmentResponseBody setResult(UpdateEnvironmentResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateEnvironmentResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateEnvironmentResponseBodyResult extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static UpdateEnvironmentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateEnvironmentResponseBodyResult self = new UpdateEnvironmentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateEnvironmentResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
