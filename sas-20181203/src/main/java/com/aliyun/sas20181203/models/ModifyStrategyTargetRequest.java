// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyStrategyTargetRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Config")
    public String config;

    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>This parameter is required.</p>
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
