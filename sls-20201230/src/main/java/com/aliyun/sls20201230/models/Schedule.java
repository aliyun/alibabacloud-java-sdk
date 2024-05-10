// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Schedule extends TeaModel {
    @NameInMap("cronExpression")
    public String cronExpression;

    @NameInMap("delay")
    public Integer delay;

    @NameInMap("interval")
    public String interval;

    @NameInMap("runImmediately")
    public Boolean runImmediately;

    @NameInMap("timeZone")
    public String timeZone;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    public static Schedule build(java.util.Map<String, ?> map) throws Exception {
        Schedule self = new Schedule();
        return TeaModel.build(map, self);
    }

    public Schedule setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public Schedule setDelay(Integer delay) {
        this.delay = delay;
        return this;
    }
    public Integer getDelay() {
        return this.delay;
    }

    public Schedule setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public Schedule setRunImmediately(Boolean runImmediately) {
        this.runImmediately = runImmediately;
        return this;
    }
    public Boolean getRunImmediately() {
        return this.runImmediately;
    }

    public Schedule setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public Schedule setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
