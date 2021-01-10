// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class FinishLinkelinkflowLinkflowTaskRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("FormDefinitionId")
    public String formDefinitionId;

    @NameInMap("OperatorId")
    public String operatorId;

    @NameInMap("Outcome")
    public String outcome;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("Variables")
    public String variables;

    public static FinishLinkelinkflowLinkflowTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishLinkelinkflowLinkflowTaskRequest self = new FinishLinkelinkflowLinkflowTaskRequest();
        return TeaModel.build(map, self);
    }

    public FinishLinkelinkflowLinkflowTaskRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public FinishLinkelinkflowLinkflowTaskRequest setFormDefinitionId(String formDefinitionId) {
        this.formDefinitionId = formDefinitionId;
        return this;
    }
    public String getFormDefinitionId() {
        return this.formDefinitionId;
    }

    public FinishLinkelinkflowLinkflowTaskRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public FinishLinkelinkflowLinkflowTaskRequest setOutcome(String outcome) {
        this.outcome = outcome;
        return this;
    }
    public String getOutcome() {
        return this.outcome;
    }

    public FinishLinkelinkflowLinkflowTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public FinishLinkelinkflowLinkflowTaskRequest setVariables(String variables) {
        this.variables = variables;
        return this;
    }
    public String getVariables() {
        return this.variables;
    }

}
