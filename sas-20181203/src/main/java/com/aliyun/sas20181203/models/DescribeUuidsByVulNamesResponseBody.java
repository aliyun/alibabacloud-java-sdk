// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUuidsByVulNamesResponseBody extends TeaModel {
    /**
     * <p>The statistics about the servers.</p>
     */
    @NameInMap("MachineInfoStatistics")
    public java.util.List<DescribeUuidsByVulNamesResponseBodyMachineInfoStatistics> machineInfoStatistics;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>97286A-4A6B-4A4-95FA-EC7E3E2451</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of vulnerabilities on the server.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
         * <p>The public IP address of the server on which the exception was detected.</p>
         * 
         * <strong>example:</strong>
         * <p>47.98.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server on which the exception was detected.</p>
         * 
         * <strong>example:</strong>
         * <p>172.18.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The instance ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>i-wz9gd1os5talju****</p>
         */
        @NameInMap("MachineInstanceId")
        public String machineInstanceId;

        /**
         * <p>The IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("MachineIp")
        public String machineIp;

        /**
         * <p>The name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>TestMachine</p>
         */
        @NameInMap("MachineName")
        public String machineName;

        /**
         * <p>The operating system that the server runs.</p>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The region ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>18375c64-eaa2-4702-92b0-4ee7******</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeUuidsByVulNamesResponseBodyMachineInfoStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeUuidsByVulNamesResponseBodyMachineInfoStatistics self = new DescribeUuidsByVulNamesResponseBodyMachineInfoStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeUuidsByVulNamesResponseBodyMachineInfoStatistics setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeUuidsByVulNamesResponseBodyMachineInfoStatistics setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
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
