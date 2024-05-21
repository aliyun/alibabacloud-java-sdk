// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListDataLevelPermissionWhiteListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CubeId")
    public String cubeId;

    /**
     * <p>This parameter is required.</p>
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
