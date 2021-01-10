// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSTokenRequest extends TeaModel {
    @NameInMap("ContainerName")
    public String containerName;

    @NameInMap("Ctoken")
    public String ctoken;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PodName")
    public String podName;

    @NameInMap("Workspace")
    public String workspace;

    public static CreateAKSTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSTokenRequest self = new CreateAKSTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateAKSTokenRequest setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public CreateAKSTokenRequest setCtoken(String ctoken) {
        this.ctoken = ctoken;
        return this;
    }
    public String getCtoken() {
        return this.ctoken;
    }

    public CreateAKSTokenRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateAKSTokenRequest setPodName(String podName) {
        this.podName = podName;
        return this;
    }
    public String getPodName() {
        return this.podName;
    }

    public CreateAKSTokenRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
