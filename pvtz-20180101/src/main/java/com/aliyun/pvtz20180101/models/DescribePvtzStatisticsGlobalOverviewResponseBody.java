// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribePvtzStatisticsGlobalOverviewResponseBody extends TeaModel {
    /**
     * <p>The statistical results.</p>
     */
    @NameInMap("Data")
    public DescribePvtzStatisticsGlobalOverviewResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0B7AD377-7E86-44A8-B9A8-53E8666E72FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePvtzStatisticsGlobalOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePvtzStatisticsGlobalOverviewResponseBody self = new DescribePvtzStatisticsGlobalOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePvtzStatisticsGlobalOverviewResponseBody setData(DescribePvtzStatisticsGlobalOverviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePvtzStatisticsGlobalOverviewResponseBodyData getData() {
        return this.data;
    }

    public DescribePvtzStatisticsGlobalOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePvtzStatisticsGlobalOverviewResponseBodyData extends TeaModel {
        /**
         * <p>The average resolution latency for all VPCs with traffic analysis enabled. The average resolution latency is the average time from when an Alibaba Cloud DNS server receives a DNS query to when it returns a response.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("AvgResolveLatency")
        public Long avgResolveLatency;

        /**
         * <p>The trend in the average resolution latency for all VPCs with traffic analysis enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>-2</p>
         */
        @NameInMap("AvgResolveLatencyTrend")
        public Long avgResolveLatencyTrend;

        /**
         * <p>The average resolution success rate for all VPCs with traffic analysis enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>98</p>
         */
        @NameInMap("AvgSuccessRatio")
        public Long avgSuccessRatio;

        /**
         * <p>The trend in the average resolution success rate for all VPCs with traffic analysis enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AvgSuccessRatioTrend")
        public Long avgSuccessRatioTrend;

        /**
         * <p>The total number of resolutions for all VPCs with traffic analysis enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("TotalResolveCount")
        public Long totalResolveCount;

        /**
         * <p>The trend in the resolution volume for all VPCs with traffic analysis enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalResolveCountTrend")
        public Long totalResolveCountTrend;

        public static DescribePvtzStatisticsGlobalOverviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePvtzStatisticsGlobalOverviewResponseBodyData self = new DescribePvtzStatisticsGlobalOverviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePvtzStatisticsGlobalOverviewResponseBodyData setAvgResolveLatency(Long avgResolveLatency) {
            this.avgResolveLatency = avgResolveLatency;
            return this;
        }
        public Long getAvgResolveLatency() {
            return this.avgResolveLatency;
        }

        public DescribePvtzStatisticsGlobalOverviewResponseBodyData setAvgResolveLatencyTrend(Long avgResolveLatencyTrend) {
            this.avgResolveLatencyTrend = avgResolveLatencyTrend;
            return this;
        }
        public Long getAvgResolveLatencyTrend() {
            return this.avgResolveLatencyTrend;
        }

        public DescribePvtzStatisticsGlobalOverviewResponseBodyData setAvgSuccessRatio(Long avgSuccessRatio) {
            this.avgSuccessRatio = avgSuccessRatio;
            return this;
        }
        public Long getAvgSuccessRatio() {
            return this.avgSuccessRatio;
        }

        public DescribePvtzStatisticsGlobalOverviewResponseBodyData setAvgSuccessRatioTrend(Long avgSuccessRatioTrend) {
            this.avgSuccessRatioTrend = avgSuccessRatioTrend;
            return this;
        }
        public Long getAvgSuccessRatioTrend() {
            return this.avgSuccessRatioTrend;
        }

        public DescribePvtzStatisticsGlobalOverviewResponseBodyData setTotalResolveCount(Long totalResolveCount) {
            this.totalResolveCount = totalResolveCount;
            return this;
        }
        public Long getTotalResolveCount() {
            return this.totalResolveCount;
        }

        public DescribePvtzStatisticsGlobalOverviewResponseBodyData setTotalResolveCountTrend(Long totalResolveCountTrend) {
            this.totalResolveCountTrend = totalResolveCountTrend;
            return this;
        }
        public Long getTotalResolveCountTrend() {
            return this.totalResolveCountTrend;
        }

    }

}
