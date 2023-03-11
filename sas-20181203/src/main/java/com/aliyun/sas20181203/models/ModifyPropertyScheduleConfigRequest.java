// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyPropertyScheduleConfigRequest extends TeaModel {
    /**
     * <p>The new collection frequency of asset fingerprints. Valid values:</p>
     * <br>
     * <p>*   **0**: disabled, which indicates that the asset fingerprints are not automatically or periodically collected.</p>
     * <p>*   **1**: collects asset fingerprints once an hour.</p>
     * <p>*   **3**: collects asset fingerprints once every 3 hours.</p>
     * <p>*   **12**: collects asset fingerprints once every 12 hours.</p>
     * <p>*   **24**: collects asset fingerprints once a day.</p>
     * <p>*   **168**: collects asset fingerprints once every 7 days.</p>
     */
    @NameInMap("ScheduleTime")
    public String scheduleTime;

    /**
     * <p>The type of the asset fingerprints for which you want to modify the collection frequency. Valid values:</p>
     * <br>
     * <p>*   **scheduler\_port_period**: listening port</p>
     * <p>*   **scheduler\_process_period**: running process</p>
     * <p>*   **scheduler\_account_period**: account</p>
     * <p>*   **scheduler\_software_period**: software</p>
     * <p>*   **scheduler\_cron_period**: scheduled task</p>
     * <p>*   **scheduler\_sca_period**: middleware, database, or web service</p>
     * <p>*   **scheduler\_autorun_period**: startup item</p>
     * <p>*   **scheduler\_lkm_period**: kernel module</p>
     * <p>*   **scheduler\_sca\_proxy_period**: website</p>
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
