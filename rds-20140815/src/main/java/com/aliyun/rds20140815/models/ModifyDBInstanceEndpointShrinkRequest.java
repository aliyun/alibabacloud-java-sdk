// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceEndpointShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The user-defined description of the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>for readonly business</p>
     */
    @NameInMap("DBInstanceEndpointDescription")
    public String DBInstanceEndpointDescription;

    /**
     * <p>The endpoint ID of the instance. You can call the DescribeDBInstanceEndpoints operation to query the endpoint ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ep-****</p>
     */
    @NameInMap("DBInstanceEndpointId")
    public String DBInstanceEndpointId;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The information about the endpoint.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
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
