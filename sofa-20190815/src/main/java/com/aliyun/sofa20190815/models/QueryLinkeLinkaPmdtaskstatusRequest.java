// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaPmdtaskstatusRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static QueryLinkeLinkaPmdtaskstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaPmdtaskstatusRequest self = new QueryLinkeLinkaPmdtaskstatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaPmdtaskstatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
