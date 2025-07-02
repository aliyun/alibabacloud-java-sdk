// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class CreateIpamResourceDiscoveryRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
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
     * <p>Specifies whether to perform a dry run, without sending the actual request. Valid value:</p>
     * <ul>
     * <li><strong>true</strong>: Performs the dry run without creating a custom resource discovery instance. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the DryRunOperation error code is returned.</li>
     * <li><strong>false</strong> (default): Performs a dry run and the actual request. If the request passes the dry run, an HTTP 2xx status code is returned and a custom resource discovery instance is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The description of resource discovery.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("IpamResourceDiscoveryDescription")
    public String ipamResourceDiscoveryDescription;

    /**
     * <p>The name of the resource discovery.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("IpamResourceDiscoveryName")
    public String ipamResourceDiscoveryName;

    /**
     * <p>The list of effective regions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperatingRegionList")
    public java.util.List<String> operatingRegionList;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The request region.</p>
     * <blockquote>
     * <p> The request region is the managed region of the resource discovery instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2sermdd6****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tag information.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateIpamResourceDiscoveryRequestTag> tag;

    public static CreateIpamResourceDiscoveryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpamResourceDiscoveryRequest self = new CreateIpamResourceDiscoveryRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpamResourceDiscoveryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIpamResourceDiscoveryRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateIpamResourceDiscoveryRequest setIpamResourceDiscoveryDescription(String ipamResourceDiscoveryDescription) {
        this.ipamResourceDiscoveryDescription = ipamResourceDiscoveryDescription;
        return this;
    }
    public String getIpamResourceDiscoveryDescription() {
        return this.ipamResourceDiscoveryDescription;
    }

    public CreateIpamResourceDiscoveryRequest setIpamResourceDiscoveryName(String ipamResourceDiscoveryName) {
        this.ipamResourceDiscoveryName = ipamResourceDiscoveryName;
        return this;
    }
    public String getIpamResourceDiscoveryName() {
        return this.ipamResourceDiscoveryName;
    }

    public CreateIpamResourceDiscoveryRequest setOperatingRegionList(java.util.List<String> operatingRegionList) {
        this.operatingRegionList = operatingRegionList;
        return this;
    }
    public java.util.List<String> getOperatingRegionList() {
        return this.operatingRegionList;
    }

    public CreateIpamResourceDiscoveryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateIpamResourceDiscoveryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateIpamResourceDiscoveryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateIpamResourceDiscoveryRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateIpamResourceDiscoveryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateIpamResourceDiscoveryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateIpamResourceDiscoveryRequest setTag(java.util.List<CreateIpamResourceDiscoveryRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateIpamResourceDiscoveryRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateIpamResourceDiscoveryRequestTag extends TeaModel {
        /**
         * <p>The tag keys. You can specify at most 20 tag keys. It cannot be an empty string.</p>
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

        public static CreateIpamResourceDiscoveryRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateIpamResourceDiscoveryRequestTag self = new CreateIpamResourceDiscoveryRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateIpamResourceDiscoveryRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateIpamResourceDiscoveryRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
