// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetNisTrafficMetricsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned per page or per query. In VPC scenarios, this represents the paging size. In TR and Internet Shared Bandwidth scenarios, this represents the SQL query limit.</p>
     * 
     * <strong>example:</strong>
     * <p>1440</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The list of time series metric data points. Each element represents an aggregated time point and its corresponding metric value.</p>
     */
    @NameInMap("MetricStatics")
    public java.util.List<GetNisTrafficMetricsResponseBodyMetricStatics> metricStatics;

    /**
     * <p>The paging token for the next page. Paging is supported only in VPC scenarios. An empty value indicates that no more pages exist. This field is typically not returned in TR and Internet Shared Bandwidth scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>qqt9NJ3/AWeMXCntK4Kyhrt0QclAmfbtYB4899hEUzVNEo/F148UPCh2itDku111</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FA764-BA47-56F8-88E1-7AB503A62112</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of data points in the query result.</p>
     * 
     * <strong>example:</strong>
     * <p>1440</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p><strong>Unit and MetricName mapping</strong></p>
     * <ul>
     * <li><p>Bandwidth  </p>
     * <ul>
     * <li>Unit: Bits/Second  </li>
     * <li>Description: bits per second.</li>
     * </ul>
     * </li>
     * <li><p>PacketsRate  </p>
     * <ul>
     * <li>Unit: Packets/Second  </li>
     * <li>Description: packets per second.</li>
     * </ul>
     * </li>
     * <li><p>RoundTripTime  </p>
     * <ul>
     * <li>Unit: MicroSecond  </li>
     * <li>Description: TCP round-trip time.</li>
     * </ul>
     * </li>
     * <li><p>BandwidthUtilization  </p>
     * <ul>
     * <li>Unit: Percent  </li>
     * <li>Description: bandwidth utilization.</li>
     * </ul>
     * </li>
     * <li><p>PacketsLostNoRouteRate  </p>
     * <ul>
     * <li>Unit: PacketsLostNoRouteRate  </li>
     * <li>Description: rate of packets dropped due to no route.</li>
     * </ul>
     * </li>
     * <li><p>PacketsLostBlackholeRate  </p>
     * <ul>
     * <li>Unit: PacketsLostBlackholeRate  </li>
     * <li>Description: rate of packets dropped due to blackhole routing.</li>
     * </ul>
     * </li>
     * <li><p>PacketsLostTTLExpiredRate  </p>
     * <ul>
     * <li>Unit: PacketsLostTTLExpiredRate  </li>
     * <li>Description: rate of packets dropped due to TTL expiration.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Bits/Second</p>
     */
    @NameInMap("Unit")
    public String unit;

    public static GetNisTrafficMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNisTrafficMetricsResponseBody self = new GetNisTrafficMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNisTrafficMetricsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetNisTrafficMetricsResponseBody setMetricStatics(java.util.List<GetNisTrafficMetricsResponseBodyMetricStatics> metricStatics) {
        this.metricStatics = metricStatics;
        return this;
    }
    public java.util.List<GetNisTrafficMetricsResponseBodyMetricStatics> getMetricStatics() {
        return this.metricStatics;
    }

    public GetNisTrafficMetricsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetNisTrafficMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNisTrafficMetricsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public GetNisTrafficMetricsResponseBody setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public static class GetNisTrafficMetricsResponseBodyMetricStatics extends TeaModel {
        /**
         * <p>The timestamp of the data point, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1785219000000</p>
         */
        @NameInMap("TimeStamp")
        public Long timeStamp;

        /**
         * <p>The metric value at the current time point. The specific meaning and unit are determined by the MetricName in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>102400.25</p>
         */
        @NameInMap("Value")
        public Double value;

        public static GetNisTrafficMetricsResponseBodyMetricStatics build(java.util.Map<String, ?> map) throws Exception {
            GetNisTrafficMetricsResponseBodyMetricStatics self = new GetNisTrafficMetricsResponseBodyMetricStatics();
            return TeaModel.build(map, self);
        }

        public GetNisTrafficMetricsResponseBodyMetricStatics setTimeStamp(Long timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Long getTimeStamp() {
            return this.timeStamp;
        }

        public GetNisTrafficMetricsResponseBodyMetricStatics setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

}
