// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetSwimLaneDetailRequest extends TeaModel {
    /**
     * <p>The name of the lane group.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The ID of the Service Mesh (ASM) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    /**
     * <p>The name of the lane.</p>
     * 
     * <strong>example:</strong>
     * <p>s1</p>
     */
    @NameInMap("SwimLaneName")
    public String swimLaneName;

    public static GetSwimLaneDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSwimLaneDetailRequest self = new GetSwimLaneDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetSwimLaneDetailRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public GetSwimLaneDetailRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public GetSwimLaneDetailRequest setSwimLaneName(String swimLaneName) {
        this.swimLaneName = swimLaneName;
        return this;
    }
    public String getSwimLaneName() {
        return this.swimLaneName;
    }

}
