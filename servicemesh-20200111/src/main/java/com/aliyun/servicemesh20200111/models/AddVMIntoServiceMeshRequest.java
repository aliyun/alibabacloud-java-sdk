// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class AddVMIntoServiceMeshRequest extends TeaModel {
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

    public static AddVMIntoServiceMeshRequest build(java.util.Map<String, ?> map) throws Exception {
        AddVMIntoServiceMeshRequest self = new AddVMIntoServiceMeshRequest();
        return TeaModel.build(map, self);
    }

    public AddVMIntoServiceMeshRequest setEcsId(String ecsId) {
        this.ecsId = ecsId;
        return this;
    }
    public String getEcsId() {
        return this.ecsId;
    }

    public AddVMIntoServiceMeshRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
