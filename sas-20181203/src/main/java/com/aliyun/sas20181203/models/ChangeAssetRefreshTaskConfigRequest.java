// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeAssetRefreshTaskConfigRequest extends TeaModel {
    @NameInMap("AssetRefreshConfigs")
    public java.util.List<ChangeAssetRefreshTaskConfigRequestAssetRefreshConfigs> assetRefreshConfigs;

    @NameInMap("RegionId")
    public String regionId;

    public static ChangeAssetRefreshTaskConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeAssetRefreshTaskConfigRequest self = new ChangeAssetRefreshTaskConfigRequest();
        return TeaModel.build(map, self);
    }

    public ChangeAssetRefreshTaskConfigRequest setAssetRefreshConfigs(java.util.List<ChangeAssetRefreshTaskConfigRequestAssetRefreshConfigs> assetRefreshConfigs) {
        this.assetRefreshConfigs = assetRefreshConfigs;
        return this;
    }
    public java.util.List<ChangeAssetRefreshTaskConfigRequestAssetRefreshConfigs> getAssetRefreshConfigs() {
        return this.assetRefreshConfigs;
    }

    public ChangeAssetRefreshTaskConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ChangeAssetRefreshTaskConfigRequestAssetRefreshConfigs extends TeaModel {
        @NameInMap("SchedulePeriod")
        public Integer schedulePeriod;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Vendor")
        public Integer vendor;

        public static ChangeAssetRefreshTaskConfigRequestAssetRefreshConfigs build(java.util.Map<String, ?> map) throws Exception {
            ChangeAssetRefreshTaskConfigRequestAssetRefreshConfigs self = new ChangeAssetRefreshTaskConfigRequestAssetRefreshConfigs();
            return TeaModel.build(map, self);
        }

        public ChangeAssetRefreshTaskConfigRequestAssetRefreshConfigs setSchedulePeriod(Integer schedulePeriod) {
            this.schedulePeriod = schedulePeriod;
            return this;
        }
        public Integer getSchedulePeriod() {
            return this.schedulePeriod;
        }

        public ChangeAssetRefreshTaskConfigRequestAssetRefreshConfigs setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ChangeAssetRefreshTaskConfigRequestAssetRefreshConfigs setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

}
