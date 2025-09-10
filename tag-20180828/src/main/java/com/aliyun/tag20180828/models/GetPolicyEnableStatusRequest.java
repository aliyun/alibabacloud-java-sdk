// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class GetPolicyEnableStatusRequest extends TeaModel {
    /**
     * <p>The enabling type. Valid values:</p>
     * <ul>
     * <li>TAG_POLICY: the Tag Policy feature.</li>
     * <li>VERIFY_NO_TAG: the strong verification feature.</li>
     * <li>TAG_POLICY_NOTIFY: the notification feature that sends notifications for resources found to be non-compliant with the tag policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TAG_POLICY</p>
     */
    @NameInMap("OpenType")
    public String openType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. Set the value to cn-shanghai.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    /**
     * <p>The mode of the Tag Policy feature. This parameter specifies a filter condition for the query. Valid values:</p>
     * <ul>
     * <li>USER: single-account mode</li>
     * <li>RD: multi-account mode</li>
     * </ul>
     * <p>For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.</p>
     * <blockquote>
     * <p> The value of this parameter is not case-sensitive.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>RD</p>
     */
    @NameInMap("UserType")
    public String userType;

    public static GetPolicyEnableStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyEnableStatusRequest self = new GetPolicyEnableStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetPolicyEnableStatusRequest setOpenType(String openType) {
        this.openType = openType;
        return this;
    }
    public String getOpenType() {
        return this.openType;
    }

    public GetPolicyEnableStatusRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GetPolicyEnableStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetPolicyEnableStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetPolicyEnableStatusRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetPolicyEnableStatusRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetPolicyEnableStatusRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
