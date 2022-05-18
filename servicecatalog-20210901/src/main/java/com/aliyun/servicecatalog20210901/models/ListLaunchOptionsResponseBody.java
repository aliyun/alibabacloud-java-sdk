// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListLaunchOptionsResponseBody extends TeaModel {
    // 启动选项概要
    @NameInMap("LaunchOptionSummaries")
    public java.util.List<ListLaunchOptionsResponseBodyLaunchOptionSummaries> launchOptionSummaries;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static ListLaunchOptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLaunchOptionsResponseBody self = new ListLaunchOptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLaunchOptionsResponseBody setLaunchOptionSummaries(java.util.List<ListLaunchOptionsResponseBodyLaunchOptionSummaries> launchOptionSummaries) {
        this.launchOptionSummaries = launchOptionSummaries;
        return this;
    }
    public java.util.List<ListLaunchOptionsResponseBodyLaunchOptionSummaries> getLaunchOptionSummaries() {
        return this.launchOptionSummaries;
    }

    public ListLaunchOptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLaunchOptionsResponseBodyLaunchOptionSummariesConstraintSummaries extends TeaModel {
        // 约束类型
        @NameInMap("ConstraintType")
        public String constraintType;

        // 约束描述
        @NameInMap("Description")
        public String description;

        public static ListLaunchOptionsResponseBodyLaunchOptionSummariesConstraintSummaries build(java.util.Map<String, ?> map) throws Exception {
            ListLaunchOptionsResponseBodyLaunchOptionSummariesConstraintSummaries self = new ListLaunchOptionsResponseBodyLaunchOptionSummariesConstraintSummaries();
            return TeaModel.build(map, self);
        }

        public ListLaunchOptionsResponseBodyLaunchOptionSummariesConstraintSummaries setConstraintType(String constraintType) {
            this.constraintType = constraintType;
            return this;
        }
        public String getConstraintType() {
            return this.constraintType;
        }

        public ListLaunchOptionsResponseBodyLaunchOptionSummariesConstraintSummaries setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class ListLaunchOptionsResponseBodyLaunchOptionSummaries extends TeaModel {
        // 约束概要
        @NameInMap("ConstraintSummaries")
        public java.util.List<ListLaunchOptionsResponseBodyLaunchOptionSummariesConstraintSummaries> constraintSummaries;

        // 产品组合ID
        @NameInMap("PortfolioId")
        public String portfolioId;

        // 产品组合名称
        @NameInMap("PortfolioName")
        public String portfolioName;

        public static ListLaunchOptionsResponseBodyLaunchOptionSummaries build(java.util.Map<String, ?> map) throws Exception {
            ListLaunchOptionsResponseBodyLaunchOptionSummaries self = new ListLaunchOptionsResponseBodyLaunchOptionSummaries();
            return TeaModel.build(map, self);
        }

        public ListLaunchOptionsResponseBodyLaunchOptionSummaries setConstraintSummaries(java.util.List<ListLaunchOptionsResponseBodyLaunchOptionSummariesConstraintSummaries> constraintSummaries) {
            this.constraintSummaries = constraintSummaries;
            return this;
        }
        public java.util.List<ListLaunchOptionsResponseBodyLaunchOptionSummariesConstraintSummaries> getConstraintSummaries() {
            return this.constraintSummaries;
        }

        public ListLaunchOptionsResponseBodyLaunchOptionSummaries setPortfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }
        public String getPortfolioId() {
            return this.portfolioId;
        }

        public ListLaunchOptionsResponseBodyLaunchOptionSummaries setPortfolioName(String portfolioName) {
            this.portfolioName = portfolioName;
            return this;
        }
        public String getPortfolioName() {
            return this.portfolioName;
        }

    }

}
