// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ReadMarkSystemAlarmsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("AlarmIds")
    public java.util.List<String> alarmIds;

    public static ReadMarkSystemAlarmsRequest build(java.util.Map<String, ?> map) throws Exception {
        ReadMarkSystemAlarmsRequest self = new ReadMarkSystemAlarmsRequest();
        return TeaModel.build(map, self);
    }

    public ReadMarkSystemAlarmsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReadMarkSystemAlarmsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReadMarkSystemAlarmsRequest setAlarmIds(java.util.List<String> alarmIds) {
        this.alarmIds = alarmIds;
        return this;
    }
    public java.util.List<String> getAlarmIds() {
        return this.alarmIds;
    }

}
