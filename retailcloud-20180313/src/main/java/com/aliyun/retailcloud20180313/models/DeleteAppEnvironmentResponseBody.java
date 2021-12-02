// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeleteAppEnvironmentResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DeleteAppEnvironmentResponseBodyResult result;

    public static DeleteAppEnvironmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppEnvironmentResponseBody self = new DeleteAppEnvironmentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppEnvironmentResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteAppEnvironmentResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DeleteAppEnvironmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAppEnvironmentResponseBody setResult(DeleteAppEnvironmentResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteAppEnvironmentResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteAppEnvironmentResponseBodyResult extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static DeleteAppEnvironmentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteAppEnvironmentResponseBodyResult self = new DeleteAppEnvironmentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteAppEnvironmentResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
