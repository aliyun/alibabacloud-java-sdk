// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectTrafficQosRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9C7FA9D6-72E0-48A9-A9C3-2DA8569CD5EB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The QoS rules.</p>
     */
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
         * <p>The destination IP address IPv4 CIDR block for QoS rule traffic matching.</p>
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
         * <p>The destination IP address IPv6 CIDR block for QoS rule traffic matching.</p>
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
         * <p>The destination port range for QoS rule traffic matching. Valid values: <strong>0</strong> to <strong>65535</strong>. A value of -1 indicates no match. Currently, only a single port number can be specified, and the start and end port numbers must be the same. The destination port range is fixed for each protocol type. Valid values:</p>
         * <ul>
         * <li><p><strong>ALL</strong>: -1/-1. Not editable.</p>
         * </li>
         * <li><p><strong>ICMP(IPv4)</strong>: -1/-1. Not editable.</p>
         * </li>
         * <li><p><strong>ICMPv6(IPv6)</strong>: -1/-1. Not editable.</p>
         * </li>
         * <li><p><strong>TCP</strong>: -1/-1. Editable.</p>
         * </li>
         * <li><p><strong>UDP</strong>: -1/-1. Editable.</p>
         * </li>
         * <li><p><strong>GRE</strong>: -1/-1. Not editable.</p>
         * </li>
         * <li><p><strong>SSH</strong>: 22/22. Not editable.</p>
         * </li>
         * <li><p><strong>Telnet</strong>: 23/23. Not editable.</p>
         * </li>
         * <li><p><strong>HTTP</strong>: 80/80. Not editable.</p>
         * </li>
         * <li><p><strong>HTTPS</strong>: 443/443. Not editable.</p>
         * </li>
         * <li><p><strong>MS SQL</strong>: 1443/1443. Not editable.</p>
         * </li>
         * <li><p><strong>Oracle</strong>: 1521/1521. Not editable.</p>
         * </li>
         * <li><p><strong>MySql</strong>: 3306/3306. Not editable.</p>
         * </li>
         * <li><p><strong>RDP</strong>: 3389/3389. Not editable.</p>
         * </li>
         * <li><p><strong>PostgreSQL</strong>: 5432/5432. Not editable.</p>
         * </li>
         * <li><p><strong>Redis</strong>: 6379/6379. Not editable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1/-1</p>
         */
        @NameInMap("DstPortRange")
        public String dstPortRange;

        /**
         * <p>The DSCP value for QoS rule traffic matching. Valid values: <strong>0</strong> to <strong>63</strong>. A value of -1 indicates no match.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MatchDscp")
        public Integer matchDscp;

        /**
         * <p>The priority of the QoS rule. Valid values: <strong>1</strong> to <strong>9000</strong>. A larger value indicates a higher priority. QoS rule priorities must be unique within the same QoS policy.</p>
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
         * <li><p><strong>Redis</strong></p>
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
         * <p>qos-pksbqfmotl5hzq****</p>
         */
        @NameInMap("QosId")
        public String qosId;

        /**
         * <p>The QoS queue ID.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-queue-9nyx2u7n71s2rc****</p>
         */
        @NameInMap("QueueId")
        public String queueId;

        /**
         * <p>The remarked DSCP value in the traffic. Valid values: <strong>0</strong> to <strong>63</strong>. A value of -1 indicates no remarking.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RemarkingDscp")
        public Integer remarkingDscp;

        /**
         * <p>The description of the QoS rule.</p>
         * <p>The description must be 0 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
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
         * <p>qos-rule-iugg0l9x27f2noc****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the QoS rule.</p>
         * <p>The name must be 0 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-rule-test</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The source IPv4 CIDR block for QoS rule traffic matching.</p>
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
         * <p>The source IPv6 CIDR block for QoS rule traffic matching.</p>
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
         * <p>The source port range for QoS rule traffic matching. Valid values: <strong>0</strong> to <strong>65535</strong>. A value of -1 indicates no match. Currently, only a single port number can be specified, and the start and end port numbers must be the same.</p>
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
