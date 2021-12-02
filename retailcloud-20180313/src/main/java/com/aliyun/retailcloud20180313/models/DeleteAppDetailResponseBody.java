// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeleteAppDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DeleteAppDetailResponseBodyResult result;

    public static DeleteAppDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppDetailResponseBody self = new DeleteAppDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteAppDetailResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DeleteAppDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAppDetailResponseBody setResult(DeleteAppDetailResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteAppDetailResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteAppDetailResponseBodyResult extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static DeleteAppDetailResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteAppDetailResponseBodyResult self = new DeleteAppDetailResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteAppDetailResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
