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
     * <p>The list of QoS rules.</p>
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
         * <p>The destination IPv4 CIDR block that matches the QoS rule traffic.</p>
         * <blockquote>
         * <p>When this parameter is unavailable, specify <strong>SrcIPv6Cidr</strong> or <strong>DstIPv6Cidr</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.0/24</p>
         */
        @NameInMap("DstCidr")
        public String dstCidr;

        /**
         * <p>The destination IPv6 CIDR block that matches the QoS rule traffic.</p>
         * <blockquote>
         * <p>When this parameter is unavailable, specify <strong>SrcCidr</strong> or <strong>DstCidr</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2001:0db8:1234:5678::/64</p>
         */
        @NameInMap("DstIPv6Cidr")
        public String dstIPv6Cidr;

        /**
         * <p>The range of destination ports that match the QoS rule traffic. Valid values: <strong>0</strong> to <strong>65535</strong>. If the traffic does not match, the value is -1. You can specify only one port. The start port number must be the same as the end port number. Different protocols correspond to different ports. Valid values:</p>
         * <ul>
         * <li><strong>ALL</strong> (uneditable): -1/-1.</li>
         * <li><strong>ICMP(IPv4)</strong> (uneditable): -1/-1.</li>
         * <li><strong>ICMPv6(IPv6)</strong> (uneditable): -1/-1.</li>
         * <li><strong>TCP</strong> (editable): -1/-1.</li>
         * <li><strong>UDP</strong> (editable): -1/-1.</li>
         * <li><strong>GRE</strong> (uneditable): -1/-1.</li>
         * <li><strong>SSH</strong> (uneditable): 22/22.</li>
         * <li><strong>Telnet</strong> (uneditable): 23/23.</li>
         * <li><strong>HTTP</strong> (uneditable): 80/80.</li>
         * <li><strong>HTTPS</strong> (uneditable): 443/443.</li>
         * <li><strong>MS SQL</strong> (uneditable): 1443/1443.</li>
         * <li><strong>Oracle</strong> (uneditable): 1521/1521.</li>
         * <li><strong>MySql</strong> (uneditable): 3306/3306.</li>
         * <li><strong>RDP</strong> (uneditable): 3389/3389.</li>
         * <li><strong>PostgreSQL</strong> (uneditable): 5432/5432.</li>
         * <li><strong>Redis</strong> (uneditable): 6379/6379.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1/-1</p>
         */
        @NameInMap("DstPortRange")
        public String dstPortRange;

        /**
         * <p>The DSCP value that matches the QoS rule traffic. Valid values: <strong>0</strong> to <strong>63</strong>. If no value is matched, the value is -1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MatchDscp")
        public Integer matchDscp;

        /**
         * <p>The priority of the QoS rule. Valid values: <strong>1</strong> to <strong>9000</strong>. A larger value indicates a higher priority. The priority of each QoS rule must be unique in the same QoS policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The protocol of the QoS rule. Valid values:</p>
         * <ul>
         * <li><strong>ALL</strong></li>
         * <li><strong>ICMP(IPv4)</strong></li>
         * <li><strong>ICMPv6(IPv6)</strong></li>
         * <li><strong>TCP</strong></li>
         * <li><strong>UDP</strong></li>
         * <li><strong>GRE</strong></li>
         * <li><strong>SSH</strong></li>
         * <li><strong>Telnet</strong></li>
         * <li><strong>HTTP</strong></li>
         * <li><strong>HTTPS</strong></li>
         * <li><strong>MS SQL</strong></li>
         * <li><strong>Oracle</strong></li>
         * <li><strong>MySql</strong></li>
         * <li><strong>RDP</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * <li><strong>Redis</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The ID of the QoS policy.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-pksbqfmotl5hzqmhf8</p>
         */
        @NameInMap("QosId")
        public String qosId;

        /**
         * <p>The ID of the QoS queue.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-queue-9nyx2u7n71s2rcy4n5</p>
         */
        @NameInMap("QueueId")
        public String queueId;

        /**
         * <p>The new DSCP value. Valid values: <strong>0</strong> to <strong>63</strong>. If you do not change the value, set the value to -1.</p>
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
         * <p>The ID of the QoS rule.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-rule-iugg0l9x27f2nocouj</p>
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
         * <p>The source IPv4 CIDR block that matches the QoS rule traffic.</p>
         * <blockquote>
         * <p>When this parameter is unavailable, specify <strong>SrcIPv6Cidr</strong> or <strong>DstIPv6Cidr</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.0/24</p>
         */
        @NameInMap("SrcCidr")
        public String srcCidr;

        /**
         * <p>The source IPv6 CIDR block that matches the QoS rule traffic.</p>
         * <blockquote>
         * <p>When this parameter is unavailable, specify <strong>SrcCidr</strong> or <strong>DstCidr</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2001:0db8:1234:5678::/64</p>
         */
        @NameInMap("SrcIPv6Cidr")
        public String srcIPv6Cidr;

        /**
         * <p>The range of source ports that match the QoS rule traffic. Valid values: <strong>0</strong> to <strong>65535</strong>. If the traffic does not match, the value is -1. You can specify only one port. The start port number must be the same as the end port number.</p>
         * 
         * <strong>example:</strong>
         * <p>-1/-1</p>
         */
        @NameInMap("SrcPortRange")
        public String srcPortRange;

        /**
         * <p>The status of the QoS rule. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong></li>
         * <li><strong>Configuring</strong></li>
         * <li><strong>Deleting</strong></li>
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
