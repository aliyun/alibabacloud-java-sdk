// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectUnbindmissionRequest extends TeaModel {
    @NameInMap("MissionId")
    public String missionId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static ExecHasInspectUnbindmissionRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectUnbindmissionRequest self = new ExecHasInspectUnbindmissionRequest();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectUnbindmissionRequest setMissionId(String missionId) {
        this.missionId = missionId;
        return this;
    }
    public String getMissionId() {
        return this.missionId;
    }

    public ExecHasInspectUnbindmissionRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
