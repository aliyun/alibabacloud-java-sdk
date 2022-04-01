// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ComponentDTO extends TeaModel {
    // affinityComponents
    @NameInMap("affinityComponents")
    public java.util.List<String> affinityComponents;

    // antiAffinityComponents
    @NameInMap("antiAffinityComponents")
    public java.util.List<String> antiAffinityComponents;

    // componentType
    @NameInMap("componentType")
    public String componentType;

    // description
    @NameInMap("description")
    public String description;

    // name
    @NameInMap("name")
    public String name;

    // nodeConstraints
    @NameInMap("nodeConstraints")
    public java.util.List<NodeConstraint> nodeConstraints;

    public static ComponentDTO build(java.util.Map<String, ?> map) throws Exception {
        ComponentDTO self = new ComponentDTO();
        return TeaModel.build(map, self);
    }

    public ComponentDTO setAffinityComponents(java.util.List<String> affinityComponents) {
        this.affinityComponents = affinityComponents;
        return this;
    }
    public java.util.List<String> getAffinityComponents() {
        return this.affinityComponents;
    }

    public ComponentDTO setAntiAffinityComponents(java.util.List<String> antiAffinityComponents) {
        this.antiAffinityComponents = antiAffinityComponents;
        return this;
    }
    public java.util.List<String> getAntiAffinityComponents() {
        return this.antiAffinityComponents;
    }

    public ComponentDTO setComponentType(String componentType) {
        this.componentType = componentType;
        return this;
    }
    public String getComponentType() {
        return this.componentType;
    }

    public ComponentDTO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ComponentDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ComponentDTO setNodeConstraints(java.util.List<NodeConstraint> nodeConstraints) {
        this.nodeConstraints = nodeConstraints;
        return this;
    }
    public java.util.List<NodeConstraint> getNodeConstraints() {
        return this.nodeConstraints;
    }

}
