// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaSinglecoveragetaskRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static QueryLinkeLinkaSinglecoveragetaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaSinglecoveragetaskRequest self = new QueryLinkeLinkaSinglecoveragetaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaSinglecoveragetaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
