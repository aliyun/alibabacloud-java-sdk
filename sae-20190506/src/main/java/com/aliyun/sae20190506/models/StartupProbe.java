// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class StartupProbe extends TeaModel {
    /**
     * <p>The minimum number of consecutive failures that is considered a failure after a successful probe. Default value: 3. Minimum value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FailureThreshold")
    public Integer failureThreshold;

    /**
     * <p>The duration after the container is started before health checks are initiated. For more information, see <a href="https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes">Probes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InitialDelaySeconds")
    public Integer initialDelaySeconds;

    /**
     * <p>The health check interval. Default value: 10. Unit: seconds. Minimum value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PeriodSeconds")
    public Integer periodSeconds;

    /**
     * <p>The operation to determine the health of the container.</p>
     */
    @NameInMap("ProbeHandler")
    public ProbeHandler probeHandler;

    /**
     * <p>The timeout period of a health check. Default value: 1. Minimum value: 1. For more information, see <a href="https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes">Container probes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
