// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyPropertyScheduleConfigRequest extends TeaModel {
    // The new collection frequency of asset fingerprints. Valid values:
    // 
    // *   **0**: disabled, which indicates that the asset fingerprints are not automatically or periodically collected.
    // *   **1**: collects asset fingerprints once an hour.
    // *   **3**: collects asset fingerprints once every 3 hours.
    // *   **12**: collects asset fingerprints once every 12 hours.
    // *   **24**: collects asset fingerprints once a day.
    // *   **168**: collects asset fingerprints once every 7 days.
    @NameInMap("ScheduleTime")
    public String scheduleTime;

    // The type of the asset fingerprints for which you want to modify the collection frequency. Valid values:
    // 
    // *   **scheduler\_port_period**: listening port
    // *   **scheduler\_process_period**: running process
    // *   **scheduler\_account_period**: account
    // *   **scheduler\_software_period**: software
    // *   **scheduler\_cron_period**: scheduled task
    // *   **scheduler\_sca_period**: middleware, database, or web service
    // *   **scheduler\_autorun_period**: startup item
    // *   **scheduler\_lkm_period**: kernel module
    // *   **scheduler\_sca\_proxy_period**: website
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
