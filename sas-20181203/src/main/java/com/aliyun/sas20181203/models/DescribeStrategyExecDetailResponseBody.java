// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyExecDetailResponseBody extends TeaModel {
    /**
     * <p>The time when the baseline check ends.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The number of check items that failed to pass the baseline check. This type of check item is considered risk items.</p>
     */
    @NameInMap("FailCount")
    public Integer failCount;

    /**
     * <p>An array consisting of the servers on which risk items were detected.</p>
     */
    @NameInMap("FailedEcsList")
    public java.util.List<DescribeStrategyExecDetailResponseBodyFailedEcsList> failedEcsList;

    /**
     * <p>The number of tasks that are **running** based on the baseline check policy.</p>
     */
    @NameInMap("InProcessCount")
    public Integer inProcessCount;

    /**
     * <p>The execution progress of the baseline check policy.</p>
     */
    @NameInMap("Percent")
    public String percent;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The type of the baseline check. Valid values:</p>
     * <br>
     * <p>*   **Schedule**: automatic check that periodically runs</p>
     * <p>*   **Manual**: intermediate check that is manually performed</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The time when the baseline check starts.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The number of check items that **passed** the baseline check.</p>
     */
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
        /**
         * <p>The IP address of the server on which the baseline check was performed.</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The failure cause for the check item.</p>
         */
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
