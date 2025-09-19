// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateAttackPathSensitiveAssetConfigRequest extends TeaModel {
    /**
     * <p>List of cloud product assets in the attack path.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AttackPathAssetList")
    public java.util.List<UpdateAttackPathSensitiveAssetConfigRequestAttackPathAssetList> attackPathAssetList;

    /**
     * <p>ID of the sensitive asset setting for the attack path.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>apsac-123</p>
     */
    @NameInMap("AttackPathSensitiveAssetConfigId")
    public String attackPathSensitiveAssetConfigId;

    public static UpdateAttackPathSensitiveAssetConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAttackPathSensitiveAssetConfigRequest self = new UpdateAttackPathSensitiveAssetConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAttackPathSensitiveAssetConfigRequest setAttackPathAssetList(java.util.List<UpdateAttackPathSensitiveAssetConfigRequestAttackPathAssetList> attackPathAssetList) {
        this.attackPathAssetList = attackPathAssetList;
        return this;
    }
    public java.util.List<UpdateAttackPathSensitiveAssetConfigRequestAttackPathAssetList> getAttackPathAssetList() {
        return this.attackPathAssetList;
    }

    public UpdateAttackPathSensitiveAssetConfigRequest setAttackPathSensitiveAssetConfigId(String attackPathSensitiveAssetConfigId) {
        this.attackPathSensitiveAssetConfigId = attackPathSensitiveAssetConfigId;
        return this;
    }
    public String getAttackPathSensitiveAssetConfigId() {
        return this.attackPathSensitiveAssetConfigId;
    }

    public static class UpdateAttackPathSensitiveAssetConfigRequestAttackPathAssetList extends TeaModel {
        /**
         * <p>Subtype of the cloud product asset.</p>
         * <blockquote>
         * <p>You can call <a href="~~ListCloudAssetInstances~~">ListCloudAssetInstances</a> to query the subtype of the cloud product asset.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("AssetSubType")
        public Integer assetSubType;

        /**
         * <p>Type of the cloud product asset.</p>
         * <blockquote>
         * <p>You can call <a href="~~ListCloudAssetInstances~~">ListCloudAssetInstances</a> to query the type of the cloud product asset.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        /**
         * <p>Cloud product asset instance ID.</p>
         * <blockquote>
         * <p>You can call <a href="~~ListCloudAssetInstances~~">ListCloudAssetInstances</a> to query the cloud product asset instance ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2ze357b4mrkwi7tq****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Region ID of the cloud product asset instance.</p>
         * <blockquote>
         * <p>You can call <a href="~~ListCloudAssetInstances~~">ListCloudAssetInstances</a> to query the region ID of the cloud product asset instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Vendor of the cloud product asset.</p>
         * <blockquote>
         * <p>You can call <a href="~~ListCloudAssetInstances~~">ListCloudAssetInstances</a> to query the vendor of the cloud product asset.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        public static UpdateAttackPathSensitiveAssetConfigRequestAttackPathAssetList build(java.util.Map<String, ?> map) throws Exception {
            UpdateAttackPathSensitiveAssetConfigRequestAttackPathAssetList self = new UpdateAttackPathSensitiveAssetConfigRequestAttackPathAssetList();
            return TeaModel.build(map, self);
        }

        public UpdateAttackPathSensitiveAssetConfigRequestAttackPathAssetList setAssetSubType(Integer assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        public UpdateAttackPathSensitiveAssetConfigRequestAttackPathAssetList setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public UpdateAttackPathSensitiveAssetConfigRequestAttackPathAssetList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateAttackPathSensitiveAssetConfigRequestAttackPathAssetList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateAttackPathSensitiveAssetConfigRequestAttackPathAssetList setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

}
