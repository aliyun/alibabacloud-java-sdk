// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetPortfolioResponseBody extends TeaModel {
    // 产品组合详情
    @NameInMap("PortfolioDetail")
    public GetPortfolioResponseBodyPortfolioDetail portfolioDetail;

    // 请求ID
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
        // 产品组合创建时间
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
