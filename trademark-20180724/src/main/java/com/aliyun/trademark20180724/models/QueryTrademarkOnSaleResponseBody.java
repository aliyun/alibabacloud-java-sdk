// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkOnSaleResponseBody extends TeaModel {
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
    public java.util.List<QueryTrademarkOnSaleResponseBodyTrademarks> trademarks;

    public static QueryTrademarkOnSaleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkOnSaleResponseBody self = new QueryTrademarkOnSaleResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkOnSaleResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryTrademarkOnSaleResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTrademarkOnSaleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTrademarkOnSaleResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryTrademarkOnSaleResponseBody setTotalPageNumber(Integer totalPageNumber) {
        this.totalPageNumber = totalPageNumber;
        return this;
    }
    public Integer getTotalPageNumber() {
        return this.totalPageNumber;
    }

    public QueryTrademarkOnSaleResponseBody setTrademarks(java.util.List<QueryTrademarkOnSaleResponseBodyTrademarks> trademarks) {
        this.trademarks = trademarks;
        return this;
    }
    public java.util.List<QueryTrademarkOnSaleResponseBodyTrademarks> getTrademarks() {
        return this.trademarks;
    }

    public static class QueryTrademarkOnSaleResponseBodyTrademarks extends TeaModel {
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

        public static QueryTrademarkOnSaleResponseBodyTrademarks build(java.util.Map<String, ?> map) throws Exception {
            QueryTrademarkOnSaleResponseBodyTrademarks self = new QueryTrademarkOnSaleResponseBodyTrademarks();
            return TeaModel.build(map, self);
        }

        public QueryTrademarkOnSaleResponseBodyTrademarks setAuditResult(String auditResult) {
            this.auditResult = auditResult;
            return this;
        }
        public String getAuditResult() {
            return this.auditResult;
        }

        public QueryTrademarkOnSaleResponseBodyTrademarks setClassification(String classification) {
            this.classification = classification;
            return this;
        }
        public String getClassification() {
            return this.classification;
        }

        public QueryTrademarkOnSaleResponseBodyTrademarks setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryTrademarkOnSaleResponseBodyTrademarks setOrderPrice(String orderPrice) {
            this.orderPrice = orderPrice;
            return this;
        }
        public String getOrderPrice() {
            return this.orderPrice;
        }

        public QueryTrademarkOnSaleResponseBodyTrademarks setRegistrationNumber(String registrationNumber) {
            this.registrationNumber = registrationNumber;
            return this;
        }
        public String getRegistrationNumber() {
            return this.registrationNumber;
        }

        public QueryTrademarkOnSaleResponseBodyTrademarks setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryTrademarkOnSaleResponseBodyTrademarks setTmType(String tmType) {
            this.tmType = tmType;
            return this;
        }
        public String getTmType() {
            return this.tmType;
        }

        public QueryTrademarkOnSaleResponseBodyTrademarks setTrademarkName(String trademarkName) {
            this.trademarkName = trademarkName;
            return this;
        }
        public String getTrademarkName() {
            return this.trademarkName;
        }

    }

}
