// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyTargetRequest extends TeaModel {
    /**
     * <p>The ID of the baseline check policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;strategyId&quot;:8167126}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.X.X</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the policy. Set the value to hc_strategy, which indicates baseline check policies.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hc_strategy</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeStrategyTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStrategyTargetRequest self = new DescribeStrategyTargetRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStrategyTargetRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public DescribeStrategyTargetRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeStrategyTargetRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
