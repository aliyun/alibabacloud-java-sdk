// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class AddSolutionShrinkRequest extends TeaModel {
    // 机器人code
    @NameInMap("RobotCode")
    public String robotCode;

    // 知识id
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    // 答案
    @NameInMap("Solution")
    public String solutionShrink;

    // 操作人id
    @NameInMap("OperatorId")
    public String operatorId;

    // 操作人名称
    @NameInMap("OperatorName")
    public String operatorName;

    public static AddSolutionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSolutionShrinkRequest self = new AddSolutionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddSolutionShrinkRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public AddSolutionShrinkRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public AddSolutionShrinkRequest setSolutionShrink(String solutionShrink) {
        this.solutionShrink = solutionShrink;
        return this;
    }
    public String getSolutionShrink() {
        return this.solutionShrink;
    }

    public AddSolutionShrinkRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public AddSolutionShrinkRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

}
