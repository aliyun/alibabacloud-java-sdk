// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class PutLogStoreConfigShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    public static PutLogStoreConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PutLogStoreConfigShrinkRequest self = new PutLogStoreConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PutLogStoreConfigShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
