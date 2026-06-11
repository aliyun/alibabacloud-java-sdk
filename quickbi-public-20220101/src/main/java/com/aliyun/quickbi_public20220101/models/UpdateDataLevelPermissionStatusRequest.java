// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateDataLevelPermissionStatusRequest extends TeaModel {
    /**
     * <p>The ID of the dataset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7c7223ae-****-3c744528014b</p>
     */
    @NameInMap("CubeId")
    public String cubeId;

    /**
     * <p>The status of the permission switch. Valid values:</p>
     * <ul>
     * <li><p>1: On</p>
     * </li>
     * <li><p>0: Off</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsOpen")
    public Integer isOpen;

    /**
     * <p>The type of data-level permission. Valid values:</p>
     * <ul>
     * <li><p>ROW_LEVEL: Row-level permission</p>
     * </li>
     * <li><p>COLUMN_LEVEL: Column-level permission</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ROW_LEVEL</p>
     */
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
