// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeleteAppGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DeleteAppGroupResponseBodyResult result;

    public static DeleteAppGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppGroupResponseBody self = new DeleteAppGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteAppGroupResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DeleteAppGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAppGroupResponseBody setResult(DeleteAppGroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteAppGroupResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteAppGroupResponseBodyResult extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static DeleteAppGroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteAppGroupResponseBodyResult self = new DeleteAppGroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteAppGroupResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
