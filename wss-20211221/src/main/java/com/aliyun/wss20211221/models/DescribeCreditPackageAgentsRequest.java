// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeCreditPackageAgentsRequest extends TeaModel {
    /**
     * <p>An array of agent IDs to query. Example: <code>[&quot;agent-1&quot;,&quot;agent-2&quot;]</code>.</p>
     */
    @NameInMap("AgentIds")
    public java.util.List<String> agentIds;

    /**
     * <p>The agent type. Valid values: <code>CREDIT_PACKAGE</code>, <code>JVS_CLAW</code>, <code>OPEN_CLAW</code>, and <code>JVS_COPILOT</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>JVS_COPILOT</p>
     */
    @NameInMap("AgentType")
    public String agentType;

    /**
     * <p>The business type.</p>
     * 
     * <strong>example:</strong>
     * <p>BUSINESS</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The maximum number of results to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to retrieve the next page of results. Obtain this value from the <code>NextToken</code> parameter of the previous response. For the first request, set this parameter to an empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwfQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static DescribeCreditPackageAgentsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreditPackageAgentsRequest self = new DescribeCreditPackageAgentsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCreditPackageAgentsRequest setAgentIds(java.util.List<String> agentIds) {
        this.agentIds = agentIds;
        return this;
    }
    public java.util.List<String> getAgentIds() {
        return this.agentIds;
    }

    public DescribeCreditPackageAgentsRequest setAgentType(String agentType) {
        this.agentType = agentType;
        return this;
    }
    public String getAgentType() {
        return this.agentType;
    }

    public DescribeCreditPackageAgentsRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribeCreditPackageAgentsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeCreditPackageAgentsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
