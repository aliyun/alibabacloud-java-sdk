// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaPmdtaskresultRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static QueryLinkeLinkaPmdtaskresultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaPmdtaskresultRequest self = new QueryLinkeLinkaPmdtaskresultRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaPmdtaskresultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
