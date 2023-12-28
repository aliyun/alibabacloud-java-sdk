// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class GetPublicPatchBaselineRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    public static GetPublicPatchBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPublicPatchBaselineRequest self = new GetPublicPatchBaselineRequest();
        return TeaModel.build(map, self);
    }

    public GetPublicPatchBaselineRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetPublicPatchBaselineRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
