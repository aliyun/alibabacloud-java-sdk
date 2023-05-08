// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RemoveVMFromServiceMeshRequest extends TeaModel {
    /**
     * <p>The ID of the VM.</p>
     */
    @NameInMap("EcsId")
    public String ecsId;

    /**
     * <p>The ID of the ASM instance.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static RemoveVMFromServiceMeshRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveVMFromServiceMeshRequest self = new RemoveVMFromServiceMeshRequest();
        return TeaModel.build(map, self);
    }

    public RemoveVMFromServiceMeshRequest setEcsId(String ecsId) {
        this.ecsId = ecsId;
        return this;
    }
    public String getEcsId() {
        return this.ecsId;
    }

    public RemoveVMFromServiceMeshRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
