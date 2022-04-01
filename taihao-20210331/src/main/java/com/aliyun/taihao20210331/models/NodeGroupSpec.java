// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class NodeGroupSpec extends TeaModel {
    // bizNodeGroupType
    @NameInMap("bizNodeGroupType")
    public String bizNodeGroupType;

    // componentLabelList
    @NameInMap("componentLabelList")
    public java.util.List<String> componentLabelList;

    // master
    @NameInMap("master")
    public Boolean master;

    @NameInMap("nodeCountConstraints")
    public NodeCountConstraint nodeCountConstraints;

    // nodeCountMax
    @NameInMap("nodeCountMax")
    public Long nodeCountMax;

    // nodeCountMin
    @NameInMap("nodeCountMin")
    public Long nodeCountMin;

    // nodeDataDiskCategories
    @NameInMap("nodeDataDiskCategories")
    public java.util.List<String> nodeDataDiskCategories;

    // nodeDataDiskCountDefault
    @NameInMap("nodeDataDiskCountDefault")
    public Long nodeDataDiskCountDefault;

    // nodeDataDiskCountMax
    @NameInMap("nodeDataDiskCountMax")
    public Long nodeDataDiskCountMax;

    // nodeDataDiskCountMin
    @NameInMap("nodeDataDiskCountMin")
    public Long nodeDataDiskCountMin;

    // nodeDataDiskSizeDefault
    @NameInMap("nodeDataDiskSizeDefault")
    public Long nodeDataDiskSizeDefault;

    // nodeDataDiskSizeMax
    @NameInMap("nodeDataDiskSizeMax")
    public Long nodeDataDiskSizeMax;

    // nodeDataDiskSizeMin
    @NameInMap("nodeDataDiskSizeMin")
    public Long nodeDataDiskSizeMin;

    // nodeGroupType
    @NameInMap("nodeGroupType")
    public String nodeGroupType;

    // nodeSystemDiskCategories
    @NameInMap("nodeSystemDiskCategories")
    public java.util.List<String> nodeSystemDiskCategories;

    // nodeSystemDiskSizeDefault
    @NameInMap("nodeSystemDiskSizeDefault")
    public Long nodeSystemDiskSizeDefault;

    // nodeSystemDiskSizeMax
    @NameInMap("nodeSystemDiskSizeMax")
    public Long nodeSystemDiskSizeMax;

    // nodeSystemDiskSizeMin
    @NameInMap("nodeSystemDiskSizeMin")
    public Long nodeSystemDiskSizeMin;

    // optional
    @NameInMap("optional")
    public Boolean optional;

    // realNodeGroupType
    @NameInMap("realNodeGroupType")
    public String realNodeGroupType;

    public static NodeGroupSpec build(java.util.Map<String, ?> map) throws Exception {
        NodeGroupSpec self = new NodeGroupSpec();
        return TeaModel.build(map, self);
    }

    public NodeGroupSpec setBizNodeGroupType(String bizNodeGroupType) {
        this.bizNodeGroupType = bizNodeGroupType;
        return this;
    }
    public String getBizNodeGroupType() {
        return this.bizNodeGroupType;
    }

    public NodeGroupSpec setComponentLabelList(java.util.List<String> componentLabelList) {
        this.componentLabelList = componentLabelList;
        return this;
    }
    public java.util.List<String> getComponentLabelList() {
        return this.componentLabelList;
    }

    public NodeGroupSpec setMaster(Boolean master) {
        this.master = master;
        return this;
    }
    public Boolean getMaster() {
        return this.master;
    }

    public NodeGroupSpec setNodeCountConstraints(NodeCountConstraint nodeCountConstraints) {
        this.nodeCountConstraints = nodeCountConstraints;
        return this;
    }
    public NodeCountConstraint getNodeCountConstraints() {
        return this.nodeCountConstraints;
    }

    public NodeGroupSpec setNodeCountMax(Long nodeCountMax) {
        this.nodeCountMax = nodeCountMax;
        return this;
    }
    public Long getNodeCountMax() {
        return this.nodeCountMax;
    }

    public NodeGroupSpec setNodeCountMin(Long nodeCountMin) {
        this.nodeCountMin = nodeCountMin;
        return this;
    }
    public Long getNodeCountMin() {
        return this.nodeCountMin;
    }

    public NodeGroupSpec setNodeDataDiskCategories(java.util.List<String> nodeDataDiskCategories) {
        this.nodeDataDiskCategories = nodeDataDiskCategories;
        return this;
    }
    public java.util.List<String> getNodeDataDiskCategories() {
        return this.nodeDataDiskCategories;
    }

    public NodeGroupSpec setNodeDataDiskCountDefault(Long nodeDataDiskCountDefault) {
        this.nodeDataDiskCountDefault = nodeDataDiskCountDefault;
        return this;
    }
    public Long getNodeDataDiskCountDefault() {
        return this.nodeDataDiskCountDefault;
    }

    public NodeGroupSpec setNodeDataDiskCountMax(Long nodeDataDiskCountMax) {
        this.nodeDataDiskCountMax = nodeDataDiskCountMax;
        return this;
    }
    public Long getNodeDataDiskCountMax() {
        return this.nodeDataDiskCountMax;
    }

    public NodeGroupSpec setNodeDataDiskCountMin(Long nodeDataDiskCountMin) {
        this.nodeDataDiskCountMin = nodeDataDiskCountMin;
        return this;
    }
    public Long getNodeDataDiskCountMin() {
        return this.nodeDataDiskCountMin;
    }

    public NodeGroupSpec setNodeDataDiskSizeDefault(Long nodeDataDiskSizeDefault) {
        this.nodeDataDiskSizeDefault = nodeDataDiskSizeDefault;
        return this;
    }
    public Long getNodeDataDiskSizeDefault() {
        return this.nodeDataDiskSizeDefault;
    }

    public NodeGroupSpec setNodeDataDiskSizeMax(Long nodeDataDiskSizeMax) {
        this.nodeDataDiskSizeMax = nodeDataDiskSizeMax;
        return this;
    }
    public Long getNodeDataDiskSizeMax() {
        return this.nodeDataDiskSizeMax;
    }

    public NodeGroupSpec setNodeDataDiskSizeMin(Long nodeDataDiskSizeMin) {
        this.nodeDataDiskSizeMin = nodeDataDiskSizeMin;
        return this;
    }
    public Long getNodeDataDiskSizeMin() {
        return this.nodeDataDiskSizeMin;
    }

    public NodeGroupSpec setNodeGroupType(String nodeGroupType) {
        this.nodeGroupType = nodeGroupType;
        return this;
    }
    public String getNodeGroupType() {
        return this.nodeGroupType;
    }

    public NodeGroupSpec setNodeSystemDiskCategories(java.util.List<String> nodeSystemDiskCategories) {
        this.nodeSystemDiskCategories = nodeSystemDiskCategories;
        return this;
    }
    public java.util.List<String> getNodeSystemDiskCategories() {
        return this.nodeSystemDiskCategories;
    }

    public NodeGroupSpec setNodeSystemDiskSizeDefault(Long nodeSystemDiskSizeDefault) {
        this.nodeSystemDiskSizeDefault = nodeSystemDiskSizeDefault;
        return this;
    }
    public Long getNodeSystemDiskSizeDefault() {
        return this.nodeSystemDiskSizeDefault;
    }

    public NodeGroupSpec setNodeSystemDiskSizeMax(Long nodeSystemDiskSizeMax) {
        this.nodeSystemDiskSizeMax = nodeSystemDiskSizeMax;
        return this;
    }
    public Long getNodeSystemDiskSizeMax() {
        return this.nodeSystemDiskSizeMax;
    }

    public NodeGroupSpec setNodeSystemDiskSizeMin(Long nodeSystemDiskSizeMin) {
        this.nodeSystemDiskSizeMin = nodeSystemDiskSizeMin;
        return this;
    }
    public Long getNodeSystemDiskSizeMin() {
        return this.nodeSystemDiskSizeMin;
    }

    public NodeGroupSpec setOptional(Boolean optional) {
        this.optional = optional;
        return this;
    }
    public Boolean getOptional() {
        return this.optional;
    }

    public NodeGroupSpec setRealNodeGroupType(String realNodeGroupType) {
        this.realNodeGroupType = realNodeGroupType;
        return this;
    }
    public String getRealNodeGroupType() {
        return this.realNodeGroupType;
    }

}
