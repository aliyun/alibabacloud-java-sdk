// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DeleteNetworkPathRequest extends TeaModel {
    /**
     * <p>The IDs of network paths.</p>
     */
    @NameInMap("NetworkPathIds")
    public java.util.List<String> networkPathIds;

    /**
     * <p>The region ID of the network path that you want to delete.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteNetworkPathRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkPathRequest self = new DeleteNetworkPathRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkPathRequest setNetworkPathIds(java.util.List<String> networkPathIds) {
        this.networkPathIds = networkPathIds;
        return this;
    }
    public java.util.List<String> getNetworkPathIds() {
        return this.networkPathIds;
    }

    public DeleteNetworkPathRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
