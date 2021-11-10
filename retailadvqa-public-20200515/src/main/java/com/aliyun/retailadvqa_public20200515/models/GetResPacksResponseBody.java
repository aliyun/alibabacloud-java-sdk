// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class GetResPacksResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetResPacksResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static GetResPacksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResPacksResponseBody self = new GetResPacksResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResPacksResponseBody setData(GetResPacksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetResPacksResponseBodyData getData() {
        return this.data;
    }

    public GetResPacksResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetResPacksResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public GetResPacksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResPacksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetResPacksResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class GetResPacksResponseBodyData extends TeaModel {
        @NameInMap("BagsInfo")
        public String bagsInfo;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("EffectiveInstanceFlag")
        public Boolean effectiveInstanceFlag;

        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("SlrGrantedFlag")
        public Boolean slrGrantedFlag;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetResPacksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetResPacksResponseBodyData self = new GetResPacksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetResPacksResponseBodyData setBagsInfo(String bagsInfo) {
            this.bagsInfo = bagsInfo;
            return this;
        }
        public String getBagsInfo() {
            return this.bagsInfo;
        }

        public GetResPacksResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetResPacksResponseBodyData setEffectiveInstanceFlag(Boolean effectiveInstanceFlag) {
            this.effectiveInstanceFlag = effectiveInstanceFlag;
            return this;
        }
        public Boolean getEffectiveInstanceFlag() {
            return this.effectiveInstanceFlag;
        }

        public GetResPacksResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public GetResPacksResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetResPacksResponseBodyData setSlrGrantedFlag(Boolean slrGrantedFlag) {
            this.slrGrantedFlag = slrGrantedFlag;
            return this;
        }
        public Boolean getSlrGrantedFlag() {
            return this.slrGrantedFlag;
        }

        public GetResPacksResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
