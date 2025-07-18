// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sasrasp20240727.models;

import com.aliyun.tea.*;

public class DescribeAttackProtectionCountRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("AgentType")
    public String agentType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1767456000000</p>
     */
    @NameInMap("EndTimestamp")
    public Integer endTimestamp;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1739289981765</p>
     */
    @NameInMap("StartTimestamp")
    public Integer startTimestamp;

    public static DescribeAttackProtectionCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttackProtectionCountRequest self = new DescribeAttackProtectionCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAttackProtectionCountRequest setAgentType(String agentType) {
        this.agentType = agentType;
        return this;
    }
    public String getAgentType() {
        return this.agentType;
    }

    public DescribeAttackProtectionCountRequest setEndTimestamp(Integer endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Integer getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeAttackProtectionCountRequest setStartTimestamp(Integer startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Integer getStartTimestamp() {
        return this.startTimestamp;
    }

}
