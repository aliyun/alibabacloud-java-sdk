// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeAssetRefreshTaskConfigRequest extends TeaModel {
    /**
     * <p>The asset synchronization configurations.</p>
     */
    @NameInMap("AssetRefreshConfigs")
    public java.util.List<ChangeAssetRefreshTaskConfigRequestAssetRefreshConfigs> assetRefreshConfigs;

    /**
     * <p>The region in which your Security Center service resides.</p>
     */
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
        @NameInMap("RefreshConfigType")
        public Integer refreshConfigType;

        /**
         * <p>The interval at which assets are synchronized. Unit: minutes. Valid values:</p>
         * <br>
         * <p>*   **60**</p>
         * <p>*   **180**</p>
         * <p>*   **360**</p>
         * <p>*   **720**</p>
         * <p>*   **1440**</p>
         * <p>*   **10080**</p>
         */
        @NameInMap("SchedulePeriod")
        public Integer schedulePeriod;

        /**
         * <p>The status of the asset synchronization feature. Valid values:</p>
         * <br>
         * <p>*   **1**: Asset synchronization is enabled.</p>
         * <p>*   **0**: Asset synchronization is disabled.</p>
         */
        @NameInMap("Status")
        public Integer status;

        @NameInMap("TargetId")
        public Long targetId;

        /**
         * <p>The service provider of the cloud asset. Valid values:</p>
         * <br>
         * <p>*   **3**: Tencent Cloud</p>
         * <p>*   **4**: HUAWEI CLOUD</p>
         * <p>*   **7**: Amazon Web Services (AWS)</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        public static ChangeAssetRefreshTaskConfigRequestAssetRefreshConfigs build(java.util.Map<String, ?> map) throws Exception {
            ChangeAssetRefreshTaskConfigRequestAssetRefreshConfigs self = new ChangeAssetRefreshTaskConfigRequestAssetRefreshConfigs();
            return TeaModel.build(map, self);
        }

        public ChangeAssetRefreshTaskConfigRequestAssetRefreshConfigs setRefreshConfigType(Integer refreshConfigType) {
            this.refreshConfigType = refreshConfigType;
            return this;
        }
        public Integer getRefreshConfigType() {
            return this.refreshConfigType;
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

        public ChangeAssetRefreshTaskConfigRequestAssetRefreshConfigs setTargetId(Long targetId) {
            this.targetId = targetId;
            return this;
        }
        public Long getTargetId() {
            return this.targetId;
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
