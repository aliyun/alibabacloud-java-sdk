// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class StartJMeterTestingRequest extends TeaModel {
    @NameInMap("SceneId")
    @Validation(required = true)
    public String sceneId;

    public static StartJMeterTestingRequest build(java.util.Map<String, ?> map) throws Exception {
        StartJMeterTestingRequest self = new StartJMeterTestingRequest();
        return TeaModel.build(map, self);
    }

}
