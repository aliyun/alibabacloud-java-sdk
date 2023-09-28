// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListLaunchOptionsResponseBody extends TeaModel {
    /**
     * <p>The launch options.</p>
     */
    @NameInMap("LaunchOptionSummaries")
    public java.util.List<ListLaunchOptionsResponseBodyLaunchOptionSummaries> launchOptionSummaries;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The type of the constraint. Valid values:</p>
         * <br>
         * <p>1.  Launch</p>
         * <p>2.  Template</p>
         * <p>3.  Approval</p>
         * <p>4.  StackRegion</p>
         */
        @NameInMap("ConstraintType")
        public String constraintType;

        /**
         * <p>The description of the constraint.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The types of operations that require approval. If the type of the constraint is Approval, this parameter is not empty.</p>
         */
        @NameInMap("OperationTypes")
        public java.util.List<String> operationTypes;

        /**
         * <p>The regions in which users can launch the service. If the type of the constraint is StackRegion, this parameter is not empty.</p>
         */
        @NameInMap("StackRegions")
        public java.util.List<String> stackRegions;

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

        public ListLaunchOptionsResponseBodyLaunchOptionSummariesConstraintSummaries setOperationTypes(java.util.List<String> operationTypes) {
            this.operationTypes = operationTypes;
            return this;
        }
        public java.util.List<String> getOperationTypes() {
            return this.operationTypes;
        }

        public ListLaunchOptionsResponseBodyLaunchOptionSummariesConstraintSummaries setStackRegions(java.util.List<String> stackRegions) {
            this.stackRegions = stackRegions;
            return this;
        }
        public java.util.List<String> getStackRegions() {
            return this.stackRegions;
        }

    }

    public static class ListLaunchOptionsResponseBodyLaunchOptionSummaries extends TeaModel {
        /**
         * <p>The constraints.</p>
         */
        @NameInMap("ConstraintSummaries")
        public java.util.List<ListLaunchOptionsResponseBodyLaunchOptionSummariesConstraintSummaries> constraintSummaries;

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
