// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DeleteSolutionShrinkRequest extends TeaModel {
    // 知识id
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    // 操作用户id
    @NameInMap("OperatorId")
    public String operatorId;

    // 操作用户名称
    @NameInMap("OperatorName")
    public String operatorName;

    // 机器人code
    @NameInMap("RobotCode")
    public String robotCode;

    // 答案id集合
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
