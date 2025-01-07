// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyStrategyTargetRequest extends TeaModel {
    /**
     * <p>The ID of the baseline check policy. The ID is returned after the policy is created. The value of this parameter is in the JSON format and contains the following field:</p>
     * <ul>
     * <li><strong>strategyId</strong>: the ID of the policy</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;strategyId&quot;:8070645}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The information about the asset group to which the policy is applied. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <ul>
     * <li><strong>TargetType</strong>: the type of the asset to which the policy is applied. Set the value to <strong>groupId</strong>, which indicates that the policy is applied to an asset group.</li>
     * <li><strong>BindUuidCount</strong>: the number of servers to which the policy is applied.</li>
     * <li><strong>Target</strong>: the ID of the asset group.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Target&quot;:&quot;9273980&quot;,&quot;BindUuidCount&quot;:5320,&quot;TargetType&quot;:&quot;groupId&quot;,&quot;Flag&quot;:&quot;del&quot;},{&quot;Target&quot;:&quot;9677606&quot;,&quot;TargetType&quot;:&quot;groupId&quot;,&quot;Flag&quot;:&quot;del&quot;},{&quot;Target&quot;:&quot;10121607&quot;,&quot;BindUuidCount&quot;:7,&quot;TargetType&quot;:&quot;groupId&quot;,&quot;Flag&quot;:&quot;add&quot;},{&quot;Target&quot;:&quot;10670708&quot;,&quot;BindUuidCount&quot;:2,&quot;TargetType&quot;:&quot;groupId&quot;,&quot;Flag&quot;:&quot;del&quot;},{&quot;Target&quot;:&quot;11246338&quot;,&quot;BindUuidCount&quot;:6,&quot;TargetType&quot;:&quot;groupId&quot;,&quot;Flag&quot;:&quot;del&quot;},{&quot;Target&quot;:&quot;11291161&quot;,&quot;BindUuidCount&quot;:13,&quot;TargetType&quot;:&quot;groupId&quot;,&quot;Flag&quot;:&quot;del&quot;}]</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>The type of the configuration. Set the value to <strong>hc_strategy</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hc_strategy</p>
     */
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
