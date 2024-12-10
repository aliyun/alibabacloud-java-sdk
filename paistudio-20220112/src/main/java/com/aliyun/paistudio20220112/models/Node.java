// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class Node extends TeaModel {
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    @NameInMap("BoundQuotas")
    public java.util.List<QuotaIdName> boundQuotas;

    @NameInMap("CPU")
    public String CPU;

    @NameInMap("CreatorId")
    public String creatorId;

    @NameInMap("GPU")
    public String GPU;

    @NameInMap("GPUMemory")
    public String GPUMemory;

    @NameInMap("GPUType")
    public String GPUType;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtExpiredTime")
    public String gmtExpiredTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("IsBound")
    public Boolean isBound;

    @NameInMap("LimitCPU")
    public String limitCPU;

    @NameInMap("LimitGPU")
    public String limitGPU;

    @NameInMap("LimitMemory")
    public String limitMemory;

    @NameInMap("MachineGroupId")
    public String machineGroupId;

    @NameInMap("Memory")
    public String memory;

    @NameInMap("NodeName")
    public String nodeName;

    @NameInMap("NodeStatus")
    public String nodeStatus;

    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("OrderStatus")
    public String orderStatus;

    @NameInMap("PodNum")
    public Long podNum;

    @NameInMap("ReasonCode")
    public String reasonCode;

    @NameInMap("ReasonMessage")
    public String reasonMessage;

    @NameInMap("RequestCPU")
    public String requestCPU;

    @NameInMap("RequestGPU")
    public String requestGPU;

    @NameInMap("RequestMemory")
    public String requestMemory;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    @NameInMap("Users")
    public java.util.List<UserInfo> users;

    @NameInMap("WorkloadNum")
    public Long workloadNum;

    public static Node build(java.util.Map<String, ?> map) throws Exception {
        Node self = new Node();
        return TeaModel.build(map, self);
    }

    public Node setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public Node setBoundQuotas(java.util.List<QuotaIdName> boundQuotas) {
        this.boundQuotas = boundQuotas;
        return this;
    }
    public java.util.List<QuotaIdName> getBoundQuotas() {
        return this.boundQuotas;
    }

    public Node setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }
    public String getCPU() {
        return this.CPU;
    }

    public Node setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public Node setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }
    public String getGPU() {
        return this.GPU;
    }

    public Node setGPUMemory(String GPUMemory) {
        this.GPUMemory = GPUMemory;
        return this;
    }
    public String getGPUMemory() {
        return this.GPUMemory;
    }

    public Node setGPUType(String GPUType) {
        this.GPUType = GPUType;
        return this;
    }
    public String getGPUType() {
        return this.GPUType;
    }

    public Node setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public Node setGmtExpiredTime(String gmtExpiredTime) {
        this.gmtExpiredTime = gmtExpiredTime;
        return this;
    }
    public String getGmtExpiredTime() {
        return this.gmtExpiredTime;
    }

    public Node setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public Node setIsBound(Boolean isBound) {
        this.isBound = isBound;
        return this;
    }
    public Boolean getIsBound() {
        return this.isBound;
    }

    public Node setLimitCPU(String limitCPU) {
        this.limitCPU = limitCPU;
        return this;
    }
    public String getLimitCPU() {
        return this.limitCPU;
    }

    public Node setLimitGPU(String limitGPU) {
        this.limitGPU = limitGPU;
        return this;
    }
    public String getLimitGPU() {
        return this.limitGPU;
    }

    public Node setLimitMemory(String limitMemory) {
        this.limitMemory = limitMemory;
        return this;
    }
    public String getLimitMemory() {
        return this.limitMemory;
    }

    public Node setMachineGroupId(String machineGroupId) {
        this.machineGroupId = machineGroupId;
        return this;
    }
    public String getMachineGroupId() {
        return this.machineGroupId;
    }

    public Node setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

    public Node setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public Node setNodeStatus(String nodeStatus) {
        this.nodeStatus = nodeStatus;
        return this;
    }
    public String getNodeStatus() {
        return this.nodeStatus;
    }

    public Node setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public Node setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public Node setPodNum(Long podNum) {
        this.podNum = podNum;
        return this;
    }
    public Long getPodNum() {
        return this.podNum;
    }

    public Node setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public Node setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    public Node setRequestCPU(String requestCPU) {
        this.requestCPU = requestCPU;
        return this;
    }
    public String getRequestCPU() {
        return this.requestCPU;
    }

    public Node setRequestGPU(String requestGPU) {
        this.requestGPU = requestGPU;
        return this;
    }
    public String getRequestGPU() {
        return this.requestGPU;
    }

    public Node setRequestMemory(String requestMemory) {
        this.requestMemory = requestMemory;
        return this;
    }
    public String getRequestMemory() {
        return this.requestMemory;
    }

    public Node setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public Node setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public Node setUsers(java.util.List<UserInfo> users) {
        this.users = users;
        return this;
    }
    public java.util.List<UserInfo> getUsers() {
        return this.users;
    }

    public Node setWorkloadNum(Long workloadNum) {
        this.workloadNum = workloadNum;
        return this;
    }
    public Long getWorkloadNum() {
        return this.workloadNum;
    }

}
