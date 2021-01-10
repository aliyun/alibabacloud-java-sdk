// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectMissionRequest extends TeaModel {
    @NameInMap("MissionId")
    public String missionId;

    public static GetHasInspectMissionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectMissionRequest self = new GetHasInspectMissionRequest();
        return TeaModel.build(map, self);
    }

    public GetHasInspectMissionRequest setMissionId(String missionId) {
        this.missionId = missionId;
        return this;
    }
    public String getMissionId() {
        return this.missionId;
    }

}
