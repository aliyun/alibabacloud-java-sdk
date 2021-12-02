// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class UpdateDeployConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpdateDeployConfigResponseBodyResult result;

    public static UpdateDeployConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeployConfigResponseBody self = new UpdateDeployConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDeployConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateDeployConfigResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public UpdateDeployConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDeployConfigResponseBody setResult(UpdateDeployConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateDeployConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateDeployConfigResponseBodyResult extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static UpdateDeployConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateDeployConfigResponseBodyResult self = new UpdateDeployConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateDeployConfigResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
