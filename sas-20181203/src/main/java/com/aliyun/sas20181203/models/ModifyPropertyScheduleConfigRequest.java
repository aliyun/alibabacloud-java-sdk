// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyPropertyScheduleConfigRequest extends TeaModel {
    /**
     * <p>The new collection frequency of asset fingerprints. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disabled, which indicates that the asset fingerprints are not automatically or periodically collected.</li>
     * <li><strong>1</strong>: collects asset fingerprints once an hour.</li>
     * <li><strong>3</strong>: collects asset fingerprints once every 3 hours.</li>
     * <li><strong>12</strong>: collects asset fingerprints once every 12 hours.</li>
     * <li><strong>24</strong>: collects asset fingerprints once a day.</li>
     * <li><strong>168</strong>: collects asset fingerprints once every 7 days.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ScheduleTime")
    public String scheduleTime;

    /**
     * <p>The type of the asset fingerprints for which you want to modify the collection frequency. Valid values:</p>
     * <ul>
     * <li><strong>scheduler_port_period</strong>: listening port</li>
     * <li><strong>scheduler_process_period</strong>: running process</li>
     * <li><strong>scheduler_account_period</strong>: account</li>
     * <li><strong>scheduler_software_period</strong>: software</li>
     * <li><strong>scheduler_cron_period</strong>: scheduled task</li>
     * <li><strong>scheduler_sca_period</strong>: middleware, database, or web service</li>
     * <li><strong>scheduler_autorun_period</strong>: startup item</li>
     * <li><strong>scheduler_lkm_period</strong>: kernel module</li>
     * <li><strong>scheduler_sca_proxy_period</strong>: website</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>scheduler_port_period</p>
     */
    @NameInMap("Type")
    public String type;

    public static ModifyPropertyScheduleConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPropertyScheduleConfigRequest self = new ModifyPropertyScheduleConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPropertyScheduleConfigRequest setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }
    public String getScheduleTime() {
        return this.scheduleTime;
    }

    public ModifyPropertyScheduleConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
