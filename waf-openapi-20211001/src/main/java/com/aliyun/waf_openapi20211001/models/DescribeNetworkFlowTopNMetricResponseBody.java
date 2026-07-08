// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeNetworkFlowTopNMetricResponseBody extends TeaModel {
    /**
     * <p>An array of the top N statistics.</p>
     */
    @NameInMap("NetworkFlowTopNValues")
    public java.util.List<DescribeNetworkFlowTopNMetricResponseBodyNetworkFlowTopNValues> networkFlowTopNValues;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D827FCFE-90A7-4330-9326-******4C7726</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The metadata of the returned data.</p>
     */
    @NameInMap("TopNMetaData")
    public DescribeNetworkFlowTopNMetricResponseBodyTopNMetaData topNMetaData;

    public static DescribeNetworkFlowTopNMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkFlowTopNMetricResponseBody self = new DescribeNetworkFlowTopNMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkFlowTopNMetricResponseBody setNetworkFlowTopNValues(java.util.List<DescribeNetworkFlowTopNMetricResponseBodyNetworkFlowTopNValues> networkFlowTopNValues) {
        this.networkFlowTopNValues = networkFlowTopNValues;
        return this;
    }
    public java.util.List<DescribeNetworkFlowTopNMetricResponseBodyNetworkFlowTopNValues> getNetworkFlowTopNValues() {
        return this.networkFlowTopNValues;
    }

    public DescribeNetworkFlowTopNMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkFlowTopNMetricResponseBody setTopNMetaData(DescribeNetworkFlowTopNMetricResponseBodyTopNMetaData topNMetaData) {
        this.topNMetaData = topNMetaData;
        return this;
    }
    public DescribeNetworkFlowTopNMetricResponseBodyTopNMetaData getTopNMetaData() {
        return this.topNMetaData;
    }

    public static class DescribeNetworkFlowTopNMetricResponseBodyNetworkFlowTopNValues extends TeaModel {
        /**
         * <p>The additional attribute associated with the entry. For example, when the Metric is set to real_client_ip, this parameter indicates the country or region to which the IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("Attribute")
        public String attribute;

        /**
         * <p>The dimension value that corresponds to the specified Metric request parameter. For example, if the Metric is set to real_client_ip, this parameter indicates the source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The total number of requests or the QPS value, depending on the specified Metric. This value is used for top N ranking.</p>
         * 
         * <strong>example:</strong>
         * <p>1123</p>
         */
        @NameInMap("Value")
        public Long value;

        public static DescribeNetworkFlowTopNMetricResponseBodyNetworkFlowTopNValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkFlowTopNMetricResponseBodyNetworkFlowTopNValues self = new DescribeNetworkFlowTopNMetricResponseBodyNetworkFlowTopNValues();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkFlowTopNMetricResponseBodyNetworkFlowTopNValues setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public DescribeNetworkFlowTopNMetricResponseBodyNetworkFlowTopNValues setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeNetworkFlowTopNMetricResponseBodyNetworkFlowTopNValues setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class DescribeNetworkFlowTopNMetricResponseBodyTopNMetaDataDateRange extends TeaModel {
        /**
         * <p>The end of the time range. This value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1713888600</p>
         */
        @NameInMap("EndDate")
        public Long endDate;

        /**
         * <p>The beginning of the time range. This value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1713888000</p>
         */
        @NameInMap("StartDate")
        public Long startDate;

        public static DescribeNetworkFlowTopNMetricResponseBodyTopNMetaDataDateRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkFlowTopNMetricResponseBodyTopNMetaDataDateRange self = new DescribeNetworkFlowTopNMetricResponseBodyTopNMetaDataDateRange();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkFlowTopNMetricResponseBodyTopNMetaDataDateRange setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public DescribeNetworkFlowTopNMetricResponseBodyTopNMetaDataDateRange setStartDate(Long startDate) {
            this.startDate = startDate;
            return this;
        }
        public Long getStartDate() {
            return this.startDate;
        }

    }

    public static class DescribeNetworkFlowTopNMetricResponseBodyTopNMetaData extends TeaModel {
        /**
         * <p>The time range used for the query.</p>
         */
        @NameInMap("DateRange")
        public DescribeNetworkFlowTopNMetricResponseBodyTopNMetaDataDateRange dateRange;

        /**
         * <p>The unit of the returned statistical data.</p>
         * 
         * <strong>example:</strong>
         * <p>requests</p>
         */
        @NameInMap("Units")
        public String units;

        public static DescribeNetworkFlowTopNMetricResponseBodyTopNMetaData build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkFlowTopNMetricResponseBodyTopNMetaData self = new DescribeNetworkFlowTopNMetricResponseBodyTopNMetaData();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkFlowTopNMetricResponseBodyTopNMetaData setDateRange(DescribeNetworkFlowTopNMetricResponseBodyTopNMetaDataDateRange dateRange) {
            this.dateRange = dateRange;
            return this;
        }
        public DescribeNetworkFlowTopNMetricResponseBodyTopNMetaDataDateRange getDateRange() {
            return this.dateRange;
        }

        public DescribeNetworkFlowTopNMetricResponseBodyTopNMetaData setUnits(String units) {
            this.units = units;
            return this;
        }
        public String getUnits() {
            return this.units;
        }

    }

}
