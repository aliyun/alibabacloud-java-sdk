// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListDataLevelPermissionWhiteListRequest extends TeaModel {
    /**
     * <p>Dataset ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3d5db23c-e4f2-49dd-a883-92285b48e14a</p>
     */
    @NameInMap("CubeId")
    public String cubeId;

    /**
     * <p>Type of row and column permission that the whitelist belongs to:</p>
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

    public static ListDataLevelPermissionWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataLevelPermissionWhiteListRequest self = new ListDataLevelPermissionWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public ListDataLevelPermissionWhiteListRequest setCubeId(String cubeId) {
        this.cubeId = cubeId;
        return this;
    }
    public String getCubeId() {
        return this.cubeId;
    }

    public ListDataLevelPermissionWhiteListRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

}
