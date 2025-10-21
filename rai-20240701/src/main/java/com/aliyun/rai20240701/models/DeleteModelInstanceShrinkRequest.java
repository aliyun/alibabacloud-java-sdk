// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class DeleteModelInstanceShrinkRequest extends TeaModel {
    @NameInMap("ModelInstanceIdList")
    public String modelInstanceIdListShrink;

    public static DeleteModelInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelInstanceShrinkRequest self = new DeleteModelInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteModelInstanceShrinkRequest setModelInstanceIdListShrink(String modelInstanceIdListShrink) {
        this.modelInstanceIdListShrink = modelInstanceIdListShrink;
        return this;
    }
    public String getModelInstanceIdListShrink() {
        return this.modelInstanceIdListShrink;
    }

}
