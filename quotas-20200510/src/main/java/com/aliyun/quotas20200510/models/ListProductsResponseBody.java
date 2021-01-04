// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListProductsResponseBody extends TeaModel {
    @NameInMap("ProductInfo")
    public java.util.List<ListProductsResponseBodyProductInfo> productInfo;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    public static ListProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductsResponseBody self = new ListProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductsResponseBody setProductInfo(java.util.List<ListProductsResponseBodyProductInfo> productInfo) {
        this.productInfo = productInfo;
        return this;
    }
    public java.util.List<ListProductsResponseBodyProductInfo> getProductInfo() {
        return this.productInfo;
    }

    public ListProductsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListProductsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public static class ListProductsResponseBodyProductInfo extends TeaModel {
        @NameInMap("ProductName")
        public String productName;

        @NameInMap("SecondCategoryId")
        public Long secondCategoryId;

        @NameInMap("ProductNameEn")
        public String productNameEn;

        @NameInMap("Dynamic")
        public Boolean dynamic;

        @NameInMap("SecondCategoryNameEn")
        public String secondCategoryNameEn;

        @NameInMap("SecondCategoryName")
        public String secondCategoryName;

        @NameInMap("ProductCode")
        public String productCode;

        public static ListProductsResponseBodyProductInfo build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyProductInfo self = new ListProductsResponseBodyProductInfo();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyProductInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListProductsResponseBodyProductInfo setSecondCategoryId(Long secondCategoryId) {
            this.secondCategoryId = secondCategoryId;
            return this;
        }
        public Long getSecondCategoryId() {
            return this.secondCategoryId;
        }

        public ListProductsResponseBodyProductInfo setProductNameEn(String productNameEn) {
            this.productNameEn = productNameEn;
            return this;
        }
        public String getProductNameEn() {
            return this.productNameEn;
        }

        public ListProductsResponseBodyProductInfo setDynamic(Boolean dynamic) {
            this.dynamic = dynamic;
            return this;
        }
        public Boolean getDynamic() {
            return this.dynamic;
        }

        public ListProductsResponseBodyProductInfo setSecondCategoryNameEn(String secondCategoryNameEn) {
            this.secondCategoryNameEn = secondCategoryNameEn;
            return this;
        }
        public String getSecondCategoryNameEn() {
            return this.secondCategoryNameEn;
        }

        public ListProductsResponseBodyProductInfo setSecondCategoryName(String secondCategoryName) {
            this.secondCategoryName = secondCategoryName;
            return this;
        }
        public String getSecondCategoryName() {
            return this.secondCategoryName;
        }

        public ListProductsResponseBodyProductInfo setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

}
