// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateCustomerGatewayRequest extends TeaModel {
    /**
     * <p>The autonomous system number (ASN) of the gateway device in the data center.</p>
     * <br>
     * <p>**Asn** is a 4-byte number. You can enter the number in two segments and separate the first 16 bits from the following 16 bits with a period (.). Enter the number in each segment in the decimal format.</p>
     * <br>
     * <p>For example, if you enter 123.456, the ASN is: 123 × 65536 + 456 = 8061384.</p>
     */
    @NameInMap("Asn")
    public String asn;

    /**
     * <p>The authentication key of the BGP routing protocol for the gateway device in the data center.</p>
     * <br>
     * <p>The key must be 1 to 64 characters in length. It can contain only ASCII characters and cannot contain spaces or question marks (?).</p>
     */
    @NameInMap("AuthKey")
    public String authKey;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the customer gateway.</p>
     * <br>
     * <p>The description must be 1 to 100 characters in length, and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The public IP address of the gateway device in the data center.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IpAddress")
    public String ipAddress;

    /**
     * <p>The name of the customer gateway.</p>
     * <br>
     * <p>The name must be 1 to 100 characters in length, and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the customer gateway.</p>
     * <br>
     * <p>You can call the [DescribeRegions](https://help.aliyun.com/document_detail/36063.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the customer gateway belongs.</p>
     * <br>
     * <p>- You can call the [ListResourceGroups](https://help.aliyun.com/document_detail/158855.html) operation to query the resource group list.</p>
     * <br>
     * <p>- If you do not specify a resource group, the customer gateway will belong to the default resource group after being created.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tag value.</p>
     * <br>
     * <p>The tag value can be an empty string and cannot exceed 128 characters in length. It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.</p>
     * <br>
     * <p>Each tag key corresponds to one tag value. You can specify up to 20 tag values in each call.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateCustomerGatewayRequestTags> tags;

    public static CreateCustomerGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomerGatewayRequest self = new CreateCustomerGatewayRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomerGatewayRequest setAsn(String asn) {
        this.asn = asn;
        return this;
    }
    public String getAsn() {
        return this.asn;
    }

    public CreateCustomerGatewayRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public CreateCustomerGatewayRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCustomerGatewayRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCustomerGatewayRequest setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public CreateCustomerGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCustomerGatewayRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateCustomerGatewayRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCustomerGatewayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCustomerGatewayRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateCustomerGatewayRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateCustomerGatewayRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateCustomerGatewayRequest setTags(java.util.List<CreateCustomerGatewayRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateCustomerGatewayRequestTags> getTags() {
        return this.tags;
    }

    public static class CreateCustomerGatewayRequestTags extends TeaModel {
        /**
         * <p>The tag key. The tag key cannot be an empty string.</p>
         * <br>
         * <p>It can be at most 64 characters in length, and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.</p>
         * <br>
         * <p>You can specify at most 20 tag keys in each call.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <br>
         * <p>The tag value can be an empty string and cannot exceed 128 characters in length. It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.</p>
         * <br>
         * <p>Each tag key corresponds to one tag value. You can specify at most 20 tag values in each call.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateCustomerGatewayRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomerGatewayRequestTags self = new CreateCustomerGatewayRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateCustomerGatewayRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateCustomerGatewayRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
