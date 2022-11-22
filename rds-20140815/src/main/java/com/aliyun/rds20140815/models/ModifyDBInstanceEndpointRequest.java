// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceEndpointRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DBInstanceEndpointDescription")
    public String DBInstanceEndpointDescription;

    @NameInMap("DBInstanceEndpointId")
    public String DBInstanceEndpointId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

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
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("NodeId")
        public String nodeId;

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
