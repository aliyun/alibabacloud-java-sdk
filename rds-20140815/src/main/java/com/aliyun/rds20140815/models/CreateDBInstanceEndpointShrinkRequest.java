// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceEndpointShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <br>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The prefix of the internal endpoint.</p>
     * <br>
     * <p>When you create any type of endpoint, an internal endpoint is automatically created for the endpoint. This parameter specifies the prefix of the internal endpoint.</p>
     */
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    /**
     * <p>The user-defined description of the endpoint.</p>
     */
    @NameInMap("DBInstanceEndpointDescription")
    public String DBInstanceEndpointDescription;

    /**
     * <p>The type of the endpoint. Valid values:</p>
     * <br>
     * <p>*   Primary: read/write endpoint of the instance</p>
     * <p>*   Readonly: read-only endpoint of the instance</p>
     */
    @NameInMap("DBInstanceEndpointType")
    public String DBInstanceEndpointType;

    /**
     * <p>The ID of the instance. You can call the [DescribeDBInstances](~~26232~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The node that is configured for the endpoint.</p>
     */
    @NameInMap("NodeItems")
    public String nodeItemsShrink;

    /**
     * <p>The port number of the internal endpoint. You can specify the port number for the internal endpoint.</p>
     * <br>
     * <p>Valid values: 3000 to 5999.</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The IP address of the internal endpoint.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The vSwitch ID of the internal endpoint.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The virtual private cloud (VPC) ID of the internal endpoint.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateDBInstanceEndpointShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceEndpointShrinkRequest self = new CreateDBInstanceEndpointShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceEndpointShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBInstanceEndpointShrinkRequest setConnectionStringPrefix(String connectionStringPrefix) {
        this.connectionStringPrefix = connectionStringPrefix;
        return this;
    }
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    public CreateDBInstanceEndpointShrinkRequest setDBInstanceEndpointDescription(String DBInstanceEndpointDescription) {
        this.DBInstanceEndpointDescription = DBInstanceEndpointDescription;
        return this;
    }
    public String getDBInstanceEndpointDescription() {
        return this.DBInstanceEndpointDescription;
    }

    public CreateDBInstanceEndpointShrinkRequest setDBInstanceEndpointType(String DBInstanceEndpointType) {
        this.DBInstanceEndpointType = DBInstanceEndpointType;
        return this;
    }
    public String getDBInstanceEndpointType() {
        return this.DBInstanceEndpointType;
    }

    public CreateDBInstanceEndpointShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateDBInstanceEndpointShrinkRequest setNodeItemsShrink(String nodeItemsShrink) {
        this.nodeItemsShrink = nodeItemsShrink;
        return this;
    }
    public String getNodeItemsShrink() {
        return this.nodeItemsShrink;
    }

    public CreateDBInstanceEndpointShrinkRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public CreateDBInstanceEndpointShrinkRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateDBInstanceEndpointShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDBInstanceEndpointShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDBInstanceEndpointShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateDBInstanceEndpointShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
