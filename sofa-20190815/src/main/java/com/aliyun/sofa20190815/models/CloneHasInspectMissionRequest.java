// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CloneHasInspectMissionRequest extends TeaModel {
    @NameInMap("MissionId")
    public String missionId;

    public static CloneHasInspectMissionRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneHasInspectMissionRequest self = new CloneHasInspectMissionRequest();
        return TeaModel.build(map, self);
    }

    public CloneHasInspectMissionRequest setMissionId(String missionId) {
        this.missionId = missionId;
        return this;
    }
    public String getMissionId() {
        return this.missionId;
    }

}
