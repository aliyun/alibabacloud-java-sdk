// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateAKSKubernetesResourceRequest extends TeaModel {
    @NameInMap("Cluster")
    public String cluster;

    @NameInMap("Content")
    public String content;

    @NameInMap("Path")
    public String path;

    @NameInMap("Workspace")
    public String workspace;

    public static UpdateAKSKubernetesResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAKSKubernetesResourceRequest self = new UpdateAKSKubernetesResourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAKSKubernetesResourceRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public UpdateAKSKubernetesResourceRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateAKSKubernetesResourceRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public UpdateAKSKubernetesResourceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
