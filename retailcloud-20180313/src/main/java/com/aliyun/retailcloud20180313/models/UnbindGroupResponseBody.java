// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class UnbindGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UnbindGroupResponseBodyResult result;

    public static UnbindGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindGroupResponseBody self = new UnbindGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UnbindGroupResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public UnbindGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnbindGroupResponseBody setResult(UnbindGroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UnbindGroupResponseBodyResult getResult() {
        return this.result;
    }

    public static class UnbindGroupResponseBodyResult extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static UnbindGroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UnbindGroupResponseBodyResult self = new UnbindGroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UnbindGroupResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
