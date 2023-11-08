// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ListWaypointsRequest extends TeaModel {
    /**
     * <p>The ID of the cluster on the data plane.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Continue")
    public String _continue;

    @NameInMap("Limit")
    public Long limit;

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

    public static ListWaypointsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWaypointsRequest self = new ListWaypointsRequest();
        return TeaModel.build(map, self);
    }

    public ListWaypointsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListWaypointsRequest set_continue(String _continue) {
        this._continue = _continue;
        return this;
    }
    public String get_continue() {
        return this._continue;
    }

    public ListWaypointsRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public ListWaypointsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListWaypointsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListWaypointsRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
