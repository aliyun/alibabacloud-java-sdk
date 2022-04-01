// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetConfigTagsShrinkRequest extends TeaModel {
    // getConfigTagsParam
    @NameInMap("getConfigTagsParam")
    public String getConfigTagsParamShrink;

    public static GetConfigTagsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConfigTagsShrinkRequest self = new GetConfigTagsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetConfigTagsShrinkRequest setGetConfigTagsParamShrink(String getConfigTagsParamShrink) {
        this.getConfigTagsParamShrink = getConfigTagsParamShrink;
        return this;
    }
    public String getGetConfigTagsParamShrink() {
        return this.getConfigTagsParamShrink;
    }

}
