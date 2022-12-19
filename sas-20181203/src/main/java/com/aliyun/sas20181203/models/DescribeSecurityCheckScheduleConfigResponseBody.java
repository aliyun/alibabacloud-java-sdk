// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecurityCheckScheduleConfigResponseBody extends TeaModel {
    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The configurations of custom check tasks.
    @NameInMap("RiskCheckJobConfig")
    public DescribeSecurityCheckScheduleConfigResponseBodyRiskCheckJobConfig riskCheckJobConfig;

    public static DescribeSecurityCheckScheduleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityCheckScheduleConfigResponseBody self = new DescribeSecurityCheckScheduleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityCheckScheduleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityCheckScheduleConfigResponseBody setRiskCheckJobConfig(DescribeSecurityCheckScheduleConfigResponseBodyRiskCheckJobConfig riskCheckJobConfig) {
        this.riskCheckJobConfig = riskCheckJobConfig;
        return this;
    }
    public DescribeSecurityCheckScheduleConfigResponseBodyRiskCheckJobConfig getRiskCheckJobConfig() {
        return this.riskCheckJobConfig;
    }

    public static class DescribeSecurityCheckScheduleConfigResponseBodyRiskCheckJobConfig extends TeaModel {
        // The day of the week when the check tasks are performed. Multiple days can be specified. Multiple days are separated by commas (,).
        // 
        // *   **1**: Monday
        // *   **2**: Tuesday
        // *   **3**: Wednesday
        // *   **4**: Thursday
        // *   **5**: Friday
        // *   **6**: Saturday
        // *   **7**: Sunday
        @NameInMap("DaysOfWeek")
        public String daysOfWeek;

        // The time range during which check tasks end. Valid values:
        // 
        // *   **6**: 00:00 to 06:00
        // *   **12**: 06:00 to 12:00
        // *   **18**: 12:00 to 18:00
        // *   **24**: 18:00 to 24:00
        @NameInMap("EndTime")
        public Integer endTime;

        // The time range during which check tasks start. Valid values:
        // 
        // *   **0**: 00:00 to 06:00
        // *   **6**: 06:00 to 12:00
        // *   **12**: 12:00 to 18:00
        // *   **18**: 18:00 to 24:00
        @NameInMap("StartTime")
        public Integer startTime;

        public static DescribeSecurityCheckScheduleConfigResponseBodyRiskCheckJobConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityCheckScheduleConfigResponseBodyRiskCheckJobConfig self = new DescribeSecurityCheckScheduleConfigResponseBodyRiskCheckJobConfig();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityCheckScheduleConfigResponseBodyRiskCheckJobConfig setDaysOfWeek(String daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }
        public String getDaysOfWeek() {
            return this.daysOfWeek;
        }

        public DescribeSecurityCheckScheduleConfigResponseBodyRiskCheckJobConfig setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public DescribeSecurityCheckScheduleConfigResponseBodyRiskCheckJobConfig setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

    }

}
