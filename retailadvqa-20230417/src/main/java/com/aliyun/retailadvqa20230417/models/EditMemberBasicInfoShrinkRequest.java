// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class EditMemberBasicInfoShrinkRequest extends TeaModel {
    @NameInMap("Body")
    public String bodyShrink;

    public static EditMemberBasicInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EditMemberBasicInfoShrinkRequest self = new EditMemberBasicInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EditMemberBasicInfoShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
