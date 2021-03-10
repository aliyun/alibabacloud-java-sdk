// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class GetMediaResourcePackageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetMediaResourcePackageResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    public static GetMediaResourcePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaResourcePackageResponseBody self = new GetMediaResourcePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaResourcePackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMediaResourcePackageResponseBody setData(GetMediaResourcePackageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMediaResourcePackageResponseBodyData getData() {
        return this.data;
    }

    public GetMediaResourcePackageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMediaResourcePackageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMediaResourcePackageResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("SlrGrantedFlag")
        public Boolean slrGrantedFlag;

        @NameInMap("EffectiveInstanceFlag")
        public Boolean effectiveInstanceFlag;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("BagsInfo")
        public String bagsInfo;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("PageCount")
        public Integer pageCount;

        public static GetMediaResourcePackageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMediaResourcePackageResponseBodyData self = new GetMediaResourcePackageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMediaResourcePackageResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetMediaResourcePackageResponseBodyData setSlrGrantedFlag(Boolean slrGrantedFlag) {
            this.slrGrantedFlag = slrGrantedFlag;
            return this;
        }
        public Boolean getSlrGrantedFlag() {
            return this.slrGrantedFlag;
        }

        public GetMediaResourcePackageResponseBodyData setEffectiveInstanceFlag(Boolean effectiveInstanceFlag) {
            this.effectiveInstanceFlag = effectiveInstanceFlag;
            return this;
        }
        public Boolean getEffectiveInstanceFlag() {
            return this.effectiveInstanceFlag;
        }

        public GetMediaResourcePackageResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetMediaResourcePackageResponseBodyData setBagsInfo(String bagsInfo) {
            this.bagsInfo = bagsInfo;
            return this;
        }
        public String getBagsInfo() {
            return this.bagsInfo;
        }

        public GetMediaResourcePackageResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetMediaResourcePackageResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

    }

}
