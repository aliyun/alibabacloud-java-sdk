// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class SessionClusterRunningInfo extends TeaModel {
    @NameInMap("lastUpdateTime")
    public Long lastUpdateTime;

    @NameInMap("referenceDeploymentIds")
    public java.util.List<String> referenceDeploymentIds;

    @NameInMap("startedAt")
    public Long startedAt;

    public static SessionClusterRunningInfo build(java.util.Map<String, ?> map) throws Exception {
        SessionClusterRunningInfo self = new SessionClusterRunningInfo();
        return TeaModel.build(map, self);
    }

    public SessionClusterRunningInfo setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }
    public Long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public SessionClusterRunningInfo setReferenceDeploymentIds(java.util.List<String> referenceDeploymentIds) {
        this.referenceDeploymentIds = referenceDeploymentIds;
        return this;
    }
    public java.util.List<String> getReferenceDeploymentIds() {
        return this.referenceDeploymentIds;
    }

    public SessionClusterRunningInfo setStartedAt(Long startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public Long getStartedAt() {
        return this.startedAt;
    }

}
