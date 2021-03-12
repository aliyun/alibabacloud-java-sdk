// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DisableSceneShrinkRequest extends TeaModel {
    // 知识id集合
    @NameInMap("KnowledgeIds")
    public String knowledgeIdsShrink;

    // 机器人code
    @NameInMap("RobotCode")
    public String robotCode;

    // 操作用户id
    @NameInMap("OperatorId")
    public String operatorId;

    // 操作用户名称
    @NameInMap("OperatorName")
    public String operatorName;

    public static DisableSceneShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableSceneShrinkRequest self = new DisableSceneShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DisableSceneShrinkRequest setKnowledgeIdsShrink(String knowledgeIdsShrink) {
        this.knowledgeIdsShrink = knowledgeIdsShrink;
        return this;
    }
    public String getKnowledgeIdsShrink() {
        return this.knowledgeIdsShrink;
    }

    public DisableSceneShrinkRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public DisableSceneShrinkRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public DisableSceneShrinkRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

}
