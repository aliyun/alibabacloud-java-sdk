// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class OpenAKSClusterMeshRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("EnableDiscoverySync")
    public Boolean enableDiscoverySync;

    @NameInMap("EnableK8sSvcDiscovery")
    public Boolean enableK8sSvcDiscovery;

    @NameInMap("Insecure")
    public Boolean insecure;

    @NameInMap("Kubeconfig")
    public String kubeconfig;

    @NameInMap("RegistryMetaConfigJsonStr")
    public String registryMetaConfigJsonStr;

    @NameInMap("UserAccessKey")
    public String userAccessKey;

    @NameInMap("UserAccessSecret")
    public String userAccessSecret;

    @NameInMap("Workspace")
    public String workspace;

    public static OpenAKSClusterMeshRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenAKSClusterMeshRequest self = new OpenAKSClusterMeshRequest();
        return TeaModel.build(map, self);
    }

    public OpenAKSClusterMeshRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public OpenAKSClusterMeshRequest setEnableDiscoverySync(Boolean enableDiscoverySync) {
        this.enableDiscoverySync = enableDiscoverySync;
        return this;
    }
    public Boolean getEnableDiscoverySync() {
        return this.enableDiscoverySync;
    }

    public OpenAKSClusterMeshRequest setEnableK8sSvcDiscovery(Boolean enableK8sSvcDiscovery) {
        this.enableK8sSvcDiscovery = enableK8sSvcDiscovery;
        return this;
    }
    public Boolean getEnableK8sSvcDiscovery() {
        return this.enableK8sSvcDiscovery;
    }

    public OpenAKSClusterMeshRequest setInsecure(Boolean insecure) {
        this.insecure = insecure;
        return this;
    }
    public Boolean getInsecure() {
        return this.insecure;
    }

    public OpenAKSClusterMeshRequest setKubeconfig(String kubeconfig) {
        this.kubeconfig = kubeconfig;
        return this;
    }
    public String getKubeconfig() {
        return this.kubeconfig;
    }

    public OpenAKSClusterMeshRequest setRegistryMetaConfigJsonStr(String registryMetaConfigJsonStr) {
        this.registryMetaConfigJsonStr = registryMetaConfigJsonStr;
        return this;
    }
    public String getRegistryMetaConfigJsonStr() {
        return this.registryMetaConfigJsonStr;
    }

    public OpenAKSClusterMeshRequest setUserAccessKey(String userAccessKey) {
        this.userAccessKey = userAccessKey;
        return this;
    }
    public String getUserAccessKey() {
        return this.userAccessKey;
    }

    public OpenAKSClusterMeshRequest setUserAccessSecret(String userAccessSecret) {
        this.userAccessSecret = userAccessSecret;
        return this;
    }
    public String getUserAccessSecret() {
        return this.userAccessSecret;
    }

    public OpenAKSClusterMeshRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
