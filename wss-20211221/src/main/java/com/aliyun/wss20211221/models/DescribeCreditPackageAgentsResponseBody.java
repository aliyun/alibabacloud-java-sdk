// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeCreditPackageAgentsResponseBody extends TeaModel {
    @NameInMap("Agents")
    public java.util.List<DescribeCreditPackageAgentsResponseBodyAgents> agents;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwfQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
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
         * <p>Agent ID</p>
         * 
         * <strong>example:</strong>
         * <p>agent-abc</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <strong>example:</strong>
         * <p>2026-04-01 10:00:00</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <strong>example:</strong>
         * <p>cp-inst-001</p>
         */
        @NameInMap("CreditPackageId")
        public String creditPackageId;

        /**
         * <strong>example:</strong>
         * <p>2026-10-01 10:00:00</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <strong>example:</strong>
         * <p>jvs-copilot.standard</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("TotalCredit")
        public Long totalCredit;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("UsedCredit")
        public Long usedCredit;

        /**
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
