// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAiEngineOverviewResponseBody extends TeaModel {
    /**
     * <p>The number of analyzed requests.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("AnalyzedRequestCount")
    public Long analyzedRequestCount;

    /**
     * <p>The number of events within the specified time range.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EventCount")
    public Long eventCount;

    /**
     * <p>The number of events within the specified time range, categorized by handling status.</p>
     */
    @NameInMap("HandleStatusCounts")
    public DescribeAiEngineOverviewResponseBodyHandleStatusCounts handleStatusCounts;

    /**
     * <p>The number of protection groups for which AI Engine is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ProtectedGroupCount")
    public Integer protectedGroupCount;

    /**
     * <p>The number of protected objects for which AI Engine is enabled. This count does not include protected objects that belong to a protection group.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("ProtectedResourceCount")
    public Integer protectedResourceCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>01A1CEE****-019A-8B44-255****F9C2C8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of events within the specified time range, categorized by risk level.</p>
     */
    @NameInMap("RiskCounts")
    public DescribeAiEngineOverviewResponseBodyRiskCounts riskCounts;

    public static DescribeAiEngineOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiEngineOverviewResponseBody self = new DescribeAiEngineOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAiEngineOverviewResponseBody setAnalyzedRequestCount(Long analyzedRequestCount) {
        this.analyzedRequestCount = analyzedRequestCount;
        return this;
    }
    public Long getAnalyzedRequestCount() {
        return this.analyzedRequestCount;
    }

    public DescribeAiEngineOverviewResponseBody setEventCount(Long eventCount) {
        this.eventCount = eventCount;
        return this;
    }
    public Long getEventCount() {
        return this.eventCount;
    }

    public DescribeAiEngineOverviewResponseBody setHandleStatusCounts(DescribeAiEngineOverviewResponseBodyHandleStatusCounts handleStatusCounts) {
        this.handleStatusCounts = handleStatusCounts;
        return this;
    }
    public DescribeAiEngineOverviewResponseBodyHandleStatusCounts getHandleStatusCounts() {
        return this.handleStatusCounts;
    }

    public DescribeAiEngineOverviewResponseBody setProtectedGroupCount(Integer protectedGroupCount) {
        this.protectedGroupCount = protectedGroupCount;
        return this;
    }
    public Integer getProtectedGroupCount() {
        return this.protectedGroupCount;
    }

    public DescribeAiEngineOverviewResponseBody setProtectedResourceCount(Integer protectedResourceCount) {
        this.protectedResourceCount = protectedResourceCount;
        return this;
    }
    public Integer getProtectedResourceCount() {
        return this.protectedResourceCount;
    }

    public DescribeAiEngineOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAiEngineOverviewResponseBody setRiskCounts(DescribeAiEngineOverviewResponseBodyRiskCounts riskCounts) {
        this.riskCounts = riskCounts;
        return this;
    }
    public DescribeAiEngineOverviewResponseBodyRiskCounts getRiskCounts() {
        return this.riskCounts;
    }

    public static class DescribeAiEngineOverviewResponseBodyHandleStatusCounts extends TeaModel {
        /**
         * <p>The number of handled events.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Handled")
        public Long handled;

        /**
         * <p>The number of events being handled.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Handling")
        public Long handling;

        /**
         * <p>The number of unhandled events.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Unhandled")
        public Long unhandled;

        public static DescribeAiEngineOverviewResponseBodyHandleStatusCounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiEngineOverviewResponseBodyHandleStatusCounts self = new DescribeAiEngineOverviewResponseBodyHandleStatusCounts();
            return TeaModel.build(map, self);
        }

        public DescribeAiEngineOverviewResponseBodyHandleStatusCounts setHandled(Long handled) {
            this.handled = handled;
            return this;
        }
        public Long getHandled() {
            return this.handled;
        }

        public DescribeAiEngineOverviewResponseBodyHandleStatusCounts setHandling(Long handling) {
            this.handling = handling;
            return this;
        }
        public Long getHandling() {
            return this.handling;
        }

        public DescribeAiEngineOverviewResponseBodyHandleStatusCounts setUnhandled(Long unhandled) {
            this.unhandled = unhandled;
            return this;
        }
        public Long getUnhandled() {
            return this.unhandled;
        }

    }

    public static class DescribeAiEngineOverviewResponseBodyRiskCounts extends TeaModel {
        /**
         * <p>The number of critical events.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Critical")
        public Long critical;

        /**
         * <p>The number of high-risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("High")
        public Long high;

        /**
         * <p>The number of low-risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Low")
        public Long low;

        /**
         * <p>The number of medium-risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Medium")
        public Long medium;

        public static DescribeAiEngineOverviewResponseBodyRiskCounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiEngineOverviewResponseBodyRiskCounts self = new DescribeAiEngineOverviewResponseBodyRiskCounts();
            return TeaModel.build(map, self);
        }

        public DescribeAiEngineOverviewResponseBodyRiskCounts setCritical(Long critical) {
            this.critical = critical;
            return this;
        }
        public Long getCritical() {
            return this.critical;
        }

        public DescribeAiEngineOverviewResponseBodyRiskCounts setHigh(Long high) {
            this.high = high;
            return this;
        }
        public Long getHigh() {
            return this.high;
        }

        public DescribeAiEngineOverviewResponseBodyRiskCounts setLow(Long low) {
            this.low = low;
            return this;
        }
        public Long getLow() {
            return this.low;
        }

        public DescribeAiEngineOverviewResponseBodyRiskCounts setMedium(Long medium) {
            this.medium = medium;
            return this;
        }
        public Long getMedium() {
            return this.medium;
        }

    }

}
