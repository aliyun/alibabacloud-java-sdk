// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class AddSuspendPointOnWorkflowInstanceRequest extends TeaModel {
    // 添加暂停点参数
    @NameInMap("addSuspendOnWorkflowInstanceParam")
    public AddSuspendPointOnWorkflowInstanceParam addSuspendOnWorkflowInstanceParam;

    public static AddSuspendPointOnWorkflowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSuspendPointOnWorkflowInstanceRequest self = new AddSuspendPointOnWorkflowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public AddSuspendPointOnWorkflowInstanceRequest setAddSuspendOnWorkflowInstanceParam(AddSuspendPointOnWorkflowInstanceParam addSuspendOnWorkflowInstanceParam) {
        this.addSuspendOnWorkflowInstanceParam = addSuspendOnWorkflowInstanceParam;
        return this;
    }
    public AddSuspendPointOnWorkflowInstanceParam getAddSuspendOnWorkflowInstanceParam() {
        return this.addSuspendOnWorkflowInstanceParam;
    }

}
