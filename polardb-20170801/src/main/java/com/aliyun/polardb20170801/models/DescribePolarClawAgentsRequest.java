// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawAgentsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>work,research</p>
     */
    @NameInMap("AgentList")
    public java.util.List<String> agentList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    public static DescribePolarClawAgentsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawAgentsRequest self = new DescribePolarClawAgentsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawAgentsRequest setAgentList(java.util.List<String> agentList) {
        this.agentList = agentList;
        return this;
    }
    public java.util.List<String> getAgentList() {
        return this.agentList;
    }

    public DescribePolarClawAgentsRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

}
