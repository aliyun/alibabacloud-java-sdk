// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class NodeGroupMetaDTO extends TeaModel {
    // componentTags
    @NameInMap("componentTags")
    public java.util.List<String> componentTags;

    // componentTaints
    @NameInMap("componentTaints")
    public java.util.List<String> componentTaints;

    // dataDiskConstraint
    @NameInMap("dataDiskConstraint")
    public DiskConstraint dataDiskConstraint;

    // nodeGroupType
    @NameInMap("nodeGroupType")
    public String nodeGroupType;

    // supportActions
    @NameInMap("supportActions")
    public java.util.List<String> supportActions;

    // systemDiskConstraint
    @NameInMap("systemDiskConstraint")
    public DiskConstraint systemDiskConstraint;

    public static NodeGroupMetaDTO build(java.util.Map<String, ?> map) throws Exception {
        NodeGroupMetaDTO self = new NodeGroupMetaDTO();
        return TeaModel.build(map, self);
    }

    public NodeGroupMetaDTO setComponentTags(java.util.List<String> componentTags) {
        this.componentTags = componentTags;
        return this;
    }
    public java.util.List<String> getComponentTags() {
        return this.componentTags;
    }

    public NodeGroupMetaDTO setComponentTaints(java.util.List<String> componentTaints) {
        this.componentTaints = componentTaints;
        return this;
    }
    public java.util.List<String> getComponentTaints() {
        return this.componentTaints;
    }

    public NodeGroupMetaDTO setDataDiskConstraint(DiskConstraint dataDiskConstraint) {
        this.dataDiskConstraint = dataDiskConstraint;
        return this;
    }
    public DiskConstraint getDataDiskConstraint() {
        return this.dataDiskConstraint;
    }

    public NodeGroupMetaDTO setNodeGroupType(String nodeGroupType) {
        this.nodeGroupType = nodeGroupType;
        return this;
    }
    public String getNodeGroupType() {
        return this.nodeGroupType;
    }

    public NodeGroupMetaDTO setSupportActions(java.util.List<String> supportActions) {
        this.supportActions = supportActions;
        return this;
    }
    public java.util.List<String> getSupportActions() {
        return this.supportActions;
    }

    public NodeGroupMetaDTO setSystemDiskConstraint(DiskConstraint systemDiskConstraint) {
        this.systemDiskConstraint = systemDiskConstraint;
        return this;
    }
    public DiskConstraint getSystemDiskConstraint() {
        return this.systemDiskConstraint;
    }

}
