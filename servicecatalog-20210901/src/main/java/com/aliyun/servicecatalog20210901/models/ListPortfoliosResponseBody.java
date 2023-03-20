// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListPortfoliosResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>An array that consists of the product portfolios.</p>
     */
    @NameInMap("PortfolioDetails")
    public java.util.List<ListPortfoliosResponseBodyPortfolioDetails> portfolioDetails;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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
         * <p>The time when the product portfolio is created.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the product portfolio.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the product portfolio.</p>
         */
        @NameInMap("PortfolioArn")
        public String portfolioArn;

        /**
         * <p>The ID of the product portfolio.</p>
         */
        @NameInMap("PortfolioId")
        public String portfolioId;

        /**
         * <p>The name of the product portfolio.</p>
         */
        @NameInMap("PortfolioName")
        public String portfolioName;

        /**
         * <p>The provider of the product portfolio.</p>
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
