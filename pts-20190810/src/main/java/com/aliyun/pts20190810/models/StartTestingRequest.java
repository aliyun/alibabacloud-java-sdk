// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class StartTestingRequest extends TeaModel {
    @NameInMap("SceneId")
    @Validation(required = true)
    public String sceneId;

    public static StartTestingRequest build(java.util.Map<String, ?> map) throws Exception {
        StartTestingRequest self = new StartTestingRequest();
        return TeaModel.build(map, self);
    }

}
