// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class NodeGroupMeta extends TeaModel {
    // componentTags
    @NameInMap("componentTags")
    public java.util.List<String> componentTags;

    @NameInMap("dataDiskConstraint")
    public DiskConstraint dataDiskConstraint;

    // mandatory
    @NameInMap("mandatory")
    public Boolean mandatory;

    // nodeGroupType
    @NameInMap("nodeGroupType")
    public String nodeGroupType;

    // priority
    @NameInMap("priority")
    public Long priority;

    // supportActions
    @NameInMap("supportActions")
    public java.util.List<String> supportActions;

    @NameInMap("systemDiskConstraint")
    public DiskConstraint systemDiskConstraint;

    public static NodeGroupMeta build(java.util.Map<String, ?> map) throws Exception {
        NodeGroupMeta self = new NodeGroupMeta();
        return TeaModel.build(map, self);
    }

    public NodeGroupMeta setComponentTags(java.util.List<String> componentTags) {
        this.componentTags = componentTags;
        return this;
    }
    public java.util.List<String> getComponentTags() {
        return this.componentTags;
    }

    public NodeGroupMeta setDataDiskConstraint(DiskConstraint dataDiskConstraint) {
        this.dataDiskConstraint = dataDiskConstraint;
        return this;
    }
    public DiskConstraint getDataDiskConstraint() {
        return this.dataDiskConstraint;
    }

    public NodeGroupMeta setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
        return this;
    }
    public Boolean getMandatory() {
        return this.mandatory;
    }

    public NodeGroupMeta setNodeGroupType(String nodeGroupType) {
        this.nodeGroupType = nodeGroupType;
        return this;
    }
    public String getNodeGroupType() {
        return this.nodeGroupType;
    }

    public NodeGroupMeta setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public NodeGroupMeta setSupportActions(java.util.List<String> supportActions) {
        this.supportActions = supportActions;
        return this;
    }
    public java.util.List<String> getSupportActions() {
        return this.supportActions;
    }

    public NodeGroupMeta setSystemDiskConstraint(DiskConstraint systemDiskConstraint) {
        this.systemDiskConstraint = systemDiskConstraint;
        return this;
    }
    public DiskConstraint getSystemDiskConstraint() {
        return this.systemDiskConstraint;
    }

}
