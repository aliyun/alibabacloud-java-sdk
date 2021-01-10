// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSKubernetesResourceRequest extends TeaModel {
    @NameInMap("Cluster")
    public String cluster;

    @NameInMap("Name")
    public String name;

    @NameInMap("Path")
    public String path;

    @NameInMap("Workspace")
    public String workspace;

    public static GetAKSKubernetesResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAKSKubernetesResourceRequest self = new GetAKSKubernetesResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetAKSKubernetesResourceRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public GetAKSKubernetesResourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetAKSKubernetesResourceRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public GetAKSKubernetesResourceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
