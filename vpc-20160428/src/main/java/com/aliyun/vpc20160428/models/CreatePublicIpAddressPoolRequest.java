// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePublicIpAddressPoolRequest extends TeaModel {
    /**
     * <p>The service type of the IP address pool. Valid values:</p>
     * <br>
     * <p>*   **CloudBox** Only cloud box users can select this type.</p>
     * <p>*   **Default**: This is the default value.</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate a value, and you must make sure that each request has a unique token value. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the value of **RequestId** as the value of **ClientToken**. The value of **RequestId** for each API request is different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the IP address pool.</p>
     * <br>
     * <p>This parameter is optional. The description must be 2 to 256 characters in length, and cannot start with http:// or https://.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to precheck only this request. Valid values:</p>
     * <br>
     * <p>*   **true**: prechecks the request without creating an IP address pool. The system checks the required parameters, request format, and service limits. If the request fails to pass the precheck, an error code is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false**: sends the request. This is the default value. If the request passes the precheck, a 2xx HTTP status code is returned and the IP address pool is created.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The line type. Valid values:</p>
     * <br>
     * <p>*   **BGP** (default)</p>
     * <p>*   **BGP_PRO**</p>
     * <br>
     * <p>For more information about BGP (Multi-ISP) lines and BGP (Multi-ISP) Pro lines, see the "Line types" section in the [What is EIP?](https://help.aliyun.com/document_detail/32321.html) topic.</p>
     * <br>
     * <p>*   If you are allowed to use single-ISP bandwidth, you can also use one of the following values:</p>
     * <br>
     * <p>    *   **ChinaTelecom**</p>
     * <p>    *   **ChinaUnicom**</p>
     * <p>    *   **ChinaMobile**</p>
     * <p>    *   **ChinaTelecom_L2**</p>
     * <p>    *   **ChinaUnicom_L2**</p>
     * <p>    *   **ChinaMobile_L2**</p>
     * <br>
     * <p>*   If your services are deployed in China East 1 Finance, this parameter is required and you must set the value to **BGP_FinanceCloud**.</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>The name of the IP address pool.</p>
     * <br>
     * <p>This parameter is optional. The name must be 1 to 128 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where you want to create the IP address pool.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the IP address pool belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The editions of Anti-DDoS.</p>
     * <p>- If you do not specify this parameter, Anti-DDoS Origin Basic is used.</p>
     * <p>- If you set the parameter to AntiDDoS_Enhanced, Anti-DDoS Pro/Premium is used.</p>
     */
    @NameInMap("SecurityProtectionTypes")
    public java.util.List<String> securityProtectionTypes;

    /**
     * <p>The tag of the resource.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreatePublicIpAddressPoolRequestTag> tag;

    /**
     * <p>The zone of the IP address pool. If you set **BizType** to **CloudBox**, this parameter is required.</p>
     */
    @NameInMap("Zones")
    public java.util.List<String> zones;

    public static CreatePublicIpAddressPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePublicIpAddressPoolRequest self = new CreatePublicIpAddressPoolRequest();
        return TeaModel.build(map, self);
    }

    public CreatePublicIpAddressPoolRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreatePublicIpAddressPoolRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreatePublicIpAddressPoolRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePublicIpAddressPoolRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreatePublicIpAddressPoolRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public CreatePublicIpAddressPoolRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePublicIpAddressPoolRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreatePublicIpAddressPoolRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreatePublicIpAddressPoolRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePublicIpAddressPoolRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreatePublicIpAddressPoolRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreatePublicIpAddressPoolRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreatePublicIpAddressPoolRequest setSecurityProtectionTypes(java.util.List<String> securityProtectionTypes) {
        this.securityProtectionTypes = securityProtectionTypes;
        return this;
    }
    public java.util.List<String> getSecurityProtectionTypes() {
        return this.securityProtectionTypes;
    }

    public CreatePublicIpAddressPoolRequest setTag(java.util.List<CreatePublicIpAddressPoolRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreatePublicIpAddressPoolRequestTag> getTag() {
        return this.tag;
    }

    public CreatePublicIpAddressPoolRequest setZones(java.util.List<String> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<String> getZones() {
        return this.zones;
    }

    public static class CreatePublicIpAddressPoolRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <br>
         * <p>A tag key can be up to 128 characters in length. It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length. It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreatePublicIpAddressPoolRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreatePublicIpAddressPoolRequestTag self = new CreatePublicIpAddressPoolRequestTag();
            return TeaModel.build(map, self);
        }

        public CreatePublicIpAddressPoolRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreatePublicIpAddressPoolRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
