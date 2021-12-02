// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class RebuildAppInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public RebuildAppInstanceResponseBodyResult result;

    public static RebuildAppInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebuildAppInstanceResponseBody self = new RebuildAppInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RebuildAppInstanceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public RebuildAppInstanceResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public RebuildAppInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RebuildAppInstanceResponseBody setResult(RebuildAppInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public RebuildAppInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class RebuildAppInstanceResponseBodyResult extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static RebuildAppInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            RebuildAppInstanceResponseBodyResult self = new RebuildAppInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public RebuildAppInstanceResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
