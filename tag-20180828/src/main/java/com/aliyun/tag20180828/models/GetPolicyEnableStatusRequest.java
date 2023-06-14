// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class GetPolicyEnableStatusRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. Set the value to cn-shanghai.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    /**
     * <p>The mode of the Tag Policy feature. This parameter specifies a filter condition for the query. Valid values:</p>
     * <br>
     * <p>*   USER: single-account mode</p>
     * <p>*   RD: multi-account mode</p>
     * <br>
     * <p>For more information about the modes of the Tag Policy feature, see [Modes of the Tag Policy feature](~~417434~~).</p>
     * <br>
     * <p>>  The value of this parameter is not case-sensitive.</p>
     */
    @NameInMap("UserType")
    public String userType;

    public static GetPolicyEnableStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyEnableStatusRequest self = new GetPolicyEnableStatusRequest();
        return TeaModel.build(map, self);
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
