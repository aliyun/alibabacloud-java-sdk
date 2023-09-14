// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListProductsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of records that are returned for the query.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the position at which the query ends. An empty value indicates that all data is returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The information of the Alibaba Cloud service.</p>
     */
    @NameInMap("ProductInfo")
    public java.util.List<ListProductsResponseBodyProductInfo> productInfo;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records that are returned for the query.</p>
     */
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
        /**
         * <p>Indicates whether the Alibaba Cloud service supports general quotas. Valid values:</p>
         * <br>
         * <p>*   support: The Alibaba Cloud service supports general quotas.</p>
         * <p>*   unsupport: The Alibaba Cloud service does not support general quotas.</p>
         */
        @NameInMap("CommonQuotaSupport")
        public String commonQuotaSupport;

        /**
         * <p>Indicates whether the Alibaba Cloud service supports dynamic quota adjustment. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("Dynamic")
        public Boolean dynamic;

        /**
         * <p>Indicates whether the Alibaba Cloud service supports API rate limits. Valid values:</p>
         * <br>
         * <p>*   support: The Alibaba Cloud service supports API rate limits.</p>
         * <p>*   unsupport: The Alibaba Cloud service does not support API rate limits.</p>
         */
        @NameInMap("FlowControlSupport")
        public String flowControlSupport;

        /**
         * <p>The abbreviation of the Alibaba Cloud service name.</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The name of the Alibaba Cloud service.</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The English name of the Alibaba Cloud service.</p>
         */
        @NameInMap("ProductNameEn")
        public String productNameEn;

        /**
         * <p>The ID of the service category.</p>
         */
        @NameInMap("SecondCategoryId")
        public Long secondCategoryId;

        /**
         * <p>The name of the service category.</p>
         */
        @NameInMap("SecondCategoryName")
        public String secondCategoryName;

        /**
         * <p>The English name of the service category.</p>
         */
        @NameInMap("SecondCategoryNameEn")
        public String secondCategoryNameEn;

        /**
         * <p>Indicates whether the Alibaba Cloud service supports whitelist quotas. Valid values:</p>
         * <br>
         * <p>*   support: The Alibaba Cloud service supports whitelist quotas.</p>
         * <p>*   unsupport: The Alibaba Cloud service does not support whitelist quotas.</p>
         */
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
