// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class AddOrQuitLaneCmd extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("laneIds")
    public String laneIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>add</p>
     */
    @NameInMap("operateType")
    public String operateType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    public static AddOrQuitLaneCmd build(java.util.Map<String, ?> map) throws Exception {
        AddOrQuitLaneCmd self = new AddOrQuitLaneCmd();
        return TeaModel.build(map, self);
    }

    public AddOrQuitLaneCmd setLaneIds(String laneIds) {
        this.laneIds = laneIds;
        return this;
    }
    public String getLaneIds() {
        return this.laneIds;
    }

    public AddOrQuitLaneCmd setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public AddOrQuitLaneCmd setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

}
