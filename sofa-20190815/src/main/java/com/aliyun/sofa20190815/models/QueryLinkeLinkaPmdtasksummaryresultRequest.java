// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaPmdtasksummaryresultRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static QueryLinkeLinkaPmdtasksummaryresultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaPmdtasksummaryresultRequest self = new QueryLinkeLinkaPmdtasksummaryresultRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaPmdtasksummaryresultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
