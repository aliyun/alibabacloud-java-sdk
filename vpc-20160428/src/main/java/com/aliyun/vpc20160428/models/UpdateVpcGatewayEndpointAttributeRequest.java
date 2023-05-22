// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateVpcGatewayEndpointAttributeRequest extends TeaModel {
    /**
     * <p>The region ID of the gateway endpoint.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among all requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system uses **RequestId** as **ClientToken**. The value of **RequestId** of each API request may be different.</p>
     */
    @NameInMap("EndpointDescription")
    public String endpointDescription;

    /**
     * <p>The new description of the gateway endpoint.</p>
     * <br>
     * <p>The description must be 1 to 255 characters in length.</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The access policy for the cloud service.</p>
     * <br>
     * <p>For more information about the syntax and structure of the access policy, see [Policy syntax and structure](~~93739~~).</p>
     */
    @NameInMap("EndpointName")
    public String endpointName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <br>
     * <p>*   **true**: performs a dry run. The system checks your AccessKey pair, the RAM user permissions, and the required parameters If the request fails the dry run, the corresponding error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and sends the request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("PolicyDocument")
    public String policyDocument;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UpdateVpcGatewayEndpointAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpcGatewayEndpointAttributeRequest self = new UpdateVpcGatewayEndpointAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVpcGatewayEndpointAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateVpcGatewayEndpointAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateVpcGatewayEndpointAttributeRequest setEndpointDescription(String endpointDescription) {
        this.endpointDescription = endpointDescription;
        return this;
    }
    public String getEndpointDescription() {
        return this.endpointDescription;
    }

    public UpdateVpcGatewayEndpointAttributeRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public UpdateVpcGatewayEndpointAttributeRequest setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public UpdateVpcGatewayEndpointAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateVpcGatewayEndpointAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateVpcGatewayEndpointAttributeRequest setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }
    public String getPolicyDocument() {
        return this.policyDocument;
    }

    public UpdateVpcGatewayEndpointAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateVpcGatewayEndpointAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateVpcGatewayEndpointAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
