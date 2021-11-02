// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryTaskRulesRequest extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("TaskRuleType")
    public String taskRuleType;

    public static QueryTaskRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskRulesRequest self = new QueryTaskRulesRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskRulesRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public QueryTaskRulesRequest setTaskRuleType(String taskRuleType) {
        this.taskRuleType = taskRuleType;
        return this;
    }
    public String getTaskRuleType() {
        return this.taskRuleType;
    }

}
