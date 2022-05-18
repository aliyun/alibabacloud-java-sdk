// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListPortfoliosResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    // 产品组合列表
    @NameInMap("PortfolioDetails")
    public java.util.List<ListPortfoliosResponseBodyPortfolioDetails> portfolioDetails;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 总记录数
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPortfoliosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPortfoliosResponseBody self = new ListPortfoliosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPortfoliosResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPortfoliosResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPortfoliosResponseBody setPortfolioDetails(java.util.List<ListPortfoliosResponseBodyPortfolioDetails> portfolioDetails) {
        this.portfolioDetails = portfolioDetails;
        return this;
    }
    public java.util.List<ListPortfoliosResponseBodyPortfolioDetails> getPortfolioDetails() {
        return this.portfolioDetails;
    }

    public ListPortfoliosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPortfoliosResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPortfoliosResponseBodyPortfolioDetails extends TeaModel {
        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 产品组合描述
        @NameInMap("Description")
        public String description;

        // 产品组合ARN
        @NameInMap("PortfolioArn")
        public String portfolioArn;

        // 产品组合ID
        @NameInMap("PortfolioId")
        public String portfolioId;

        // 产品组合名称
        @NameInMap("PortfolioName")
        public String portfolioName;

        // 提供者名称
        @NameInMap("ProviderName")
        public String providerName;

        public static ListPortfoliosResponseBodyPortfolioDetails build(java.util.Map<String, ?> map) throws Exception {
            ListPortfoliosResponseBodyPortfolioDetails self = new ListPortfoliosResponseBodyPortfolioDetails();
            return TeaModel.build(map, self);
        }

        public ListPortfoliosResponseBodyPortfolioDetails setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPortfoliosResponseBodyPortfolioDetails setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPortfoliosResponseBodyPortfolioDetails setPortfolioArn(String portfolioArn) {
            this.portfolioArn = portfolioArn;
            return this;
        }
        public String getPortfolioArn() {
            return this.portfolioArn;
        }

        public ListPortfoliosResponseBodyPortfolioDetails setPortfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }
        public String getPortfolioId() {
            return this.portfolioId;
        }

        public ListPortfoliosResponseBodyPortfolioDetails setPortfolioName(String portfolioName) {
            this.portfolioName = portfolioName;
            return this;
        }
        public String getPortfolioName() {
            return this.portfolioName;
        }

        public ListPortfoliosResponseBodyPortfolioDetails setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

    }

}
