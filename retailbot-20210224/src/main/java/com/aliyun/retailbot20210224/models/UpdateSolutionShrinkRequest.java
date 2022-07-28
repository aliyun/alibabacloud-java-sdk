// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpdateSolutionShrinkRequest extends TeaModel {
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    @NameInMap("OperatorId")
    public String operatorId;

    @NameInMap("OperatorName")
    public String operatorName;

    @NameInMap("RobotCode")
    public String robotCode;

    @NameInMap("Solution")
    public String solutionShrink;

    public static UpdateSolutionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSolutionShrinkRequest self = new UpdateSolutionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSolutionShrinkRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public UpdateSolutionShrinkRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public UpdateSolutionShrinkRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public UpdateSolutionShrinkRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public UpdateSolutionShrinkRequest setSolutionShrink(String solutionShrink) {
        this.solutionShrink = solutionShrink;
        return this;
    }
    public String getSolutionShrink() {
        return this.solutionShrink;
    }

}
