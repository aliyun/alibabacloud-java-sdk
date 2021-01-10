// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaCoveragenodeRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("TaskId")
    public String taskId;

    public static QueryLinkeLinkaCoveragenodeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaCoveragenodeRequest self = new QueryLinkeLinkaCoveragenodeRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaCoveragenodeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkeLinkaCoveragenodeRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
