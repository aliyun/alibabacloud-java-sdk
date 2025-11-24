// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RemoveVMFromServiceMeshRequest extends TeaModel {
    /**
     * <p>The ID of the ECS instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-2ze90ts4edj3650****</p>
     */
    @NameInMap("EcsId")
    public String ecsId;

    /**
     * <p>The ASM instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccb37ff104caf419fbf48fb38e6f3****</p>
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
