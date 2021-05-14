// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyExecDetailResponseBody extends TeaModel {
    @NameInMap("InProcessCount")
    public Integer inProcessCount;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Percent")
    public String percent;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FailCount")
    public Integer failCount;

    @NameInMap("Source")
    public String source;

    @NameInMap("SuccessCount")
    public Integer successCount;

    @NameInMap("FailedEcsList")
    public java.util.List<DescribeStrategyExecDetailResponseBodyFailedEcsList> failedEcsList;

    public static DescribeStrategyExecDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStrategyExecDetailResponseBody self = new DescribeStrategyExecDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStrategyExecDetailResponseBody setInProcessCount(Integer inProcessCount) {
        this.inProcessCount = inProcessCount;
        return this;
    }
    public Integer getInProcessCount() {
        return this.inProcessCount;
    }

    public DescribeStrategyExecDetailResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeStrategyExecDetailResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeStrategyExecDetailResponseBody setPercent(String percent) {
        this.percent = percent;
        return this;
    }
    public String getPercent() {
        return this.percent;
    }

    public DescribeStrategyExecDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStrategyExecDetailResponseBody setFailCount(Integer failCount) {
        this.failCount = failCount;
        return this;
    }
    public Integer getFailCount() {
        return this.failCount;
    }

    public DescribeStrategyExecDetailResponseBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeStrategyExecDetailResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public DescribeStrategyExecDetailResponseBody setFailedEcsList(java.util.List<DescribeStrategyExecDetailResponseBodyFailedEcsList> failedEcsList) {
        this.failedEcsList = failedEcsList;
        return this;
    }
    public java.util.List<DescribeStrategyExecDetailResponseBodyFailedEcsList> getFailedEcsList() {
        return this.failedEcsList;
    }

    public static class DescribeStrategyExecDetailResponseBodyFailedEcsList extends TeaModel {
        @NameInMap("IP")
        public String IP;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("InstanceName")
        public String instanceName;

        public static DescribeStrategyExecDetailResponseBodyFailedEcsList build(java.util.Map<String, ?> map) throws Exception {
            DescribeStrategyExecDetailResponseBodyFailedEcsList self = new DescribeStrategyExecDetailResponseBodyFailedEcsList();
            return TeaModel.build(map, self);
        }

        public DescribeStrategyExecDetailResponseBodyFailedEcsList setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeStrategyExecDetailResponseBodyFailedEcsList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeStrategyExecDetailResponseBodyFailedEcsList setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeStrategyExecDetailResponseBodyFailedEcsList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

    }

}
