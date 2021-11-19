// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsReportDetailsRequest extends TeaModel {
    @NameInMap("PlanId")
    public String planId;

    @NameInMap("SceneId")
    public String sceneId;

    public static GetPtsReportDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPtsReportDetailsRequest self = new GetPtsReportDetailsRequest();
        return TeaModel.build(map, self);
    }

    public GetPtsReportDetailsRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public GetPtsReportDetailsRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
