// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DeleteNetworkPathShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of network paths.</p>
     */
    @NameInMap("NetworkPathIds")
    public String networkPathIdsShrink;

    /**
     * <p>The region ID of the network path that you want to delete.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteNetworkPathShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkPathShrinkRequest self = new DeleteNetworkPathShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkPathShrinkRequest setNetworkPathIdsShrink(String networkPathIdsShrink) {
        this.networkPathIdsShrink = networkPathIdsShrink;
        return this;
    }
    public String getNetworkPathIdsShrink() {
        return this.networkPathIdsShrink;
    }

    public DeleteNetworkPathShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
