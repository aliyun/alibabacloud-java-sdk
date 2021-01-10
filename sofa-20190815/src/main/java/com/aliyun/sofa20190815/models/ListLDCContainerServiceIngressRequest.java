// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCContainerServiceIngressRequest extends TeaModel {
    @NameInMap("ContainerServiceName")
    public String containerServiceName;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static ListLDCContainerServiceIngressRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLDCContainerServiceIngressRequest self = new ListLDCContainerServiceIngressRequest();
        return TeaModel.build(map, self);
    }

    public ListLDCContainerServiceIngressRequest setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public ListLDCContainerServiceIngressRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListLDCContainerServiceIngressRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
