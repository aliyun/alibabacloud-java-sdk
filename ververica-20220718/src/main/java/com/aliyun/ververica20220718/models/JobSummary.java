// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class JobSummary extends TeaModel {
    @NameInMap("cancelled")
    public Integer cancelled;

    @NameInMap("cancelling")
    public Integer cancelling;

    @NameInMap("failed")
    public Integer failed;

    @NameInMap("finished")
    public Integer finished;

    @NameInMap("running")
    public Integer running;

    @NameInMap("starting")
    public Integer starting;

    public static JobSummary build(java.util.Map<String, ?> map) throws Exception {
        JobSummary self = new JobSummary();
        return TeaModel.build(map, self);
    }

    public JobSummary setCancelled(Integer cancelled) {
        this.cancelled = cancelled;
        return this;
    }
    public Integer getCancelled() {
        return this.cancelled;
    }

    public JobSummary setCancelling(Integer cancelling) {
        this.cancelling = cancelling;
        return this;
    }
    public Integer getCancelling() {
        return this.cancelling;
    }

    public JobSummary setFailed(Integer failed) {
        this.failed = failed;
        return this;
    }
    public Integer getFailed() {
        return this.failed;
    }

    public JobSummary setFinished(Integer finished) {
        this.finished = finished;
        return this;
    }
    public Integer getFinished() {
        return this.finished;
    }

    public JobSummary setRunning(Integer running) {
        this.running = running;
        return this;
    }
    public Integer getRunning() {
        return this.running;
    }

    public JobSummary setStarting(Integer starting) {
        this.starting = starting;
        return this;
    }
    public Integer getStarting() {
        return this.starting;
    }

}
