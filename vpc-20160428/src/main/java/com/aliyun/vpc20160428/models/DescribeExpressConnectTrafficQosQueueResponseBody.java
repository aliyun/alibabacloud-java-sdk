// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectTrafficQosQueueResponseBody extends TeaModel {
    @NameInMap("QueueList")
    public java.util.List<DescribeExpressConnectTrafficQosQueueResponseBodyQueueList> queueList;

    /**
     * <strong>example:</strong>
     * <p>606998F0-B94D-48FE-8316-ACA81BB230DA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeExpressConnectTrafficQosQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectTrafficQosQueueResponseBody self = new DescribeExpressConnectTrafficQosQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectTrafficQosQueueResponseBody setQueueList(java.util.List<DescribeExpressConnectTrafficQosQueueResponseBodyQueueList> queueList) {
        this.queueList = queueList;
        return this;
    }
    public java.util.List<DescribeExpressConnectTrafficQosQueueResponseBodyQueueList> getQueueList() {
        return this.queueList;
    }

    public DescribeExpressConnectTrafficQosQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeExpressConnectTrafficQosQueueResponseBodyQueueListRuleList extends TeaModel {
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
         * <p>qos-91xz9f8zd7yj8xwknz</p>
         */
        @NameInMap("QosId")
        public String qosId;

        /**
         * <strong>example:</strong>
         * <p>qos-queue-iugg0l9x27f2nocouj</p>
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

        public static DescribeExpressConnectTrafficQosQueueResponseBodyQueueListRuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressConnectTrafficQosQueueResponseBodyQueueListRuleList self = new DescribeExpressConnectTrafficQosQueueResponseBodyQueueListRuleList();
            return TeaModel.build(map, self);
        }

        public DescribeExpressConnectTrafficQosQueueResponseBodyQueueListRuleList setDstCidr(String dstCidr) {
            this.dstCidr = dstCidr;
            return this;
        }
        public String getDstCidr() {
            return this.dstCidr;
        }

        public DescribeExpressConnectTrafficQosQueueResponseBodyQueueListRuleList setDstIPv6Cidr(String dstIPv6Cidr) {
            this.dstIPv6Cidr = dstIPv6Cidr;
            return this;
        }
        public String getDstIPv6Cidr() {
            return this.dstIPv6Cidr;
        }

        public DescribeExpressConnectTrafficQosQueueResponseBodyQueueListRuleList setDstPortRange(String dstPortRange) {
            this.dstPortRange = dstPortRange;
            return this;
        }
        public String getDstPortRange() {
            return this.dstPortRange;
        }

        public DescribeExpressConnectTrafficQosQueueResponseBodyQueueListRuleList setMatchDscp(Integer matchDscp) {
            this.matchDscp = matchDscp;
            return this;
        }
        public Integer getMatchDscp() {
            return this.matchDscp;
        }

        public DescribeExpressConnectTrafficQosQueueResponseBodyQueueListRuleList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeExpressConnectTrafficQosQueueResponseBodyQueueListRuleList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeExpressConnectTrafficQosQueueResponseBodyQueueListRuleList setQosId(String qosId) {
            this.qosId = qosId;
            return this;
        }
        public String getQosId() {
            return this.qosId;
        }

        public DescribeExpressConnectTrafficQosQueueResponseBodyQueueListRuleList setQueueId(String queueId) {
            this.queueId = queueId;
            return this;
        }
        public String getQueueId() {
            return this.queueId;
        }

        public DescribeExpressConnectTrafficQosQueueResponseBodyQueueListRuleList setRemarkingDscp(Integer remarkingDscp) {
            this.remarkingDscp = remarkingDscp;
            return this;
        }
        public Integer getRemarkingDscp() {
            return this.remarkingDscp;
        }

        public DescribeExpressConnectTrafficQosQueueResponseBodyQueueListRuleList setRuleDescription(String ruleDescription) {
            this.ruleDescription = ruleDescription;
            return this;
        }
        public String getRuleDescription() {
            return this.ruleDescription;
        }

        public DescribeExpressConnectTrafficQosQueueResponseBodyQueueListRuleList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeExpressConnectTrafficQosQueueResponseBodyQueueListRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeExpressConnectTrafficQosQueueResponseBodyQueueListRuleList setSrcCidr(String srcCidr) {
            this.srcCidr = srcCidr;
            return this;
        }
        public String getSrcCidr() {
            return this.srcCidr;
        }

        public DescribeExpressConnectTrafficQosQueueResponseBodyQueueListRuleList setSrcIPv6Cidr(String srcIPv6Cidr) {
            this.srcIPv6Cidr = srcIPv6Cidr;
            return this;
        }
        public String getSrcIPv6Cidr() {
            return this.srcIPv6Cidr;
        }

        public DescribeExpressConnectTrafficQosQueueResponseBodyQueueListRuleList setSrcPortRange(String srcPortRange) {
            this.srcPortRange = srcPortRange;
            return this;
        }
        public String getSrcPortRange() {
            return this.srcPortRange;
        }

        public DescribeExpressConnectTrafficQosQueueResponseBodyQueueListRuleList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeExpressConnectTrafficQosQueueResponseBodyQueueList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("BandwidthPercent")
        public String bandwidthPercent;

        /**
         * <strong>example:</strong>
         * <p>qos-ncfgzxg40zks5n0qze</p>
         */
        @NameInMap("QosId")
        public String qosId;

        /**
         * <strong>example:</strong>
         * <p>qos-queue-test</p>
         */
        @NameInMap("QueueDescription")
        public String queueDescription;

        /**
         * <strong>example:</strong>
         * <p>qos-queue-9nyx2u7n71s2rcy4n5</p>
         */
        @NameInMap("QueueId")
        public String queueId;

        /**
         * <strong>example:</strong>
         * <p>qos-queue-test</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <strong>example:</strong>
         * <p>High</p>
         */
        @NameInMap("QueueType")
        public String queueType;

        @NameInMap("RuleList")
        public java.util.List<DescribeExpressConnectTrafficQosQueueResponseBodyQueueListRuleList> ruleList;

        @NameInMap("Status")
        public String status;

        public static DescribeExpressConnectTrafficQosQueueResponseBodyQueueList build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressConnectTrafficQosQueueResponseBodyQueueList self = new DescribeExpressConnectTrafficQosQueueResponseBodyQueueList();
            return TeaModel.build(map, self);
        }

        public DescribeExpressConnectTrafficQosQueueResponseBodyQueueList setBandwidthPercent(String bandwidthPercent) {
            this.bandwidthPercent = bandwidthPercent;
            return this;
        }
        public String getBandwidthPercent() {
            return this.bandwidthPercent;
        }

        public DescribeExpressConnectTrafficQosQueueResponseBodyQueueList setQosId(String qosId) {
            this.qosId = qosId;
            return this;
        }
        public String getQosId() {
            return this.qosId;
        }

        public DescribeExpressConnectTrafficQosQueueResponseBodyQueueList setQueueDescription(String queueDescription) {
            this.queueDescription = queueDescription;
            return this;
        }
        public String getQueueDescription() {
            return this.queueDescription;
        }

        public DescribeExpressConnectTrafficQosQueueResponseBodyQueueList setQueueId(String queueId) {
            this.queueId = queueId;
            return this;
        }
        public String getQueueId() {
            return this.queueId;
        }

        public DescribeExpressConnectTrafficQosQueueResponseBodyQueueList setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public DescribeExpressConnectTrafficQosQueueResponseBodyQueueList setQueueType(String queueType) {
            this.queueType = queueType;
            return this;
        }
        public String getQueueType() {
            return this.queueType;
        }

        public DescribeExpressConnectTrafficQosQueueResponseBodyQueueList setRuleList(java.util.List<DescribeExpressConnectTrafficQosQueueResponseBodyQueueListRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<DescribeExpressConnectTrafficQosQueueResponseBodyQueueListRuleList> getRuleList() {
            return this.ruleList;
        }

        public DescribeExpressConnectTrafficQosQueueResponseBodyQueueList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
