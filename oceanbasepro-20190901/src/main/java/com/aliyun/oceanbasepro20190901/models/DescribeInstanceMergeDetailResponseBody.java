// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceMergeDetailResponseBody extends TeaModel {
    @NameInMap("ClusterMergeDetail")
    public java.util.List<DescribeInstanceMergeDetailResponseBodyClusterMergeDetail> clusterMergeDetail;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceMergeDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMergeDetailResponseBody self = new DescribeInstanceMergeDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMergeDetailResponseBody setClusterMergeDetail(java.util.List<DescribeInstanceMergeDetailResponseBodyClusterMergeDetail> clusterMergeDetail) {
        this.clusterMergeDetail = clusterMergeDetail;
        return this;
    }
    public java.util.List<DescribeInstanceMergeDetailResponseBodyClusterMergeDetail> getClusterMergeDetail() {
        return this.clusterMergeDetail;
    }

    public DescribeInstanceMergeDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceMergeDetailResponseBodyClusterMergeDetailNodes extends TeaModel {
        @NameInMap("Cost")
        public Integer cost;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Node")
        public String node;

        @NameInMap("StartTime")
        public String startTime;

        public static DescribeInstanceMergeDetailResponseBodyClusterMergeDetailNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMergeDetailResponseBodyClusterMergeDetailNodes self = new DescribeInstanceMergeDetailResponseBodyClusterMergeDetailNodes();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMergeDetailResponseBodyClusterMergeDetailNodes setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public DescribeInstanceMergeDetailResponseBodyClusterMergeDetailNodes setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeInstanceMergeDetailResponseBodyClusterMergeDetailNodes setNode(String node) {
            this.node = node;
            return this;
        }
        public String getNode() {
            return this.node;
        }

        public DescribeInstanceMergeDetailResponseBodyClusterMergeDetailNodes setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeInstanceMergeDetailResponseBodyClusterMergeDetailZones extends TeaModel {
        @NameInMap("Cost")
        public Integer cost;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Zone")
        public String zone;

        public static DescribeInstanceMergeDetailResponseBodyClusterMergeDetailZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMergeDetailResponseBodyClusterMergeDetailZones self = new DescribeInstanceMergeDetailResponseBodyClusterMergeDetailZones();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMergeDetailResponseBodyClusterMergeDetailZones setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public DescribeInstanceMergeDetailResponseBodyClusterMergeDetailZones setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeInstanceMergeDetailResponseBodyClusterMergeDetailZones setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeInstanceMergeDetailResponseBodyClusterMergeDetailZones setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class DescribeInstanceMergeDetailResponseBodyClusterMergeDetail extends TeaModel {
        @NameInMap("BroadcastVersion")
        public Integer broadcastVersion;

        @NameInMap("Cost")
        public Integer cost;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("FinishedNodeCount")
        public Integer finishedNodeCount;

        @NameInMap("FreezeVersion")
        public Integer freezeVersion;

        @NameInMap("MergeType")
        public String mergeType;

        @NameInMap("MergeVersion")
        public Integer mergeVersion;

        @NameInMap("MinorMergeCount")
        public Integer minorMergeCount;

        @NameInMap("Nodes")
        public java.util.List<DescribeInstanceMergeDetailResponseBodyClusterMergeDetailNodes> nodes;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalNodeCount")
        public Integer totalNodeCount;

        @NameInMap("Zones")
        public java.util.List<DescribeInstanceMergeDetailResponseBodyClusterMergeDetailZones> zones;

        public static DescribeInstanceMergeDetailResponseBodyClusterMergeDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMergeDetailResponseBodyClusterMergeDetail self = new DescribeInstanceMergeDetailResponseBodyClusterMergeDetail();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMergeDetailResponseBodyClusterMergeDetail setBroadcastVersion(Integer broadcastVersion) {
            this.broadcastVersion = broadcastVersion;
            return this;
        }
        public Integer getBroadcastVersion() {
            return this.broadcastVersion;
        }

        public DescribeInstanceMergeDetailResponseBodyClusterMergeDetail setCost(Integer cost) {
            this.cost = cost;
            return this;
        }
        public Integer getCost() {
            return this.cost;
        }

        public DescribeInstanceMergeDetailResponseBodyClusterMergeDetail setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeInstanceMergeDetailResponseBodyClusterMergeDetail setFinishedNodeCount(Integer finishedNodeCount) {
            this.finishedNodeCount = finishedNodeCount;
            return this;
        }
        public Integer getFinishedNodeCount() {
            return this.finishedNodeCount;
        }

        public DescribeInstanceMergeDetailResponseBodyClusterMergeDetail setFreezeVersion(Integer freezeVersion) {
            this.freezeVersion = freezeVersion;
            return this;
        }
        public Integer getFreezeVersion() {
            return this.freezeVersion;
        }

        public DescribeInstanceMergeDetailResponseBodyClusterMergeDetail setMergeType(String mergeType) {
            this.mergeType = mergeType;
            return this;
        }
        public String getMergeType() {
            return this.mergeType;
        }

        public DescribeInstanceMergeDetailResponseBodyClusterMergeDetail setMergeVersion(Integer mergeVersion) {
            this.mergeVersion = mergeVersion;
            return this;
        }
        public Integer getMergeVersion() {
            return this.mergeVersion;
        }

        public DescribeInstanceMergeDetailResponseBodyClusterMergeDetail setMinorMergeCount(Integer minorMergeCount) {
            this.minorMergeCount = minorMergeCount;
            return this;
        }
        public Integer getMinorMergeCount() {
            return this.minorMergeCount;
        }

        public DescribeInstanceMergeDetailResponseBodyClusterMergeDetail setNodes(java.util.List<DescribeInstanceMergeDetailResponseBodyClusterMergeDetailNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeInstanceMergeDetailResponseBodyClusterMergeDetailNodes> getNodes() {
            return this.nodes;
        }

        public DescribeInstanceMergeDetailResponseBodyClusterMergeDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeInstanceMergeDetailResponseBodyClusterMergeDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstanceMergeDetailResponseBodyClusterMergeDetail setTotalNodeCount(Integer totalNodeCount) {
            this.totalNodeCount = totalNodeCount;
            return this;
        }
        public Integer getTotalNodeCount() {
            return this.totalNodeCount;
        }

        public DescribeInstanceMergeDetailResponseBodyClusterMergeDetail setZones(java.util.List<DescribeInstanceMergeDetailResponseBodyClusterMergeDetailZones> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<DescribeInstanceMergeDetailResponseBodyClusterMergeDetailZones> getZones() {
            return this.zones;
        }

    }

}
