// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListProductsResponseBody extends TeaModel {
    // The maximum number of records returned for the query.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that is used to mark the location where the query is ended. An empty value indicates that all the data is queried.
    @NameInMap("NextToken")
    public String nextToken;

    // The information of the cloud service.
    @NameInMap("ProductInfo")
    public java.util.List<ListProductsResponseBodyProductInfo> productInfo;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of records returned for the query.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductsResponseBody self = new ListProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProductsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProductsResponseBody setProductInfo(java.util.List<ListProductsResponseBodyProductInfo> productInfo) {
        this.productInfo = productInfo;
        return this;
    }
    public java.util.List<ListProductsResponseBodyProductInfo> getProductInfo() {
        return this.productInfo;
    }

    public ListProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListProductsResponseBodyProductInfo extends TeaModel {
        // Indicates whether the cloud service supports general quotas. Valid values:
        // 
        // *   support: The cloud service supports general quotas.
        // *   unsupport: The cloud service does not support general quotas.
        @NameInMap("CommonQuotaSupport")
        public String commonQuotaSupport;

        // Indicates whether the cloud service supports dynamic quota adjustment. Valid values:
        // 
        // *   true
        // *   false
        @NameInMap("Dynamic")
        public Boolean dynamic;

        // Indicates whether the cloud service supports API rate limits. Valid values:
        // 
        // *   support: The cloud service supports API rate limits.
        // *   unsupport: The cloud service does not support API rate limits.
        @NameInMap("FlowControlSupport")
        public String flowControlSupport;

        // The abbreviation of the cloud service name.
        @NameInMap("ProductCode")
        public String productCode;

        // The name of the cloud service.
        @NameInMap("ProductName")
        public String productName;

        // The name of the cloud service.
        @NameInMap("ProductNameEn")
        public String productNameEn;

        // The ID of the service category.
        @NameInMap("SecondCategoryId")
        public Long secondCategoryId;

        // The name of the service category.
        @NameInMap("SecondCategoryName")
        public String secondCategoryName;

        // The name of the service category.
        @NameInMap("SecondCategoryNameEn")
        public String secondCategoryNameEn;

        @NameInMap("WhiteListLabelQuotaSupport")
        public String whiteListLabelQuotaSupport;

        public static ListProductsResponseBodyProductInfo build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyProductInfo self = new ListProductsResponseBodyProductInfo();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyProductInfo setCommonQuotaSupport(String commonQuotaSupport) {
            this.commonQuotaSupport = commonQuotaSupport;
            return this;
        }
        public String getCommonQuotaSupport() {
            return this.commonQuotaSupport;
        }

        public ListProductsResponseBodyProductInfo setDynamic(Boolean dynamic) {
            this.dynamic = dynamic;
            return this;
        }
        public Boolean getDynamic() {
            return this.dynamic;
        }

        public ListProductsResponseBodyProductInfo setFlowControlSupport(String flowControlSupport) {
            this.flowControlSupport = flowControlSupport;
            return this;
        }
        public String getFlowControlSupport() {
            return this.flowControlSupport;
        }

        public ListProductsResponseBodyProductInfo setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListProductsResponseBodyProductInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListProductsResponseBodyProductInfo setProductNameEn(String productNameEn) {
            this.productNameEn = productNameEn;
            return this;
        }
        public String getProductNameEn() {
            return this.productNameEn;
        }

        public ListProductsResponseBodyProductInfo setSecondCategoryId(Long secondCategoryId) {
            this.secondCategoryId = secondCategoryId;
            return this;
        }
        public Long getSecondCategoryId() {
            return this.secondCategoryId;
        }

        public ListProductsResponseBodyProductInfo setSecondCategoryName(String secondCategoryName) {
            this.secondCategoryName = secondCategoryName;
            return this;
        }
        public String getSecondCategoryName() {
            return this.secondCategoryName;
        }

        public ListProductsResponseBodyProductInfo setSecondCategoryNameEn(String secondCategoryNameEn) {
            this.secondCategoryNameEn = secondCategoryNameEn;
            return this;
        }
        public String getSecondCategoryNameEn() {
            return this.secondCategoryNameEn;
        }

        public ListProductsResponseBodyProductInfo setWhiteListLabelQuotaSupport(String whiteListLabelQuotaSupport) {
            this.whiteListLabelQuotaSupport = whiteListLabelQuotaSupport;
            return this;
        }
        public String getWhiteListLabelQuotaSupport() {
            return this.whiteListLabelQuotaSupport;
        }

    }

}
