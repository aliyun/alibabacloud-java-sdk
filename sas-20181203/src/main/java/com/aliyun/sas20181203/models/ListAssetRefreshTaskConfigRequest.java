// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAssetRefreshTaskConfigRequest extends TeaModel {
    /**
     * <p>The configuration type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: host refresh task</li>
     * <li><strong>1</strong>: cloud service refresh task</li>
     * <li><strong>2</strong>: AccessKey scheduled verification task.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RefreshConfigType")
    public Integer refreshConfigType;

    /**
     * <p>The region of the Security Center instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the AccessKey record specified when querying an AccessKey scheduled verification task.</p>
     * 
     * <strong>example:</strong>
     * <p>2295</p>
     */
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
