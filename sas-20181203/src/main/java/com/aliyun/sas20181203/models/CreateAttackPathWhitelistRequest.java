// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAttackPathWhitelistRequest extends TeaModel {
    /**
     * <p>List of cloud product assets in the attack path.</p>
     */
    @NameInMap("AttackPathAssetList")
    public java.util.List<CreateAttackPathWhitelistRequestAttackPathAssetList> attackPathAssetList;

    /**
     * <p>Path name.</p>
     * <blockquote>
     * <p>You can call <a href="~~ListAvailableAttackPath~~">ListAvailableAttackPath</a> to query the path name.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecs_get_credential_by_create_login_profile</p>
     */
    @NameInMap("PathName")
    public String pathName;

    /**
     * <p>Path type.</p>
     * <blockquote>
     * <p>You can call <a href="~~ListAvailableAttackPath~~">ListAvailableAttackPath</a> to query the path type.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>role_escalation</p>
     */
    @NameInMap("PathType")
    public String pathType;

    /**
     * <p>Remark information.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>Whitelist name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("WhitelistName")
    public String whitelistName;

    /**
     * <p>Whitelist type. Values:</p>
     * <ul>
     * <li><strong>ALL_ASSET</strong>: All assets</li>
     * <li><strong>PART_ASSET</strong>: Partial assets</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL_ASSET</p>
     */
    @NameInMap("WhitelistType")
    public String whitelistType;

    public static CreateAttackPathWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAttackPathWhitelistRequest self = new CreateAttackPathWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public CreateAttackPathWhitelistRequest setAttackPathAssetList(java.util.List<CreateAttackPathWhitelistRequestAttackPathAssetList> attackPathAssetList) {
        this.attackPathAssetList = attackPathAssetList;
        return this;
    }
    public java.util.List<CreateAttackPathWhitelistRequestAttackPathAssetList> getAttackPathAssetList() {
        return this.attackPathAssetList;
    }

    public CreateAttackPathWhitelistRequest setPathName(String pathName) {
        this.pathName = pathName;
        return this;
    }
    public String getPathName() {
        return this.pathName;
    }

    public CreateAttackPathWhitelistRequest setPathType(String pathType) {
        this.pathType = pathType;
        return this;
    }
    public String getPathType() {
        return this.pathType;
    }

    public CreateAttackPathWhitelistRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateAttackPathWhitelistRequest setWhitelistName(String whitelistName) {
        this.whitelistName = whitelistName;
        return this;
    }
    public String getWhitelistName() {
        return this.whitelistName;
    }

    public CreateAttackPathWhitelistRequest setWhitelistType(String whitelistType) {
        this.whitelistType = whitelistType;
        return this;
    }
    public String getWhitelistType() {
        return this.whitelistType;
    }

    public static class CreateAttackPathWhitelistRequestAttackPathAssetList extends TeaModel {
        /**
         * <p>Subtype of the cloud product asset.</p>
         * <blockquote>
         * <p>You can call <a href="~~ListCloudAssetInstances~~">ListCloudAssetInstances</a> to query the subtype of the cloud product asset.</p>
         * </blockquote>
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
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        /**
         * <p>Cloud product asset instance ID.</p>
         * <blockquote>
         * <p>You can call <a href="~~ListCloudAssetInstances~~">ListCloudAssetInstances</a> to query the cloud product asset instance ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-8vb0e8qdaj0yyxjo****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Node type, with values:</p>
         * <ul>
         * <li><strong>start</strong>: Start point.</li>
         * <li><strong>end</strong>: End point.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>start</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>Region ID of the cloud product asset instance.</p>
         * <blockquote>
         * <p>You can call <a href="~~ListCloudAssetInstances~~">ListCloudAssetInstances</a> to query the region ID of the cloud product asset instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Vendor of the cloud product asset.</p>
         * <blockquote>
         * <p>You can call <a href="~~ListCloudAssetInstances~~">ListCloudAssetInstances</a> to query the vendor of the cloud product asset.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        public static CreateAttackPathWhitelistRequestAttackPathAssetList build(java.util.Map<String, ?> map) throws Exception {
            CreateAttackPathWhitelistRequestAttackPathAssetList self = new CreateAttackPathWhitelistRequestAttackPathAssetList();
            return TeaModel.build(map, self);
        }

        public CreateAttackPathWhitelistRequestAttackPathAssetList setAssetSubType(Integer assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        public CreateAttackPathWhitelistRequestAttackPathAssetList setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public CreateAttackPathWhitelistRequestAttackPathAssetList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateAttackPathWhitelistRequestAttackPathAssetList setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public CreateAttackPathWhitelistRequestAttackPathAssetList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateAttackPathWhitelistRequestAttackPathAssetList setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

}
