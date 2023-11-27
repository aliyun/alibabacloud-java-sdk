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

    @NameInMap("ReasonCode")
    public String reasonCode;

    @NameInMap("ReasonMessage")
    public String reasonMessage;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

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

}
