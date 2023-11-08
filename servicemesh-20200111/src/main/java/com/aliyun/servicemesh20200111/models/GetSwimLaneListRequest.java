// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetSwimLaneListRequest extends TeaModel {
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

    public static GetSwimLaneListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSwimLaneListRequest self = new GetSwimLaneListRequest();
        return TeaModel.build(map, self);
    }

    public GetSwimLaneListRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public GetSwimLaneListRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
