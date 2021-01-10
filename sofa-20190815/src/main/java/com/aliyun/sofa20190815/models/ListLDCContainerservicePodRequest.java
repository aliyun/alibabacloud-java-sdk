// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCContainerservicePodRequest extends TeaModel {
    @NameInMap("ContainerServiceName")
    public String containerServiceName;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("WorkspaceGroupName")
    public String workspaceGroupName;

    public static ListLDCContainerservicePodRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLDCContainerservicePodRequest self = new ListLDCContainerservicePodRequest();
        return TeaModel.build(map, self);
    }

    public ListLDCContainerservicePodRequest setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public ListLDCContainerservicePodRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListLDCContainerservicePodRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

}
