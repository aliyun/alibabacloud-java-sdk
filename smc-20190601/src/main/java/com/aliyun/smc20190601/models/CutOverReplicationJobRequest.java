// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class CutOverReplicationJobRequest extends TeaModel {
    /**
     * <p>The ID of the incremental migration job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>j-bp1fnx5y3djc4cop****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>Specifies whether to migrate full data for the last time. Valid Values:</p>
     * <ul>
     * <li>true: migrates full data for the last time.</li>
     * <li>false: does not migrate full data for the last time.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SyncData")
    public Boolean syncData;

    public static CutOverReplicationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CutOverReplicationJobRequest self = new CutOverReplicationJobRequest();
        return TeaModel.build(map, self);
    }

    public CutOverReplicationJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CutOverReplicationJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CutOverReplicationJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CutOverReplicationJobRequest setSyncData(Boolean syncData) {
        this.syncData = syncData;
        return this;
    }
    public Boolean getSyncData() {
        return this.syncData;
    }

}
