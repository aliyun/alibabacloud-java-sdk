// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteReplicationLinkRequest extends TeaModel {
    /**
     * <p>The ID of the DR instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-bp1trqb4p1xd****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Specifies whether to delete the data synchronization link between the DR instance and the primary instance and promote the DR instance to the primary instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PromoteToMaster")
    public Boolean promoteToMaster;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteReplicationLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteReplicationLinkRequest self = new DeleteReplicationLinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteReplicationLinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DeleteReplicationLinkRequest setPromoteToMaster(Boolean promoteToMaster) {
        this.promoteToMaster = promoteToMaster;
        return this;
    }
    public Boolean getPromoteToMaster() {
        return this.promoteToMaster;
    }

    public DeleteReplicationLinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
