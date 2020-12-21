// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class UnSubscribeRegionRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static UnSubscribeRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        UnSubscribeRegionRequest self = new UnSubscribeRegionRequest();
        return TeaModel.build(map, self);
    }

    public UnSubscribeRegionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
