// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExistLDCContainerServiceRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static ExistLDCContainerServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExistLDCContainerServiceRequest self = new ExistLDCContainerServiceRequest();
        return TeaModel.build(map, self);
    }

    public ExistLDCContainerServiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ExistLDCContainerServiceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ExistLDCContainerServiceRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
