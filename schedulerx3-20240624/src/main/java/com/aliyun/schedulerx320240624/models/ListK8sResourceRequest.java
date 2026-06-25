// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListK8sResourceRequest extends TeaModel {
    /**
     * <p>The Cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the Kubernetes cluster used for synchronizing namespaces. The cluster is added to the service mesh specified by ServiceMeshId. This parameter is required when you query a k8s namespace or a k8s service.</p>
     * 
     * <strong>example:</strong>
     * <p>cadb451ed7af04b0297f4be396a2196fc</p>
     */
    @NameInMap("K8sClusterId")
    public String k8sClusterId;

    /**
     * <p>The name of the namespace in the k8s cluster. This parameter is required when you query a k8s service.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("K8sNamespace")
    public String k8sNamespace;

    /**
     * <p>The resource type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The VPC ID. This parameter is required if ResourceType is set to \&quot;cluster\&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-aa1a18236n90rqhuhhnhh</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static ListK8sResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListK8sResourceRequest self = new ListK8sResourceRequest();
        return TeaModel.build(map, self);
    }

    public ListK8sResourceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListK8sResourceRequest setK8sClusterId(String k8sClusterId) {
        this.k8sClusterId = k8sClusterId;
        return this;
    }
    public String getK8sClusterId() {
        return this.k8sClusterId;
    }

    public ListK8sResourceRequest setK8sNamespace(String k8sNamespace) {
        this.k8sNamespace = k8sNamespace;
        return this;
    }
    public String getK8sNamespace() {
        return this.k8sNamespace;
    }

    public ListK8sResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListK8sResourceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
