// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class StopTestingJMeterSceneRequest extends TeaModel {
    /**
     * <p>The ID of the JMeter scenario.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DYYPZIH</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static StopTestingJMeterSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        StopTestingJMeterSceneRequest self = new StopTestingJMeterSceneRequest();
        return TeaModel.build(map, self);
    }

    public StopTestingJMeterSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
