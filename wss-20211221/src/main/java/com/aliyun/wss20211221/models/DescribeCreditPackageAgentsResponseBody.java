// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeCreditPackageAgentsResponseBody extends TeaModel {
    /**
     * <p>A list of agents.</p>
     */
    @NameInMap("Agents")
    public java.util.List<DescribeCreditPackageAgentsResponseBodyAgents> agents;

    /**
     * <p>The number of results returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to retrieve the next page of results. If this value is empty, all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwfQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID. Provide this ID when contacting support.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCreditPackageAgentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreditPackageAgentsResponseBody self = new DescribeCreditPackageAgentsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCreditPackageAgentsResponseBody setAgents(java.util.List<DescribeCreditPackageAgentsResponseBodyAgents> agents) {
        this.agents = agents;
        return this;
    }
    public java.util.List<DescribeCreditPackageAgentsResponseBodyAgents> getAgents() {
        return this.agents;
    }

    public DescribeCreditPackageAgentsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeCreditPackageAgentsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCreditPackageAgentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCreditPackageAgentsResponseBodyAgents extends TeaModel {
        /**
         * <p>The ID of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-abc</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p><strong>The creation time of the instance.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-01 10:00:00</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p><strong>The ID of the active credit package instance.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>cp-inst-001</p>
         */
        @NameInMap("CreditPackageId")
        public String creditPackageId;

        /**
         * <p><strong>The expiration time of the instance.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-01 10:00:00</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>jvs-copilot.standard</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p><strong>The total credit.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("TotalCredit")
        public Long totalCredit;

        /**
         * <p><strong>The amount of credit used.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("UsedCredit")
        public Long usedCredit;

        /**
         * <p><strong>The alarm threshold, specified as a percentage. Valid values: 0 to 100.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("WarnPercent")
        public Integer warnPercent;

        public static DescribeCreditPackageAgentsResponseBodyAgents build(java.util.Map<String, ?> map) throws Exception {
            DescribeCreditPackageAgentsResponseBodyAgents self = new DescribeCreditPackageAgentsResponseBodyAgents();
            return TeaModel.build(map, self);
        }

        public DescribeCreditPackageAgentsResponseBodyAgents setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public DescribeCreditPackageAgentsResponseBodyAgents setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeCreditPackageAgentsResponseBodyAgents setCreditPackageId(String creditPackageId) {
            this.creditPackageId = creditPackageId;
            return this;
        }
        public String getCreditPackageId() {
            return this.creditPackageId;
        }

        public DescribeCreditPackageAgentsResponseBodyAgents setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeCreditPackageAgentsResponseBodyAgents setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeCreditPackageAgentsResponseBodyAgents setTotalCredit(Long totalCredit) {
            this.totalCredit = totalCredit;
            return this;
        }
        public Long getTotalCredit() {
            return this.totalCredit;
        }

        public DescribeCreditPackageAgentsResponseBodyAgents setUsedCredit(Long usedCredit) {
            this.usedCredit = usedCredit;
            return this;
        }
        public Long getUsedCredit() {
            return this.usedCredit;
        }

        public DescribeCreditPackageAgentsResponseBodyAgents setWarnPercent(Integer warnPercent) {
            this.warnPercent = warnPercent;
            return this;
        }
        public Integer getWarnPercent() {
            return this.warnPercent;
        }

    }

}
