// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class GetDeliveryTypeConfigListResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Ext")
    public java.util.Map<String, ?> ext;

    @NameInMap("Header")
    public GetDeliveryTypeConfigListResponseBodyHeader header;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<GetDeliveryTypeConfigListResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static GetDeliveryTypeConfigListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeliveryTypeConfigListResponseBody self = new GetDeliveryTypeConfigListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeliveryTypeConfigListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDeliveryTypeConfigListResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetDeliveryTypeConfigListResponseBody setExt(java.util.Map<String, ?> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, ?> getExt() {
        return this.ext;
    }

    public GetDeliveryTypeConfigListResponseBody setHeader(GetDeliveryTypeConfigListResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public GetDeliveryTypeConfigListResponseBodyHeader getHeader() {
        return this.header;
    }

    public GetDeliveryTypeConfigListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeliveryTypeConfigListResponseBody setResult(java.util.List<GetDeliveryTypeConfigListResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetDeliveryTypeConfigListResponseBodyResult> getResult() {
        return this.result;
    }

    public GetDeliveryTypeConfigListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDeliveryTypeConfigListResponseBodyHeader extends TeaModel {
        @NameInMap("CostTime")
        public Long costTime;

        @NameInMap("RpcId")
        public String rpcId;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("Version")
        public String version;

        public static GetDeliveryTypeConfigListResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            GetDeliveryTypeConfigListResponseBodyHeader self = new GetDeliveryTypeConfigListResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public GetDeliveryTypeConfigListResponseBodyHeader setCostTime(Long costTime) {
            this.costTime = costTime;
            return this;
        }
        public Long getCostTime() {
            return this.costTime;
        }

        public GetDeliveryTypeConfigListResponseBodyHeader setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public GetDeliveryTypeConfigListResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public GetDeliveryTypeConfigListResponseBodyHeader setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetDeliveryTypeConfigListResponseBodyResult extends TeaModel {
        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("Code")
        public String code;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Name")
        public String name;

        public static GetDeliveryTypeConfigListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetDeliveryTypeConfigListResponseBodyResult self = new GetDeliveryTypeConfigListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetDeliveryTypeConfigListResponseBodyResult setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public GetDeliveryTypeConfigListResponseBodyResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetDeliveryTypeConfigListResponseBodyResult setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetDeliveryTypeConfigListResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
