// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class EnableSceneRequest extends TeaModel {
    // 知识id集合
    @NameInMap("KnowledgeIds")
    public java.util.List<Long> knowledgeIds;

    // 操作用户id
    @NameInMap("OperatorId")
    public String operatorId;

    // 操作用户名称
    @NameInMap("OperatorName")
    public String operatorName;

    // 机器人code
    @NameInMap("RobotCode")
    public String robotCode;

    public static EnableSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableSceneRequest self = new EnableSceneRequest();
        return TeaModel.build(map, self);
    }

    public EnableSceneRequest setKnowledgeIds(java.util.List<Long> knowledgeIds) {
        this.knowledgeIds = knowledgeIds;
        return this;
    }
    public java.util.List<Long> getKnowledgeIds() {
        return this.knowledgeIds;
    }

    public EnableSceneRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public EnableSceneRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public EnableSceneRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

}
