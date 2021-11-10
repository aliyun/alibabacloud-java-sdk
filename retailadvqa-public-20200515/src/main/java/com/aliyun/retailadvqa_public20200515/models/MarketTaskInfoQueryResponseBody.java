// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class MarketTaskInfoQueryResponseBody extends TeaModel {
    @NameInMap("Data")
    public MarketTaskInfoQueryResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static MarketTaskInfoQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MarketTaskInfoQueryResponseBody self = new MarketTaskInfoQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public MarketTaskInfoQueryResponseBody setData(MarketTaskInfoQueryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MarketTaskInfoQueryResponseBodyData getData() {
        return this.data;
    }

    public MarketTaskInfoQueryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public MarketTaskInfoQueryResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public MarketTaskInfoQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MarketTaskInfoQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public MarketTaskInfoQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class MarketTaskInfoQueryResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<java.util.Map<String, ?>> data;

        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalNum")
        public Long totalNum;

        public static MarketTaskInfoQueryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MarketTaskInfoQueryResponseBodyData self = new MarketTaskInfoQueryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MarketTaskInfoQueryResponseBodyData setData(java.util.List<java.util.Map<String, ?>> data) {
            this.data = data;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getData() {
            return this.data;
        }

        public MarketTaskInfoQueryResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public MarketTaskInfoQueryResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public MarketTaskInfoQueryResponseBodyData setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
