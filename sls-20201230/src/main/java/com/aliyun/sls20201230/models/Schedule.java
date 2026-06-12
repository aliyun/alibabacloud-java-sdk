// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Schedule extends TeaModel {
    /**
     * <p>The cron expression.</p>
     * 
     * <strong>example:</strong>
     * <p>0/5 * * * *</p>
     */
    @NameInMap("cronExpression")
    public String cronExpression;

    /**
     * <p>The delay before a scheduled task is executed, in seconds (s).</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("delay")
    public Integer delay;

    /**
     * <p>The fixed interval.</p>
     * 
     * <strong>example:</strong>
     * <p>60s</p>
     */
    @NameInMap("interval")
    public String interval;

    /**
     * <p>Specifies whether to execute the scheduled task immediately.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("runImmediately")
    public Boolean runImmediately;

    /**
     * <p>The time zone of the cron expression. If this parameter is left empty, the default time zone UTC+8 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>+0800</p>
     */
    @NameInMap("timeZone")
    public String timeZone;

    /**
     * <p>schedule type</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FixedRate</p>
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
