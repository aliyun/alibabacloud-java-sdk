// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribePvtzStatisticsGlobalOverviewResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribePvtzStatisticsGlobalOverviewResponseBodyData data;

    /**
     * <p>Id of the request</p>
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
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("AvgResolveLatency")
        public Long avgResolveLatency;

        /**
         * <strong>example:</strong>
         * <p>-2</p>
         */
        @NameInMap("AvgResolveLatencyTrend")
        public Long avgResolveLatencyTrend;

        /**
         * <strong>example:</strong>
         * <p>98</p>
         */
        @NameInMap("AvgSuccessRatio")
        public Long avgSuccessRatio;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AvgSuccessRatioTrend")
        public Long avgSuccessRatioTrend;

        /**
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("TotalResolveCount")
        public Long totalResolveCount;

        /**
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
