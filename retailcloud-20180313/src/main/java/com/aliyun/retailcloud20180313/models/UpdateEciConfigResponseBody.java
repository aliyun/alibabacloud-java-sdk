// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class UpdateEciConfigResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public Integer code;

    // errMsg
    @NameInMap("ErrMsg")
    public String errMsg;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // result
    @NameInMap("Result")
    public UpdateEciConfigResponseBodyResult result;

    public static UpdateEciConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEciConfigResponseBody self = new UpdateEciConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEciConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateEciConfigResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public UpdateEciConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateEciConfigResponseBody setResult(UpdateEciConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateEciConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateEciConfigResponseBodyResult extends TeaModel {
        // success
        @NameInMap("Success")
        public Boolean success;

        public static UpdateEciConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateEciConfigResponseBodyResult self = new UpdateEciConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateEciConfigResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
