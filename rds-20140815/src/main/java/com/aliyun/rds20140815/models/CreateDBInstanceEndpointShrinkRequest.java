// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceEndpointShrinkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    @NameInMap("DBInstanceEndpointDescription")
    public String DBInstanceEndpointDescription;

    @NameInMap("DBInstanceEndpointType")
    public String DBInstanceEndpointType;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("NodeItems")
    public String nodeItemsShrink;

    @NameInMap("Port")
    public String port;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

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
