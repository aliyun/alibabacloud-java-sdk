// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListSystemAlarmsRequest extends TeaModel {
    @NameInMap("AlarmType")
    public Integer alarmType;

    @NameInMap("BeginDate")
    public String beginDate;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static ListSystemAlarmsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSystemAlarmsRequest self = new ListSystemAlarmsRequest();
        return TeaModel.build(map, self);
    }

    public ListSystemAlarmsRequest setAlarmType(Integer alarmType) {
        this.alarmType = alarmType;
        return this;
    }
    public Integer getAlarmType() {
        return this.alarmType;
    }

    public ListSystemAlarmsRequest setBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public String getBeginDate() {
        return this.beginDate;
    }

    public ListSystemAlarmsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ListSystemAlarmsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSystemAlarmsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
