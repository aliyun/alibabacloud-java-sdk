// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListPortfoliosResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PortfolioDetails")
    public java.util.List<ListPortfoliosResponseBodyPortfolioDetails> portfolioDetails;

    /**
     * <strong>example:</strong>
     * <p>0FEEF92D-4052-5202-87D0-3D8EC16F81BF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <p>代表创建时间的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-12T06:11:12Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>产品组合描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>acs:servicecatalog:cn-hangzhou:146611588617****:portfolio/port-bp1yt7582g****</p>
         */
        @NameInMap("PortfolioArn")
        public String portfolioArn;

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>port-bp1yt7582g****</p>
         */
        @NameInMap("PortfolioId")
        public String portfolioId;

        /**
         * <p>代表资源名称的资源属性字段</p>
         */
        @NameInMap("PortfolioName")
        public String portfolioName;

        /**
         * <p>产品组合提供方</p>
         */
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
