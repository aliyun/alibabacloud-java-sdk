// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class GetCrowdDatasetShrinkRequest extends TeaModel {
    @NameInMap("body")
    public String bodyShrink;

    public static GetCrowdDatasetShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCrowdDatasetShrinkRequest self = new GetCrowdDatasetShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetCrowdDatasetShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
