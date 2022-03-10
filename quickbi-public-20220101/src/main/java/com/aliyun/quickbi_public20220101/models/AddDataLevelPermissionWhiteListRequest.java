// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddDataLevelPermissionWhiteListRequest extends TeaModel {
    @NameInMap("CubeId")
    public String cubeId;

    @NameInMap("OperateType")
    public String operateType;

    @NameInMap("RuleType")
    public String ruleType;

    @NameInMap("TargetIds")
    public String targetIds;

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
