// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaOutdatedtaskRequest extends TeaModel {
    @NameInMap("Source")
    public String source;

    @NameInMap("TaskId")
    public String taskId;

    public static QueryLinkeLinkaOutdatedtaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaOutdatedtaskRequest self = new QueryLinkeLinkaOutdatedtaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaOutdatedtaskRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public QueryLinkeLinkaOutdatedtaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
