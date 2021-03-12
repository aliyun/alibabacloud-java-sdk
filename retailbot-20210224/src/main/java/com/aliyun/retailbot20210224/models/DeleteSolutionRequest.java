// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DeleteSolutionRequest extends TeaModel {
    // 机器人code
    @NameInMap("RobotCode")
    public String robotCode;

    // 知识id
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    // 答案id集合
    @NameInMap("SolutionIds")
    public java.util.List<Long> solutionIds;

    // 操作用户id
    @NameInMap("OperatorId")
    public String operatorId;

    // 操作用户名称
    @NameInMap("OperatorName")
    public String operatorName;

    public static DeleteSolutionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSolutionRequest self = new DeleteSolutionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSolutionRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public DeleteSolutionRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public DeleteSolutionRequest setSolutionIds(java.util.List<Long> solutionIds) {
        this.solutionIds = solutionIds;
        return this;
    }
    public java.util.List<Long> getSolutionIds() {
        return this.solutionIds;
    }

    public DeleteSolutionRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public DeleteSolutionRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

}
