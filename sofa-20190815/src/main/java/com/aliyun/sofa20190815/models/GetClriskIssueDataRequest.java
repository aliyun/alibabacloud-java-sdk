// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskIssueDataRequest extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    public static GetClriskIssueDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClriskIssueDataRequest self = new GetClriskIssueDataRequest();
        return TeaModel.build(map, self);
    }

    public GetClriskIssueDataRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
