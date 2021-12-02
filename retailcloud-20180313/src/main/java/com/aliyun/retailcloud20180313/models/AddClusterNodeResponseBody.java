// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class AddClusterNodeResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public AddClusterNodeResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static AddClusterNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddClusterNodeResponseBody self = new AddClusterNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public AddClusterNodeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddClusterNodeResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public AddClusterNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddClusterNodeResponseBody setResult(AddClusterNodeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddClusterNodeResponseBodyResult getResult() {
        return this.result;
    }

    public AddClusterNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddClusterNodeResponseBodyResult extends TeaModel {
        @NameInMap("Nonsense")
        public Integer nonsense;

        public static AddClusterNodeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddClusterNodeResponseBodyResult self = new AddClusterNodeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddClusterNodeResponseBodyResult setNonsense(Integer nonsense) {
            this.nonsense = nonsense;
            return this;
        }
        public Integer getNonsense() {
            return this.nonsense;
        }

    }

}
