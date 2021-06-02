// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetOriginLayoutDataRequest extends TeaModel {
    // 子场景ID
    @NameInMap("SubSceneId")
    public String subSceneId;

    public static GetOriginLayoutDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOriginLayoutDataRequest self = new GetOriginLayoutDataRequest();
        return TeaModel.build(map, self);
    }

    public GetOriginLayoutDataRequest setSubSceneId(String subSceneId) {
        this.subSceneId = subSceneId;
        return this;
    }
    public String getSubSceneId() {
        return this.subSceneId;
    }

}
