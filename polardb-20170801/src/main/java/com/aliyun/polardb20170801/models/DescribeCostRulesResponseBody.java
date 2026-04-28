// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeCostRulesResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeCostRulesResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeCostRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCostRulesResponseBody self = new DescribeCostRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCostRulesResponseBody setItems(java.util.List<DescribeCostRulesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeCostRulesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeCostRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCostRulesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeCostRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCostRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCostRulesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeCostRulesResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CacheCostPointsPerMillion")
        public String cacheCostPointsPerMillion;

        /**
         * <strong>example:</strong>
         * <p>924d450014e64e88ac6e8486f8e990**</p>
         */
        @NameInMap("CostRuleId")
        public String costRuleId;

        /**
         * <strong>example:</strong>
         * <p>2026-01-04T16:09:29+08:00</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <strong>example:</strong>
         * <p>2024-10-16 16:46:20</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>pg-xxxxxxxxxx</p>
         */
        @NameInMap("GwClusterId")
        public String gwClusterId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InputCostPointsPerMillion")
        public String inputCostPointsPerMillion;

        /**
         * <strong>example:</strong>
         * <p>gpt-4</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <strong>example:</strong>
         * <p>ms-xxxxxxxxx</p>
         */
        @NameInMap("ModelServiceId")
        public String modelServiceId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OutputCostPointsPerMillion")
        public String outputCostPointsPerMillion;

        public static DescribeCostRulesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCostRulesResponseBodyItems self = new DescribeCostRulesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeCostRulesResponseBodyItems setCacheCostPointsPerMillion(String cacheCostPointsPerMillion) {
            this.cacheCostPointsPerMillion = cacheCostPointsPerMillion;
            return this;
        }
        public String getCacheCostPointsPerMillion() {
            return this.cacheCostPointsPerMillion;
        }

        public DescribeCostRulesResponseBodyItems setCostRuleId(String costRuleId) {
            this.costRuleId = costRuleId;
            return this;
        }
        public String getCostRuleId() {
            return this.costRuleId;
        }

        public DescribeCostRulesResponseBodyItems setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeCostRulesResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeCostRulesResponseBodyItems setGwClusterId(String gwClusterId) {
            this.gwClusterId = gwClusterId;
            return this;
        }
        public String getGwClusterId() {
            return this.gwClusterId;
        }

        public DescribeCostRulesResponseBodyItems setInputCostPointsPerMillion(String inputCostPointsPerMillion) {
            this.inputCostPointsPerMillion = inputCostPointsPerMillion;
            return this;
        }
        public String getInputCostPointsPerMillion() {
            return this.inputCostPointsPerMillion;
        }

        public DescribeCostRulesResponseBodyItems setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeCostRulesResponseBodyItems setModelServiceId(String modelServiceId) {
            this.modelServiceId = modelServiceId;
            return this;
        }
        public String getModelServiceId() {
            return this.modelServiceId;
        }

        public DescribeCostRulesResponseBodyItems setOutputCostPointsPerMillion(String outputCostPointsPerMillion) {
            this.outputCostPointsPerMillion = outputCostPointsPerMillion;
            return this;
        }
        public String getOutputCostPointsPerMillion() {
            return this.outputCostPointsPerMillion;
        }

    }

}
