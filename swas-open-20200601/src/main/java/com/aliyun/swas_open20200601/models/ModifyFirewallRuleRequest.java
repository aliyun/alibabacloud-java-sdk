// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ModifyFirewallRuleRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The value of <strong>ClientToken</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the simple application server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ace0706b2ac4454d984295a94213****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The port range. Valid values: 165535. Specify a port range in the format of \<start port number>/\<end port number>. Example: <code>1024/1055</code>, which indicates that the port range of 10241055.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The region ID of the simple application server. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The remarks of the firewall rule.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The ID of the firewall rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eeea34d9867b4d55a4ff8d5fcfbd****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The transport layer protocol. Valid values:</p>
     * <ul>
     * <li>TCP: the TCP protocol</li>
     * <li>UDP: the UDP protocol</li>
     * <li>TCP+UDP: the TCP and UDP protocols</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("RuleProtocol")
    public String ruleProtocol;

    /**
     * <p>The IP address or CIDR block that is allowed in the firewall rule.</p>
     * 
     * <strong>example:</strong>
     * <p>10.147.33.**</p>
     */
    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    public static ModifyFirewallRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFirewallRuleRequest self = new ModifyFirewallRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFirewallRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyFirewallRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyFirewallRuleRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public ModifyFirewallRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyFirewallRuleRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ModifyFirewallRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public ModifyFirewallRuleRequest setRuleProtocol(String ruleProtocol) {
        this.ruleProtocol = ruleProtocol;
        return this;
    }
    public String getRuleProtocol() {
        return this.ruleProtocol;
    }

    public ModifyFirewallRuleRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

}
