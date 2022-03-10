// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListCubeDataLevelPermissionConfigRequest extends TeaModel {
    @NameInMap("CubeId")
    public String cubeId;

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
