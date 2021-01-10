// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableClusterMeshRequest extends TeaModel {
    @NameInMap("CertificateAuthorityData")
    public String certificateAuthorityData;

    @NameInMap("ClientCertificateData")
    public String clientCertificateData;

    @NameInMap("ClientKeyData")
    public String clientKeyData;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("Server")
    public String server;

    @NameInMap("User")
    public String user;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static EnableClusterMeshRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableClusterMeshRequest self = new EnableClusterMeshRequest();
        return TeaModel.build(map, self);
    }

    public EnableClusterMeshRequest setCertificateAuthorityData(String certificateAuthorityData) {
        this.certificateAuthorityData = certificateAuthorityData;
        return this;
    }
    public String getCertificateAuthorityData() {
        return this.certificateAuthorityData;
    }

    public EnableClusterMeshRequest setClientCertificateData(String clientCertificateData) {
        this.clientCertificateData = clientCertificateData;
        return this;
    }
    public String getClientCertificateData() {
        return this.clientCertificateData;
    }

    public EnableClusterMeshRequest setClientKeyData(String clientKeyData) {
        this.clientKeyData = clientKeyData;
        return this;
    }
    public String getClientKeyData() {
        return this.clientKeyData;
    }

    public EnableClusterMeshRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public EnableClusterMeshRequest setServer(String server) {
        this.server = server;
        return this;
    }
    public String getServer() {
        return this.server;
    }

    public EnableClusterMeshRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

    public EnableClusterMeshRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
