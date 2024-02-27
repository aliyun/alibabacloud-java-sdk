// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectTrafficQosQueueResponseBody extends TeaModel {
    @NameInMap("QueueList")
    public java.util.List<DescribeExpressConnectTrafficQosQueueResponseBodyQueueList> queueList;

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
        @NameInMap("DstCidr")
        public String dstCidr;

        @NameInMap("DstIPv6Cidr")
        public String dstIPv6Cidr;

        @NameInMap("DstPortRange")
        public String dstPortRange;

        @NameInMap("MatchDscp")
        public Integer matchDscp;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("QosId")
        public String qosId;

        @NameInMap("QueueId")
        public String queueId;

        @NameInMap("RemarkingDscp")
        public Integer remarkingDscp;

        @NameInMap("RuleDescription")
        public String ruleDescription;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("SrcCidr")
        public String srcCidr;

        @NameInMap("SrcIPv6Cidr")
        public String srcIPv6Cidr;

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
        @NameInMap("BandwidthPercent")
        public String bandwidthPercent;

        @NameInMap("QosId")
        public String qosId;

        @NameInMap("QueueDescription")
        public String queueDescription;

        @NameInMap("QueueId")
        public String queueId;

        @NameInMap("QueueName")
        public String queueName;

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
