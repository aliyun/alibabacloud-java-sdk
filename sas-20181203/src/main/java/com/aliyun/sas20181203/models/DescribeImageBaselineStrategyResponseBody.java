// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBaselineStrategyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the baseline check policy.</p>
     */
    @NameInMap("Strategy")
    public DescribeImageBaselineStrategyResponseBodyStrategy strategy;

    public static DescribeImageBaselineStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageBaselineStrategyResponseBody self = new DescribeImageBaselineStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageBaselineStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageBaselineStrategyResponseBody setStrategy(DescribeImageBaselineStrategyResponseBodyStrategy strategy) {
        this.strategy = strategy;
        return this;
    }
    public DescribeImageBaselineStrategyResponseBodyStrategy getStrategy() {
        return this.strategy;
    }

    public static class DescribeImageBaselineStrategyResponseBodyStrategyBaselineItemList extends TeaModel {
        /**
         * <p>The key of the baseline type.</p>
         */
        @NameInMap("ClassKey")
        public String classKey;

        /**
         * <p>The key of the baseline check item.</p>
         */
        @NameInMap("ItemKey")
        public String itemKey;

        /**
         * <p>The key of the name for the baseline.</p>
         */
        @NameInMap("NameKey")
        public String nameKey;

        public static DescribeImageBaselineStrategyResponseBodyStrategyBaselineItemList build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageBaselineStrategyResponseBodyStrategyBaselineItemList self = new DescribeImageBaselineStrategyResponseBodyStrategyBaselineItemList();
            return TeaModel.build(map, self);
        }

        public DescribeImageBaselineStrategyResponseBodyStrategyBaselineItemList setClassKey(String classKey) {
            this.classKey = classKey;
            return this;
        }
        public String getClassKey() {
            return this.classKey;
        }

        public DescribeImageBaselineStrategyResponseBodyStrategyBaselineItemList setItemKey(String itemKey) {
            this.itemKey = itemKey;
            return this;
        }
        public String getItemKey() {
            return this.itemKey;
        }

        public DescribeImageBaselineStrategyResponseBodyStrategyBaselineItemList setNameKey(String nameKey) {
            this.nameKey = nameKey;
            return this;
        }
        public String getNameKey() {
            return this.nameKey;
        }

    }

    public static class DescribeImageBaselineStrategyResponseBodyStrategy extends TeaModel {
        @NameInMap("BaselineItem")
        public String baselineItem;

        /**
         * <p>An array that contains the baselines.</p>
         */
        @NameInMap("BaselineItemList")
        public java.util.List<DescribeImageBaselineStrategyResponseBodyStrategyBaselineItemList> baselineItemList;

        /**
         * <p>The number of selected baseline check items.</p>
         */
        @NameInMap("SelectedItemCount")
        public Integer selectedItemCount;

        /**
         * <p>The ID of the baseline check policy.</p>
         */
        @NameInMap("StrategyId")
        public Long strategyId;

        /**
         * <p>The name of the baseline check policy.</p>
         */
        @NameInMap("StrategyName")
        public String strategyName;

        /**
         * <p>The total number of baseline check items.</p>
         */
        @NameInMap("TotalItemCount")
        public Integer totalItemCount;

        /**
         * <p>The type of the baseline check policy. Valid values:</p>
         * <br>
         * <p>*   **default**: the default policy</p>
         * <p>*   **full**: a policy that uses all baselines</p>
         * <p>*   **normal**: a policy that uses general baselines</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeImageBaselineStrategyResponseBodyStrategy build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageBaselineStrategyResponseBodyStrategy self = new DescribeImageBaselineStrategyResponseBodyStrategy();
            return TeaModel.build(map, self);
        }

        public DescribeImageBaselineStrategyResponseBodyStrategy setBaselineItem(String baselineItem) {
            this.baselineItem = baselineItem;
            return this;
        }
        public String getBaselineItem() {
            return this.baselineItem;
        }

        public DescribeImageBaselineStrategyResponseBodyStrategy setBaselineItemList(java.util.List<DescribeImageBaselineStrategyResponseBodyStrategyBaselineItemList> baselineItemList) {
            this.baselineItemList = baselineItemList;
            return this;
        }
        public java.util.List<DescribeImageBaselineStrategyResponseBodyStrategyBaselineItemList> getBaselineItemList() {
            return this.baselineItemList;
        }

        public DescribeImageBaselineStrategyResponseBodyStrategy setSelectedItemCount(Integer selectedItemCount) {
            this.selectedItemCount = selectedItemCount;
            return this;
        }
        public Integer getSelectedItemCount() {
            return this.selectedItemCount;
        }

        public DescribeImageBaselineStrategyResponseBodyStrategy setStrategyId(Long strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public Long getStrategyId() {
            return this.strategyId;
        }

        public DescribeImageBaselineStrategyResponseBodyStrategy setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public DescribeImageBaselineStrategyResponseBodyStrategy setTotalItemCount(Integer totalItemCount) {
            this.totalItemCount = totalItemCount;
            return this;
        }
        public Integer getTotalItemCount() {
            return this.totalItemCount;
        }

        public DescribeImageBaselineStrategyResponseBodyStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
