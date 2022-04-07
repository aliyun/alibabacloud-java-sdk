// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ModifyApiServerEipResourceRequest extends TeaModel {
    @NameInMap("ApiServerEipId")
    public String apiServerEipId;

    @NameInMap("Operation")
    public String operation;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static ModifyApiServerEipResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiServerEipResourceRequest self = new ModifyApiServerEipResourceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApiServerEipResourceRequest setApiServerEipId(String apiServerEipId) {
        this.apiServerEipId = apiServerEipId;
        return this;
    }
    public String getApiServerEipId() {
        return this.apiServerEipId;
    }

    public ModifyApiServerEipResourceRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public ModifyApiServerEipResourceRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
