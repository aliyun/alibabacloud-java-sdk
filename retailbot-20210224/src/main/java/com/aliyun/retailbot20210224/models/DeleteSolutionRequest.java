// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DeleteSolutionRequest extends TeaModel {
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    @NameInMap("OperatorId")
    public String operatorId;

    @NameInMap("OperatorName")
    public String operatorName;

    @NameInMap("RobotCode")
    public String robotCode;

    @NameInMap("SolutionIds")
    public java.util.List<Long> solutionIds;

    public static DeleteSolutionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSolutionRequest self = new DeleteSolutionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSolutionRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
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

    public DeleteSolutionRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public DeleteSolutionRequest setSolutionIds(java.util.List<Long> solutionIds) {
        this.solutionIds = solutionIds;
        return this;
    }
    public java.util.List<Long> getSolutionIds() {
        return this.solutionIds;
    }

}
