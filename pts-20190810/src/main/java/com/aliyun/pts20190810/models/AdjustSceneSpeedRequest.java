// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class AdjustSceneSpeedRequest extends TeaModel {
    @NameInMap("SceneId")
    @Validation(required = true)
    public String sceneId;

    @NameInMap("SpeedData")
    @Validation(required = true)
    public String speedData;

    @NameInMap("Content")
    public String content;

    public static AdjustSceneSpeedRequest build(java.util.Map<String, ?> map) throws Exception {
        AdjustSceneSpeedRequest self = new AdjustSceneSpeedRequest();
        return TeaModel.build(map, self);
    }

}
