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
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
         * <ul>
         * <li><strong>0</strong>: server synchronization task</li>
         * <li><strong>1</strong>: cloud service synchronization task</li>
         * <li><strong>2</strong>: scheduled AccessKey pair verification task</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RefreshConfigType")
        public Integer refreshConfigType;

        /**
         * <p>The synchronization cycle. Valid values:</p>
         * <ul>
         * <li><strong>60</strong>: 60 minutes</li>
         * <li><strong>180</strong>: 3 hours</li>
         * <li><strong>360</strong>: 6 hours</li>
         * <li><strong>720</strong>: 12 hours</li>
         * <li><strong>1440</strong>: 1 day</li>
         * <li><strong>10080</strong>: 7 days</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>360</p>
         */
        @NameInMap("SchedulePeriod")
        public Integer schedulePeriod;

        /**
         * <p>The status of the configuration. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enabled</li>
         * <li><strong>0</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ID of the data entry containing the AccessKey pair that you specify when you configure the scheduled AccessKey pair verification task.</p>
         * 
         * <strong>example:</strong>
         * <p>2308</p>
         */
        @NameInMap("TargetId")
        public Long targetId;

        /**
         * <p>The service provider of the cloud asset. Valid values:</p>
         * <ul>
         * <li><strong>3</strong>: Tencent Cloud</li>
         * <li><strong>4</strong>: Huawei Cloud</li>
         * <li><strong>7</strong>: Amazon Web Services (AWS) Cloud</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
