// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTopologyNodesResponseBody extends TeaModel {
    @NameInMap("Nodes")
    public java.util.List<DescribeTopologyNodesResponseBodyNodes> nodes;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTopologyNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopologyNodesResponseBody self = new DescribeTopologyNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTopologyNodesResponseBody setNodes(java.util.List<DescribeTopologyNodesResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<DescribeTopologyNodesResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public DescribeTopologyNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTopologyNodesResponseBodyNodes extends TeaModel {
        @NameInMap("BuildVersion")
        public String buildVersion;

        @NameInMap("CpuAssigned")
        public Float cpuAssigned;

        @NameInMap("CpuTotal")
        public Float cpuTotal;

        @NameInMap("DiskFreeSpace")
        public Float diskFreeSpace;

        @NameInMap("DiskTotal")
        public Float diskTotal;

        @NameInMap("DiskUsedPercent")
        public Float diskUsedPercent;

        @NameInMap("LeaderCount")
        public Float leaderCount;

        @NameInMap("MemAssigned")
        public Float memAssigned;

        @NameInMap("MemTotal")
        public Float memTotal;

        @NameInMap("PartitionNumber")
        public Long partitionNumber;

        @NameInMap("SmName")
        public String smName;

        @NameInMap("SnName")
        public String snName;

        @NameInMap("UnitNumber")
        public Float unitNumber;

        @NameInMap("Zone")
        public String zone;

        public static DescribeTopologyNodesResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeTopologyNodesResponseBodyNodes self = new DescribeTopologyNodesResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public DescribeTopologyNodesResponseBodyNodes setBuildVersion(String buildVersion) {
            this.buildVersion = buildVersion;
            return this;
        }
        public String getBuildVersion() {
            return this.buildVersion;
        }

        public DescribeTopologyNodesResponseBodyNodes setCpuAssigned(Float cpuAssigned) {
            this.cpuAssigned = cpuAssigned;
            return this;
        }
        public Float getCpuAssigned() {
            return this.cpuAssigned;
        }

        public DescribeTopologyNodesResponseBodyNodes setCpuTotal(Float cpuTotal) {
            this.cpuTotal = cpuTotal;
            return this;
        }
        public Float getCpuTotal() {
            return this.cpuTotal;
        }

        public DescribeTopologyNodesResponseBodyNodes setDiskFreeSpace(Float diskFreeSpace) {
            this.diskFreeSpace = diskFreeSpace;
            return this;
        }
        public Float getDiskFreeSpace() {
            return this.diskFreeSpace;
        }

        public DescribeTopologyNodesResponseBodyNodes setDiskTotal(Float diskTotal) {
            this.diskTotal = diskTotal;
            return this;
        }
        public Float getDiskTotal() {
            return this.diskTotal;
        }

        public DescribeTopologyNodesResponseBodyNodes setDiskUsedPercent(Float diskUsedPercent) {
            this.diskUsedPercent = diskUsedPercent;
            return this;
        }
        public Float getDiskUsedPercent() {
            return this.diskUsedPercent;
        }

        public DescribeTopologyNodesResponseBodyNodes setLeaderCount(Float leaderCount) {
            this.leaderCount = leaderCount;
            return this;
        }
        public Float getLeaderCount() {
            return this.leaderCount;
        }

        public DescribeTopologyNodesResponseBodyNodes setMemAssigned(Float memAssigned) {
            this.memAssigned = memAssigned;
            return this;
        }
        public Float getMemAssigned() {
            return this.memAssigned;
        }

        public DescribeTopologyNodesResponseBodyNodes setMemTotal(Float memTotal) {
            this.memTotal = memTotal;
            return this;
        }
        public Float getMemTotal() {
            return this.memTotal;
        }

        public DescribeTopologyNodesResponseBodyNodes setPartitionNumber(Long partitionNumber) {
            this.partitionNumber = partitionNumber;
            return this;
        }
        public Long getPartitionNumber() {
            return this.partitionNumber;
        }

        public DescribeTopologyNodesResponseBodyNodes setSmName(String smName) {
            this.smName = smName;
            return this;
        }
        public String getSmName() {
            return this.smName;
        }

        public DescribeTopologyNodesResponseBodyNodes setSnName(String snName) {
            this.snName = snName;
            return this;
        }
        public String getSnName() {
            return this.snName;
        }

        public DescribeTopologyNodesResponseBodyNodes setUnitNumber(Float unitNumber) {
            this.unitNumber = unitNumber;
            return this;
        }
        public Float getUnitNumber() {
            return this.unitNumber;
        }

        public DescribeTopologyNodesResponseBodyNodes setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

}
