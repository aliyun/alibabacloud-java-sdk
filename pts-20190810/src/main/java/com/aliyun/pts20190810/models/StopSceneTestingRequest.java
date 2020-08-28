// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class StopSceneTestingRequest extends TeaModel {
    @NameInMap("SceneId")
    @Validation(required = true)
    public String sceneId;

    public static StopSceneTestingRequest build(java.util.Map<String, ?> map) throws Exception {
        StopSceneTestingRequest self = new StopSceneTestingRequest();
        return TeaModel.build(map, self);
    }

}
