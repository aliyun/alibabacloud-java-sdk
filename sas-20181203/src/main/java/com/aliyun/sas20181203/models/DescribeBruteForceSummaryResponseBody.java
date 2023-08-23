// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBruteForceSummaryResponseBody extends TeaModel {
    /**
     * <p>The statistics of IP address blocking policies.</p>
     */
    @NameInMap("BruteForceSummary")
    public DescribeBruteForceSummaryResponseBodyBruteForceSummary bruteForceSummary;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBruteForceSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBruteForceSummaryResponseBody self = new DescribeBruteForceSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBruteForceSummaryResponseBody setBruteForceSummary(DescribeBruteForceSummaryResponseBodyBruteForceSummary bruteForceSummary) {
        this.bruteForceSummary = bruteForceSummary;
        return this;
    }
    public DescribeBruteForceSummaryResponseBodyBruteForceSummary getBruteForceSummary() {
        return this.bruteForceSummary;
    }

    public DescribeBruteForceSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBruteForceSummaryResponseBodyBruteForceSummary extends TeaModel {
        /**
         * <p>The number of anti-brute force IP blocking policies.</p>
         */
        @NameInMap("AllStrategyCount")
        public Integer allStrategyCount;

        /**
         * <p>The number of defense policies.</p>
         */
        @NameInMap("AntiBruteForceRuleCount")
        public String antiBruteForceRuleCount;

        /**
         * <p>The number of custom blocking rules that are in effect.</p>
         */
        @NameInMap("CustomEffectiveCount")
        public String customEffectiveCount;

        /**
         * <p>The number of custom blocking rules.</p>
         */
        @NameInMap("CustomRecordCount")
        public String customRecordCount;

        /**
         * <p>The number of anti-brute force IP blocking policies enabled.</p>
         */
        @NameInMap("EffectiveCount")
        public Integer effectiveCount;

        /**
         * <p>The number of system blocking rules that are in effect.</p>
         */
        @NameInMap("SystemEffectiveCount")
        public String systemEffectiveCount;

        /**
         * <p>The number of system blocking rules.</p>
         */
        @NameInMap("SystemRecordCount")
        public String systemRecordCount;

        public static DescribeBruteForceSummaryResponseBodyBruteForceSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeBruteForceSummaryResponseBodyBruteForceSummary self = new DescribeBruteForceSummaryResponseBodyBruteForceSummary();
            return TeaModel.build(map, self);
        }

        public DescribeBruteForceSummaryResponseBodyBruteForceSummary setAllStrategyCount(Integer allStrategyCount) {
            this.allStrategyCount = allStrategyCount;
            return this;
        }
        public Integer getAllStrategyCount() {
            return this.allStrategyCount;
        }

        public DescribeBruteForceSummaryResponseBodyBruteForceSummary setAntiBruteForceRuleCount(String antiBruteForceRuleCount) {
            this.antiBruteForceRuleCount = antiBruteForceRuleCount;
            return this;
        }
        public String getAntiBruteForceRuleCount() {
            return this.antiBruteForceRuleCount;
        }

        public DescribeBruteForceSummaryResponseBodyBruteForceSummary setCustomEffectiveCount(String customEffectiveCount) {
            this.customEffectiveCount = customEffectiveCount;
            return this;
        }
        public String getCustomEffectiveCount() {
            return this.customEffectiveCount;
        }

        public DescribeBruteForceSummaryResponseBodyBruteForceSummary setCustomRecordCount(String customRecordCount) {
            this.customRecordCount = customRecordCount;
            return this;
        }
        public String getCustomRecordCount() {
            return this.customRecordCount;
        }

        public DescribeBruteForceSummaryResponseBodyBruteForceSummary setEffectiveCount(Integer effectiveCount) {
            this.effectiveCount = effectiveCount;
            return this;
        }
        public Integer getEffectiveCount() {
            return this.effectiveCount;
        }

        public DescribeBruteForceSummaryResponseBodyBruteForceSummary setSystemEffectiveCount(String systemEffectiveCount) {
            this.systemEffectiveCount = systemEffectiveCount;
            return this;
        }
        public String getSystemEffectiveCount() {
            return this.systemEffectiveCount;
        }

        public DescribeBruteForceSummaryResponseBodyBruteForceSummary setSystemRecordCount(String systemRecordCount) {
            this.systemRecordCount = systemRecordCount;
            return this;
        }
        public String getSystemRecordCount() {
            return this.systemRecordCount;
        }

    }

}
