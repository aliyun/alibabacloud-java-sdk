// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceEndpointShrinkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DBInstanceEndpointDescription")
    public String DBInstanceEndpointDescription;

    @NameInMap("DBInstanceEndpointId")
    public String DBInstanceEndpointId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("NodeItems")
    public String nodeItemsShrink;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDBInstanceEndpointShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceEndpointShrinkRequest self = new ModifyDBInstanceEndpointShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceEndpointShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDBInstanceEndpointShrinkRequest setDBInstanceEndpointDescription(String DBInstanceEndpointDescription) {
        this.DBInstanceEndpointDescription = DBInstanceEndpointDescription;
        return this;
    }
    public String getDBInstanceEndpointDescription() {
        return this.DBInstanceEndpointDescription;
    }

    public ModifyDBInstanceEndpointShrinkRequest setDBInstanceEndpointId(String DBInstanceEndpointId) {
        this.DBInstanceEndpointId = DBInstanceEndpointId;
        return this;
    }
    public String getDBInstanceEndpointId() {
        return this.DBInstanceEndpointId;
    }

    public ModifyDBInstanceEndpointShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceEndpointShrinkRequest setNodeItemsShrink(String nodeItemsShrink) {
        this.nodeItemsShrink = nodeItemsShrink;
        return this;
    }
    public String getNodeItemsShrink() {
        return this.nodeItemsShrink;
    }

    public ModifyDBInstanceEndpointShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
