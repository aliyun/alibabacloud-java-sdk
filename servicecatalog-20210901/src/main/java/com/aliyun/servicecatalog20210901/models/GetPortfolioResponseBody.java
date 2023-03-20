// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetPortfolioResponseBody extends TeaModel {
    /**
     * <p>The details of the product portfolio.</p>
     */
    @NameInMap("PortfolioDetail")
    public GetPortfolioResponseBodyPortfolioDetail portfolioDetail;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPortfolioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPortfolioResponseBody self = new GetPortfolioResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPortfolioResponseBody setPortfolioDetail(GetPortfolioResponseBodyPortfolioDetail portfolioDetail) {
        this.portfolioDetail = portfolioDetail;
        return this;
    }
    public GetPortfolioResponseBodyPortfolioDetail getPortfolioDetail() {
        return this.portfolioDetail;
    }

    public GetPortfolioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPortfolioResponseBodyPortfolioDetail extends TeaModel {
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

        public static GetPortfolioResponseBodyPortfolioDetail build(java.util.Map<String, ?> map) throws Exception {
            GetPortfolioResponseBodyPortfolioDetail self = new GetPortfolioResponseBodyPortfolioDetail();
            return TeaModel.build(map, self);
        }

        public GetPortfolioResponseBodyPortfolioDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetPortfolioResponseBodyPortfolioDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPortfolioResponseBodyPortfolioDetail setPortfolioArn(String portfolioArn) {
            this.portfolioArn = portfolioArn;
            return this;
        }
        public String getPortfolioArn() {
            return this.portfolioArn;
        }

        public GetPortfolioResponseBodyPortfolioDetail setPortfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }
        public String getPortfolioId() {
            return this.portfolioId;
        }

        public GetPortfolioResponseBodyPortfolioDetail setPortfolioName(String portfolioName) {
            this.portfolioName = portfolioName;
            return this;
        }
        public String getPortfolioName() {
            return this.portfolioName;
        }

        public GetPortfolioResponseBodyPortfolioDetail setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

    }

}
