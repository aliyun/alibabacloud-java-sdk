// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListCubeDataLevelPermissionConfigRequest extends TeaModel {
    /**
     * <p>The ID of the training dataset that you want to remove from the specified custom linguistic model.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7c7223ae-****-3c744528014b</p>
     */
    @NameInMap("CubeId")
    public String cubeId;

    /**
     * <p>The type of the dataset row and column permission. Valid values:</p>
     * <ul>
     * <li>ROW_LEVEL: row-level permissions</li>
     * <li>COLUMN_LEVEL: column-level permissions</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ROW_LEVEL</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    public static ListCubeDataLevelPermissionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCubeDataLevelPermissionConfigRequest self = new ListCubeDataLevelPermissionConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListCubeDataLevelPermissionConfigRequest setCubeId(String cubeId) {
        this.cubeId = cubeId;
        return this;
    }
    public String getCubeId() {
        return this.cubeId;
    }

    public ListCubeDataLevelPermissionConfigRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

}
