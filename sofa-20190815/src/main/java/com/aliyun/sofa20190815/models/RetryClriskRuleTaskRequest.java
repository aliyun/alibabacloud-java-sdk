// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryClriskRuleTaskRequest extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    public static RetryClriskRuleTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryClriskRuleTaskRequest self = new RetryClriskRuleTaskRequest();
        return TeaModel.build(map, self);
    }

    public RetryClriskRuleTaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
