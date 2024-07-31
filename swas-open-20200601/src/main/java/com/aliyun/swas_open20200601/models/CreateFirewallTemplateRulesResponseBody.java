// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateFirewallTemplateRulesResponseBody extends TeaModel {
    /**
     * <p>The firewall template rules.</p>
     */
    @NameInMap("FirewallTemplateRules")
    public java.util.List<CreateFirewallTemplateRulesResponseBodyFirewallTemplateRules> firewallTemplateRules;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateFirewallTemplateRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFirewallTemplateRulesResponseBody self = new CreateFirewallTemplateRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFirewallTemplateRulesResponseBody setFirewallTemplateRules(java.util.List<CreateFirewallTemplateRulesResponseBodyFirewallTemplateRules> firewallTemplateRules) {
        this.firewallTemplateRules = firewallTemplateRules;
        return this;
    }
    public java.util.List<CreateFirewallTemplateRulesResponseBodyFirewallTemplateRules> getFirewallTemplateRules() {
        return this.firewallTemplateRules;
    }

    public CreateFirewallTemplateRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateFirewallTemplateRulesResponseBodyFirewallTemplateRules extends TeaModel {
        /**
         * <p>The ID of the firewall template rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ft-bcf1a7hrdq717****</p>
         */
        @NameInMap("FirewallTemplateRuleId")
        public String firewallTemplateRuleId;

        /**
         * <p>The port range. Valid values: 1 to 65535. Specify a port range in the format of \<start port number>/\<end port number>. Example: <code>1024/1055</code>, which indicates that the port range of 1024 to 1055.</p>
         * <blockquote>
         * <p> If you set RuleProtocol to ICMP, you must set Port to -1/-1.</p>
         * </blockquote>
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
         * <li>ICMP: the ICMP protocol</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("RuleProtocol")
        public String ruleProtocol;

        /**
         * <p>The source address to which you want to grant access permissions. CIDR blocks and IPv4 addresses are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>171.233.XX.XX</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        public static CreateFirewallTemplateRulesResponseBodyFirewallTemplateRules build(java.util.Map<String, ?> map) throws Exception {
            CreateFirewallTemplateRulesResponseBodyFirewallTemplateRules self = new CreateFirewallTemplateRulesResponseBodyFirewallTemplateRules();
            return TeaModel.build(map, self);
        }

        public CreateFirewallTemplateRulesResponseBodyFirewallTemplateRules setFirewallTemplateRuleId(String firewallTemplateRuleId) {
            this.firewallTemplateRuleId = firewallTemplateRuleId;
            return this;
        }
        public String getFirewallTemplateRuleId() {
            return this.firewallTemplateRuleId;
        }

        public CreateFirewallTemplateRulesResponseBodyFirewallTemplateRules setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public CreateFirewallTemplateRulesResponseBodyFirewallTemplateRules setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public CreateFirewallTemplateRulesResponseBodyFirewallTemplateRules setRuleProtocol(String ruleProtocol) {
            this.ruleProtocol = ruleProtocol;
            return this;
        }
        public String getRuleProtocol() {
            return this.ruleProtocol;
        }

        public CreateFirewallTemplateRulesResponseBodyFirewallTemplateRules setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

    }

}
