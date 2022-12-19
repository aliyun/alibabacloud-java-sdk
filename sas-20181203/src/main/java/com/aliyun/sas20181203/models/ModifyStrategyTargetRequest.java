// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyStrategyTargetRequest extends TeaModel {
    // The ID of the baseline check policy. The ID is returned after the policy is created. The value of this parameter is in the JSON format and contains the following field:
    // 
    // *   **strategyId**: the ID of the policy
    @NameInMap("Config")
    public String config;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The information about the asset group to which the policy is applied. The value of this parameter is in the JSON format and contains the following fields:
    // 
    // *   **TargetType**: the type of the asset to which the policy is applied. Set the value to **groupId**, which indicates that the policy is applied to an asset group.
    // 
    // *   **BindUuidCount**: the number of servers to which the policy is applied.
    // 
    // *   **Target**: the ID of the asset group.
    // 
    // *   **Flag**: the operation that you want to perform on the asset group. Valid values:
    // 
    //     *   **del**: removes the asset group from the policy.
    //     *   **add**: adds the asset group to the policy.
    @NameInMap("Target")
    public String target;

    // The configuration type. Set the value to **hc_strategy**.
    @NameInMap("Type")
    public String type;

    public static ModifyStrategyTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyStrategyTargetRequest self = new ModifyStrategyTargetRequest();
        return TeaModel.build(map, self);
    }

    public ModifyStrategyTargetRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ModifyStrategyTargetRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyStrategyTargetRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public ModifyStrategyTargetRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
