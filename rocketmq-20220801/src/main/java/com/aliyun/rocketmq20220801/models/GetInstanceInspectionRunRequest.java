// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetInstanceInspectionRunRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static GetInstanceInspectionRunRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceInspectionRunRequest self = new GetInstanceInspectionRunRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceInspectionRunRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
