// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeleteDeployConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DeleteDeployConfigResponseBodyResult result;

    public static DeleteDeployConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeployConfigResponseBody self = new DeleteDeployConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDeployConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteDeployConfigResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DeleteDeployConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDeployConfigResponseBody setResult(DeleteDeployConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteDeployConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteDeployConfigResponseBodyResult extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static DeleteDeployConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteDeployConfigResponseBodyResult self = new DeleteDeployConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteDeployConfigResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
