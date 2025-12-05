// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsReportDetailsRequest extends TeaModel {
    /**
     * <p>The ID of the performance testing task. A task ID is generated each time a PTS scenario is started.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OH5HA3VB</p>
     */
    @NameInMap("PlanId")
    public String planId;

    /**
     * <p>The ID of the scenario.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>G5HCVS</p>
     */
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
