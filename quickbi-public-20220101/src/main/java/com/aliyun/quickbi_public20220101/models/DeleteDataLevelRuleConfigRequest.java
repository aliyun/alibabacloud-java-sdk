// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteDataLevelRuleConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CubeId")
    public String cubeId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static DeleteDataLevelRuleConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataLevelRuleConfigRequest self = new DeleteDataLevelRuleConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataLevelRuleConfigRequest setCubeId(String cubeId) {
        this.cubeId = cubeId;
        return this;
    }
    public String getCubeId() {
        return this.cubeId;
    }

    public DeleteDataLevelRuleConfigRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
