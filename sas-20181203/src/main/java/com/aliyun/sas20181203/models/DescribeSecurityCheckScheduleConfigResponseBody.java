// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecurityCheckScheduleConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>48D2E9A9-A1B0-4295-B727-0995757C47E9</p>
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
         * <ul>
         * <li><strong>1</strong>: Monday</li>
         * <li><strong>2</strong>: Tuesday</li>
         * <li><strong>3</strong>: Wednesday</li>
         * <li><strong>4</strong>: Thursday</li>
         * <li><strong>5</strong>: Friday</li>
         * <li><strong>6</strong>: Saturday</li>
         * <li><strong>7</strong>: Sunday</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1,2,3</p>
         */
        @NameInMap("DaysOfWeek")
        public String daysOfWeek;

        /**
         * <p>The time range during which check tasks end. Valid values:</p>
         * <ul>
         * <li><strong>6</strong>: 00:00 to 06:00</li>
         * <li><strong>12</strong>: 06:00 to 12:00</li>
         * <li><strong>18</strong>: 12:00 to 18:00</li>
         * <li><strong>24</strong>: 18:00 to 24:00</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("EndTime")
        public Integer endTime;

        /**
         * <p>The time range during which check tasks start. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: 00:00 to 06:00</li>
         * <li><strong>6</strong>: 06:00 to 12:00</li>
         * <li><strong>12</strong>: 12:00 to 18:00</li>
         * <li><strong>18</strong>: 18:00 to 24:00</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6</p>
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
