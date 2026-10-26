// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class DeleteInstanceInspectionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static DeleteInstanceInspectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceInspectionRequest self = new DeleteInstanceInspectionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceInspectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
