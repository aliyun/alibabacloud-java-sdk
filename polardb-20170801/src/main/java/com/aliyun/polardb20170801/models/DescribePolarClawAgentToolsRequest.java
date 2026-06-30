// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawAgentToolsRequest extends TeaModel {
    /**
     * <p>Agent ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>main</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-xxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>Specifies whether to include plugin tools.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludePlugins")
    public Boolean includePlugins;

    public static DescribePolarClawAgentToolsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawAgentToolsRequest self = new DescribePolarClawAgentToolsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawAgentToolsRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public DescribePolarClawAgentToolsRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribePolarClawAgentToolsRequest setIncludePlugins(Boolean includePlugins) {
        this.includePlugins = includePlugins;
        return this;
    }
    public Boolean getIncludePlugins() {
        return this.includePlugins;
    }

}
