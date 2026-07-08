// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListAssociatedResourceRulesRequest extends TeaModel {
    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Default Value: 50. Maximum Value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResult")
    public Integer maxResult;

    /**
     * <p>The token returned from a previous call to retrieve the next page of results.</p>
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
     * <p>The Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The names of the associated resource rules.</p>
     */
    @NameInMap("SettingName")
    public java.util.List<String> settingName;

    /**
     * <p>The status of the associated resource rules to query. Valid values:</p>
     * <ul>
     * <li><p>Enable: The rule is enabled.</p>
     * </li>
     * <li><p>Disable: The rule is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListAssociatedResourceRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAssociatedResourceRulesRequest self = new ListAssociatedResourceRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListAssociatedResourceRulesRequest setMaxResult(Integer maxResult) {
        this.maxResult = maxResult;
        return this;
    }
    public Integer getMaxResult() {
        return this.maxResult;
    }

    public ListAssociatedResourceRulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAssociatedResourceRulesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListAssociatedResourceRulesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListAssociatedResourceRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAssociatedResourceRulesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListAssociatedResourceRulesRequest setSettingName(java.util.List<String> settingName) {
        this.settingName = settingName;
        return this;
    }
    public java.util.List<String> getSettingName() {
        return this.settingName;
    }

    public ListAssociatedResourceRulesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
