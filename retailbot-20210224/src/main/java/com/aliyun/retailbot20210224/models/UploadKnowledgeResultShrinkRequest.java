// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UploadKnowledgeResultShrinkRequest extends TeaModel {
    @NameInMap("DigDatas")
    public String digDatasShrink;

    public static UploadKnowledgeResultShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadKnowledgeResultShrinkRequest self = new UploadKnowledgeResultShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UploadKnowledgeResultShrinkRequest setDigDatasShrink(String digDatasShrink) {
        this.digDatasShrink = digDatasShrink;
        return this;
    }
    public String getDigDatasShrink() {
        return this.digDatasShrink;
    }

}
