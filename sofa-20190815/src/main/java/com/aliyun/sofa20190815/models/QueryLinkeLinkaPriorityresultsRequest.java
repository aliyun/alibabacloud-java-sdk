// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaPriorityresultsRequest extends TeaModel {
    @NameInMap("Priority")
    public String priority;

    @NameInMap("TaskId")
    public String taskId;

    public static QueryLinkeLinkaPriorityresultsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaPriorityresultsRequest self = new QueryLinkeLinkaPriorityresultsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaPriorityresultsRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public QueryLinkeLinkaPriorityresultsRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
