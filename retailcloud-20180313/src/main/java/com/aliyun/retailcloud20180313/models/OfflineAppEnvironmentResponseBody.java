// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class OfflineAppEnvironmentResponseBody extends TeaModel {
    // CodeEnum
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public OfflineAppEnvironmentResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static OfflineAppEnvironmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OfflineAppEnvironmentResponseBody self = new OfflineAppEnvironmentResponseBody();
        return TeaModel.build(map, self);
    }

    public OfflineAppEnvironmentResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public OfflineAppEnvironmentResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public OfflineAppEnvironmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OfflineAppEnvironmentResponseBody setResult(OfflineAppEnvironmentResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public OfflineAppEnvironmentResponseBodyResult getResult() {
        return this.result;
    }

    public OfflineAppEnvironmentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class OfflineAppEnvironmentResponseBodyResult extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static OfflineAppEnvironmentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            OfflineAppEnvironmentResponseBodyResult self = new OfflineAppEnvironmentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public OfflineAppEnvironmentResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
