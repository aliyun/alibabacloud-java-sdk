// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListImageAnalysisRuleProjectRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    // 任务 id
    @NameInMap("TaskId")
    public String taskId;

    // token
    @NameInMap("Token")
    public String token;

    public static ListImageAnalysisRuleProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImageAnalysisRuleProjectRequest self = new ListImageAnalysisRuleProjectRequest();
        return TeaModel.build(map, self);
    }

    public ListImageAnalysisRuleProjectRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ListImageAnalysisRuleProjectRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ListImageAnalysisRuleProjectRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
