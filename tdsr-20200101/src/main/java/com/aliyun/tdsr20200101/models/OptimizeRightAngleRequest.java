// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class OptimizeRightAngleRequest extends TeaModel {
    // 子场景ID
    @NameInMap("SubSceneId")
    public String subSceneId;

    public static OptimizeRightAngleRequest build(java.util.Map<String, ?> map) throws Exception {
        OptimizeRightAngleRequest self = new OptimizeRightAngleRequest();
        return TeaModel.build(map, self);
    }

    public OptimizeRightAngleRequest setSubSceneId(String subSceneId) {
        this.subSceneId = subSceneId;
        return this;
    }
    public String getSubSceneId() {
        return this.subSceneId;
    }

}
