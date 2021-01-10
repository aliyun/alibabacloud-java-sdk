// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaPmdruleresultsRequest extends TeaModel {
    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("TaskId")
    public String taskId;

    public static QueryLinkeLinkaPmdruleresultsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaPmdruleresultsRequest self = new QueryLinkeLinkaPmdruleresultsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaPmdruleresultsRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public QueryLinkeLinkaPmdruleresultsRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
