// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class SchedulingRule extends TeaModel {
    /**
     * <p>The cron tab. Only the minute, hour, day, month, and week fields are currently supported. Second-level configurations are discarded.</p>
     * 
     * <strong>example:</strong>
     * <p>0 0 * * 7</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("CronTab")
    public String cronTab;

    /**
     * <p>The stop time of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-22T00:00:00Z</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("EndAt")
    public String endAt;

    /**
     * <p>Specifies whether the task is executed only once.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("ExecuteOnce")
    public Boolean executeOnce;

    /**
     * <p>The start time of the effective period for the node.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-22T00:00:00Z</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("StartAt")
    public String startAt;

    public static SchedulingRule build(java.util.Map<String, ?> map) throws Exception {
        SchedulingRule self = new SchedulingRule();
        return TeaModel.build(map, self);
    }

    public SchedulingRule setCronTab(String cronTab) {
        this.cronTab = cronTab;
        return this;
    }
    public String getCronTab() {
        return this.cronTab;
    }

    public SchedulingRule setEndAt(String endAt) {
        this.endAt = endAt;
        return this;
    }
    public String getEndAt() {
        return this.endAt;
    }

    public SchedulingRule setExecuteOnce(Boolean executeOnce) {
        this.executeOnce = executeOnce;
        return this;
    }
    public Boolean getExecuteOnce() {
        return this.executeOnce;
    }

    public SchedulingRule setStartAt(String startAt) {
        this.startAt = startAt;
        return this;
    }
    public String getStartAt() {
        return this.startAt;
    }

}
