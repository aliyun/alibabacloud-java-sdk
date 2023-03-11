// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecurityCheckScheduleConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The configurations of custom check tasks.</p>
     */
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
        /**
         * <p>The day of the week when the check tasks are performed. Multiple days can be specified. Multiple days are separated by commas (,).</p>
         * <br>
         * <p>*   **1**: Monday</p>
         * <p>*   **2**: Tuesday</p>
         * <p>*   **3**: Wednesday</p>
         * <p>*   **4**: Thursday</p>
         * <p>*   **5**: Friday</p>
         * <p>*   **6**: Saturday</p>
         * <p>*   **7**: Sunday</p>
         */
        @NameInMap("DaysOfWeek")
        public String daysOfWeek;

        /**
         * <p>The time range during which check tasks end. Valid values:</p>
         * <br>
         * <p>*   **6**: 00:00 to 06:00</p>
         * <p>*   **12**: 06:00 to 12:00</p>
         * <p>*   **18**: 12:00 to 18:00</p>
         * <p>*   **24**: 18:00 to 24:00</p>
         */
        @NameInMap("EndTime")
        public Integer endTime;

        /**
         * <p>The time range during which check tasks start. Valid values:</p>
         * <br>
         * <p>*   **0**: 00:00 to 06:00</p>
         * <p>*   **6**: 06:00 to 12:00</p>
         * <p>*   **12**: 12:00 to 18:00</p>
         * <p>*   **18**: 18:00 to 24:00</p>
         */
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
