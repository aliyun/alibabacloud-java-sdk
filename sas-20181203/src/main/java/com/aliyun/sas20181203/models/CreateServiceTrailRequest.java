// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateServiceTrailRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static CreateServiceTrailRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceTrailRequest self = new CreateServiceTrailRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceTrailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
