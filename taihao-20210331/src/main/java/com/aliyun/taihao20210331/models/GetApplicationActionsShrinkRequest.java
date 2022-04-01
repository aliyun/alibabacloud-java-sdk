// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetApplicationActionsShrinkRequest extends TeaModel {
    // getApplicationActionsParam
    @NameInMap("getApplicationActionsParam")
    public String getApplicationActionsParamShrink;

    public static GetApplicationActionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationActionsShrinkRequest self = new GetApplicationActionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationActionsShrinkRequest setGetApplicationActionsParamShrink(String getApplicationActionsParamShrink) {
        this.getApplicationActionsParamShrink = getApplicationActionsParamShrink;
        return this;
    }
    public String getGetApplicationActionsParamShrink() {
        return this.getApplicationActionsParamShrink;
    }

}
