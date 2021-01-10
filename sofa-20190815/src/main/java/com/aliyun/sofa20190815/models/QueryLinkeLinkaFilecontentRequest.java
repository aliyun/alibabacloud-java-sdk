// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaFilecontentRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("TaskId")
    public String taskId;

    public static QueryLinkeLinkaFilecontentRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaFilecontentRequest self = new QueryLinkeLinkaFilecontentRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaFilecontentRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkeLinkaFilecontentRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
