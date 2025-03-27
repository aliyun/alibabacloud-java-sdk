// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventTopNMetricResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D827FCFE-90A7-4330-9326-D33C8B4C7726</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The top N data entries returned.</p>
     */
    @NameInMap("SecurityEventTopNValues")
    public java.util.List<DescribeSecurityEventTopNMetricResponseBodySecurityEventTopNValues> securityEventTopNValues;

    /**
     * <p>The metadata of the data entries returned.</p>
     */
    @NameInMap("TopNMetaData")
    public DescribeSecurityEventTopNMetricResponseBodyTopNMetaData topNMetaData;

    public static DescribeSecurityEventTopNMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventTopNMetricResponseBody self = new DescribeSecurityEventTopNMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventTopNMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityEventTopNMetricResponseBody setSecurityEventTopNValues(java.util.List<DescribeSecurityEventTopNMetricResponseBodySecurityEventTopNValues> securityEventTopNValues) {
        this.securityEventTopNValues = securityEventTopNValues;
        return this;
    }
    public java.util.List<DescribeSecurityEventTopNMetricResponseBodySecurityEventTopNValues> getSecurityEventTopNValues() {
        return this.securityEventTopNValues;
    }

    public DescribeSecurityEventTopNMetricResponseBody setTopNMetaData(DescribeSecurityEventTopNMetricResponseBodyTopNMetaData topNMetaData) {
        this.topNMetaData = topNMetaData;
        return this;
    }
    public DescribeSecurityEventTopNMetricResponseBodyTopNMetaData getTopNMetaData() {
        return this.topNMetaData;
    }

    public static class DescribeSecurityEventTopNMetricResponseBodySecurityEventTopNValues extends TeaModel {
        /**
         * <p>The additional information, such as the protection module for a protection rule whose ID is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("Attribute")
        public String attribute;

        /**
         * <p>The field value, which varies based on the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>i-8v****a-443-ecs</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The count for the data entry.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("Value")
        public Long value;

        public static DescribeSecurityEventTopNMetricResponseBodySecurityEventTopNValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventTopNMetricResponseBodySecurityEventTopNValues self = new DescribeSecurityEventTopNMetricResponseBodySecurityEventTopNValues();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventTopNMetricResponseBodySecurityEventTopNValues setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public DescribeSecurityEventTopNMetricResponseBodySecurityEventTopNValues setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSecurityEventTopNMetricResponseBodySecurityEventTopNValues setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class DescribeSecurityEventTopNMetricResponseBodyTopNMetaDataDateRange extends TeaModel {
        /**
         * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds. This value is the same as the value of EndDate in the request parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>1713888600</p>
         */
        @NameInMap("EndDate")
        public Long endDate;

        /**
         * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds. This value is the same as the value of StartDate in the request parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>1713888000</p>
         */
        @NameInMap("StartDate")
        public Long startDate;

        public static DescribeSecurityEventTopNMetricResponseBodyTopNMetaDataDateRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventTopNMetricResponseBodyTopNMetaDataDateRange self = new DescribeSecurityEventTopNMetricResponseBodyTopNMetaDataDateRange();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventTopNMetricResponseBodyTopNMetaDataDateRange setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public DescribeSecurityEventTopNMetricResponseBodyTopNMetaDataDateRange setStartDate(Long startDate) {
            this.startDate = startDate;
            return this;
        }
        public Long getStartDate() {
            return this.startDate;
        }

    }

    public static class DescribeSecurityEventTopNMetricResponseBodyTopNMetaData extends TeaModel {
        /**
         * <p>The time range that is used for the query.</p>
         */
        @NameInMap("DateRange")
        public DescribeSecurityEventTopNMetricResponseBodyTopNMetaDataDateRange dateRange;

        /**
         * <p>The unit of the returned data. Defaults to the value: request.</p>
         * 
         * <strong>example:</strong>
         * <p>request</p>
         */
        @NameInMap("Units")
        public String units;

        public static DescribeSecurityEventTopNMetricResponseBodyTopNMetaData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventTopNMetricResponseBodyTopNMetaData self = new DescribeSecurityEventTopNMetricResponseBodyTopNMetaData();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventTopNMetricResponseBodyTopNMetaData setDateRange(DescribeSecurityEventTopNMetricResponseBodyTopNMetaDataDateRange dateRange) {
            this.dateRange = dateRange;
            return this;
        }
        public DescribeSecurityEventTopNMetricResponseBodyTopNMetaDataDateRange getDateRange() {
            return this.dateRange;
        }

        public DescribeSecurityEventTopNMetricResponseBodyTopNMetaData setUnits(String units) {
            this.units = units;
            return this;
        }
        public String getUnits() {
            return this.units;
        }

    }

}
