// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetServiceTrailRequest extends TeaModel {
    /**
     * <p>The ID of the region in which the instance resides. Valid value:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: center.</li>
     * <li><strong>ap-southeast-1</strong>: Singapore.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetServiceTrailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceTrailRequest self = new GetServiceTrailRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceTrailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
