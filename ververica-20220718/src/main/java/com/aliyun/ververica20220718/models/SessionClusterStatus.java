// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class SessionClusterStatus extends TeaModel {
    @NameInMap("currentSessionClusterStatus")
    public String currentSessionClusterStatus;

    @NameInMap("failure")
    public SessionClusterFailureInfo failure;

    @NameInMap("running")
    public SessionClusterRunningInfo running;

    public static SessionClusterStatus build(java.util.Map<String, ?> map) throws Exception {
        SessionClusterStatus self = new SessionClusterStatus();
        return TeaModel.build(map, self);
    }

    public SessionClusterStatus setCurrentSessionClusterStatus(String currentSessionClusterStatus) {
        this.currentSessionClusterStatus = currentSessionClusterStatus;
        return this;
    }
    public String getCurrentSessionClusterStatus() {
        return this.currentSessionClusterStatus;
    }

    public SessionClusterStatus setFailure(SessionClusterFailureInfo failure) {
        this.failure = failure;
        return this;
    }
    public SessionClusterFailureInfo getFailure() {
        return this.failure;
    }

    public SessionClusterStatus setRunning(SessionClusterRunningInfo running) {
        this.running = running;
        return this;
    }
    public SessionClusterRunningInfo getRunning() {
        return this.running;
    }

}
