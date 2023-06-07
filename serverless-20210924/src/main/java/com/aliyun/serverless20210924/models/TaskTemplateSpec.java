// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class TaskTemplateSpec extends TeaModel {
    @NameInMap("context")
    public Context context;

    @NameInMap("description")
    public String description;

    @NameInMap("executeCondition")
    public Condition executeCondition;

    @NameInMap("worker")
    public TaskWorker worker;

    public static TaskTemplateSpec build(java.util.Map<String, ?> map) throws Exception {
        TaskTemplateSpec self = new TaskTemplateSpec();
        return TeaModel.build(map, self);
    }

    public TaskTemplateSpec setContext(Context context) {
        this.context = context;
        return this;
    }
    public Context getContext() {
        return this.context;
    }

    public TaskTemplateSpec setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public TaskTemplateSpec setExecuteCondition(Condition executeCondition) {
        this.executeCondition = executeCondition;
        return this;
    }
    public Condition getExecuteCondition() {
        return this.executeCondition;
    }

    public TaskTemplateSpec setWorker(TaskWorker worker) {
        this.worker = worker;
        return this;
    }
    public TaskWorker getWorker() {
        return this.worker;
    }

}
