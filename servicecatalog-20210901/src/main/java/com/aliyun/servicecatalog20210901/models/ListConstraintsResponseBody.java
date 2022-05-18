// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListConstraintsResponseBody extends TeaModel {
    // 约束详情
    @NameInMap("ConstraintDetails")
    public java.util.List<ListConstraintsResponseBodyConstraintDetails> constraintDetails;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static ListConstraintsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConstraintsResponseBody self = new ListConstraintsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConstraintsResponseBody setConstraintDetails(java.util.List<ListConstraintsResponseBodyConstraintDetails> constraintDetails) {
        this.constraintDetails = constraintDetails;
        return this;
    }
    public java.util.List<ListConstraintsResponseBodyConstraintDetails> getConstraintDetails() {
        return this.constraintDetails;
    }

    public ListConstraintsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListConstraintsResponseBodyConstraintDetails extends TeaModel {
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

        // 约束描述
        @NameInMap("Description")
        public String description;

        // 约束所属的产品组合ID
        @NameInMap("PortfolioId")
        public String portfolioId;

        // 约束对应的产品ID
        @NameInMap("ProductId")
        public String productId;

        public static ListConstraintsResponseBodyConstraintDetails build(java.util.Map<String, ?> map) throws Exception {
            ListConstraintsResponseBodyConstraintDetails self = new ListConstraintsResponseBodyConstraintDetails();
            return TeaModel.build(map, self);
        }

        public ListConstraintsResponseBodyConstraintDetails setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListConstraintsResponseBodyConstraintDetails setConstraintId(String constraintId) {
            this.constraintId = constraintId;
            return this;
        }
        public String getConstraintId() {
            return this.constraintId;
        }

        public ListConstraintsResponseBodyConstraintDetails setConstraintType(String constraintType) {
            this.constraintType = constraintType;
            return this;
        }
        public String getConstraintType() {
            return this.constraintType;
        }

        public ListConstraintsResponseBodyConstraintDetails setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListConstraintsResponseBodyConstraintDetails setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListConstraintsResponseBodyConstraintDetails setPortfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }
        public String getPortfolioId() {
            return this.portfolioId;
        }

        public ListConstraintsResponseBodyConstraintDetails setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

    }

}
