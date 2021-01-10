// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaTaskstatisticsinfoRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static QueryLinkeLinkaTaskstatisticsinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaTaskstatisticsinfoRequest self = new QueryLinkeLinkaTaskstatisticsinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaTaskstatisticsinfoRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
