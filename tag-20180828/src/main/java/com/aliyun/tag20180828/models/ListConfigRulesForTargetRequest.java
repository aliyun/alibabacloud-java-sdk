// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListConfigRulesForTargetRequest extends TeaModel {
    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Default value: 50. Maximum value: 1000.</p>
     */
    @NameInMap("MaxResult")
    public Integer maxResult;

    /**
     * <p>The token that is used to start the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The use scenario of the tag policy. This parameter specifies a filter condition for the query. Valid values:</p>
     * <br>
     * <p>*   tags: enables tags with specified tag values to be added to resources.</p>
     * <p>*   rg_inherit: enables resources in a resource group to automatically inherit tags from the resource group.</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>The region ID. Set the value to cn-shanghai.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The tag key. This parameter specifies a filter condition for the query.</p>
     */
    @NameInMap("TagKey")
    public String tagKey;

    /**
     * <p>The ID of the object. This parameter specifies a filter condition for the query.</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The type of the object. This parameter specifies a filter condition for the query. Valid values:</p>
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

    public static ListConfigRulesForTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfigRulesForTargetRequest self = new ListConfigRulesForTargetRequest();
        return TeaModel.build(map, self);
    }

    public ListConfigRulesForTargetRequest setMaxResult(Integer maxResult) {
        this.maxResult = maxResult;
        return this;
    }
    public Integer getMaxResult() {
        return this.maxResult;
    }

    public ListConfigRulesForTargetRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListConfigRulesForTargetRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListConfigRulesForTargetRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListConfigRulesForTargetRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public ListConfigRulesForTargetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListConfigRulesForTargetRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListConfigRulesForTargetRequest setTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public String getTagKey() {
        return this.tagKey;
    }

    public ListConfigRulesForTargetRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public ListConfigRulesForTargetRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public ListConfigRulesForTargetRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
