// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class GetConfigRuleReportRequest extends TeaModel {
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

    /**
     * <p>The ID of the object.</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The type of the object. Valid values:</p>
     * <br>
     * <p>*   USER: the current logon account. This value is available if you use the Tag Policy feature in single-account mode.</p>
     * <p>*   ROOT: the Root folder in a resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</p>
     * <p>*   FOLDER: a folder other than the Root folder in a resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</p>
     * <p>*   ACCOUNT: a member in a resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</p>
     * <br>
     * <p>>  The value of this parameter is not case-sensitive.</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The mode of the Tag Policy feature. Valid values:</p>
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

    public static GetConfigRuleReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConfigRuleReportRequest self = new GetConfigRuleReportRequest();
        return TeaModel.build(map, self);
    }

    public GetConfigRuleReportRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GetConfigRuleReportRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetConfigRuleReportRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetConfigRuleReportRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetConfigRuleReportRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public GetConfigRuleReportRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public GetConfigRuleReportRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
