// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectTrafficQosRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9C7FA9D6-72E0-48A9-A9C3-2DA8569CD5EB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleList")
    public java.util.List<DescribeExpressConnectTrafficQosRuleResponseBodyRuleList> ruleList;

    public static DescribeExpressConnectTrafficQosRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectTrafficQosRuleResponseBody self = new DescribeExpressConnectTrafficQosRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectTrafficQosRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExpressConnectTrafficQosRuleResponseBody setRuleList(java.util.List<DescribeExpressConnectTrafficQosRuleResponseBodyRuleList> ruleList) {
        this.ruleList = ruleList;
        return this;
    }
    public java.util.List<DescribeExpressConnectTrafficQosRuleResponseBodyRuleList> getRuleList() {
        return this.ruleList;
    }

    public static class DescribeExpressConnectTrafficQosRuleResponseBodyRuleList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1.1.1.0/24</p>
         */
        @NameInMap("DstCidr")
        public String dstCidr;

        /**
         * <strong>example:</strong>
         * <p>2001:0db8:1234:5678::/64</p>
         */
        @NameInMap("DstIPv6Cidr")
        public String dstIPv6Cidr;

        /**
         * <strong>example:</strong>
         * <p>-1/-1</p>
         */
        @NameInMap("DstPortRange")
        public String dstPortRange;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MatchDscp")
        public Integer matchDscp;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>qos-pksbqfmotl5hzqmhf8</p>
         */
        @NameInMap("QosId")
        public String qosId;

        /**
         * <strong>example:</strong>
         * <p>qos-queue-9nyx2u7n71s2rcy4n5</p>
         */
        @NameInMap("QueueId")
        public String queueId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RemarkingDscp")
        public Integer remarkingDscp;

        /**
         * <strong>example:</strong>
         * <p>qos-rule-test</p>
         */
        @NameInMap("RuleDescription")
        public String ruleDescription;

        /**
         * <strong>example:</strong>
         * <p>qos-rule-iugg0l9x27f2nocouj</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <strong>example:</strong>
         * <p>qos-rule-test</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>1.1.1.0/24</p>
         */
        @NameInMap("SrcCidr")
        public String srcCidr;

        /**
         * <strong>example:</strong>
         * <p>2001:0db8:1234:5678::/64</p>
         */
        @NameInMap("SrcIPv6Cidr")
        public String srcIPv6Cidr;

        /**
         * <strong>example:</strong>
         * <p>-1/-1</p>
         */
        @NameInMap("SrcPortRange")
        public String srcPortRange;

        @NameInMap("Status")
        public String status;

        public static DescribeExpressConnectTrafficQosRuleResponseBodyRuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressConnectTrafficQosRuleResponseBodyRuleList self = new DescribeExpressConnectTrafficQosRuleResponseBodyRuleList();
            return TeaModel.build(map, self);
        }

        public DescribeExpressConnectTrafficQosRuleResponseBodyRuleList setDstCidr(String dstCidr) {
            this.dstCidr = dstCidr;
            return this;
        }
        public String getDstCidr() {
            return this.dstCidr;
        }

        public DescribeExpressConnectTrafficQosRuleResponseBodyRuleList setDstIPv6Cidr(String dstIPv6Cidr) {
            this.dstIPv6Cidr = dstIPv6Cidr;
            return this;
        }
        public String getDstIPv6Cidr() {
            return this.dstIPv6Cidr;
        }

        public DescribeExpressConnectTrafficQosRuleResponseBodyRuleList setDstPortRange(String dstPortRange) {
            this.dstPortRange = dstPortRange;
            return this;
        }
        public String getDstPortRange() {
            return this.dstPortRange;
        }

        public DescribeExpressConnectTrafficQosRuleResponseBodyRuleList setMatchDscp(Integer matchDscp) {
            this.matchDscp = matchDscp;
            return this;
        }
        public Integer getMatchDscp() {
            return this.matchDscp;
        }

        public DescribeExpressConnectTrafficQosRuleResponseBodyRuleList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeExpressConnectTrafficQosRuleResponseBodyRuleList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeExpressConnectTrafficQosRuleResponseBodyRuleList setQosId(String qosId) {
            this.qosId = qosId;
            return this;
        }
        public String getQosId() {
            return this.qosId;
        }

        public DescribeExpressConnectTrafficQosRuleResponseBodyRuleList setQueueId(String queueId) {
            this.queueId = queueId;
            return this;
        }
        public String getQueueId() {
            return this.queueId;
        }

        public DescribeExpressConnectTrafficQosRuleResponseBodyRuleList setRemarkingDscp(Integer remarkingDscp) {
            this.remarkingDscp = remarkingDscp;
            return this;
        }
        public Integer getRemarkingDscp() {
            return this.remarkingDscp;
        }

        public DescribeExpressConnectTrafficQosRuleResponseBodyRuleList setRuleDescription(String ruleDescription) {
            this.ruleDescription = ruleDescription;
            return this;
        }
        public String getRuleDescription() {
            return this.ruleDescription;
        }

        public DescribeExpressConnectTrafficQosRuleResponseBodyRuleList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeExpressConnectTrafficQosRuleResponseBodyRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeExpressConnectTrafficQosRuleResponseBodyRuleList setSrcCidr(String srcCidr) {
            this.srcCidr = srcCidr;
            return this;
        }
        public String getSrcCidr() {
            return this.srcCidr;
        }

        public DescribeExpressConnectTrafficQosRuleResponseBodyRuleList setSrcIPv6Cidr(String srcIPv6Cidr) {
            this.srcIPv6Cidr = srcIPv6Cidr;
            return this;
        }
        public String getSrcIPv6Cidr() {
            return this.srcIPv6Cidr;
        }

        public DescribeExpressConnectTrafficQosRuleResponseBodyRuleList setSrcPortRange(String srcPortRange) {
            this.srcPortRange = srcPortRange;
            return this;
        }
        public String getSrcPortRange() {
            return this.srcPortRange;
        }

        public DescribeExpressConnectTrafficQosRuleResponseBodyRuleList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
