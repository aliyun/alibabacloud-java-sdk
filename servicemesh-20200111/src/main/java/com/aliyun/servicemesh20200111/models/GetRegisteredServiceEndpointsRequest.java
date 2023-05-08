// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetRegisteredServiceEndpointsRequest extends TeaModel {
    /**
     * <p>The name of the registered service.</p>
     */
    @NameInMap("ClusterIds")
    public String clusterIds;

    /**
     * <p>The type of the registered service. Valid values:</p>
     * <br>
     * <p>*   `ServiceEntry`: indicates that the service is registered by creating a service entry.</p>
     * <p>*   `Kubernetes`: indicates that the service is registered on a Kubernetes cluster on the data plane.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The IDs of clusters in the ASM instance. Separate multiple cluster IDs with commas (,).</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The name of the namespace.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    /**
     * <p>The endpoints of the registered service.</p>
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
