// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetSubSceneTaskStatusRequest extends TeaModel {
    // 子场景ID
    @NameInMap("SubSceneId")
    public String subSceneId;

    public static GetSubSceneTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSubSceneTaskStatusRequest self = new GetSubSceneTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetSubSceneTaskStatusRequest setSubSceneId(String subSceneId) {
        this.subSceneId = subSceneId;
        return this;
    }
    public String getSubSceneId() {
        return this.subSceneId;
    }

}
