// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsSceneRunningDataRequest extends TeaModel {
    /**
     * <p>The ID of the stress testing task. You can obtain the task ID by calling the StartPtsScene operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NHBGVF8</p>
     */
    @NameInMap("PlanId")
    public String planId;

    /**
     * <p>The scenario ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NKKI6GB</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static GetPtsSceneRunningDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPtsSceneRunningDataRequest self = new GetPtsSceneRunningDataRequest();
        return TeaModel.build(map, self);
    }

    public GetPtsSceneRunningDataRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public GetPtsSceneRunningDataRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
