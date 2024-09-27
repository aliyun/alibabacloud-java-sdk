// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DeleteSourceServerRequest extends TeaModel {
    /**
     * <p>Specifies whether to forcibly delete the migration source. Valid values:</p>
     * <ul>
     * <li>true: forcibly deletes the migration source and the migration job created for the migration source, and releases the intermediate resources of the migration job.</li>
     * <li>false: does not delete the migration source if a migration job is created for the migration source.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Force")
    public Boolean force;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The migration source ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s-bp17m1vi6x20c6g6****</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    public static DeleteSourceServerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSourceServerRequest self = new DeleteSourceServerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSourceServerRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteSourceServerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteSourceServerRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteSourceServerRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

}
