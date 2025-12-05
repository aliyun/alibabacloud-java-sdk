// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class StartDebuggingJMeterSceneRequest extends TeaModel {
    /**
     * <p>The ID of the scenario that you want to debug.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DYYPZIH</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static StartDebuggingJMeterSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDebuggingJMeterSceneRequest self = new StartDebuggingJMeterSceneRequest();
        return TeaModel.build(map, self);
    }

    public StartDebuggingJMeterSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
