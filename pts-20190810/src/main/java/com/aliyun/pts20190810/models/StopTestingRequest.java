// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class StopTestingRequest extends TeaModel {
    @NameInMap("SceneId")
    @Validation(required = true)
    public String sceneId;

    public static StopTestingRequest build(java.util.Map<String, ?> map) throws Exception {
        StopTestingRequest self = new StopTestingRequest();
        return TeaModel.build(map, self);
    }

}
