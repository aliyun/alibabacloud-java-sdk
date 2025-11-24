// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class AddClusterIntoServiceMeshRequest extends TeaModel {
    /**
     * <p>The ID of the cluster to be added.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ce3c25e247da24f3aab9b7edfae83****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Indicates whether to add the cluster to an ASM instance in only service discovery mode.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DiscoveryOnly")
    public Boolean discoveryOnly;

    /**
     * <p>Specifies whether to check that the cluster you want to add to the ASM instance belongs to the istio-system namespace. This parameter is often used in scenarios where you migrate traffic from self-managed open source Istio to ASM. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IgnoreNamespaceCheck")
    public Boolean ignoreNamespaceCheck;

    /**
     * <p>The cluster certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>apiVersion: v1 clusters: - cluster:     server: <a href="https://47.110.xx.xx:6443">https://47.110.xx.xx:6443</a>     certificate-authority-data: LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCk1JSURUakNDQWphZ0F3SUJBZ0lVYzBQVy82ejR1aHlxYkRRdnNsV1htSmpJeFdNd0RRWUpLb1pJaHZjTkFRRUwKQlFBd1BqRW5NQThHQTFVRUNoTUlhR0Z1WjNwb2IzVXdGQVlEVlFRS0V3MWhiR2xpWVdKaElHTnNiM1ZrTVJNdwpFUVlEVlFRREV3cHJkV0psY201bGRHVnpNQ0FYRFRJeU1EUXdOekExTVRnd01Gb1lEekl3TlRJd016TXdNRFV4Ck9EQXdXakErTVNjd0R3WURWUVFLRXdob1lXNW5lbWh2ZFRBVUJnTlZCQW9URFdGc2FXSmhZbUVnWTJ4dmRXUXgKRXpBUkJnTlZCQU1UQ210MVltVnlibVYwWlhNd2dnRWlNQTBHQ1NxR1NJYjNEUUVCQVFVQUE0SUJE****</p>
     */
    @NameInMap("Kubeconfig")
    public String kubeconfig;

    /**
     * <p>The ID of the Service Mesh (ASM) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cb8963379255149cb98c8686f274x****</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static AddClusterIntoServiceMeshRequest build(java.util.Map<String, ?> map) throws Exception {
        AddClusterIntoServiceMeshRequest self = new AddClusterIntoServiceMeshRequest();
        return TeaModel.build(map, self);
    }

    public AddClusterIntoServiceMeshRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddClusterIntoServiceMeshRequest setDiscoveryOnly(Boolean discoveryOnly) {
        this.discoveryOnly = discoveryOnly;
        return this;
    }
    public Boolean getDiscoveryOnly() {
        return this.discoveryOnly;
    }

    public AddClusterIntoServiceMeshRequest setIgnoreNamespaceCheck(Boolean ignoreNamespaceCheck) {
        this.ignoreNamespaceCheck = ignoreNamespaceCheck;
        return this;
    }
    public Boolean getIgnoreNamespaceCheck() {
        return this.ignoreNamespaceCheck;
    }

    public AddClusterIntoServiceMeshRequest setKubeconfig(String kubeconfig) {
        this.kubeconfig = kubeconfig;
        return this;
    }
    public String getKubeconfig() {
        return this.kubeconfig;
    }

    public AddClusterIntoServiceMeshRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
