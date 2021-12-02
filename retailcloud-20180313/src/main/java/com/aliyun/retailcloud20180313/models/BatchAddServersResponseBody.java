// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class BatchAddServersResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public BatchAddServersResponseBodyResult result;

    public static BatchAddServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchAddServersResponseBody self = new BatchAddServersResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchAddServersResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public BatchAddServersResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public BatchAddServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchAddServersResponseBody setResult(BatchAddServersResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public BatchAddServersResponseBodyResult getResult() {
        return this.result;
    }

    public static class BatchAddServersResponseBodyResult extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static BatchAddServersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            BatchAddServersResponseBodyResult self = new BatchAddServersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public BatchAddServersResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
