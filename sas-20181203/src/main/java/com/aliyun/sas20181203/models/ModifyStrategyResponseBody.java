// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyStrategyResponseBody extends TeaModel {
    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The result returned.
    @NameInMap("Result")
    public ModifyStrategyResponseBodyResult result;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   **true**: The request was successful.
    // *   **false**: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static ModifyStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyStrategyResponseBody self = new ModifyStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyStrategyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyStrategyResponseBody setResult(ModifyStrategyResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifyStrategyResponseBodyResult getResult() {
        return this.result;
    }

    public ModifyStrategyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifyStrategyResponseBodyResult extends TeaModel {
        // The ID of the baseline check policy.
        @NameInMap("StrategyId")
        public Integer strategyId;

        public static ModifyStrategyResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifyStrategyResponseBodyResult self = new ModifyStrategyResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifyStrategyResponseBodyResult setStrategyId(Integer strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public Integer getStrategyId() {
            return this.strategyId;
        }

    }

}
