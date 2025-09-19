// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAttackPathSensitiveAssetConfigRequest extends TeaModel {
    /**
     * <p>List of cloud product assets.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AttackPathAssetList")
    public java.util.List<CreateAttackPathSensitiveAssetConfigRequestAttackPathAssetList> attackPathAssetList;

    /**
     * <p>Configuration type. Possible values:</p>
     * <ul>
     * <li>asset_instance: Asset.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asset_instance</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    public static CreateAttackPathSensitiveAssetConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAttackPathSensitiveAssetConfigRequest self = new CreateAttackPathSensitiveAssetConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateAttackPathSensitiveAssetConfigRequest setAttackPathAssetList(java.util.List<CreateAttackPathSensitiveAssetConfigRequestAttackPathAssetList> attackPathAssetList) {
        this.attackPathAssetList = attackPathAssetList;
        return this;
    }
    public java.util.List<CreateAttackPathSensitiveAssetConfigRequestAttackPathAssetList> getAttackPathAssetList() {
        return this.attackPathAssetList;
    }

    public CreateAttackPathSensitiveAssetConfigRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public static class CreateAttackPathSensitiveAssetConfigRequestAttackPathAssetList extends TeaModel {
        /**
         * <p>Subtype of the cloud product asset.</p>
         * <blockquote>
         * <p>You can call <a href="~~ListCloudAssetInstances~~">ListCloudAssetInstances</a> to query the subtype of the cloud product asset.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>17</p>
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
         * <p>i-8vb0e8qdaj0yyxjo****</p>
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
         * <p>Cloud product asset vendor.</p>
         * <blockquote>
         * <p>You can call <a href="~~ListCloudAssetInstances~~">ListCloudAssetInstances</a> to query the cloud product asset vendor.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        public static CreateAttackPathSensitiveAssetConfigRequestAttackPathAssetList build(java.util.Map<String, ?> map) throws Exception {
            CreateAttackPathSensitiveAssetConfigRequestAttackPathAssetList self = new CreateAttackPathSensitiveAssetConfigRequestAttackPathAssetList();
            return TeaModel.build(map, self);
        }

        public CreateAttackPathSensitiveAssetConfigRequestAttackPathAssetList setAssetSubType(Integer assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        public CreateAttackPathSensitiveAssetConfigRequestAttackPathAssetList setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public CreateAttackPathSensitiveAssetConfigRequestAttackPathAssetList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateAttackPathSensitiveAssetConfigRequestAttackPathAssetList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateAttackPathSensitiveAssetConfigRequestAttackPathAssetList setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

}
