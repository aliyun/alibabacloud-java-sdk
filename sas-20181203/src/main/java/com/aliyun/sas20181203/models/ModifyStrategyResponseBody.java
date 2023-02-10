// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyStrategyResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ModifyStrategyResponseBodyResult result;

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
