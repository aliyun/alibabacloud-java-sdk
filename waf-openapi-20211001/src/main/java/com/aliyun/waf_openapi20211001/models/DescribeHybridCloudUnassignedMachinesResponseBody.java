// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudUnassignedMachinesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3EBCFCE9-4A3C-5E01-915D-691B****510A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>28</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The servers that are not assigned to the hybrid cloud cluster.</p>
     */
    @NameInMap("UnassignedMachines")
    public java.util.List<DescribeHybridCloudUnassignedMachinesResponseBodyUnassignedMachines> unassignedMachines;

    public static DescribeHybridCloudUnassignedMachinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudUnassignedMachinesResponseBody self = new DescribeHybridCloudUnassignedMachinesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudUnassignedMachinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHybridCloudUnassignedMachinesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeHybridCloudUnassignedMachinesResponseBody setUnassignedMachines(java.util.List<DescribeHybridCloudUnassignedMachinesResponseBodyUnassignedMachines> unassignedMachines) {
        this.unassignedMachines = unassignedMachines;
        return this;
    }
    public java.util.List<DescribeHybridCloudUnassignedMachinesResponseBodyUnassignedMachines> getUnassignedMachines() {
        return this.unassignedMachines;
    }

    public static class DescribeHybridCloudUnassignedMachinesResponseBodyUnassignedMachines extends TeaModel {
        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Cpu")
        public Long cpu;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleName</p>
         */
        @NameInMap("CustomName")
        public String customName;

        /**
         * <p>The host name.</p>
         * 
         * <strong>example:</strong>
         * <p>online-xagent1</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>1.X.X.1</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The media access control (MAC) address of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>00163e2686ac</p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <p>The memory size. Unit: KB. A conversion factor of 1,000 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>31580872</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>78db009ab6cf055a9085f9f4****ae3a</p>
         */
        @NameInMap("Mid")
        public String mid;

        public static DescribeHybridCloudUnassignedMachinesResponseBodyUnassignedMachines build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridCloudUnassignedMachinesResponseBodyUnassignedMachines self = new DescribeHybridCloudUnassignedMachinesResponseBodyUnassignedMachines();
            return TeaModel.build(map, self);
        }

        public DescribeHybridCloudUnassignedMachinesResponseBodyUnassignedMachines setCpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }
        public Long getCpu() {
            return this.cpu;
        }

        public DescribeHybridCloudUnassignedMachinesResponseBodyUnassignedMachines setCustomName(String customName) {
            this.customName = customName;
            return this;
        }
        public String getCustomName() {
            return this.customName;
        }

        public DescribeHybridCloudUnassignedMachinesResponseBodyUnassignedMachines setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeHybridCloudUnassignedMachinesResponseBodyUnassignedMachines setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeHybridCloudUnassignedMachinesResponseBodyUnassignedMachines setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public DescribeHybridCloudUnassignedMachinesResponseBodyUnassignedMachines setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public DescribeHybridCloudUnassignedMachinesResponseBodyUnassignedMachines setMid(String mid) {
            this.mid = mid;
            return this;
        }
        public String getMid() {
            return this.mid;
        }

    }

}
