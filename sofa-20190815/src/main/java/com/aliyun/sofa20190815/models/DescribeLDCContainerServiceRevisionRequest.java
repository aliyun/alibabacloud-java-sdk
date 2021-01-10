// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeLDCContainerServiceRevisionRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static DescribeLDCContainerServiceRevisionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLDCContainerServiceRevisionRequest self = new DescribeLDCContainerServiceRevisionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLDCContainerServiceRevisionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeLDCContainerServiceRevisionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeLDCContainerServiceRevisionRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
