// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteWaypointRequest extends TeaModel {
    /**
     * <p>The ID of the cluster on the data plane.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Waypoint名称。</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The namespace.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The Service Mesh (ASM) instance ID.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DeleteWaypointRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWaypointRequest self = new DeleteWaypointRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWaypointRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteWaypointRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteWaypointRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteWaypointRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
