// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateSwimmingLaneEnableAttributeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <strong>example:</strong>
     * <p>2074</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <strong>example:</strong>
     * <p>9637</p>
     */
    @NameInMap("LaneId")
    public Long laneId;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static UpdateSwimmingLaneEnableAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSwimmingLaneEnableAttributeRequest self = new UpdateSwimmingLaneEnableAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSwimmingLaneEnableAttributeRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateSwimmingLaneEnableAttributeRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public UpdateSwimmingLaneEnableAttributeRequest setLaneId(Long laneId) {
        this.laneId = laneId;
        return this;
    }
    public Long getLaneId() {
        return this.laneId;
    }

    public UpdateSwimmingLaneEnableAttributeRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
