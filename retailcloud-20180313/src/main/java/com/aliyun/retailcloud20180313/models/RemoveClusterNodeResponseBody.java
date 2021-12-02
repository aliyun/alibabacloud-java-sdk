// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class RemoveClusterNodeResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public RemoveClusterNodeResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static RemoveClusterNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveClusterNodeResponseBody self = new RemoveClusterNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveClusterNodeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public RemoveClusterNodeResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public RemoveClusterNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveClusterNodeResponseBody setResult(RemoveClusterNodeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public RemoveClusterNodeResponseBodyResult getResult() {
        return this.result;
    }

    public RemoveClusterNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RemoveClusterNodeResponseBodyResult extends TeaModel {
        @NameInMap("Nonsense")
        public Integer nonsense;

        public static RemoveClusterNodeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            RemoveClusterNodeResponseBodyResult self = new RemoveClusterNodeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public RemoveClusterNodeResponseBodyResult setNonsense(Integer nonsense) {
            this.nonsense = nonsense;
            return this;
        }
        public Integer getNonsense() {
            return this.nonsense;
        }

    }

}
