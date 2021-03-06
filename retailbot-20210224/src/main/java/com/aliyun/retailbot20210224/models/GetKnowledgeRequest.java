// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class GetKnowledgeRequest extends TeaModel {
    // 机器人code
    @NameInMap("RobotCode")
    public String robotCode;

    // 操作人id
    @NameInMap("OperatorId")
    public String operatorId;

    // 操作人名称
    @NameInMap("OperatorName")
    public String operatorName;

    // 知识id
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    public static GetKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeRequest self = new GetKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public GetKnowledgeRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public GetKnowledgeRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public GetKnowledgeRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

}
