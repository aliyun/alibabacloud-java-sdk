// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetRegisteredServiceEndpointsRequest extends TeaModel {
    /**
     * <p>The name of the registered service.</p>
     * 
     * <strong>example:</strong>
     * <p>c8b054ee8c3914d079b5ce9733328****,c58faedb8a78640d3aeb0372e4c02****</p>
     */
    @NameInMap("ClusterIds")
    public String clusterIds;

    /**
     * <p>The type of the registered service. Valid values:</p>
     * <ul>
     * <li><code>ServiceEntry</code>: indicates that the service is registered by creating a service entry.</li>
     * <li><code>Kubernetes</code>: indicates that the service is registered on a Kubernetes cluster on the data plane.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>reviews</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The IDs of clusters in the ASM instance. Separate multiple cluster IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The name of the namespace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c08ba3fd1e6484b0f8cc1ad8fe10d****</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    /**
     * <p>The endpoints of the registered service.</p>
     * 
     * <strong>example:</strong>
     * <p>Kubernetes</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    public static GetRegisteredServiceEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRegisteredServiceEndpointsRequest self = new GetRegisteredServiceEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public GetRegisteredServiceEndpointsRequest setClusterIds(String clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }
    public String getClusterIds() {
        return this.clusterIds;
    }

    public GetRegisteredServiceEndpointsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetRegisteredServiceEndpointsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetRegisteredServiceEndpointsRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public GetRegisteredServiceEndpointsRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
