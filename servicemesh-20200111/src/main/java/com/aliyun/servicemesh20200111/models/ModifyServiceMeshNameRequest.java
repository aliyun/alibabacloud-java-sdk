// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ModifyServiceMeshNameRequest extends TeaModel {
    /**
     * <p>The new name of the ASM instance.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the ASM instance.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static ModifyServiceMeshNameRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyServiceMeshNameRequest self = new ModifyServiceMeshNameRequest();
        return TeaModel.build(map, self);
    }

    public ModifyServiceMeshNameRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyServiceMeshNameRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
