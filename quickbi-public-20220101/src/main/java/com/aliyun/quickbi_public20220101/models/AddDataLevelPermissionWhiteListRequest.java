// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddDataLevelPermissionWhiteListRequest extends TeaModel {
    /**
     * <p>The ID of the dataset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7c7223ae-***-3c744528014b</p>
     */
    @NameInMap("CubeId")
    public String cubeId;

    /**
     * <p>The operation to perform. Valid values:</p>
     * <ul>
     * <li><p>ADD: adds users or user groups to the whitelist.</p>
     * </li>
     * <li><p>DELETE: removes users or user groups from the whitelist.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ADD</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>The type of permission. Valid values:</p>
     * <ul>
     * <li><p>ROW_LEVEL: row-level permission</p>
     * </li>
     * <li><p>COLUMN_LEVEL: column-level permission</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ROW_LEVEL</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    /**
     * <p>The IDs of the users or user groups to add to the whitelist.</p>
     * <ul>
     * <li><p>If you set TargetType to 1 (user), specify the user IDs.</p>
     * </li>
     * <li><p>When <code>TargetType=2</code> (user group), the value is the user group ID.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>43342<em><strong>435,1553a</strong></em>*41231</p>
     */
    @NameInMap("TargetIds")
    public String targetIds;

    /**
     * <p>The type of object to add to the whitelist. Valid values:</p>
     * <ul>
     * <li><p>1: user</p>
     * </li>
     * <li><p>2: user group</p>
     * </li>
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
