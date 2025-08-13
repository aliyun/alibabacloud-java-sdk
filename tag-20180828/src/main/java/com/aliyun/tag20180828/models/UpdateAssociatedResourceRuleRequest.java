// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class UpdateAssociatedResourceRuleRequest extends TeaModel {
    @NameInMap("ExistingStatus")
    public String existingStatus;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The setting name of the associated resource tag rule.</p>
     * <p>For specific values, see the <strong>Rule Setting Name</strong> column in <a href="https://help.aliyun.com/document_detail/2586330.html">Resources that Support Associated Resource Tag Settings</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rule:AssociateEip-UnassociateEip-TagInstance:Ecs-Instance:Vpc-Eip</p>
     */
    @NameInMap("SettingName")
    public String settingName;

    /**
     * <p>Indicates whether to enable the associated resource tag rule. Values:</p>
     * <ul>
     * <li>Enable: Enabled.</li>
     * <li>Disable: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>List of tag keys affected by the associated resource tag rule.</p>
     */
    @NameInMap("TagKeys")
    public java.util.List<String> tagKeys;

    public static UpdateAssociatedResourceRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAssociatedResourceRuleRequest self = new UpdateAssociatedResourceRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAssociatedResourceRuleRequest setExistingStatus(String existingStatus) {
        this.existingStatus = existingStatus;
        return this;
    }
    public String getExistingStatus() {
        return this.existingStatus;
    }

    public UpdateAssociatedResourceRuleRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateAssociatedResourceRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateAssociatedResourceRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateAssociatedResourceRuleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateAssociatedResourceRuleRequest setSettingName(String settingName) {
        this.settingName = settingName;
        return this;
    }
    public String getSettingName() {
        return this.settingName;
    }

    public UpdateAssociatedResourceRuleRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateAssociatedResourceRuleRequest setTagKeys(java.util.List<String> tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public java.util.List<String> getTagKeys() {
        return this.tagKeys;
    }

}
