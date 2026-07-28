// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateExpressConnectTrafficQosRuleRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The destination IP address IPv4 CIDR block for traffic matching in the QoS rule.</p>
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
     * <p>The destination IP address IPv6 CIDR block for traffic matching in the QoS rule.</p>
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
     * <p>The destination port range for traffic matching in the QoS rule. Valid values: <strong>0</strong> to <strong>65535</strong>. Set the value to -1 if no matching is required. Currently, only a single port number can be specified. The start and end port numbers must be the same. The destination port range is fixed for each protocol type. Valid values:</p>
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
     * <p>The DSCP value for traffic matching in the QoS rule. Valid values: <strong>0</strong> to <strong>63</strong>. Set the value to -1 if no matching is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MatchDscp")
    public Integer matchDscp;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The priority of the QoS rule. Valid values: <strong>1</strong> to <strong>9000</strong>. A larger value indicates a higher priority. The priority must be unique within the same QoS policy.</p>
     * <p>This parameter is required.</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The QoS policy ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-2giu0a6vd5x0mv****</p>
     */
    @NameInMap("QosId")
    public String qosId;

    /**
     * <p>The QoS queue ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-queue-9nyx2u7n71s2rc****</p>
     */
    @NameInMap("QueueId")
    public String queueId;

    /**
     * <p>The region ID of the QoS policy.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The new DSCP value to remark on the traffic. Valid values: <strong>0</strong> to <strong>63</strong>. Set the value to -1 if no remarking is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RemarkingDscp")
    public Integer remarkingDscp;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

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
     * <p>The name of the QoS rule.</p>
     * <p>The name must be 0 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-rule-test</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The source IPv4 CIDR block for traffic matching in the QoS rule.</p>
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
     * <p>The source IPv6 CIDR block for traffic matching in the QoS rule.</p>
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
     * <p>The source port range for traffic matching in the QoS rule. Valid values: <strong>0</strong> to <strong>65535</strong>. Set the value to -1 if no matching is required. Currently, only a single port number can be specified. The start and end port numbers must be the same.</p>
     * 
     * <strong>example:</strong>
     * <p>-1/-1</p>
     */
    @NameInMap("SrcPortRange")
    public String srcPortRange;

    public static CreateExpressConnectTrafficQosRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExpressConnectTrafficQosRuleRequest self = new CreateExpressConnectTrafficQosRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateExpressConnectTrafficQosRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateExpressConnectTrafficQosRuleRequest setDstCidr(String dstCidr) {
        this.dstCidr = dstCidr;
        return this;
    }
    public String getDstCidr() {
        return this.dstCidr;
    }

    public CreateExpressConnectTrafficQosRuleRequest setDstIPv6Cidr(String dstIPv6Cidr) {
        this.dstIPv6Cidr = dstIPv6Cidr;
        return this;
    }
    public String getDstIPv6Cidr() {
        return this.dstIPv6Cidr;
    }

    public CreateExpressConnectTrafficQosRuleRequest setDstPortRange(String dstPortRange) {
        this.dstPortRange = dstPortRange;
        return this;
    }
    public String getDstPortRange() {
        return this.dstPortRange;
    }

    public CreateExpressConnectTrafficQosRuleRequest setMatchDscp(Integer matchDscp) {
        this.matchDscp = matchDscp;
        return this;
    }
    public Integer getMatchDscp() {
        return this.matchDscp;
    }

    public CreateExpressConnectTrafficQosRuleRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateExpressConnectTrafficQosRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateExpressConnectTrafficQosRuleRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateExpressConnectTrafficQosRuleRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateExpressConnectTrafficQosRuleRequest setQosId(String qosId) {
        this.qosId = qosId;
        return this;
    }
    public String getQosId() {
        return this.qosId;
    }

    public CreateExpressConnectTrafficQosRuleRequest setQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }
    public String getQueueId() {
        return this.queueId;
    }

    public CreateExpressConnectTrafficQosRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateExpressConnectTrafficQosRuleRequest setRemarkingDscp(Integer remarkingDscp) {
        this.remarkingDscp = remarkingDscp;
        return this;
    }
    public Integer getRemarkingDscp() {
        return this.remarkingDscp;
    }

    public CreateExpressConnectTrafficQosRuleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateExpressConnectTrafficQosRuleRequest setRuleDescription(String ruleDescription) {
        this.ruleDescription = ruleDescription;
        return this;
    }
    public String getRuleDescription() {
        return this.ruleDescription;
    }

    public CreateExpressConnectTrafficQosRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateExpressConnectTrafficQosRuleRequest setSrcCidr(String srcCidr) {
        this.srcCidr = srcCidr;
        return this;
    }
    public String getSrcCidr() {
        return this.srcCidr;
    }

    public CreateExpressConnectTrafficQosRuleRequest setSrcIPv6Cidr(String srcIPv6Cidr) {
        this.srcIPv6Cidr = srcIPv6Cidr;
        return this;
    }
    public String getSrcIPv6Cidr() {
        return this.srcIPv6Cidr;
    }

    public CreateExpressConnectTrafficQosRuleRequest setSrcPortRange(String srcPortRange) {
        this.srcPortRange = srcPortRange;
        return this;
    }
    public String getSrcPortRange() {
        return this.srcPortRange;
    }

}
