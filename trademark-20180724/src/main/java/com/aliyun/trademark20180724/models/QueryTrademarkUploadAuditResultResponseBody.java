// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkUploadAuditResultResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TotalPageNumber")
    public Integer totalPageNumber;

    @NameInMap("Trademarks")
    public java.util.List<QueryTrademarkUploadAuditResultResponseBodyTrademarks> trademarks;

    public static QueryTrademarkUploadAuditResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkUploadAuditResultResponseBody self = new QueryTrademarkUploadAuditResultResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkUploadAuditResultResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryTrademarkUploadAuditResultResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTrademarkUploadAuditResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTrademarkUploadAuditResultResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryTrademarkUploadAuditResultResponseBody setTotalPageNumber(Integer totalPageNumber) {
        this.totalPageNumber = totalPageNumber;
        return this;
    }
    public Integer getTotalPageNumber() {
        return this.totalPageNumber;
    }

    public QueryTrademarkUploadAuditResultResponseBody setTrademarks(java.util.List<QueryTrademarkUploadAuditResultResponseBodyTrademarks> trademarks) {
        this.trademarks = trademarks;
        return this;
    }
    public java.util.List<QueryTrademarkUploadAuditResultResponseBodyTrademarks> getTrademarks() {
        return this.trademarks;
    }

    public static class QueryTrademarkUploadAuditResultResponseBodyTrademarks extends TeaModel {
        @NameInMap("AuditResult")
        public String auditResult;

        @NameInMap("Classification")
        public String classification;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("OrderPrice")
        public String orderPrice;

        @NameInMap("RegistrationNumber")
        public String registrationNumber;

        @NameInMap("Status")
        public Long status;

        @NameInMap("TmType")
        public String tmType;

        @NameInMap("TrademarkName")
        public String trademarkName;

        public static QueryTrademarkUploadAuditResultResponseBodyTrademarks build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkUploadAuditResultResponseBodyTrademarks self = new QueryTrademarkUploadAuditResultResponseBodyTrademarks();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkUploadAuditResultResponseBodyTrademarks setAuditResult(String auditResult) {
            this.auditResult = auditResult;
            return this;
        }
        public String getAuditResult() {
            return this.auditResult;
        }

        public QueryTrademarkUploadAuditResultResponseBodyTrademarks setClassification(String classification) {
            this.classification = classification;
            return this;
        }
        public String getClassification() {
            return this.classification;
        }

        public QueryTrademarkUploadAuditResultResponseBodyTrademarks setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryTrademarkUploadAuditResultResponseBodyTrademarks setOrderPrice(String orderPrice) {
            this.orderPrice = orderPrice;
            return this;
        }
        public String getOrderPrice() {
            return this.orderPrice;
        }

        public QueryTrademarkUploadAuditResultResponseBodyTrademarks setRegistrationNumber(String registrationNumber) {
            this.registrationNumber = registrationNumber;
            return this;
        }
        public String getRegistrationNumber() {
            return this.registrationNumber;
        }

        public QueryTrademarkUploadAuditResultResponseBodyTrademarks setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryTrademarkUploadAuditResultResponseBodyTrademarks setTmType(String tmType) {
            this.tmType = tmType;
            return this;
        }
        public String getTmType() {
            return this.tmType;
        }

        public QueryTrademarkUploadAuditResultResponseBodyTrademarks setTrademarkName(String trademarkName) {
            this.trademarkName = trademarkName;
            return this;
        }
        public String getTrademarkName() {
            return this.trademarkName;
        }

    }

}
