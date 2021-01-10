// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasInspectMissionscheduleRequest extends TeaModel {
    @NameInMap("MissionId")
    public String missionId;

    @NameInMap("ScheduleId")
    public String scheduleId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static UpdateHasInspectMissionscheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasInspectMissionscheduleRequest self = new UpdateHasInspectMissionscheduleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHasInspectMissionscheduleRequest setMissionId(String missionId) {
        this.missionId = missionId;
        return this;
    }
    public String getMissionId() {
        return this.missionId;
    }

    public UpdateHasInspectMissionscheduleRequest setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public String getScheduleId() {
        return this.scheduleId;
    }

    public UpdateHasInspectMissionscheduleRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
