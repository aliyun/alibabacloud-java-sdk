// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CheckUserFinishAdResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Ext")
    public java.util.Map<String, String> ext;

    @NameInMap("Header")
    public CheckUserFinishAdResponseBodyHeader header;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CheckUserFinishAdResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static CheckUserFinishAdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckUserFinishAdResponseBody self = new CheckUserFinishAdResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckUserFinishAdResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CheckUserFinishAdResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CheckUserFinishAdResponseBody setExt(java.util.Map<String, String> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, String> getExt() {
        return this.ext;
    }

    public CheckUserFinishAdResponseBody setHeader(CheckUserFinishAdResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public CheckUserFinishAdResponseBodyHeader getHeader() {
        return this.header;
    }

    public CheckUserFinishAdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckUserFinishAdResponseBody setResult(CheckUserFinishAdResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CheckUserFinishAdResponseBodyResult getResult() {
        return this.result;
    }

    public CheckUserFinishAdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckUserFinishAdResponseBodyHeader extends TeaModel {
        @NameInMap("CostTime")
        public Long costTime;

        @NameInMap("RpcId")
        public String rpcId;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("Version")
        public String version;

        public static CheckUserFinishAdResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            CheckUserFinishAdResponseBodyHeader self = new CheckUserFinishAdResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public CheckUserFinishAdResponseBodyHeader setCostTime(Long costTime) {
            this.costTime = costTime;
            return this;
        }
        public Long getCostTime() {
            return this.costTime;
        }

        public CheckUserFinishAdResponseBodyHeader setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public CheckUserFinishAdResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public CheckUserFinishAdResponseBodyHeader setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CheckUserFinishAdResponseBodyResult extends TeaModel {
        @NameInMap("Commission")
        public String commission;

        @NameInMap("MarketingType")
        public String marketingType;

        @NameInMap("Objective")
        public String objective;

        @NameInMap("Success")
        public Boolean success;

        public static CheckUserFinishAdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CheckUserFinishAdResponseBodyResult self = new CheckUserFinishAdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CheckUserFinishAdResponseBodyResult setCommission(String commission) {
            this.commission = commission;
            return this;
        }
        public String getCommission() {
            return this.commission;
        }

        public CheckUserFinishAdResponseBodyResult setMarketingType(String marketingType) {
            this.marketingType = marketingType;
            return this;
        }
        public String getMarketingType() {
            return this.marketingType;
        }

        public CheckUserFinishAdResponseBodyResult setObjective(String objective) {
            this.objective = objective;
            return this;
        }
        public String getObjective() {
            return this.objective;
        }

        public CheckUserFinishAdResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
