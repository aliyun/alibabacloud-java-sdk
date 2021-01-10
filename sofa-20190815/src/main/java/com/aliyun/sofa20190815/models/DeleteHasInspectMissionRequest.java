// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasInspectMissionRequest extends TeaModel {
    @NameInMap("MissionId")
    public String missionId;

    public static DeleteHasInspectMissionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasInspectMissionRequest self = new DeleteHasInspectMissionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHasInspectMissionRequest setMissionId(String missionId) {
        this.missionId = missionId;
        return this;
    }
    public String getMissionId() {
        return this.missionId;
    }

}
