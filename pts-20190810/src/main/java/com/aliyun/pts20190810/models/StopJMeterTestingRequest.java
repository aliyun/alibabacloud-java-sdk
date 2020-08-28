// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class StopJMeterTestingRequest extends TeaModel {
    @NameInMap("SceneId")
    @Validation(required = true)
    public String sceneId;

    public static StopJMeterTestingRequest build(java.util.Map<String, ?> map) throws Exception {
        StopJMeterTestingRequest self = new StopJMeterTestingRequest();
        return TeaModel.build(map, self);
    }

}
