// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAlarmListResponseBody extends TeaModel {
    /**
     * <p>The alert list.</p>
     */
    @NameInMap("Alarms")
    public java.util.List<DescribeAlarmListResponseBodyAlarms> alarms;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8D8EBFB7-E1EB-5236-952A-092EDC72***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAlarmListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmListResponseBody self = new DescribeAlarmListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmListResponseBody setAlarms(java.util.List<DescribeAlarmListResponseBodyAlarms> alarms) {
        this.alarms = alarms;
        return this;
    }
    public java.util.List<DescribeAlarmListResponseBodyAlarms> getAlarms() {
        return this.alarms;
    }

    public DescribeAlarmListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAlarmListResponseBodyAlarms extends TeaModel {
        /**
         * <p>The cause of the alert. Valid values:</p>
         * <ul>
         * <li><strong>fivefold</strong>: The service QPS exceeds the current specifications.</li>
         * <li><strong>4count</strong>: The cumulative actual service QPS exceeds the current specifications.</li>
         * <li><strong>exceed10w</strong>: The actual peak service QPS exceeds 100,000.</li>
         * <li><strong>costProtection</strong>: Billing protection is triggered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4count</p>
         */
        @NameInMap("Cause")
        public String cause;

        /**
         * <p>The end time of the alert. The value is a UNIX timestamp in UTC. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1605600798</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The peak QPS.</p>
         * 
         * <strong>example:</strong>
         * <p>12000</p>
         */
        @NameInMap("MaxQps")
        public Long maxQps;

        /**
         * <p>The current specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Spec")
        public Long spec;

        /**
         * <p>The start time of the alert. The value is a UNIX timestamp in UTC. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1605600767</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The current status of the alert. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The QPS limit is exceeded.</li>
         * <li><strong>2</strong>: The instance is added to the sandbox.</li>
         * <li><strong>3</strong>: The instance is removed from the sandbox.</li>
         * <li><strong>4</strong>: The QPS limit is no longer exceeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The Alarm Metric for alerting. Valid values:</p>
         * <ul>
         * <li><strong>qps</strong>: The QPS alerts for the service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>qps</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeAlarmListResponseBodyAlarms build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmListResponseBodyAlarms self = new DescribeAlarmListResponseBodyAlarms();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmListResponseBodyAlarms setCause(String cause) {
            this.cause = cause;
            return this;
        }
        public String getCause() {
            return this.cause;
        }

        public DescribeAlarmListResponseBodyAlarms setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeAlarmListResponseBodyAlarms setMaxQps(Long maxQps) {
            this.maxQps = maxQps;
            return this;
        }
        public Long getMaxQps() {
            return this.maxQps;
        }

        public DescribeAlarmListResponseBodyAlarms setSpec(Long spec) {
            this.spec = spec;
            return this;
        }
        public Long getSpec() {
            return this.spec;
        }

        public DescribeAlarmListResponseBodyAlarms setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeAlarmListResponseBodyAlarms setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeAlarmListResponseBodyAlarms setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
