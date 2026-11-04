// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class GetPolarClawSkillRegionRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetPolarClawSkillRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPolarClawSkillRegionRequest self = new GetPolarClawSkillRegionRequest();
        return TeaModel.build(map, self);
    }

    public GetPolarClawSkillRegionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
