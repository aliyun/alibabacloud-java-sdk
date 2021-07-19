// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class RegisterDefaultPatchBaselineRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Name")
    public String name;

    public static RegisterDefaultPatchBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterDefaultPatchBaselineRequest self = new RegisterDefaultPatchBaselineRequest();
        return TeaModel.build(map, self);
    }

    public RegisterDefaultPatchBaselineRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RegisterDefaultPatchBaselineRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
