// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class QuotaNodeViewMetric extends TeaModel {
    /**
     * <p>The CPU utilization.</p>
     * 
     * <strong>example:</strong>
     * <p>59</p>
     */
    @NameInMap("CPUUsageRate")
    public String CPUUsageRate;

    /**
     * <p>The node import time.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-08-25T15:20:56Z</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>The disk read rate.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("DiskReadRate")
    public String diskReadRate;

    /**
     * <p>The disk write rate.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("DiskWriteRate")
    public String diskWriteRate;

    /**
     * <p>The GPU model.</p>
     * 
     * <strong>example:</strong>
     * <p>V100</p>
     */
    @NameInMap("GPUType")
    public String GPUType;

    /**
     * <p>The memory utilization.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MemoryUsageRate")
    public String memoryUsageRate;

    /**
     * <p>The network inbound rate.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NetworkInputRate")
    public String networkInputRate;

    /**
     * <p>The network outbound rate.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NetworkOutputRate")
    public String networkOutputRate;

    /**
     * <p>The node ID.</p>
     * 
     * <strong>example:</strong>
     * <p>-i121212node</p>
     */
    @NameInMap("NodeID")
    public String nodeID;

    /**
     * <p>The node status.</p>
     * 
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("NodeStatus")
    public String nodeStatus;

    /**
     * <p>The GPU type.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.large</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    /**
     * <p>The resource quota ID.</p>
     * 
     * <strong>example:</strong>
     * <p>quotamtl37ge7gkvdz</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <p>The used CPU.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("RequestCPU")
    public Long requestCPU;

    /**
     * <p>The used GPU.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RequestGPU")
    public Long requestGPU;

    /**
     * <p>The used memory.</p>
     * 
     * <strong>example:</strong>
     * <p>102400000</p>
     */
    @NameInMap("RequestMemory")
    public Long requestMemory;

    /**
     * <p>The node tasks.</p>
     */
    @NameInMap("TaskIdMap")
    public java.util.Map<String, ?> taskIdMap;

    /**
     * <p>The total CPU.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalCPU")
    public Long totalCPU;

    /**
     * <p>The total GPU.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalGPU")
    public Long totalGPU;

    /**
     * <p>The total memory.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("TotalMemory")
    public Long totalMemory;

    /**
     * <p>The total number of node tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalTasks")
    public Long totalTasks;

    /**
     * <p>The user list.</p>
     */
    @NameInMap("UserIDs")
    public java.util.List<String> userIDs;

    /**
     * <p>The total number of users.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserNumber")
    public String userNumber;

    public static QuotaNodeViewMetric build(java.util.Map<String, ?> map) throws Exception {
        QuotaNodeViewMetric self = new QuotaNodeViewMetric();
        return TeaModel.build(map, self);
    }

    public QuotaNodeViewMetric setCPUUsageRate(String CPUUsageRate) {
        this.CPUUsageRate = CPUUsageRate;
        return this;
    }
    public String getCPUUsageRate() {
        return this.CPUUsageRate;
    }

    public QuotaNodeViewMetric setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public QuotaNodeViewMetric setDiskReadRate(String diskReadRate) {
        this.diskReadRate = diskReadRate;
        return this;
    }
    public String getDiskReadRate() {
        return this.diskReadRate;
    }

    public QuotaNodeViewMetric setDiskWriteRate(String diskWriteRate) {
        this.diskWriteRate = diskWriteRate;
        return this;
    }
    public String getDiskWriteRate() {
        return this.diskWriteRate;
    }

    public QuotaNodeViewMetric setGPUType(String GPUType) {
        this.GPUType = GPUType;
        return this;
    }
    public String getGPUType() {
        return this.GPUType;
    }

    public QuotaNodeViewMetric setMemoryUsageRate(String memoryUsageRate) {
        this.memoryUsageRate = memoryUsageRate;
        return this;
    }
    public String getMemoryUsageRate() {
        return this.memoryUsageRate;
    }

    public QuotaNodeViewMetric setNetworkInputRate(String networkInputRate) {
        this.networkInputRate = networkInputRate;
        return this;
    }
    public String getNetworkInputRate() {
        return this.networkInputRate;
    }

    public QuotaNodeViewMetric setNetworkOutputRate(String networkOutputRate) {
        this.networkOutputRate = networkOutputRate;
        return this;
    }
    public String getNetworkOutputRate() {
        return this.networkOutputRate;
    }

    public QuotaNodeViewMetric setNodeID(String nodeID) {
        this.nodeID = nodeID;
        return this;
    }
    public String getNodeID() {
        return this.nodeID;
    }

    public QuotaNodeViewMetric setNodeStatus(String nodeStatus) {
        this.nodeStatus = nodeStatus;
        return this;
    }
    public String getNodeStatus() {
        return this.nodeStatus;
    }

    public QuotaNodeViewMetric setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public QuotaNodeViewMetric setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public QuotaNodeViewMetric setRequestCPU(Long requestCPU) {
        this.requestCPU = requestCPU;
        return this;
    }
    public Long getRequestCPU() {
        return this.requestCPU;
    }

    public QuotaNodeViewMetric setRequestGPU(Long requestGPU) {
        this.requestGPU = requestGPU;
        return this;
    }
    public Long getRequestGPU() {
        return this.requestGPU;
    }

    public QuotaNodeViewMetric setRequestMemory(Long requestMemory) {
        this.requestMemory = requestMemory;
        return this;
    }
    public Long getRequestMemory() {
        return this.requestMemory;
    }

    public QuotaNodeViewMetric setTaskIdMap(java.util.Map<String, ?> taskIdMap) {
        this.taskIdMap = taskIdMap;
        return this;
    }
    public java.util.Map<String, ?> getTaskIdMap() {
        return this.taskIdMap;
    }

    public QuotaNodeViewMetric setTotalCPU(Long totalCPU) {
        this.totalCPU = totalCPU;
        return this;
    }
    public Long getTotalCPU() {
        return this.totalCPU;
    }

    public QuotaNodeViewMetric setTotalGPU(Long totalGPU) {
        this.totalGPU = totalGPU;
        return this;
    }
    public Long getTotalGPU() {
        return this.totalGPU;
    }

    public QuotaNodeViewMetric setTotalMemory(Long totalMemory) {
        this.totalMemory = totalMemory;
        return this;
    }
    public Long getTotalMemory() {
        return this.totalMemory;
    }

    public QuotaNodeViewMetric setTotalTasks(Long totalTasks) {
        this.totalTasks = totalTasks;
        return this;
    }
    public Long getTotalTasks() {
        return this.totalTasks;
    }

    public QuotaNodeViewMetric setUserIDs(java.util.List<String> userIDs) {
        this.userIDs = userIDs;
        return this;
    }
    public java.util.List<String> getUserIDs() {
        return this.userIDs;
    }

    public QuotaNodeViewMetric setUserNumber(String userNumber) {
        this.userNumber = userNumber;
        return this;
    }
    public String getUserNumber() {
        return this.userNumber;
    }

}
