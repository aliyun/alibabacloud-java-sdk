// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class NodeViewMetric extends TeaModel {
    @NameInMap("CPUUsageRate")
    public String CPUUsageRate;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("DiskReadRate")
    public String diskReadRate;

    @NameInMap("DiskWriteRate")
    public String diskWriteRate;

    @NameInMap("GPUType")
    public String GPUType;

    @NameInMap("MachineGroupID")
    public String machineGroupID;

    @NameInMap("MemoryUsageRate")
    public String memoryUsageRate;

    @NameInMap("NetworkInputRate")
    public String networkInputRate;

    @NameInMap("NetworkOutputRate")
    public String networkOutputRate;

    @NameInMap("NodeID")
    public String nodeID;

    @NameInMap("NodeStatus")
    public String nodeStatus;

    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("RequestCPU")
    public Long requestCPU;

    @NameInMap("RequestGPU")
    public Long requestGPU;

    @NameInMap("RequestMemory")
    public Long requestMemory;

    @NameInMap("TaskIdMap")
    public java.util.Map<String, ?> taskIdMap;

    @NameInMap("TotalCPU")
    public Long totalCPU;

    @NameInMap("TotalGPU")
    public Long totalGPU;

    @NameInMap("TotalMemory")
    public Long totalMemory;

    @NameInMap("TotalTasks")
    public Long totalTasks;

    @NameInMap("UserIDs")
    public java.util.List<String> userIDs;

    @NameInMap("UserNumber")
    public String userNumber;

    public static NodeViewMetric build(java.util.Map<String, ?> map) throws Exception {
        NodeViewMetric self = new NodeViewMetric();
        return TeaModel.build(map, self);
    }

    public NodeViewMetric setCPUUsageRate(String CPUUsageRate) {
        this.CPUUsageRate = CPUUsageRate;
        return this;
    }
    public String getCPUUsageRate() {
        return this.CPUUsageRate;
    }

    public NodeViewMetric setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public NodeViewMetric setDiskReadRate(String diskReadRate) {
        this.diskReadRate = diskReadRate;
        return this;
    }
    public String getDiskReadRate() {
        return this.diskReadRate;
    }

    public NodeViewMetric setDiskWriteRate(String diskWriteRate) {
        this.diskWriteRate = diskWriteRate;
        return this;
    }
    public String getDiskWriteRate() {
        return this.diskWriteRate;
    }

    public NodeViewMetric setGPUType(String GPUType) {
        this.GPUType = GPUType;
        return this;
    }
    public String getGPUType() {
        return this.GPUType;
    }

    public NodeViewMetric setMachineGroupID(String machineGroupID) {
        this.machineGroupID = machineGroupID;
        return this;
    }
    public String getMachineGroupID() {
        return this.machineGroupID;
    }

    public NodeViewMetric setMemoryUsageRate(String memoryUsageRate) {
        this.memoryUsageRate = memoryUsageRate;
        return this;
    }
    public String getMemoryUsageRate() {
        return this.memoryUsageRate;
    }

    public NodeViewMetric setNetworkInputRate(String networkInputRate) {
        this.networkInputRate = networkInputRate;
        return this;
    }
    public String getNetworkInputRate() {
        return this.networkInputRate;
    }

    public NodeViewMetric setNetworkOutputRate(String networkOutputRate) {
        this.networkOutputRate = networkOutputRate;
        return this;
    }
    public String getNetworkOutputRate() {
        return this.networkOutputRate;
    }

    public NodeViewMetric setNodeID(String nodeID) {
        this.nodeID = nodeID;
        return this;
    }
    public String getNodeID() {
        return this.nodeID;
    }

    public NodeViewMetric setNodeStatus(String nodeStatus) {
        this.nodeStatus = nodeStatus;
        return this;
    }
    public String getNodeStatus() {
        return this.nodeStatus;
    }

    public NodeViewMetric setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public NodeViewMetric setRequestCPU(Long requestCPU) {
        this.requestCPU = requestCPU;
        return this;
    }
    public Long getRequestCPU() {
        return this.requestCPU;
    }

    public NodeViewMetric setRequestGPU(Long requestGPU) {
        this.requestGPU = requestGPU;
        return this;
    }
    public Long getRequestGPU() {
        return this.requestGPU;
    }

    public NodeViewMetric setRequestMemory(Long requestMemory) {
        this.requestMemory = requestMemory;
        return this;
    }
    public Long getRequestMemory() {
        return this.requestMemory;
    }

    public NodeViewMetric setTaskIdMap(java.util.Map<String, ?> taskIdMap) {
        this.taskIdMap = taskIdMap;
        return this;
    }
    public java.util.Map<String, ?> getTaskIdMap() {
        return this.taskIdMap;
    }

    public NodeViewMetric setTotalCPU(Long totalCPU) {
        this.totalCPU = totalCPU;
        return this;
    }
    public Long getTotalCPU() {
        return this.totalCPU;
    }

    public NodeViewMetric setTotalGPU(Long totalGPU) {
        this.totalGPU = totalGPU;
        return this;
    }
    public Long getTotalGPU() {
        return this.totalGPU;
    }

    public NodeViewMetric setTotalMemory(Long totalMemory) {
        this.totalMemory = totalMemory;
        return this;
    }
    public Long getTotalMemory() {
        return this.totalMemory;
    }

    public NodeViewMetric setTotalTasks(Long totalTasks) {
        this.totalTasks = totalTasks;
        return this;
    }
    public Long getTotalTasks() {
        return this.totalTasks;
    }

    public NodeViewMetric setUserIDs(java.util.List<String> userIDs) {
        this.userIDs = userIDs;
        return this;
    }
    public java.util.List<String> getUserIDs() {
        return this.userIDs;
    }

    public NodeViewMetric setUserNumber(String userNumber) {
        this.userNumber = userNumber;
        return this;
    }
    public String getUserNumber() {
        return this.userNumber;
    }

}
