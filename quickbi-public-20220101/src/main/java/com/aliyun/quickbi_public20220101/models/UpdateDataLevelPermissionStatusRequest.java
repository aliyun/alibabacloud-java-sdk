// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateDataLevelPermissionStatusRequest extends TeaModel {
    /**
     * <p>The ID of the training dataset that you want to remove from the specified custom linguistic model.</p>
     */
    @NameInMap("CubeId")
    public String cubeId;

    @NameInMap("IsOpen")
    public Integer isOpen;

    @NameInMap("RuleType")
    public String ruleType;

    public static UpdateDataLevelPermissionStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataLevelPermissionStatusRequest self = new UpdateDataLevelPermissionStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataLevelPermissionStatusRequest setCubeId(String cubeId) {
        this.cubeId = cubeId;
        return this;
    }
    public String getCubeId() {
        return this.cubeId;
    }

    public UpdateDataLevelPermissionStatusRequest setIsOpen(Integer isOpen) {
        this.isOpen = isOpen;
        return this;
    }
    public Integer getIsOpen() {
        return this.isOpen;
    }

    public UpdateDataLevelPermissionStatusRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

}
