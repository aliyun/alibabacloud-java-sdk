// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class GetPolicyDefaultOptionsRequest extends TeaModel {
    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetPolicyDefaultOptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyDefaultOptionsRequest self = new GetPolicyDefaultOptionsRequest();
        return TeaModel.build(map, self);
    }

    public GetPolicyDefaultOptionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
