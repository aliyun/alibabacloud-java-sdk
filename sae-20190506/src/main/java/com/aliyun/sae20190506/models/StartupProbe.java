// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class StartupProbe extends TeaModel {
    @NameInMap("FailureThreshold")
    public Integer failureThreshold;

    @NameInMap("InitialDelaySeconds")
    public Integer initialDelaySeconds;

    @NameInMap("PeriodSeconds")
    public Integer periodSeconds;

    @NameInMap("ProbeHandler")
    public ProbeHandler probeHandler;

    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    public static StartupProbe build(java.util.Map<String, ?> map) throws Exception {
        StartupProbe self = new StartupProbe();
        return TeaModel.build(map, self);
    }

    public StartupProbe setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }
    public Integer getFailureThreshold() {
        return this.failureThreshold;
    }

    public StartupProbe setInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
        return this;
    }
    public Integer getInitialDelaySeconds() {
        return this.initialDelaySeconds;
    }

    public StartupProbe setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }
    public Integer getPeriodSeconds() {
        return this.periodSeconds;
    }

    public StartupProbe setProbeHandler(ProbeHandler probeHandler) {
        this.probeHandler = probeHandler;
        return this;
    }
    public ProbeHandler getProbeHandler() {
        return this.probeHandler;
    }

    public StartupProbe setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

}
