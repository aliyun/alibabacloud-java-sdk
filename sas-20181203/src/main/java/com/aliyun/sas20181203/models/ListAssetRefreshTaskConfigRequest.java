// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAssetRefreshTaskConfigRequest extends TeaModel {
    /**
     * <p>The region where the Security Center instance is deployed.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListAssetRefreshTaskConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAssetRefreshTaskConfigRequest self = new ListAssetRefreshTaskConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListAssetRefreshTaskConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
