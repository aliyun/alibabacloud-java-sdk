// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteAIInstanceShrinkRequest extends TeaModel {
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    public static DeleteAIInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIInstanceShrinkRequest self = new DeleteAIInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAIInstanceShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

}
