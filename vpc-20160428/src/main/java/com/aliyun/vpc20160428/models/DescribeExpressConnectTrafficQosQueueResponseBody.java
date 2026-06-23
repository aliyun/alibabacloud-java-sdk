// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectTrafficQosQueueResponseBody extends TeaModel {
    /**
     * <p>The list of QoS queues.</p>
     */
    @NameInMap("QueueList")
    public java.util.List<DescribeExpressConnectTrafficQosQueueResponseBodyQueueList> queueList;

    /**
     * <p>The request ID.</p>
     * 
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
         * <p>The destination IP address IPv4 CIDR block that is used for traffic matching by the QoS rule.</p>
         * <blockquote>
         * <p>You cannot specify this parameter together with <strong>SrcIPv6Cidr</strong> or <strong>DstIPv6Cidr</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><code>1.1.**.**</code>/24</p>
         */
        @NameInMap("DstCidr")
        public String dstCidr;

        /**
         * <p>The destination IP address IPv6 CIDR block that is used for traffic matching by the QoS rule.</p>
         * <blockquote>
         * <p>You cannot specify this parameter together with <strong>SrcCidr</strong> or <strong>DstCidr</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2001:0db8:1234:****::/64</p>
         */
        @NameInMap("DstIPv6Cidr")
        public String dstIPv6Cidr;

        /**
         * <p>The destination port range that is used for traffic matching by the QoS rule. Valid values: <strong>0</strong> to <strong>65535</strong>. A value of -1 indicates that no port is matched. Only a single port number is supported. The start and end port numbers must be the same. The destination port range is fixed for each protocol type. Valid values:</p>
         * <ul>
         * <li><p><strong>ALL</strong>: -1/-1, not editable.</p>
         * </li>
         * <li><p><strong>ICMP(IPv4)</strong>: -1/-1, not editable.</p>
         * </li>
         * <li><p><strong>ICMPv6(IPv6)</strong>: -1/-1, not editable.</p>
         * </li>
         * <li><p><strong>TCP</strong>: -1/-1, editable.</p>
         * </li>
         * <li><p><strong>UDP</strong>: -1/-1, editable.</p>
         * </li>
         * <li><p><strong>GRE</strong>: -1/-1, not editable.</p>
         * </li>
         * <li><p><strong>SSH</strong>: 22/22, not editable.</p>
         * </li>
         * <li><p><strong>Telnet</strong>: 23/23, not editable.</p>
         * </li>
         * <li><p><strong>HTTP</strong>: 80/80, not editable.</p>
         * </li>
         * <li><p><strong>HTTPS</strong>: 443/443, not editable.</p>
         * </li>
         * <li><p><strong>MS SQL</strong>: 1443/1443, not editable.</p>
         * </li>
         * <li><p><strong>Oracle</strong>: 1521/1521, not editable.</p>
         * </li>
         * <li><p><strong>MySql</strong>: 3306/3306, not editable.</p>
         * </li>
         * <li><p><strong>RDP</strong>: 3389/3389, not editable.</p>
         * </li>
         * <li><p><strong>PostgreSQL</strong>: 5432/5432, not editable.</p>
         * </li>
         * <li><p><strong>Redis</strong>: 6379/6379, not editable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1/-1</p>
         */
        @NameInMap("DstPortRange")
        public String dstPortRange;

        /**
         * <p>The DSCP value that is used for traffic matching by the QoS rule. Valid values: <strong>0</strong> to <strong>63</strong>. A value of -1 indicates that no DSCP value is matched.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MatchDscp")
        public Integer matchDscp;

        /**
         * <p>The priority of the QoS rule. Valid values: <strong>1</strong> to <strong>9000</strong>. A larger value indicates a higher priority. The priority of each QoS rule must be unique within the same QoS policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The protocol type of the QoS rule. Valid values:</p>
         * <ul>
         * <li><p><strong>ALL</strong></p>
         * </li>
         * <li><p><strong>ICMP(IPv4)</strong></p>
         * </li>
         * <li><p><strong>ICMPv6(IPv6)</strong></p>
         * </li>
         * <li><p><strong>TCP</strong></p>
         * </li>
         * <li><p><strong>UDP</strong></p>
         * </li>
         * <li><p><strong>GRE</strong></p>
         * </li>
         * <li><p><strong>SSH</strong></p>
         * </li>
         * <li><p><strong>Telnet</strong></p>
         * </li>
         * <li><p><strong>HTTP</strong></p>
         * </li>
         * <li><p><strong>HTTPS</strong></p>
         * </li>
         * <li><p><strong>MS SQL</strong></p>
         * </li>
         * <li><p><strong>Oracle</strong></p>
         * </li>
         * <li><p><strong>MySql</strong></p>
         * </li>
         * <li><p><strong>RDP</strong></p>
         * </li>
         * <li><p><strong>PostgreSQL</strong></p>
         * </li>
         * <li><p><strong>Redis</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The QoS policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-91xz9f8zd7yj8x****</p>
         */
        @NameInMap("QosId")
        public String qosId;

        /**
         * <p>The QoS queue ID.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-queue-iugg0l9x27f2no****</p>
         */
        @NameInMap("QueueId")
        public String queueId;

        /**
         * <p>The new DSCP value to remark in the traffic. Valid values: <strong>0</strong> to <strong>63</strong>. A value of -1 indicates that the DSCP value is not modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RemarkingDscp")
        public Integer remarkingDscp;

        /**
         * <p>The description of the QoS rule.</p>
         * <p>The description must be <strong>0</strong> to <strong>256</strong> characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-rule-test</p>
         */
        @NameInMap("RuleDescription")
        public String ruleDescription;

        /**
         * <p>The QoS rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-rule-iugg0l9x27f2no****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the QoS rule.</p>
         * <p>The name must be <strong>0</strong> to <strong>128</strong> characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-rule-test</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The source IPv4 CIDR block that is used for traffic matching by the QoS rule.</p>
         * <blockquote>
         * <p>You cannot specify this parameter together with <strong>SrcIPv6Cidr</strong> or <strong>DstIPv6Cidr</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><code>1.1.**.**</code>/24</p>
         */
        @NameInMap("SrcCidr")
        public String srcCidr;

        /**
         * <p>The source IPv6 CIDR block that is used for traffic matching by the QoS rule.</p>
         * <blockquote>
         * <p>You cannot specify this parameter together with <strong>SrcCidr</strong> or <strong>DstCidr</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2001:0db8:1234:****::/64</p>
         */
        @NameInMap("SrcIPv6Cidr")
        public String srcIPv6Cidr;

        /**
         * <p>The source port range that is used for traffic matching by the QoS rule. Valid values: <strong>0</strong> to <strong>65535</strong>. A value of -1 indicates that no port is matched. Only a single port number is supported. The start and end port numbers must be the same.</p>
         * 
         * <strong>example:</strong>
         * <p>-1/-1</p>
         */
        @NameInMap("SrcPortRange")
        public String srcPortRange;

        /**
         * <p>The status of the QoS rule. Valid values:</p>
         * <ul>
         * <li><p><strong>Normal</strong>: active.</p>
         * </li>
         * <li><p><strong>Configuring</strong>: being configured.</p>
         * </li>
         * <li><p><strong>Deleting</strong>: being deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
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
         * <p>The bandwidth percentage of the QoS queue.</p>
         * <ul>
         * <li><p>When the QoS queue type is <strong>Medium</strong>, this field is required. Valid values: <strong>1</strong> to <strong>100</strong>.</p>
         * </li>
         * <li><p>When the QoS queue type is <strong>Default</strong>, this field is &quot;-&quot;.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("BandwidthPercent")
        public String bandwidthPercent;

        /**
         * <p>The QoS policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-ncfgzxg40zks5n****</p>
         */
        @NameInMap("QosId")
        public String qosId;

        /**
         * <p>The description of the QoS queue.</p>
         * <p>The description must be <strong>0</strong> to <strong>256</strong> characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-queue-test</p>
         */
        @NameInMap("QueueDescription")
        public String queueDescription;

        /**
         * <p>The QoS queue ID.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-queue-9nyx2u7n71s2rc****</p>
         */
        @NameInMap("QueueId")
        public String queueId;

        /**
         * <p>The name of the QoS queue.</p>
         * <p>The name must be <strong>0</strong> to <strong>128</strong> characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-queue-test</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The type of the QoS queue. Valid values:</p>
         * <ul>
         * <li><p><strong>High</strong>: high-priority queue.</p>
         * </li>
         * <li><p><strong>Medium</strong>: medium-priority queue.</p>
         * </li>
         * <li><p><strong>Default</strong>: default-priority queue.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The default-priority queue cannot be created.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>High</p>
         */
        @NameInMap("QueueType")
        public String queueType;

        /**
         * <p>The list of QoS rules.</p>
         */
        @NameInMap("RuleList")
        public java.util.List<DescribeExpressConnectTrafficQosQueueResponseBodyQueueListRuleList> ruleList;

        /**
         * <p>The status of the QoS queue. Valid values:</p>
         * <ul>
         * <li><p><strong>Normal</strong>: active.</p>
         * </li>
         * <li><p><strong>Configuring</strong>: being configured.</p>
         * </li>
         * <li><p><strong>Deleting</strong>: being deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
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
