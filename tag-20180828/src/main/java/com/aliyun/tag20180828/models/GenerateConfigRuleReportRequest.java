// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class GenerateConfigRuleReportRequest extends TeaModel {
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

    /**
     * <p>The ID of the object.</p>
     * 
     * <strong>example:</strong>
     * <p>154950938137****</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The type of the object. Valid values:</p>
     * <ul>
     * <li>USER: the current logon account. This value is available if you use the Tag Policy feature in single-account mode.</li>
     * <li>ROOT: the Root folder in a resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</li>
     * <li>FOLDER: a folder other than the Root folder in a resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</li>
     * <li>ACCOUNT: a member in a resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</li>
     * </ul>
     * <blockquote>
     * <p> The value of this parameter is not case-sensitive.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ACCOUNT</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The mode of the Tag Policy feature. Valid values:</p>
     * <ul>
     * <li>USER: single-account mode</li>
     * <li>RD: multi-account mode</li>
     * </ul>
     * <p>For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.</p>
     * <blockquote>
     * <p> This parameter is required if the management account of your resource directory is used to enable the Tag Policy feature in both single-account mode and multi-account mode. The value of this parameter is not case-sensitive.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("UserType")
    public String userType;

    public static GenerateConfigRuleReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateConfigRuleReportRequest self = new GenerateConfigRuleReportRequest();
        return TeaModel.build(map, self);
    }

    public GenerateConfigRuleReportRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GenerateConfigRuleReportRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GenerateConfigRuleReportRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GenerateConfigRuleReportRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GenerateConfigRuleReportRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public GenerateConfigRuleReportRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public GenerateConfigRuleReportRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
