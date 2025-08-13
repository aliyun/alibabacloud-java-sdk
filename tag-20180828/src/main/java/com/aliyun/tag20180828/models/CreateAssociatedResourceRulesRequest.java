// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class CreateAssociatedResourceRulesRequest extends TeaModel {
    /**
     * <p>The associated resource tagging rules that you want to create.</p>
     */
    @NameInMap("CreateRulesList")
    public java.util.List<CreateAssociatedResourceRulesRequestCreateRulesList> createRulesList;

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

    public static CreateAssociatedResourceRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAssociatedResourceRulesRequest self = new CreateAssociatedResourceRulesRequest();
        return TeaModel.build(map, self);
    }

    public CreateAssociatedResourceRulesRequest setCreateRulesList(java.util.List<CreateAssociatedResourceRulesRequestCreateRulesList> createRulesList) {
        this.createRulesList = createRulesList;
        return this;
    }
    public java.util.List<CreateAssociatedResourceRulesRequestCreateRulesList> getCreateRulesList() {
        return this.createRulesList;
    }

    public CreateAssociatedResourceRulesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateAssociatedResourceRulesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAssociatedResourceRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAssociatedResourceRulesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public static class CreateAssociatedResourceRulesRequestCreateRulesList extends TeaModel {
        @NameInMap("ExistingStatus")
        public String existingStatus;

        /**
         * <p>The name of the associated resource tagging rule.</p>
         * <p>For more information, see the <strong>Rule Name</strong> column in <a href="https://help.aliyun.com/document_detail/2586330.html">Resource types that support the Associated Resource Tagging feature</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rule:AttachEni-DetachEni-TagInstance:Ecs-Instance:Ecs-Eni</p>
         */
        @NameInMap("SettingName")
        public String settingName;

        /**
         * <p>Specifies whether to enable the associated resource tagging rule. Valid values:</p>
         * <ul>
         * <li>Enable (default)</li>
         * <li>Disable</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag keys to which the associated resource tagging rule applies.</p>
         */
        @NameInMap("TagKeys")
        public java.util.List<String> tagKeys;

        public static CreateAssociatedResourceRulesRequestCreateRulesList build(java.util.Map<String, ?> map) throws Exception {
            CreateAssociatedResourceRulesRequestCreateRulesList self = new CreateAssociatedResourceRulesRequestCreateRulesList();
            return TeaModel.build(map, self);
        }

        public CreateAssociatedResourceRulesRequestCreateRulesList setExistingStatus(String existingStatus) {
            this.existingStatus = existingStatus;
            return this;
        }
        public String getExistingStatus() {
            return this.existingStatus;
        }

        public CreateAssociatedResourceRulesRequestCreateRulesList setSettingName(String settingName) {
            this.settingName = settingName;
            return this;
        }
        public String getSettingName() {
            return this.settingName;
        }

        public CreateAssociatedResourceRulesRequestCreateRulesList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateAssociatedResourceRulesRequestCreateRulesList setTagKeys(java.util.List<String> tagKeys) {
            this.tagKeys = tagKeys;
            return this;
        }
        public java.util.List<String> getTagKeys() {
            return this.tagKeys;
        }

    }

}
