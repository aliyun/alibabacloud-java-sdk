// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceEndpointRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <br>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The user-defined description of the endpoint.</p>
     */
    @NameInMap("DBInstanceEndpointDescription")
    public String DBInstanceEndpointDescription;

    /**
     * <p>The endpoint ID of the instance. You can call the DescribeDBInstanceEndpoints operation to query the endpoint ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceEndpointId")
    public String DBInstanceEndpointId;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The information about the endpoint.</p>
     */
    @NameInMap("NodeItems")
    public java.util.List<ModifyDBInstanceEndpointRequestNodeItems> nodeItems;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDBInstanceEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceEndpointRequest self = new ModifyDBInstanceEndpointRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDBInstanceEndpointRequest setDBInstanceEndpointDescription(String DBInstanceEndpointDescription) {
        this.DBInstanceEndpointDescription = DBInstanceEndpointDescription;
        return this;
    }
    public String getDBInstanceEndpointDescription() {
        return this.DBInstanceEndpointDescription;
    }

    public ModifyDBInstanceEndpointRequest setDBInstanceEndpointId(String DBInstanceEndpointId) {
        this.DBInstanceEndpointId = DBInstanceEndpointId;
        return this;
    }
    public String getDBInstanceEndpointId() {
        return this.DBInstanceEndpointId;
    }

    public ModifyDBInstanceEndpointRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceEndpointRequest setNodeItems(java.util.List<ModifyDBInstanceEndpointRequestNodeItems> nodeItems) {
        this.nodeItems = nodeItems;
        return this;
    }
    public java.util.List<ModifyDBInstanceEndpointRequestNodeItems> getNodeItems() {
        return this.nodeItems;
    }

    public ModifyDBInstanceEndpointRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class ModifyDBInstanceEndpointRequestNodeItems extends TeaModel {
        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The node ID.</p>
         * <br>
         * <p>You can query the node ID by using the following methods:</p>
         * <br>
         * <p>*   Log on the ApsaraDB RDS console, go to the instance details page, and then view the ID of the node in the instance topology in the lower part of the instance details page.</p>
         * <p>*   Call the DescribeDBInstanceAttribute operation to query the node ID.</p>
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

        public static ModifyDBInstanceEndpointRequestNodeItems build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBInstanceEndpointRequestNodeItems self = new ModifyDBInstanceEndpointRequestNodeItems();
            return TeaModel.build(map, self);
        }

        public ModifyDBInstanceEndpointRequestNodeItems setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public ModifyDBInstanceEndpointRequestNodeItems setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ModifyDBInstanceEndpointRequestNodeItems setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

    }

}
