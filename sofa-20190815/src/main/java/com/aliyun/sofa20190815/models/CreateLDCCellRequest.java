// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLDCCellRequest extends TeaModel {
    @NameInMap("CellGroup")
    public String cellGroup;

    @NameInMap("Color")
    public String color;

    @NameInMap("Identity")
    public String identity;

    @NameInMap("IsGray")
    public Boolean isGray;

    @NameInMap("Name")
    public String name;

    @NameInMap("Type")
    public String type;

    @NameInMap("Weight")
    public Long weight;

    @NameInMap("Workspace")
    public String workspace;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    @NameInMap("Zone")
    public String zone;

    public static CreateLDCCellRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLDCCellRequest self = new CreateLDCCellRequest();
        return TeaModel.build(map, self);
    }

    public CreateLDCCellRequest setCellGroup(String cellGroup) {
        this.cellGroup = cellGroup;
        return this;
    }
    public String getCellGroup() {
        return this.cellGroup;
    }

    public CreateLDCCellRequest setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public CreateLDCCellRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public CreateLDCCellRequest setIsGray(Boolean isGray) {
        this.isGray = isGray;
        return this;
    }
    public Boolean getIsGray() {
        return this.isGray;
    }

    public CreateLDCCellRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLDCCellRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateLDCCellRequest setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

    public CreateLDCCellRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public CreateLDCCellRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public CreateLDCCellRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
