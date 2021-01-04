// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class CutOverReplicationJobRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("SyncData")
    public Boolean syncData;

    public static CutOverReplicationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CutOverReplicationJobRequest self = new CutOverReplicationJobRequest();
        return TeaModel.build(map, self);
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

    public CutOverReplicationJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CutOverReplicationJobRequest setSyncData(Boolean syncData) {
        this.syncData = syncData;
        return this;
    }
    public Boolean getSyncData() {
        return this.syncData;
    }

}
