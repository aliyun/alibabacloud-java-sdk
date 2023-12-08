// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeAssetRefreshTaskConfigRequest extends TeaModel {
    /**
     * <p>The asset synchronization configuration.</p>
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
        /**
         * <p>The type of the configuration. Valid values:</p>
         * <br>
         * <p>*   **0**: server synchronization task</p>
         * <p>*   **1**: cloud service synchronization task</p>
         * <p>*   **2**: scheduled AccessKey pair verification task</p>
         */
        @NameInMap("RefreshConfigType")
        public Integer refreshConfigType;

        /**
         * <p>The synchronization cycle. Valid values:</p>
         * <br>
         * <p>*   **60**: 60 minutes</p>
         * <p>*   **180**: 3 hours</p>
         * <p>*   **360**: 6 hours</p>
         * <p>*   **720**: 12 hours</p>
         * <p>*   **1440**: 1 day</p>
         * <p>*   **10080**: 7 days</p>
         */
        @NameInMap("SchedulePeriod")
        public Integer schedulePeriod;

        /**
         * <p>The status of the configuration. Valid values:</p>
         * <br>
         * <p>*   **1**: enabled</p>
         * <p>*   **0**: disabled</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ID of the data entry containing the AccessKey pair that you specify when you configure the scheduled AccessKey pair verification task.</p>
         */
        @NameInMap("TargetId")
        public Long targetId;

        /**
         * <p>The service provider of the cloud asset. Valid values:</p>
         * <br>
         * <p>*   **3**: Tencent Cloud</p>
         * <p>*   **4**: Huawei Cloud</p>
         * <p>*   **7**: Amazon Web Services (AWS) Cloud</p>
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
