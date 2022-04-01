// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ComponentMeta extends TeaModel {
    // affinityComponents
    @NameInMap("affinityComponents")
    public java.util.List<String> affinityComponents;

    // antiAffinityComponents
    @NameInMap("antiAffinityComponents")
    public java.util.List<String> antiAffinityComponents;

    // deployModeNodeCountConstraints
    @NameInMap("deployModeNodeCountConstraints")
    public java.util.List<DeployModeNodeCountConstraint> deployModeNodeCountConstraints;

    // description
    @NameInMap("description")
    public String description;

    // layoutNodeGroups
    @NameInMap("layoutNodeGroups")
    public java.util.List<String> layoutNodeGroups;

    // layoutType
    @NameInMap("layoutType")
    public String layoutType;

    // name
    @NameInMap("name")
    public String name;

    public static ComponentMeta build(java.util.Map<String, ?> map) throws Exception {
        ComponentMeta self = new ComponentMeta();
        return TeaModel.build(map, self);
    }

    public ComponentMeta setAffinityComponents(java.util.List<String> affinityComponents) {
        this.affinityComponents = affinityComponents;
        return this;
    }
    public java.util.List<String> getAffinityComponents() {
        return this.affinityComponents;
    }

    public ComponentMeta setAntiAffinityComponents(java.util.List<String> antiAffinityComponents) {
        this.antiAffinityComponents = antiAffinityComponents;
        return this;
    }
    public java.util.List<String> getAntiAffinityComponents() {
        return this.antiAffinityComponents;
    }

    public ComponentMeta setDeployModeNodeCountConstraints(java.util.List<DeployModeNodeCountConstraint> deployModeNodeCountConstraints) {
        this.deployModeNodeCountConstraints = deployModeNodeCountConstraints;
        return this;
    }
    public java.util.List<DeployModeNodeCountConstraint> getDeployModeNodeCountConstraints() {
        return this.deployModeNodeCountConstraints;
    }

    public ComponentMeta setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ComponentMeta setLayoutNodeGroups(java.util.List<String> layoutNodeGroups) {
        this.layoutNodeGroups = layoutNodeGroups;
        return this;
    }
    public java.util.List<String> getLayoutNodeGroups() {
        return this.layoutNodeGroups;
    }

    public ComponentMeta setLayoutType(String layoutType) {
        this.layoutType = layoutType;
        return this;
    }
    public String getLayoutType() {
        return this.layoutType;
    }

    public ComponentMeta setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
