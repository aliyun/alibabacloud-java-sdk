// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class GetProductConfigResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Header")
    public GetProductConfigResponseBodyHeader header;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<GetProductConfigResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static GetProductConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductConfigResponseBody self = new GetProductConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetProductConfigResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetProductConfigResponseBody setHeader(GetProductConfigResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public GetProductConfigResponseBodyHeader getHeader() {
        return this.header;
    }

    public GetProductConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProductConfigResponseBody setResult(java.util.List<GetProductConfigResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetProductConfigResponseBodyResult> getResult() {
        return this.result;
    }

    public GetProductConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetProductConfigResponseBodyHeader extends TeaModel {
        @NameInMap("CostTime")
        public Long costTime;

        @NameInMap("RpcId")
        public String rpcId;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("Version")
        public String version;

        public static GetProductConfigResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            GetProductConfigResponseBodyHeader self = new GetProductConfigResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public GetProductConfigResponseBodyHeader setCostTime(Long costTime) {
            this.costTime = costTime;
            return this;
        }
        public Long getCostTime() {
            return this.costTime;
        }

        public GetProductConfigResponseBodyHeader setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public GetProductConfigResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public GetProductConfigResponseBodyHeader setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetProductConfigResponseBodyResultBusinessList extends TeaModel {
        @NameInMap("BusinessCode")
        public String businessCode;

        @NameInMap("BusinessCodeName")
        public String businessCodeName;

        public static GetProductConfigResponseBodyResultBusinessList build(java.util.Map<String, ?> map) throws Exception {
            GetProductConfigResponseBodyResultBusinessList self = new GetProductConfigResponseBodyResultBusinessList();
            return TeaModel.build(map, self);
        }

        public GetProductConfigResponseBodyResultBusinessList setBusinessCode(String businessCode) {
            this.businessCode = businessCode;
            return this;
        }
        public String getBusinessCode() {
            return this.businessCode;
        }

        public GetProductConfigResponseBodyResultBusinessList setBusinessCodeName(String businessCodeName) {
            this.businessCodeName = businessCodeName;
            return this;
        }
        public String getBusinessCodeName() {
            return this.businessCodeName;
        }

    }

    public static class GetProductConfigResponseBodyResult extends TeaModel {
        @NameInMap("BusinessList")
        public java.util.List<GetProductConfigResponseBodyResultBusinessList> businessList;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductName")
        public String productName;

        public static GetProductConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetProductConfigResponseBodyResult self = new GetProductConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetProductConfigResponseBodyResult setBusinessList(java.util.List<GetProductConfigResponseBodyResultBusinessList> businessList) {
            this.businessList = businessList;
            return this;
        }
        public java.util.List<GetProductConfigResponseBodyResultBusinessList> getBusinessList() {
            return this.businessList;
        }

        public GetProductConfigResponseBodyResult setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public GetProductConfigResponseBodyResult setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

}
