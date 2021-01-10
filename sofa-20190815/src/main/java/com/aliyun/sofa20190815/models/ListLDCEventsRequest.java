// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCEventsRequest extends TeaModel {
    @NameInMap("Cluster")
    public String cluster;

    @NameInMap("ContainerName")
    public String containerName;

    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Uid")
    public String uid;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static ListLDCEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLDCEventsRequest self = new ListLDCEventsRequest();
        return TeaModel.build(map, self);
    }

    public ListLDCEventsRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public ListLDCEventsRequest setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public ListLDCEventsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListLDCEventsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListLDCEventsRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public ListLDCEventsRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
