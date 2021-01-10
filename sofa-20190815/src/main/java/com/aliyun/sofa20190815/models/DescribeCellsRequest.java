// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeCellsRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("NamePrefix")
    public String namePrefix;

    @NameInMap("Workspace")
    public String workspace;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static DescribeCellsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCellsRequest self = new DescribeCellsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCellsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeCellsRequest setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }
    public String getNamePrefix() {
        return this.namePrefix;
    }

    public DescribeCellsRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public DescribeCellsRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
