// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class SaveCrowdDatasetAndBindingDatasetShrinkRequest extends TeaModel {
    @NameInMap("body")
    public String bodyShrink;

    public static SaveCrowdDatasetAndBindingDatasetShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveCrowdDatasetAndBindingDatasetShrinkRequest self = new SaveCrowdDatasetAndBindingDatasetShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SaveCrowdDatasetAndBindingDatasetShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
