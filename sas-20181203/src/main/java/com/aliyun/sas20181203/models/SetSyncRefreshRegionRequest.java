// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetSyncRefreshRegionRequest extends TeaModel {
    /**
     * <p>The access type of the multi-cloud site. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The current site is not the default site of multi-cloud site. You can specify the current site as the default site of the multi-cloud site.</li>
     * <li><strong>1</strong>: The current site is the default site of multi-cloud site.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DefaultRegion")
    public Integer defaultRegion;

    /**
     * <p>The regions from which you want to synchronize assets at the current site.</p>
     */
    @NameInMap("RegionIds")
    public java.util.List<String> regionIds;

    /**
     * <p>The cloud service provider. Valid values:</p>
     * <ul>
     * <li><strong>Tencent</strong>: Tencent Cloud</li>
     * <li><strong>HUAWEICLOUD</strong>: Huawei Cloud</li>
     * <li><strong>Azure</strong>: Microsoft Azure</li>
     * <li><strong>AWS</strong>: Amazon Web Services (AWS)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Tencent</p>
     */
    @NameInMap("Vendor")
    public String vendor;

    public static SetSyncRefreshRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSyncRefreshRegionRequest self = new SetSyncRefreshRegionRequest();
        return TeaModel.build(map, self);
    }

    public SetSyncRefreshRegionRequest setDefaultRegion(Integer defaultRegion) {
        this.defaultRegion = defaultRegion;
        return this;
    }
    public Integer getDefaultRegion() {
        return this.defaultRegion;
    }

    public SetSyncRefreshRegionRequest setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    public SetSyncRefreshRegionRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
