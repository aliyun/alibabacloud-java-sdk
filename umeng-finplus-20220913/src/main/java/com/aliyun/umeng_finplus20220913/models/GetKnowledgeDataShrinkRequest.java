// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class GetKnowledgeDataShrinkRequest extends TeaModel {
    @NameInMap("body")
    public String bodyShrink;

    public static GetKnowledgeDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeDataShrinkRequest self = new GetKnowledgeDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeDataShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
