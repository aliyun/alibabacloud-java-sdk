// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaStatisticsRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static QueryLinkeLinkaStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaStatisticsRequest self = new QueryLinkeLinkaStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaStatisticsRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
