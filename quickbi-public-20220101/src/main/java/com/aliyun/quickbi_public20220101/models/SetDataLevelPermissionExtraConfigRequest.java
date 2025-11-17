// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SetDataLevelPermissionExtraConfigRequest extends TeaModel {
    /**
     * <p>Dataset ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7c7223ae-******-3c744528014b</p>
     */
    @NameInMap("CubeId")
    public String cubeId;

    /**
     * <p>Policy when no rule is matched:</p>
     * <ul>
     * <li>NONE: No permission</li>
     * <li>ALL: Full permission</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("MissHitPolicy")
    public String missHitPolicy;

    /**
     * <p>Type of dataset row and column permissions. Possible values:</p>
     * <ul>
     * <li>ROW_LEVEL: Row-level permission</li>
     * <li>COLUMN_LEVEL: Column-level permission</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ROW_LEVEL</p>
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
