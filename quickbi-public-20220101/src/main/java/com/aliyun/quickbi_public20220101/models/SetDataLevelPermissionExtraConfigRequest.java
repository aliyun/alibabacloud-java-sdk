// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SetDataLevelPermissionExtraConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CubeId")
    public String cubeId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MissHitPolicy")
    public String missHitPolicy;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    public static SetDataLevelPermissionExtraConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDataLevelPermissionExtraConfigRequest self = new SetDataLevelPermissionExtraConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetDataLevelPermissionExtraConfigRequest setCubeId(String cubeId) {
        this.cubeId = cubeId;
        return this;
    }
    public String getCubeId() {
        return this.cubeId;
    }

    public SetDataLevelPermissionExtraConfigRequest setMissHitPolicy(String missHitPolicy) {
        this.missHitPolicy = missHitPolicy;
        return this;
    }
    public String getMissHitPolicy() {
        return this.missHitPolicy;
    }

    public SetDataLevelPermissionExtraConfigRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

}
