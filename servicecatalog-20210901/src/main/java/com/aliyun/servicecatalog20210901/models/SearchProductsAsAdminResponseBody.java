// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class SearchProductsAsAdminResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductDetails")
    public java.util.List<SearchProductsAsAdminResponseBodyProductDetails> productDetails;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static SearchProductsAsAdminResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchProductsAsAdminResponseBody self = new SearchProductsAsAdminResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchProductsAsAdminResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchProductsAsAdminResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchProductsAsAdminResponseBody setProductDetails(java.util.List<SearchProductsAsAdminResponseBodyProductDetails> productDetails) {
        this.productDetails = productDetails;
        return this;
    }
    public java.util.List<SearchProductsAsAdminResponseBodyProductDetails> getProductDetails() {
        return this.productDetails;
    }

    public SearchProductsAsAdminResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchProductsAsAdminResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class SearchProductsAsAdminResponseBodyProductDetails extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Provider")
        public String provider;

        @NameInMap("TemplateType")
        public String templateType;

        public static SearchProductsAsAdminResponseBodyProductDetails build(java.util.Map<String, ?> map) throws Exception {
            SearchProductsAsAdminResponseBodyProductDetails self = new SearchProductsAsAdminResponseBodyProductDetails();
            return TeaModel.build(map, self);
        }

        public SearchProductsAsAdminResponseBodyProductDetails setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public SearchProductsAsAdminResponseBodyProductDetails setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchProductsAsAdminResponseBodyProductDetails setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchProductsAsAdminResponseBodyProductDetails setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SearchProductsAsAdminResponseBodyProductDetails setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchProductsAsAdminResponseBodyProductDetails setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public SearchProductsAsAdminResponseBodyProductDetails setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

    }

}
