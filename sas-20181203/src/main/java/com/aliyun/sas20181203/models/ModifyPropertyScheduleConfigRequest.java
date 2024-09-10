// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyPropertyScheduleConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ScheduleTime")
    public String scheduleTime;

    /**
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
