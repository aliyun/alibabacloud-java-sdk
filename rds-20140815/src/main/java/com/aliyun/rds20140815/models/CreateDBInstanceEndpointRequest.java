// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceEndpointRequest extends TeaModel {
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
    public java.util.List<CreateDBInstanceEndpointRequestNodeItems> nodeItems;

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

    public static CreateDBInstanceEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceEndpointRequest self = new CreateDBInstanceEndpointRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBInstanceEndpointRequest setConnectionStringPrefix(String connectionStringPrefix) {
        this.connectionStringPrefix = connectionStringPrefix;
        return this;
    }
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    public CreateDBInstanceEndpointRequest setDBInstanceEndpointDescription(String DBInstanceEndpointDescription) {
        this.DBInstanceEndpointDescription = DBInstanceEndpointDescription;
        return this;
    }
    public String getDBInstanceEndpointDescription() {
        return this.DBInstanceEndpointDescription;
    }

    public CreateDBInstanceEndpointRequest setDBInstanceEndpointType(String DBInstanceEndpointType) {
        this.DBInstanceEndpointType = DBInstanceEndpointType;
        return this;
    }
    public String getDBInstanceEndpointType() {
        return this.DBInstanceEndpointType;
    }

    public CreateDBInstanceEndpointRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateDBInstanceEndpointRequest setNodeItems(java.util.List<CreateDBInstanceEndpointRequestNodeItems> nodeItems) {
        this.nodeItems = nodeItems;
        return this;
    }
    public java.util.List<CreateDBInstanceEndpointRequestNodeItems> getNodeItems() {
        return this.nodeItems;
    }

    public CreateDBInstanceEndpointRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public CreateDBInstanceEndpointRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateDBInstanceEndpointRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDBInstanceEndpointRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateDBInstanceEndpointRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class CreateDBInstanceEndpointRequestNodeItems extends TeaModel {
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("Weight")
        public Long weight;

        public static CreateDBInstanceEndpointRequestNodeItems build(java.util.Map<String, ?> map) throws Exception {
            CreateDBInstanceEndpointRequestNodeItems self = new CreateDBInstanceEndpointRequestNodeItems();
            return TeaModel.build(map, self);
        }

        public CreateDBInstanceEndpointRequestNodeItems setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public CreateDBInstanceEndpointRequestNodeItems setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public CreateDBInstanceEndpointRequestNodeItems setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

    }

}
