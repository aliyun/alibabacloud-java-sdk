// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class AddMeshTagToEcsRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("EcsId")
    public String ecsId;

    public static AddMeshTagToEcsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMeshTagToEcsRequest self = new AddMeshTagToEcsRequest();
        return TeaModel.build(map, self);
    }

    public AddMeshTagToEcsRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public AddMeshTagToEcsRequest setEcsId(String ecsId) {
        this.ecsId = ecsId;
        return this;
    }
    public String getEcsId() {
        return this.ecsId;
    }

}
