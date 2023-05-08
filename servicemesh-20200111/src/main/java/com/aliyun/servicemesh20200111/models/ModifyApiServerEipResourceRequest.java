// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ModifyApiServerEipResourceRequest extends TeaModel {
    /**
     * <p>The ID of the EIP.</p>
     */
    @NameInMap("ApiServerEipId")
    public String apiServerEipId;

    /**
     * <p>The type of the operation. Valid values:</p>
     * <br>
     * <p>*   `UnBindEip`: disassociates an EIP from the API server.</p>
     * <p>*   `BindEip`: associates an EIP with the API server.</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>The ID of the Alibaba Cloud Service Mesh (ASM) instance.</p>
     */
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
