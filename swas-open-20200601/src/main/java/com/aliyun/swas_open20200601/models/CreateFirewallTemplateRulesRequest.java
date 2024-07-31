// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateFirewallTemplateRulesRequest extends TeaModel {
    /**
     * <p>The details of the firewall rule.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FirewallRule")
    public java.util.List<CreateFirewallTemplateRulesRequestFirewallRule> firewallRule;

    /**
     * <p>The ID of the firewall template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ft-bcf1a7hrdq717****</p>
     */
    @NameInMap("FirewallTemplateId")
    public String firewallTemplateId;

    /**
     * <p>The region ID of the simple application server to which the firewall template is applied. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateFirewallTemplateRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFirewallTemplateRulesRequest self = new CreateFirewallTemplateRulesRequest();
        return TeaModel.build(map, self);
    }

    public CreateFirewallTemplateRulesRequest setFirewallRule(java.util.List<CreateFirewallTemplateRulesRequestFirewallRule> firewallRule) {
        this.firewallRule = firewallRule;
        return this;
    }
    public java.util.List<CreateFirewallTemplateRulesRequestFirewallRule> getFirewallRule() {
        return this.firewallRule;
    }

    public CreateFirewallTemplateRulesRequest setFirewallTemplateId(String firewallTemplateId) {
        this.firewallTemplateId = firewallTemplateId;
        return this;
    }
    public String getFirewallTemplateId() {
        return this.firewallTemplateId;
    }

    public CreateFirewallTemplateRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateFirewallTemplateRulesRequestFirewallRule extends TeaModel {
        /**
         * <p>The port range. Valid values: 1 to 65535. Specify a port range in the format of \<start port number>/\<end port number>. Example: <code>1024/1055</code>, which indicates that the port range of 1024 to 1055.</p>
         * <blockquote>
         * <p> If you set RuleProtocol to ICMP, you must set Port to -1/-1.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The remarks of the firewall rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The transport layer protocol that the rule supports. Valid values:</p>
         * <ul>
         * <li>TCP</li>
         * <li>UDP</li>
         * <li>TCP+UDP</li>
         * <li>ICMP</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("RuleProtocol")
        public String ruleProtocol;

        /**
         * <p>The source address to which you want to grant access permissions. CIDR blocks and IPv4 addresses are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>222.70.XX.XX</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        public static CreateFirewallTemplateRulesRequestFirewallRule build(java.util.Map<String, ?> map) throws Exception {
            CreateFirewallTemplateRulesRequestFirewallRule self = new CreateFirewallTemplateRulesRequestFirewallRule();
            return TeaModel.build(map, self);
        }

        public CreateFirewallTemplateRulesRequestFirewallRule setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public CreateFirewallTemplateRulesRequestFirewallRule setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public CreateFirewallTemplateRulesRequestFirewallRule setRuleProtocol(String ruleProtocol) {
            this.ruleProtocol = ruleProtocol;
            return this;
        }
        public String getRuleProtocol() {
            return this.ruleProtocol;
        }

        public CreateFirewallTemplateRulesRequestFirewallRule setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

    }

}
