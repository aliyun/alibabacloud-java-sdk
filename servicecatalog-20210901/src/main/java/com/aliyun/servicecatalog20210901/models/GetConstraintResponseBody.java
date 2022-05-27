// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetConstraintResponseBody extends TeaModel {
    // 约束详情
    @NameInMap("ConstraintDetail")
    public GetConstraintResponseBodyConstraintDetail constraintDetail;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static GetConstraintResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConstraintResponseBody self = new GetConstraintResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConstraintResponseBody setConstraintDetail(GetConstraintResponseBodyConstraintDetail constraintDetail) {
        this.constraintDetail = constraintDetail;
        return this;
    }
    public GetConstraintResponseBodyConstraintDetail getConstraintDetail() {
        return this.constraintDetail;
    }

    public GetConstraintResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetConstraintResponseBodyConstraintDetail extends TeaModel {
        // 约束配置
        @NameInMap("Config")
        public String config;

        // 约束ID
        @NameInMap("ConstraintId")
        public String constraintId;

        // 约束类型
        @NameInMap("ConstraintType")
        public String constraintType;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 描述
        @NameInMap("Description")
        public String description;

        // 约束所属的产品组合ID
        @NameInMap("PortfolioId")
        public String portfolioId;

        // 约束的产品ID
        @NameInMap("ProductId")
        public String productId;

        @NameInMap("ProductName")
        public String productName;

        public static GetConstraintResponseBodyConstraintDetail build(java.util.Map<String, ?> map) throws Exception {
            GetConstraintResponseBodyConstraintDetail self = new GetConstraintResponseBodyConstraintDetail();
            return TeaModel.build(map, self);
        }

        public GetConstraintResponseBodyConstraintDetail setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetConstraintResponseBodyConstraintDetail setConstraintId(String constraintId) {
            this.constraintId = constraintId;
            return this;
        }
        public String getConstraintId() {
            return this.constraintId;
        }

        public GetConstraintResponseBodyConstraintDetail setConstraintType(String constraintType) {
            this.constraintType = constraintType;
            return this;
        }
        public String getConstraintType() {
            return this.constraintType;
        }

        public GetConstraintResponseBodyConstraintDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetConstraintResponseBodyConstraintDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetConstraintResponseBodyConstraintDetail setPortfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }
        public String getPortfolioId() {
            return this.portfolioId;
        }

        public GetConstraintResponseBodyConstraintDetail setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public GetConstraintResponseBodyConstraintDetail setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

}
