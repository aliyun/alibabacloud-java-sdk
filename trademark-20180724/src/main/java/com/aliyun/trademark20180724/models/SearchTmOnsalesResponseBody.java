// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SearchTmOnsalesResponseBody extends TeaModel {
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
    public java.util.List<SearchTmOnsalesResponseBodyTrademarks> trademarks;

    public static SearchTmOnsalesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchTmOnsalesResponseBody self = new SearchTmOnsalesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchTmOnsalesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchTmOnsalesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchTmOnsalesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchTmOnsalesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public SearchTmOnsalesResponseBody setTotalPageNumber(Integer totalPageNumber) {
        this.totalPageNumber = totalPageNumber;
        return this;
    }
    public Integer getTotalPageNumber() {
        return this.totalPageNumber;
    }

    public SearchTmOnsalesResponseBody setTrademarks(java.util.List<SearchTmOnsalesResponseBodyTrademarks> trademarks) {
        this.trademarks = trademarks;
        return this;
    }
    public java.util.List<SearchTmOnsalesResponseBodyTrademarks> getTrademarks() {
        return this.trademarks;
    }

    public static class SearchTmOnsalesResponseBodyTrademarks extends TeaModel {
        @NameInMap("Classification")
        public String classification;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("OrderPrice")
        public String orderPrice;

        @NameInMap("PartnerCode")
        public String partnerCode;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductDesc")
        public String productDesc;

        @NameInMap("RegistrationNumber")
        public String registrationNumber;

        @NameInMap("Status")
        public Long status;

        @NameInMap("TrademarkName")
        public String trademarkName;

        @NameInMap("Uid")
        public String uid;

        public static SearchTmOnsalesResponseBodyTrademarks build(java.util.Map<String, ?> map) throws Exception {
            SearchTmOnsalesResponseBodyTrademarks self = new SearchTmOnsalesResponseBodyTrademarks();
            return TeaModel.build(map, self);
        }

        public SearchTmOnsalesResponseBodyTrademarks setClassification(String classification) {
            this.classification = classification;
            return this;
        }
        public String getClassification() {
            return this.classification;
        }

        public SearchTmOnsalesResponseBodyTrademarks setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public SearchTmOnsalesResponseBodyTrademarks setOrderPrice(String orderPrice) {
            this.orderPrice = orderPrice;
            return this;
        }
        public String getOrderPrice() {
            return this.orderPrice;
        }

        public SearchTmOnsalesResponseBodyTrademarks setPartnerCode(String partnerCode) {
            this.partnerCode = partnerCode;
            return this;
        }
        public String getPartnerCode() {
            return this.partnerCode;
        }

        public SearchTmOnsalesResponseBodyTrademarks setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public SearchTmOnsalesResponseBodyTrademarks setProductDesc(String productDesc) {
            this.productDesc = productDesc;
            return this;
        }
        public String getProductDesc() {
            return this.productDesc;
        }

        public SearchTmOnsalesResponseBodyTrademarks setRegistrationNumber(String registrationNumber) {
            this.registrationNumber = registrationNumber;
            return this;
        }
        public String getRegistrationNumber() {
            return this.registrationNumber;
        }

        public SearchTmOnsalesResponseBodyTrademarks setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public SearchTmOnsalesResponseBodyTrademarks setTrademarkName(String trademarkName) {
            this.trademarkName = trademarkName;
            return this;
        }
        public String getTrademarkName() {
            return this.trademarkName;
        }

        public SearchTmOnsalesResponseBodyTrademarks setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
