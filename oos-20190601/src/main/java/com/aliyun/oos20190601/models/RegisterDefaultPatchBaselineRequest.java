// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class RegisterDefaultPatchBaselineRequest extends TeaModel {
    /**
     * <p>The name of the patch baseline.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RegisterDefaultPatchBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterDefaultPatchBaselineRequest self = new RegisterDefaultPatchBaselineRequest();
        return TeaModel.build(map, self);
    }

    public RegisterDefaultPatchBaselineRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RegisterDefaultPatchBaselineRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
