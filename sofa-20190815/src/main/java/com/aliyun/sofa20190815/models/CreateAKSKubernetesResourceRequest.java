// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSKubernetesResourceRequest extends TeaModel {
    @NameInMap("Cluster")
    public String cluster;

    @NameInMap("Content")
    public String content;

    @NameInMap("Path")
    public String path;

    @NameInMap("Workspace")
    public String workspace;

    public static CreateAKSKubernetesResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSKubernetesResourceRequest self = new CreateAKSKubernetesResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateAKSKubernetesResourceRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public CreateAKSKubernetesResourceRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateAKSKubernetesResourceRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreateAKSKubernetesResourceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
