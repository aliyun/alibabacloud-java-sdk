// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectBindmissionRequest extends TeaModel {
    @NameInMap("MissionId")
    public String missionId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static ExecHasInspectBindmissionRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectBindmissionRequest self = new ExecHasInspectBindmissionRequest();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectBindmissionRequest setMissionId(String missionId) {
        this.missionId = missionId;
        return this;
    }
    public String getMissionId() {
        return this.missionId;
    }

    public ExecHasInspectBindmissionRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
