// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeleteRdsAccountResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DeleteRdsAccountResponseBodyResult result;

    public static DeleteRdsAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRdsAccountResponseBody self = new DeleteRdsAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRdsAccountResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteRdsAccountResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DeleteRdsAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRdsAccountResponseBody setResult(DeleteRdsAccountResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteRdsAccountResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteRdsAccountResponseBodyResult extends TeaModel {
        @NameInMap("RequestId")
        public String requestId;

        public static DeleteRdsAccountResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteRdsAccountResponseBodyResult self = new DeleteRdsAccountResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteRdsAccountResponseBodyResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
