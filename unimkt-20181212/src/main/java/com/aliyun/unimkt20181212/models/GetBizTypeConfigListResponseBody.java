// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class GetBizTypeConfigListResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Ext")
    public java.util.Map<String, ?> ext;

    @NameInMap("Header")
    public GetBizTypeConfigListResponseBodyHeader header;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<GetBizTypeConfigListResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static GetBizTypeConfigListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBizTypeConfigListResponseBody self = new GetBizTypeConfigListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBizTypeConfigListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetBizTypeConfigListResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetBizTypeConfigListResponseBody setExt(java.util.Map<String, ?> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, ?> getExt() {
        return this.ext;
    }

    public GetBizTypeConfigListResponseBody setHeader(GetBizTypeConfigListResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public GetBizTypeConfigListResponseBodyHeader getHeader() {
        return this.header;
    }

    public GetBizTypeConfigListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBizTypeConfigListResponseBody setResult(java.util.List<GetBizTypeConfigListResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetBizTypeConfigListResponseBodyResult> getResult() {
        return this.result;
    }

    public GetBizTypeConfigListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBizTypeConfigListResponseBodyHeader extends TeaModel {
        @NameInMap("CostTime")
        public Long costTime;

        @NameInMap("RpcId")
        public String rpcId;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("Version")
        public String version;

        public static GetBizTypeConfigListResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            GetBizTypeConfigListResponseBodyHeader self = new GetBizTypeConfigListResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public GetBizTypeConfigListResponseBodyHeader setCostTime(Long costTime) {
            this.costTime = costTime;
            return this;
        }
        public Long getCostTime() {
            return this.costTime;
        }

        public GetBizTypeConfigListResponseBodyHeader setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public GetBizTypeConfigListResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public GetBizTypeConfigListResponseBodyHeader setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetBizTypeConfigListResponseBodyResult extends TeaModel {
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

        public static GetBizTypeConfigListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetBizTypeConfigListResponseBodyResult self = new GetBizTypeConfigListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetBizTypeConfigListResponseBodyResult setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public GetBizTypeConfigListResponseBodyResult setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public GetBizTypeConfigListResponseBodyResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetBizTypeConfigListResponseBodyResult setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetBizTypeConfigListResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBizTypeConfigListResponseBodyResult setTransactionMode(String transactionMode) {
            this.transactionMode = transactionMode;
            return this;
        }
        public String getTransactionMode() {
            return this.transactionMode;
        }

    }

}
