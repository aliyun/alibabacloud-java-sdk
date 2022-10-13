// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class GetBizTypeConfigResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Ext")
    public java.util.Map<String, ?> ext;

    @NameInMap("Header")
    public GetBizTypeConfigResponseBodyHeader header;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetBizTypeConfigResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static GetBizTypeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBizTypeConfigResponseBody self = new GetBizTypeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBizTypeConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetBizTypeConfigResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetBizTypeConfigResponseBody setExt(java.util.Map<String, ?> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, ?> getExt() {
        return this.ext;
    }

    public GetBizTypeConfigResponseBody setHeader(GetBizTypeConfigResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public GetBizTypeConfigResponseBodyHeader getHeader() {
        return this.header;
    }

    public GetBizTypeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBizTypeConfigResponseBody setResult(GetBizTypeConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetBizTypeConfigResponseBodyResult getResult() {
        return this.result;
    }

    public GetBizTypeConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBizTypeConfigResponseBodyHeader extends TeaModel {
        @NameInMap("CostTime")
        public Long costTime;

        @NameInMap("RpcId")
        public String rpcId;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("Version")
        public String version;

        public static GetBizTypeConfigResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            GetBizTypeConfigResponseBodyHeader self = new GetBizTypeConfigResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public GetBizTypeConfigResponseBodyHeader setCostTime(Long costTime) {
            this.costTime = costTime;
            return this;
        }
        public Long getCostTime() {
            return this.costTime;
        }

        public GetBizTypeConfigResponseBodyHeader setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public GetBizTypeConfigResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public GetBizTypeConfigResponseBodyHeader setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetBizTypeConfigResponseBodyResult extends TeaModel {
        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("Code")
        public String code;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Name")
        public String name;

        @NameInMap("TransactionMode")
        public String transactionMode;

        public static GetBizTypeConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetBizTypeConfigResponseBodyResult self = new GetBizTypeConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetBizTypeConfigResponseBodyResult setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public GetBizTypeConfigResponseBodyResult setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public GetBizTypeConfigResponseBodyResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetBizTypeConfigResponseBodyResult setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetBizTypeConfigResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBizTypeConfigResponseBodyResult setTransactionMode(String transactionMode) {
            this.transactionMode = transactionMode;
            return this;
        }
        public String getTransactionMode() {
            return this.transactionMode;
        }

    }

}
