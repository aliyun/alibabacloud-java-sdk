// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateSwimLaneGroupRequest extends TeaModel {
    @NameInMap("FallbackTarget")
    public String fallbackTarget;

    /**
     * <p>The name of the lane group.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The ID of the ASM instance.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    /**
     * <p>A list of services associated with the lane group.</p>
     */
    @NameInMap("ServicesList")
    public String servicesList;

    public static UpdateSwimLaneGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSwimLaneGroupRequest self = new UpdateSwimLaneGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSwimLaneGroupRequest setFallbackTarget(String fallbackTarget) {
        this.fallbackTarget = fallbackTarget;
        return this;
    }
    public String getFallbackTarget() {
        return this.fallbackTarget;
    }

    public UpdateSwimLaneGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateSwimLaneGroupRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public UpdateSwimLaneGroupRequest setServicesList(String servicesList) {
        this.servicesList = servicesList;
        return this;
    }
    public String getServicesList() {
        return this.servicesList;
    }

}
