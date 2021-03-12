// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DisableSceneRequest extends TeaModel {
    // 知识id集合
    @NameInMap("KnowledgeIds")
    public java.util.List<Long> knowledgeIds;

    // 机器人code
    @NameInMap("RobotCode")
    public String robotCode;

    // 操作用户id
    @NameInMap("OperatorId")
    public String operatorId;

    // 操作用户名称
    @NameInMap("OperatorName")
    public String operatorName;

    public static DisableSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableSceneRequest self = new DisableSceneRequest();
        return TeaModel.build(map, self);
    }

    public DisableSceneRequest setKnowledgeIds(java.util.List<Long> knowledgeIds) {
        this.knowledgeIds = knowledgeIds;
        return this;
    }
    public java.util.List<Long> getKnowledgeIds() {
        return this.knowledgeIds;
    }

    public DisableSceneRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public DisableSceneRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public DisableSceneRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

}
