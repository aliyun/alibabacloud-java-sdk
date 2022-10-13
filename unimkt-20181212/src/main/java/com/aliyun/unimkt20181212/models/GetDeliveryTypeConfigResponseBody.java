// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class GetDeliveryTypeConfigResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Ext")
    public java.util.Map<String, ?> ext;

    @NameInMap("Header")
    public GetDeliveryTypeConfigResponseBodyHeader header;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetDeliveryTypeConfigResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static GetDeliveryTypeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeliveryTypeConfigResponseBody self = new GetDeliveryTypeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeliveryTypeConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDeliveryTypeConfigResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetDeliveryTypeConfigResponseBody setExt(java.util.Map<String, ?> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, ?> getExt() {
        return this.ext;
    }

    public GetDeliveryTypeConfigResponseBody setHeader(GetDeliveryTypeConfigResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public GetDeliveryTypeConfigResponseBodyHeader getHeader() {
        return this.header;
    }

    public GetDeliveryTypeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeliveryTypeConfigResponseBody setResult(GetDeliveryTypeConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetDeliveryTypeConfigResponseBodyResult getResult() {
        return this.result;
    }

    public GetDeliveryTypeConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDeliveryTypeConfigResponseBodyHeader extends TeaModel {
        @NameInMap("CostTime")
        public Long costTime;

        @NameInMap("RpcId")
        public String rpcId;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("Version")
        public String version;

        public static GetDeliveryTypeConfigResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            GetDeliveryTypeConfigResponseBodyHeader self = new GetDeliveryTypeConfigResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public GetDeliveryTypeConfigResponseBodyHeader setCostTime(Long costTime) {
            this.costTime = costTime;
            return this;
        }
        public Long getCostTime() {
            return this.costTime;
        }

        public GetDeliveryTypeConfigResponseBodyHeader setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public GetDeliveryTypeConfigResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public GetDeliveryTypeConfigResponseBodyHeader setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetDeliveryTypeConfigResponseBodyResult extends TeaModel {
        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("Code")
        public String code;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Name")
        public String name;

        public static GetDeliveryTypeConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetDeliveryTypeConfigResponseBodyResult self = new GetDeliveryTypeConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetDeliveryTypeConfigResponseBodyResult setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public GetDeliveryTypeConfigResponseBodyResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetDeliveryTypeConfigResponseBodyResult setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetDeliveryTypeConfigResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
