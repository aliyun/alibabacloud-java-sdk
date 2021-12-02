// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeleteClusterResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DeleteClusterResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterResponseBody self = new DeleteClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteClusterResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteClusterResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DeleteClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteClusterResponseBody setResult(DeleteClusterResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteClusterResponseBodyResult getResult() {
        return this.result;
    }

    public DeleteClusterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteClusterResponseBodyResult extends TeaModel {
        @NameInMap("Nonsense")
        public Integer nonsense;

        public static DeleteClusterResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteClusterResponseBodyResult self = new DeleteClusterResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteClusterResponseBodyResult setNonsense(Integer nonsense) {
            this.nonsense = nonsense;
            return this;
        }
        public Integer getNonsense() {
            return this.nonsense;
        }

    }

}
