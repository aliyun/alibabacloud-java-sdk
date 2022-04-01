// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetStackApplicationShrinkRequest extends TeaModel {
    @NameInMap("getStackApplicationParam")
    public String getStackApplicationParamShrink;

    public static GetStackApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStackApplicationShrinkRequest self = new GetStackApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetStackApplicationShrinkRequest setGetStackApplicationParamShrink(String getStackApplicationParamShrink) {
        this.getStackApplicationParamShrink = getStackApplicationParamShrink;
        return this;
    }
    public String getGetStackApplicationParamShrink() {
        return this.getStackApplicationParamShrink;
    }

}
