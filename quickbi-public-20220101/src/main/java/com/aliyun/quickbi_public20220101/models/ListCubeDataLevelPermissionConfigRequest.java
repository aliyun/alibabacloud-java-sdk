// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListCubeDataLevelPermissionConfigRequest extends TeaModel {
    /**
     * <p>The ID of the training dataset that you want to remove from the specified custom linguistic model.</p>
     */
    @NameInMap("CubeId")
    public String cubeId;

    /**
     * <p>The type of the dataset row and column permission. Valid values:</p>
     * <br>
     * <p>*   ROW_LEVEL: row-level permissions</p>
     * <p>*   COLUMN_LEVEL: column-level permissions</p>
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
