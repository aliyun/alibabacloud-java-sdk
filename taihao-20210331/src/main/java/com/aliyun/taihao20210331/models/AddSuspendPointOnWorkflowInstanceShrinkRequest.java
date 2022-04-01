// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class AddSuspendPointOnWorkflowInstanceShrinkRequest extends TeaModel {
    // 添加暂停点参数
    @NameInMap("addSuspendOnWorkflowInstanceParam")
    public String addSuspendOnWorkflowInstanceParamShrink;

    public static AddSuspendPointOnWorkflowInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSuspendPointOnWorkflowInstanceShrinkRequest self = new AddSuspendPointOnWorkflowInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddSuspendPointOnWorkflowInstanceShrinkRequest setAddSuspendOnWorkflowInstanceParamShrink(String addSuspendOnWorkflowInstanceParamShrink) {
        this.addSuspendOnWorkflowInstanceParamShrink = addSuspendOnWorkflowInstanceParamShrink;
        return this;
    }
    public String getAddSuspendOnWorkflowInstanceParamShrink() {
        return this.addSuspendOnWorkflowInstanceParamShrink;
    }

}
