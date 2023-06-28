// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ListTLSCipherPoliciesRequest extends TeaModel {
    /**
     * <p>The name of the TLS policy. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.</p>
     */
    @NameInMap("IncludeListener")
    public Boolean includeListener;

    /**
     * <p>The timestamp generated when the TLS policy is created.</p>
     */
    @NameInMap("MaxItems")
    public Integer maxItems;

    /**
     * <p>The status of the TLS policy. Valid values:</p>
     * <br>
     * <p>*   **configuring**: The TLS policy is being configured.</p>
     * <p>*   **normal**: The TLS policy works as expected.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the TLS policy.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The list of TLS policies.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the TLS policy.</p>
     */
    @NameInMap("TLSCipherPolicyId")
    public String TLSCipherPolicyId;

    public static ListTLSCipherPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTLSCipherPoliciesRequest self = new ListTLSCipherPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListTLSCipherPoliciesRequest setIncludeListener(Boolean includeListener) {
        this.includeListener = includeListener;
        return this;
    }
    public Boolean getIncludeListener() {
        return this.includeListener;
    }

    public ListTLSCipherPoliciesRequest setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public Integer getMaxItems() {
        return this.maxItems;
    }

    public ListTLSCipherPoliciesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListTLSCipherPoliciesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTLSCipherPoliciesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListTLSCipherPoliciesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTLSCipherPoliciesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTLSCipherPoliciesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTLSCipherPoliciesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListTLSCipherPoliciesRequest setTLSCipherPolicyId(String TLSCipherPolicyId) {
        this.TLSCipherPolicyId = TLSCipherPolicyId;
        return this;
    }
    public String getTLSCipherPolicyId() {
        return this.TLSCipherPolicyId;
    }

}
