// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DisableSceneShrinkRequest extends TeaModel {
    @NameInMap("KnowledgeIds")
    public String knowledgeIdsShrink;

    @NameInMap("OperatorId")
    public String operatorId;

    @NameInMap("OperatorName")
    public String operatorName;

    @NameInMap("RobotCode")
    public String robotCode;

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

    public DisableSceneShrinkRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

}
