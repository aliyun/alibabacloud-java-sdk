// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawAgentsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>work,research</p>
     */
    @NameInMap("AgentList")
    public String agentListShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    public static DescribePolarClawAgentsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawAgentsShrinkRequest self = new DescribePolarClawAgentsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawAgentsShrinkRequest setAgentListShrink(String agentListShrink) {
        this.agentListShrink = agentListShrink;
        return this;
    }
    public String getAgentListShrink() {
        return this.agentListShrink;
    }

    public DescribePolarClawAgentsShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

}
