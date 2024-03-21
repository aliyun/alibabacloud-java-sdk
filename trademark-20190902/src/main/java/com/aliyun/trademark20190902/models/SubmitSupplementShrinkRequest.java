// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class SubmitSupplementShrinkRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("SupplementId")
    public Long supplementId;

    @NameInMap("UserFiles")
    public String userFilesShrink;

    public static SubmitSupplementShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSupplementShrinkRequest self = new SubmitSupplementShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSupplementShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SubmitSupplementShrinkRequest setSupplementId(Long supplementId) {
        this.supplementId = supplementId;
        return this;
    }
    public Long getSupplementId() {
        return this.supplementId;
    }

    public SubmitSupplementShrinkRequest setUserFilesShrink(String userFilesShrink) {
        this.userFilesShrink = userFilesShrink;
        return this;
    }
    public String getUserFilesShrink() {
        return this.userFilesShrink;
    }

}
