// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCContainerServiceServiceRequest extends TeaModel {
    @NameInMap("ContainerServiceName")
    public String containerServiceName;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static ListLDCContainerServiceServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLDCContainerServiceServiceRequest self = new ListLDCContainerServiceServiceRequest();
        return TeaModel.build(map, self);
    }

    public ListLDCContainerServiceServiceRequest setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public ListLDCContainerServiceServiceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListLDCContainerServiceServiceRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
