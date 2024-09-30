// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListPoliciesRequest extends TeaModel {
    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Default value: 50. Maximum value: 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResult")
    public Integer maxResult;

    /**
     * <p>The token that is used to start the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of a tag policy. This parameter specifies a filter condition for the query.</p>
     */
    @NameInMap("PolicyIds")
    public java.util.List<String> policyIds;

    /**
     * <p>The name of a tag policy. This parameter specifies a filter condition for the query.</p>
     */
    @NameInMap("PolicyNames")
    public java.util.List<String> policyNames;

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
     * <p>USER</p>
     */
    @NameInMap("UserType")
    public String userType;

    public static ListPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesRequest self = new ListPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListPoliciesRequest setMaxResult(Integer maxResult) {
        this.maxResult = maxResult;
        return this;
    }
    public Integer getMaxResult() {
        return this.maxResult;
    }

    public ListPoliciesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPoliciesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListPoliciesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListPoliciesRequest setPolicyIds(java.util.List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }
    public java.util.List<String> getPolicyIds() {
        return this.policyIds;
    }

    public ListPoliciesRequest setPolicyNames(java.util.List<String> policyNames) {
        this.policyNames = policyNames;
        return this;
    }
    public java.util.List<String> getPolicyNames() {
        return this.policyNames;
    }

    public ListPoliciesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListPoliciesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListPoliciesRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
