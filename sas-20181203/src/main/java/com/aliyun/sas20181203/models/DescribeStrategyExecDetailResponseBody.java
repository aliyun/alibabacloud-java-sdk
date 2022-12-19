// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyExecDetailResponseBody extends TeaModel {
    // The time when the baseline check ends.
    @NameInMap("EndTime")
    public String endTime;

    // The number of check items that failed to pass the baseline check. This type of check item is considered risk items.
    @NameInMap("FailCount")
    public Integer failCount;

    // An array consisting of the servers on which risk items were detected.
    @NameInMap("FailedEcsList")
    public java.util.List<DescribeStrategyExecDetailResponseBodyFailedEcsList> failedEcsList;

    // The number of tasks that are **running** based on the baseline check policy.
    @NameInMap("InProcessCount")
    public Integer inProcessCount;

    // The execution progress of the baseline check policy.
    @NameInMap("Percent")
    public String percent;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The type of the baseline check. Valid values:
    // 
    // *   **Schedule**: automatic check that periodically runs
    // *   **Manual**: intermediate check that is manually performed
    @NameInMap("Source")
    public String source;

    // The time when the baseline check starts.
    @NameInMap("StartTime")
    public String startTime;

    // The number of check items that **passed** the baseline check.
    @NameInMap("SuccessCount")
    public Integer successCount;

    public static DescribeStrategyExecDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStrategyExecDetailResponseBody self = new DescribeStrategyExecDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStrategyExecDetailResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeStrategyExecDetailResponseBody setFailCount(Integer failCount) {
        this.failCount = failCount;
        return this;
    }
    public Integer getFailCount() {
        return this.failCount;
    }

    public DescribeStrategyExecDetailResponseBody setFailedEcsList(java.util.List<DescribeStrategyExecDetailResponseBodyFailedEcsList> failedEcsList) {
        this.failedEcsList = failedEcsList;
        return this;
    }
    public java.util.List<DescribeStrategyExecDetailResponseBodyFailedEcsList> getFailedEcsList() {
        return this.failedEcsList;
    }

    public DescribeStrategyExecDetailResponseBody setInProcessCount(Integer inProcessCount) {
        this.inProcessCount = inProcessCount;
        return this;
    }
    public Integer getInProcessCount() {
        return this.inProcessCount;
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

    public DescribeStrategyExecDetailResponseBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeStrategyExecDetailResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeStrategyExecDetailResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public static class DescribeStrategyExecDetailResponseBodyFailedEcsList extends TeaModel {
        // The IP address of the server on which the baseline check was performed.
        @NameInMap("IP")
        public String IP;

        // The name of the instance.
        @NameInMap("InstanceName")
        public String instanceName;

        // The public IP address.
        @NameInMap("InternetIp")
        public String internetIp;

        // The private IP address.
        @NameInMap("IntranetIp")
        public String intranetIp;

        // The failure cause for the check item.
        @NameInMap("Reason")
        public String reason;

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

        public DescribeStrategyExecDetailResponseBodyFailedEcsList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeStrategyExecDetailResponseBodyFailedEcsList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
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

    }

}
