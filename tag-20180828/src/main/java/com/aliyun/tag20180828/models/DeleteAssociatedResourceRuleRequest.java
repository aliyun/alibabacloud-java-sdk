// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class DeleteAssociatedResourceRuleRequest extends TeaModel {
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
     * <p>The name of the associated resource tagging rule.</p>
     * <p>For more information, see the <strong>Rule Name</strong> column in <a href="https://help.aliyun.com/document_detail/2586330.html">Resource types that support the Associated Resource Tagging feature</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rule:AttachEni-DetachEni-TagInstance:Ecs-Instance:Ecs-Eni</p>
     */
    @NameInMap("SettingName")
    public String settingName;

    public static DeleteAssociatedResourceRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAssociatedResourceRuleRequest self = new DeleteAssociatedResourceRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAssociatedResourceRuleRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteAssociatedResourceRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteAssociatedResourceRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteAssociatedResourceRuleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteAssociatedResourceRuleRequest setSettingName(String settingName) {
        this.settingName = settingName;
        return this;
    }
    public String getSettingName() {
        return this.settingName;
    }

}
