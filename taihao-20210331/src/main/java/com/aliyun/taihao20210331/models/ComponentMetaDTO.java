// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ComponentMetaDTO extends TeaModel {
    // affinityComponents
    @NameInMap("affinityComponents")
    public java.util.List<String> affinityComponents;

    // antiAffinityComponents
    @NameInMap("antiAffinityComponents")
    public java.util.List<String> antiAffinityComponents;

    // componentName
    @NameInMap("componentName")
    public String componentName;

    // description
    @NameInMap("description")
    public String description;

    // nodeConstraint
    @NameInMap("nodeConstraints")
    public java.util.List<NodeConstraint> nodeConstraints;

    public static ComponentMetaDTO build(java.util.Map<String, ?> map) throws Exception {
        ComponentMetaDTO self = new ComponentMetaDTO();
        return TeaModel.build(map, self);
    }

    public ComponentMetaDTO setAffinityComponents(java.util.List<String> affinityComponents) {
        this.affinityComponents = affinityComponents;
        return this;
    }
    public java.util.List<String> getAffinityComponents() {
        return this.affinityComponents;
    }

    public ComponentMetaDTO setAntiAffinityComponents(java.util.List<String> antiAffinityComponents) {
        this.antiAffinityComponents = antiAffinityComponents;
        return this;
    }
    public java.util.List<String> getAntiAffinityComponents() {
        return this.antiAffinityComponents;
    }

    public ComponentMetaDTO setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public ComponentMetaDTO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ComponentMetaDTO setNodeConstraints(java.util.List<NodeConstraint> nodeConstraints) {
        this.nodeConstraints = nodeConstraints;
        return this;
    }
    public java.util.List<NodeConstraint> getNodeConstraints() {
        return this.nodeConstraints;
    }

}
