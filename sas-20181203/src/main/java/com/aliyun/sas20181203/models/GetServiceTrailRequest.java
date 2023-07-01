// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetServiceTrailRequest extends TeaModel {
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
