// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceEndpointRequest extends TeaModel {
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
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    /**
     * <p>The user-defined description of the endpoint.</p>
     */
    @NameInMap("DBInstanceEndpointDescription")
    public String DBInstanceEndpointDescription;

    /**
     * <p>The endpoint type. Valid values:</p>
     * <br>
     * <p>*   Primary: read/write endpoint of the instance</p>
     * <p>*   Readonly: read-only endpoint of the instance</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceEndpointType")
    public String DBInstanceEndpointType;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The information about the endpoint.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeItems")
    public java.util.List<CreateDBInstanceEndpointRequestNodeItems> nodeItems;

    /**
     * <p>The port number of the internal endpoint. You can specify the port number for the internal endpoint.</p>
     * <br>
     * <p>Valid values: 3000 to 5999.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The IP address of the internal endpoint.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The resource group ID. You can call the DescribeDBInstanceAttribute operation to obtain the ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The vSwitch ID of the internal endpoint.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC ID of the internal endpoint.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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

    public CreateDBInstanceEndpointRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The node ID.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The weight of the node. Read requests are distributed based on the weight.</p>
         * <br>
         * <p>Valid values: 0 to 100.</p>
         */
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
