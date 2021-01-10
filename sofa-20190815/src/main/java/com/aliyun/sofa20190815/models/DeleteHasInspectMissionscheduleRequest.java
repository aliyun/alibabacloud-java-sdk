// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasInspectMissionscheduleRequest extends TeaModel {
    @NameInMap("MissionId")
    public String missionId;

    @NameInMap("ScheduleId")
    public String scheduleId;

    public static DeleteHasInspectMissionscheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasInspectMissionscheduleRequest self = new DeleteHasInspectMissionscheduleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHasInspectMissionscheduleRequest setMissionId(String missionId) {
        this.missionId = missionId;
        return this;
    }
    public String getMissionId() {
        return this.missionId;
    }

    public DeleteHasInspectMissionscheduleRequest setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public String getScheduleId() {
        return this.scheduleId;
    }

}
