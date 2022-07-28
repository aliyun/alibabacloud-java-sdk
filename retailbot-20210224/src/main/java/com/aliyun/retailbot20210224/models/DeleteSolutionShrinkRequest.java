// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DeleteSolutionShrinkRequest extends TeaModel {
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    @NameInMap("OperatorId")
    public String operatorId;

    @NameInMap("OperatorName")
    public String operatorName;

    @NameInMap("RobotCode")
    public String robotCode;

    @NameInMap("SolutionIds")
    public String solutionIdsShrink;

    public static DeleteSolutionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSolutionShrinkRequest self = new DeleteSolutionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSolutionShrinkRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public DeleteSolutionShrinkRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public DeleteSolutionShrinkRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public DeleteSolutionShrinkRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public DeleteSolutionShrinkRequest setSolutionIdsShrink(String solutionIdsShrink) {
        this.solutionIdsShrink = solutionIdsShrink;
        return this;
    }
    public String getSolutionIdsShrink() {
        return this.solutionIdsShrink;
    }

}
