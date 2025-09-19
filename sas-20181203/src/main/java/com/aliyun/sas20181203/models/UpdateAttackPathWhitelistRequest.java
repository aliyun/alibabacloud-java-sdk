// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateAttackPathWhitelistRequest extends TeaModel {
    /**
     * <p>List of cloud product assets in the attack path.</p>
     */
    @NameInMap("AttackPathAssetList")
    public java.util.List<UpdateAttackPathWhitelistRequestAttackPathAssetList> attackPathAssetList;

    /**
     * <p>Attack path whitelist ID.</p>
     * <blockquote>
     * <p>You can call <a href="~~ListAttackPathWhitelist~~">ListAttackPathWhitelist</a> to query the attack path whitelist ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>apwl-b33dec0acf9b42aabde032d656c0****</p>
     */
    @NameInMap("AttackPathWhitelistId")
    public String attackPathWhitelistId;

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
     * 
     * <strong>example:</strong>
     * <p>ALL_ASSET</p>
     */
    @NameInMap("WhitelistType")
    public String whitelistType;

    public static UpdateAttackPathWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAttackPathWhitelistRequest self = new UpdateAttackPathWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAttackPathWhitelistRequest setAttackPathAssetList(java.util.List<UpdateAttackPathWhitelistRequestAttackPathAssetList> attackPathAssetList) {
        this.attackPathAssetList = attackPathAssetList;
        return this;
    }
    public java.util.List<UpdateAttackPathWhitelistRequestAttackPathAssetList> getAttackPathAssetList() {
        return this.attackPathAssetList;
    }

    public UpdateAttackPathWhitelistRequest setAttackPathWhitelistId(String attackPathWhitelistId) {
        this.attackPathWhitelistId = attackPathWhitelistId;
        return this;
    }
    public String getAttackPathWhitelistId() {
        return this.attackPathWhitelistId;
    }

    public UpdateAttackPathWhitelistRequest setPathName(String pathName) {
        this.pathName = pathName;
        return this;
    }
    public String getPathName() {
        return this.pathName;
    }

    public UpdateAttackPathWhitelistRequest setPathType(String pathType) {
        this.pathType = pathType;
        return this;
    }
    public String getPathType() {
        return this.pathType;
    }

    public UpdateAttackPathWhitelistRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateAttackPathWhitelistRequest setWhitelistName(String whitelistName) {
        this.whitelistName = whitelistName;
        return this;
    }
    public String getWhitelistName() {
        return this.whitelistName;
    }

    public UpdateAttackPathWhitelistRequest setWhitelistType(String whitelistType) {
        this.whitelistType = whitelistType;
        return this;
    }
    public String getWhitelistType() {
        return this.whitelistType;
    }

    public static class UpdateAttackPathWhitelistRequestAttackPathAssetList extends TeaModel {
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

        public static UpdateAttackPathWhitelistRequestAttackPathAssetList build(java.util.Map<String, ?> map) throws Exception {
            UpdateAttackPathWhitelistRequestAttackPathAssetList self = new UpdateAttackPathWhitelistRequestAttackPathAssetList();
            return TeaModel.build(map, self);
        }

        public UpdateAttackPathWhitelistRequestAttackPathAssetList setAssetSubType(Integer assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        public UpdateAttackPathWhitelistRequestAttackPathAssetList setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public UpdateAttackPathWhitelistRequestAttackPathAssetList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateAttackPathWhitelistRequestAttackPathAssetList setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public UpdateAttackPathWhitelistRequestAttackPathAssetList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateAttackPathWhitelistRequestAttackPathAssetList setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

}
