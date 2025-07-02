// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class CreateIpamScopeRequest extends TeaModel {
    /**
     * <p>The client token used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including invalid AccessKey pairs, unauthorized RAM users, and missing parameter values. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong>: performs a dry run and the actual request. After the request passes the dry run, a 2xx HTTP status code is returned and the IPAM scope is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the IPAM.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-ccxbnsbhew0d6t****</p>
     */
    @NameInMap("IpamId")
    public String ipamId;

    /**
     * <p>The description of the IPAM scope.</p>
     * <p>It must be 1 to 256 characters in length. It must start with a letter but cannot start with <code>http://</code> or <code>https://</code>. This parameter is empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>test description</p>
     */
    @NameInMap("IpamScopeDescription")
    public String ipamScopeDescription;

    /**
     * <p>The name of the IPAM scope.</p>
     * <p>It must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("IpamScopeName")
    public String ipamScopeName;

    /**
     * <p>The type of IPAM scope: <strong>private</strong></p>
     * <p><strong>Usage notes</strong> You can create only private IPAM scopes.</p>
     * 
     * <strong>example:</strong>
     * <p>private</p>
     */
    @NameInMap("IpamScopeType")
    public String ipamScopeType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the IPAM instance is hosted. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID of the IPAM scope.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph6aiy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tag list.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateIpamScopeRequestTag> tag;

    public static CreateIpamScopeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpamScopeRequest self = new CreateIpamScopeRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpamScopeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIpamScopeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateIpamScopeRequest setIpamId(String ipamId) {
        this.ipamId = ipamId;
        return this;
    }
    public String getIpamId() {
        return this.ipamId;
    }

    public CreateIpamScopeRequest setIpamScopeDescription(String ipamScopeDescription) {
        this.ipamScopeDescription = ipamScopeDescription;
        return this;
    }
    public String getIpamScopeDescription() {
        return this.ipamScopeDescription;
    }

    public CreateIpamScopeRequest setIpamScopeName(String ipamScopeName) {
        this.ipamScopeName = ipamScopeName;
        return this;
    }
    public String getIpamScopeName() {
        return this.ipamScopeName;
    }

    public CreateIpamScopeRequest setIpamScopeType(String ipamScopeType) {
        this.ipamScopeType = ipamScopeType;
        return this;
    }
    public String getIpamScopeType() {
        return this.ipamScopeType;
    }

    public CreateIpamScopeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateIpamScopeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateIpamScopeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateIpamScopeRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateIpamScopeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateIpamScopeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateIpamScopeRequest setTag(java.util.List<CreateIpamScopeRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateIpamScopeRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateIpamScopeRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource. You can specify at most 20 tag keys. It cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter but cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify up to 20 tag values. You can specify empty strings as tag values.</p>
         * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateIpamScopeRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateIpamScopeRequestTag self = new CreateIpamScopeRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateIpamScopeRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateIpamScopeRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
