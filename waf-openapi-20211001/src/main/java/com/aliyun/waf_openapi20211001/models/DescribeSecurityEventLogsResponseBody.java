// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventLogsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D827FCFE-90A7-4330-9326-D33C8B4C7726</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The attack logs returned.</p>
     */
    @NameInMap("SecurityEventLogs")
    public java.util.List<?> securityEventLogs;

    /**
     * <p>The total number of logs returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("SecurityEventLogsTotalCount")
    public Long securityEventLogsTotalCount;

    /**
     * <p>The metadata of the time series data returned.</p>
     */
    @NameInMap("SecurityEventMetaData")
    public DescribeSecurityEventLogsResponseBodySecurityEventMetaData securityEventMetaData;

    public static DescribeSecurityEventLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventLogsResponseBody self = new DescribeSecurityEventLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityEventLogsResponseBody setSecurityEventLogs(java.util.List<?> securityEventLogs) {
        this.securityEventLogs = securityEventLogs;
        return this;
    }
    public java.util.List<?> getSecurityEventLogs() {
        return this.securityEventLogs;
    }

    public DescribeSecurityEventLogsResponseBody setSecurityEventLogsTotalCount(Long securityEventLogsTotalCount) {
        this.securityEventLogsTotalCount = securityEventLogsTotalCount;
        return this;
    }
    public Long getSecurityEventLogsTotalCount() {
        return this.securityEventLogsTotalCount;
    }

    public DescribeSecurityEventLogsResponseBody setSecurityEventMetaData(DescribeSecurityEventLogsResponseBodySecurityEventMetaData securityEventMetaData) {
        this.securityEventMetaData = securityEventMetaData;
        return this;
    }
    public DescribeSecurityEventLogsResponseBodySecurityEventMetaData getSecurityEventMetaData() {
        return this.securityEventMetaData;
    }

    public static class DescribeSecurityEventLogsResponseBodySecurityEventMetaDataDateRange extends TeaModel {
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

        public static DescribeSecurityEventLogsResponseBodySecurityEventMetaDataDateRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventLogsResponseBodySecurityEventMetaDataDateRange self = new DescribeSecurityEventLogsResponseBodySecurityEventMetaDataDateRange();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventLogsResponseBodySecurityEventMetaDataDateRange setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public DescribeSecurityEventLogsResponseBodySecurityEventMetaDataDateRange setStartDate(Long startDate) {
            this.startDate = startDate;
            return this;
        }
        public Long getStartDate() {
            return this.startDate;
        }

    }

    public static class DescribeSecurityEventLogsResponseBodySecurityEventMetaData extends TeaModel {
        /**
         * <p>The time range that is used for the query.</p>
         */
        @NameInMap("DateRange")
        public DescribeSecurityEventLogsResponseBodySecurityEventMetaDataDateRange dateRange;

        /**
         * <p>The unit of the statistics returned. The value is fixed as requests.</p>
         * 
         * <strong>example:</strong>
         * <p>requests</p>
         */
        @NameInMap("Units")
        public String units;

        public static DescribeSecurityEventLogsResponseBodySecurityEventMetaData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventLogsResponseBodySecurityEventMetaData self = new DescribeSecurityEventLogsResponseBodySecurityEventMetaData();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventLogsResponseBodySecurityEventMetaData setDateRange(DescribeSecurityEventLogsResponseBodySecurityEventMetaDataDateRange dateRange) {
            this.dateRange = dateRange;
            return this;
        }
        public DescribeSecurityEventLogsResponseBodySecurityEventMetaDataDateRange getDateRange() {
            return this.dateRange;
        }

        public DescribeSecurityEventLogsResponseBodySecurityEventMetaData setUnits(String units) {
            this.units = units;
            return this;
        }
        public String getUnits() {
            return this.units;
        }

    }

}
