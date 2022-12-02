// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerProtectionRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DeletionProtectionEnabled")
    public Boolean deletionProtectionEnabled;

    @NameInMap("DeletionProtectionReason")
    public String deletionProtectionReason;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("ModificationProtectionReason")
    public String modificationProtectionReason;

    @NameInMap("ModificationProtectionStatus")
    public String modificationProtectionStatus;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateLoadBalancerProtectionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerProtectionRequest self = new UpdateLoadBalancerProtectionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerProtectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateLoadBalancerProtectionRequest setDeletionProtectionEnabled(Boolean deletionProtectionEnabled) {
        this.deletionProtectionEnabled = deletionProtectionEnabled;
        return this;
    }
    public Boolean getDeletionProtectionEnabled() {
        return this.deletionProtectionEnabled;
    }

    public UpdateLoadBalancerProtectionRequest setDeletionProtectionReason(String deletionProtectionReason) {
        this.deletionProtectionReason = deletionProtectionReason;
        return this;
    }
    public String getDeletionProtectionReason() {
        return this.deletionProtectionReason;
    }

    public UpdateLoadBalancerProtectionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateLoadBalancerProtectionRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public UpdateLoadBalancerProtectionRequest setModificationProtectionReason(String modificationProtectionReason) {
        this.modificationProtectionReason = modificationProtectionReason;
        return this;
    }
    public String getModificationProtectionReason() {
        return this.modificationProtectionReason;
    }

    public UpdateLoadBalancerProtectionRequest setModificationProtectionStatus(String modificationProtectionStatus) {
        this.modificationProtectionStatus = modificationProtectionStatus;
        return this;
    }
    public String getModificationProtectionStatus() {
        return this.modificationProtectionStatus;
    }

    public UpdateLoadBalancerProtectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
