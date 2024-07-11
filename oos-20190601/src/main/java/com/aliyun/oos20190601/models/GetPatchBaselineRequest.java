// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetPatchBaselineRequest extends TeaModel {
    /**
     * <p>The name of the patch baseline.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyPatchBaseline</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region in which the patch baseline whose details you want to query resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetPatchBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPatchBaselineRequest self = new GetPatchBaselineRequest();
        return TeaModel.build(map, self);
    }

    public GetPatchBaselineRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetPatchBaselineRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
