// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class QueryMemberBasicInfoShrinkRequest extends TeaModel {
    @NameInMap("body")
    public String bodyShrink;

    public static QueryMemberBasicInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMemberBasicInfoShrinkRequest self = new QueryMemberBasicInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryMemberBasicInfoShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
