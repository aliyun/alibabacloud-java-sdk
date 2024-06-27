// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddDataLevelPermissionWhiteListRequest extends TeaModel {
    /**
     * <p>The ID of the training dataset that you want to remove from the specified custom linguistic model.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7c7223ae-***-3c744528014b</p>
     */
    @NameInMap("CubeId")
    public String cubeId;

    /**
     * <p>Operation Type: You can set this parameter to one of the following values.</p>
     * <ul>
     * <li>ADD: Add a whitelist</li>
     * <li>DELETE: deletes a whitelist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ADD</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>The type of row-level permissions.</p>
     * <ul>
     * <li>ROW_LEVEL: row-level permissions,</li>
     * <li>COLUMN_LEVEL: column-level permissions</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ROW_LEVEL</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    /**
     * <strong>example:</strong>
     * <p>43342<em><strong>435,1553a</strong></em>*41231</p>
     */
    @NameInMap("TargetIds")
    public String targetIds;

    /**
     * <p>Modify the type of the whitelist:</p>
     * <ul>
     * <li>1: user</li>
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
