// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetServiceSettingsRequest extends TeaModel {
    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetServiceSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceSettingsRequest self = new GetServiceSettingsRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceSettingsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
