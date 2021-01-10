// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaCpdRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static QueryLinkeLinkaCpdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaCpdRequest self = new QueryLinkeLinkaCpdRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaCpdRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
