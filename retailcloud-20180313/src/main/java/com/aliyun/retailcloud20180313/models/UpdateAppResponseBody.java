// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class UpdateAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpdateAppResponseBodyResult result;

    public static UpdateAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppResponseBody self = new UpdateAppResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAppResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateAppResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public UpdateAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAppResponseBody setResult(UpdateAppResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateAppResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateAppResponseBodyResult extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static UpdateAppResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppResponseBodyResult self = new UpdateAppResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateAppResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
