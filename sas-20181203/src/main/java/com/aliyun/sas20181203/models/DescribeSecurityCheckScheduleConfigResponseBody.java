// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecurityCheckScheduleConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DaysOfWeek")
        public String daysOfWeek;

        @NameInMap("EndTime")
        public Integer endTime;

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
