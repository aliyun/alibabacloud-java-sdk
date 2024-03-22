// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybookNumberMetricsResponseBody extends TeaModel {
    /**
     * <p>The statistics.</p>
     */
    @NameInMap("Metrics")
    public DescribePlaybookNumberMetricsResponseBodyMetrics metrics;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePlaybookNumberMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePlaybookNumberMetricsResponseBody self = new DescribePlaybookNumberMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePlaybookNumberMetricsResponseBody setMetrics(DescribePlaybookNumberMetricsResponseBodyMetrics metrics) {
        this.metrics = metrics;
        return this;
    }
    public DescribePlaybookNumberMetricsResponseBodyMetrics getMetrics() {
        return this.metrics;
    }

    public DescribePlaybookNumberMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePlaybookNumberMetricsResponseBodyMetrics extends TeaModel {
        /**
         * <p>The number of enabled playbooks.</p>
         */
        @NameInMap("StartUpNum")
        public Integer startUpNum;

        /**
         * <p>The total number of playbooks.</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        public static DescribePlaybookNumberMetricsResponseBodyMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribePlaybookNumberMetricsResponseBodyMetrics self = new DescribePlaybookNumberMetricsResponseBodyMetrics();
            return TeaModel.build(map, self);
        }

        public DescribePlaybookNumberMetricsResponseBodyMetrics setStartUpNum(Integer startUpNum) {
            this.startUpNum = startUpNum;
            return this;
        }
        public Integer getStartUpNum() {
            return this.startUpNum;
        }

        public DescribePlaybookNumberMetricsResponseBodyMetrics setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
