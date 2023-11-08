// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteSwimLaneGroupRequest extends TeaModel {
    /**
     * <p>The name of the lane group.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The ID of the Service Mesh (ASM) instance.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DeleteSwimLaneGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSwimLaneGroupRequest self = new DeleteSwimLaneGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSwimLaneGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DeleteSwimLaneGroupRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
