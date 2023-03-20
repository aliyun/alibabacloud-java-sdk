// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetConstraintResponseBody extends TeaModel {
    /**
     * <p>The details of the constraint.</p>
     */
    @NameInMap("ConstraintDetail")
    public GetConstraintResponseBodyConstraintDetail constraintDetail;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The configuration of the constraint.</p>
         * <br>
         * <p>Format: { "LocalRoleName": "\<role_name>" }.</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The ID of the constraint.</p>
         */
        @NameInMap("ConstraintId")
        public String constraintId;

        /**
         * <p>The type of the constraint.</p>
         * <br>
         * <p>The value is fixed as Launch, which indicates the launch constraint.</p>
         */
        @NameInMap("ConstraintType")
        public String constraintType;

        /**
         * <p>The time when the constraint was created.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the constraint.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the product portfolio to which the constraint belongs.</p>
         */
        @NameInMap("PortfolioId")
        public String portfolioId;

        /**
         * <p>The ID of the product for which the constraint is created.</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>The name of the product.</p>
         */
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
