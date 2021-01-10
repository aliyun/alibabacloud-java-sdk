// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLDCCellgroupRequest extends TeaModel {
    @NameInMap("Datacenter")
    public String datacenter;

    @NameInMap("DefaultGzone")
    public String defaultGzone;

    @NameInMap("Name")
    public String name;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("Type")
    public String type;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static CreateLDCCellgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLDCCellgroupRequest self = new CreateLDCCellgroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateLDCCellgroupRequest setDatacenter(String datacenter) {
        this.datacenter = datacenter;
        return this;
    }
    public String getDatacenter() {
        return this.datacenter;
    }

    public CreateLDCCellgroupRequest setDefaultGzone(String defaultGzone) {
        this.defaultGzone = defaultGzone;
        return this;
    }
    public String getDefaultGzone() {
        return this.defaultGzone;
    }

    public CreateLDCCellgroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLDCCellgroupRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CreateLDCCellgroupRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateLDCCellgroupRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
