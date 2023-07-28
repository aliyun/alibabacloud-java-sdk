// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeletePatchBaselineRequest extends TeaModel {
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

    public static DeletePatchBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePatchBaselineRequest self = new DeletePatchBaselineRequest();
        return TeaModel.build(map, self);
    }

    public DeletePatchBaselineRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeletePatchBaselineRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
