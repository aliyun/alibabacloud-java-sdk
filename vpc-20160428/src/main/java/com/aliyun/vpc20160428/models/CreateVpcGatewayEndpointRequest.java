// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpcGatewayEndpointRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. **ClientToken** can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system uses **RequestId** as **ClientToken**. The value of **RequestId** of each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <br>
     * <p>*   **true**: performs a dry run. The system checks your AccessKey pair, the RAM user permissions, and the required parameters If the request fails the dry run, the corresponding error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and sends the request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The description of the gateway endpoint.</p>
     * <br>
     * <p>The description must be 1 to 255 characters in length.</p>
     */
    @NameInMap("EndpointDescription")
    public String endpointDescription;

    /**
     * <p>The name of the gateway endpoint.</p>
     * <br>
     * <p>The name must be 1 to 128 characters in length.</p>
     */
    @NameInMap("EndpointName")
    public String endpointName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The access policy for the cloud service.</p>
     * <br>
     * <p>For more information about the syntax and structure of the access policy, see [Policy syntax and structure](~~93739~~).</p>
     */
    @NameInMap("PolicyDocument")
    public String policyDocument;

    /**
     * <p>The region ID of the gateway endpoint.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The name of the endpoint service.</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("Tag")
    public java.util.List<CreateVpcGatewayEndpointRequestTag> tag;

    /**
     * <p>The ID of the virtual private cloud (VPC) where you want to create the gateway endpoint.</p>
     * <br>
     * <p>The VPC and gateway endpoint must be deployed in the same region.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateVpcGatewayEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcGatewayEndpointRequest self = new CreateVpcGatewayEndpointRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpcGatewayEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVpcGatewayEndpointRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateVpcGatewayEndpointRequest setEndpointDescription(String endpointDescription) {
        this.endpointDescription = endpointDescription;
        return this;
    }
    public String getEndpointDescription() {
        return this.endpointDescription;
    }

    public CreateVpcGatewayEndpointRequest setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public CreateVpcGatewayEndpointRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateVpcGatewayEndpointRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateVpcGatewayEndpointRequest setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }
    public String getPolicyDocument() {
        return this.policyDocument;
    }

    public CreateVpcGatewayEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVpcGatewayEndpointRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateVpcGatewayEndpointRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateVpcGatewayEndpointRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateVpcGatewayEndpointRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CreateVpcGatewayEndpointRequest setTag(java.util.List<CreateVpcGatewayEndpointRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateVpcGatewayEndpointRequestTag> getTag() {
        return this.tag;
    }

    public CreateVpcGatewayEndpointRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class CreateVpcGatewayEndpointRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateVpcGatewayEndpointRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateVpcGatewayEndpointRequestTag self = new CreateVpcGatewayEndpointRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateVpcGatewayEndpointRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateVpcGatewayEndpointRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
