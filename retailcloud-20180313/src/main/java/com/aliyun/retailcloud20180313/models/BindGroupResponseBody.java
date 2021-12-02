// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class BindGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public BindGroupResponseBodyResult result;

    public static BindGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindGroupResponseBody self = new BindGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public BindGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public BindGroupResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public BindGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindGroupResponseBody setResult(BindGroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public BindGroupResponseBodyResult getResult() {
        return this.result;
    }

    public static class BindGroupResponseBodyResult extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static BindGroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            BindGroupResponseBodyResult self = new BindGroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public BindGroupResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
