// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAssetRefreshTaskConfigRequest extends TeaModel {
    @NameInMap("RefreshConfigType")
    public Integer refreshConfigType;

    /**
     * <p>The region where the Security Center instance is deployed.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TargetId")
    public Long targetId;

    public static ListAssetRefreshTaskConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAssetRefreshTaskConfigRequest self = new ListAssetRefreshTaskConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListAssetRefreshTaskConfigRequest setRefreshConfigType(Integer refreshConfigType) {
        this.refreshConfigType = refreshConfigType;
        return this;
    }
    public Integer getRefreshConfigType() {
        return this.refreshConfigType;
    }

    public ListAssetRefreshTaskConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAssetRefreshTaskConfigRequest setTargetId(Long targetId) {
        this.targetId = targetId;
        return this;
    }
    public Long getTargetId() {
        return this.targetId;
    }

}
