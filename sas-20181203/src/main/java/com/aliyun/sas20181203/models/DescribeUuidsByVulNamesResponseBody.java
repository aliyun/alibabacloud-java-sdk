// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUuidsByVulNamesResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the statistics about the assets.</p>
     */
    @NameInMap("MachineInfoStatistics")
    public java.util.List<DescribeUuidsByVulNamesResponseBodyMachineInfoStatistics> machineInfoStatistics;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of vulnerabilities on the server.</p>
     */
    @NameInMap("VulCount")
    public Integer vulCount;

    public static DescribeUuidsByVulNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUuidsByVulNamesResponseBody self = new DescribeUuidsByVulNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUuidsByVulNamesResponseBody setMachineInfoStatistics(java.util.List<DescribeUuidsByVulNamesResponseBodyMachineInfoStatistics> machineInfoStatistics) {
        this.machineInfoStatistics = machineInfoStatistics;
        return this;
    }
    public java.util.List<DescribeUuidsByVulNamesResponseBodyMachineInfoStatistics> getMachineInfoStatistics() {
        return this.machineInfoStatistics;
    }

    public DescribeUuidsByVulNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUuidsByVulNamesResponseBody setVulCount(Integer vulCount) {
        this.vulCount = vulCount;
        return this;
    }
    public Integer getVulCount() {
        return this.vulCount;
    }

    public static class DescribeUuidsByVulNamesResponseBodyMachineInfoStatistics extends TeaModel {
        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("MachineInstanceId")
        public String machineInstanceId;

        /**
         * <p>The IP address of the server.</p>
         */
        @NameInMap("MachineIp")
        public String machineIp;

        /**
         * <p>The name of the server.</p>
         */
        @NameInMap("MachineName")
        public String machineName;

        /**
         * <p>The operating system that the server runs.</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The ID of the region in which the server resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The UUID of the server.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeUuidsByVulNamesResponseBodyMachineInfoStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeUuidsByVulNamesResponseBodyMachineInfoStatistics self = new DescribeUuidsByVulNamesResponseBodyMachineInfoStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeUuidsByVulNamesResponseBodyMachineInfoStatistics setMachineInstanceId(String machineInstanceId) {
            this.machineInstanceId = machineInstanceId;
            return this;
        }
        public String getMachineInstanceId() {
            return this.machineInstanceId;
        }

        public DescribeUuidsByVulNamesResponseBodyMachineInfoStatistics setMachineIp(String machineIp) {
            this.machineIp = machineIp;
            return this;
        }
        public String getMachineIp() {
            return this.machineIp;
        }

        public DescribeUuidsByVulNamesResponseBodyMachineInfoStatistics setMachineName(String machineName) {
            this.machineName = machineName;
            return this;
        }
        public String getMachineName() {
            return this.machineName;
        }

        public DescribeUuidsByVulNamesResponseBodyMachineInfoStatistics setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeUuidsByVulNamesResponseBodyMachineInfoStatistics setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeUuidsByVulNamesResponseBodyMachineInfoStatistics setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
