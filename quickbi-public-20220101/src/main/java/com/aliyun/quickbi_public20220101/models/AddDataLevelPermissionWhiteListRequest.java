// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddDataLevelPermissionWhiteListRequest extends TeaModel {
    /**
     * <p>The dataset ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7c7223ae-***-3c744528014b</p>
     */
    @NameInMap("CubeId")
    public String cubeId;

    /**
     * <p>The operation type. Valid values: </p>
     * <ul>
     * <li>ADD: add entries to the whitelist</li>
     * <li>DELETE: remove entries from the whitelist</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ADD</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>The permission type. Valid values:</p>
     * <ul>
     * <li>ROW_LEVEL: row-level permissions</li>
     * <li>COLUMN_LEVEL: column-level permissions</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ROW_LEVEL</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    /**
     * <p>The authorization targets. You can specify multiple targets separated by commas (,). Valid values:</p>
     * <ul>
     * <li>If TargetType is set to 1 (user), the value is the user ID.</li>
     * <li>If TargetType is set to 2 (user group), the value is the user group ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>43342<em><strong>435,1553a</strong></em>*41231</p>
     */
    @NameInMap("TargetIds")
    public String targetIds;

    /**
     * <p>The type of the target for which the whitelist is modified. Valid values:</p>
     * <ul>
     * <li>1: user </li>
     * <li>2: user group</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static AddDataLevelPermissionWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDataLevelPermissionWhiteListRequest self = new AddDataLevelPermissionWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public AddDataLevelPermissionWhiteListRequest setCubeId(String cubeId) {
        this.cubeId = cubeId;
        return this;
    }
    public String getCubeId() {
        return this.cubeId;
    }

    public AddDataLevelPermissionWhiteListRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public AddDataLevelPermissionWhiteListRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public AddDataLevelPermissionWhiteListRequest setTargetIds(String targetIds) {
        this.targetIds = targetIds;
        return this;
    }
    public String getTargetIds() {
        return this.targetIds;
    }

    public AddDataLevelPermissionWhiteListRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
