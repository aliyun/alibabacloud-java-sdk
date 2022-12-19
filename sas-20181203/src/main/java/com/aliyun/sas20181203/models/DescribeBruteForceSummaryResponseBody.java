// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBruteForceSummaryResponseBody extends TeaModel {
    // The statistics of IP address blocking policies.
    @NameInMap("BruteForceSummary")
    public DescribeBruteForceSummaryResponseBodyBruteForceSummary bruteForceSummary;

    // The ID of the request, which is used to locate and troubleshoot issues.
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
        // The total number of IP address blocking policies.
        @NameInMap("AllStrategyCount")
        public Integer allStrategyCount;

        // The number of enabled IP address blocking policies.
        @NameInMap("EffectiveCount")
        public Integer effectiveCount;

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

        public DescribeBruteForceSummaryResponseBodyBruteForceSummary setEffectiveCount(Integer effectiveCount) {
            this.effectiveCount = effectiveCount;
            return this;
        }
        public Integer getEffectiveCount() {
            return this.effectiveCount;
        }

    }

}
