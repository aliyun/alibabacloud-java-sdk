// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetRectifyImageRequest extends TeaModel {
    // 子场景ID
    @NameInMap("SubSceneId")
    public String subSceneId;

    public static GetRectifyImageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRectifyImageRequest self = new GetRectifyImageRequest();
        return TeaModel.build(map, self);
    }

    public GetRectifyImageRequest setSubSceneId(String subSceneId) {
        this.subSceneId = subSceneId;
        return this;
    }
    public String getSubSceneId() {
        return this.subSceneId;
    }

}
