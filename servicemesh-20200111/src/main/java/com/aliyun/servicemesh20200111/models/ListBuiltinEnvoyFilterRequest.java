// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ListBuiltinEnvoyFilterRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("Id")
    public String id;

    public static ListBuiltinEnvoyFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBuiltinEnvoyFilterRequest self = new ListBuiltinEnvoyFilterRequest();
        return TeaModel.build(map, self);
    }

    public ListBuiltinEnvoyFilterRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public ListBuiltinEnvoyFilterRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
