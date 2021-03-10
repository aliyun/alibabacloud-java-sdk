// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class QueryMediaResourcePackageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryMediaResourcePackageResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public String success;

    public static QueryMediaResourcePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaResourcePackageResponseBody self = new QueryMediaResourcePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMediaResourcePackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMediaResourcePackageResponseBody setData(QueryMediaResourcePackageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMediaResourcePackageResponseBodyData getData() {
        return this.data;
    }

    public QueryMediaResourcePackageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryMediaResourcePackageResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class QueryMediaResourcePackageResponseBodyData extends TeaModel {
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

        public static QueryMediaResourcePackageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaResourcePackageResponseBodyData self = new QueryMediaResourcePackageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMediaResourcePackageResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryMediaResourcePackageResponseBodyData setSlrGrantedFlag(Boolean slrGrantedFlag) {
            this.slrGrantedFlag = slrGrantedFlag;
            return this;
        }
        public Boolean getSlrGrantedFlag() {
            return this.slrGrantedFlag;
        }

        public QueryMediaResourcePackageResponseBodyData setEffectiveInstanceFlag(Boolean effectiveInstanceFlag) {
            this.effectiveInstanceFlag = effectiveInstanceFlag;
            return this;
        }
        public Boolean getEffectiveInstanceFlag() {
            return this.effectiveInstanceFlag;
        }

        public QueryMediaResourcePackageResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryMediaResourcePackageResponseBodyData setBagsInfo(String bagsInfo) {
            this.bagsInfo = bagsInfo;
            return this;
        }
        public String getBagsInfo() {
            return this.bagsInfo;
        }

        public QueryMediaResourcePackageResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryMediaResourcePackageResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

    }

}
