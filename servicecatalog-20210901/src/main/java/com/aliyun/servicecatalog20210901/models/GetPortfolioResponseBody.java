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

    @NameInMap("TagOptions")
    public java.util.List<GetPortfolioResponseBodyTagOptions> tagOptions;

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

    public GetPortfolioResponseBody setTagOptions(java.util.List<GetPortfolioResponseBodyTagOptions> tagOptions) {
        this.tagOptions = tagOptions;
        return this;
    }
    public java.util.List<GetPortfolioResponseBodyTagOptions> getTagOptions() {
        return this.tagOptions;
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

    public static class GetPortfolioResponseBodyTagOptions extends TeaModel {
        @NameInMap("Active")
        public Boolean active;

        @NameInMap("Key")
        public String key;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("TagOptionId")
        public String tagOptionId;

        @NameInMap("Value")
        public String value;

        public static GetPortfolioResponseBodyTagOptions build(java.util.Map<String, ?> map) throws Exception {
            GetPortfolioResponseBodyTagOptions self = new GetPortfolioResponseBodyTagOptions();
            return TeaModel.build(map, self);
        }

        public GetPortfolioResponseBodyTagOptions setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public GetPortfolioResponseBodyTagOptions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetPortfolioResponseBodyTagOptions setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetPortfolioResponseBodyTagOptions setTagOptionId(String tagOptionId) {
            this.tagOptionId = tagOptionId;
            return this;
        }
        public String getTagOptionId() {
            return this.tagOptionId;
        }

        public GetPortfolioResponseBodyTagOptions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
