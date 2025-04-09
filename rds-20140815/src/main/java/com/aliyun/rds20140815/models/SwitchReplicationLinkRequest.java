// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchReplicationLinkRequest extends TeaModel {
    /**
     * <p>The ID of the source or primary instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2zecuz9tolf******</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the destination DR instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-t4neh0q12v1******</p>
     */
    @NameInMap("TargetInstanceName")
    public String targetInstanceName;

    /**
     * <p>The ID of the region in which the destination DR instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-1</p>
     */
    @NameInMap("TargetInstanceRegionId")
    public String targetInstanceRegionId;

    public static SwitchReplicationLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchReplicationLinkRequest self = new SwitchReplicationLinkRequest();
        return TeaModel.build(map, self);
    }

    public SwitchReplicationLinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public SwitchReplicationLinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SwitchReplicationLinkRequest setTargetInstanceName(String targetInstanceName) {
        this.targetInstanceName = targetInstanceName;
        return this;
    }
    public String getTargetInstanceName() {
        return this.targetInstanceName;
    }

    public SwitchReplicationLinkRequest setTargetInstanceRegionId(String targetInstanceRegionId) {
        this.targetInstanceRegionId = targetInstanceRegionId;
        return this;
    }
    public String getTargetInstanceRegionId() {
        return this.targetInstanceRegionId;
    }

}
