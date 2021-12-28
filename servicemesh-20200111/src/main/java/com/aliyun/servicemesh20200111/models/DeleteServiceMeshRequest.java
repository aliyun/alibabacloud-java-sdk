// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteServiceMeshRequest extends TeaModel {
    @NameInMap("Force")
    public Boolean force;

    @NameInMap("RetainResources")
    public String retainResources;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DeleteServiceMeshRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceMeshRequest self = new DeleteServiceMeshRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceMeshRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteServiceMeshRequest setRetainResources(String retainResources) {
        this.retainResources = retainResources;
        return this;
    }
    public String getRetainResources() {
        return this.retainResources;
    }

    public DeleteServiceMeshRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
