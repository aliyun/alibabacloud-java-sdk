// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ModifyFirewallTemplateRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>token</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the firewall template.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

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
     * <p>The firewall rule in the template.</p>
     */
    @NameInMap("FirewallTemplateRule")
    public java.util.List<ModifyFirewallTemplateRequestFirewallTemplateRule> firewallTemplateRule;

    /**
     * <p>The name of the firewall template.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID of the simple application server. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyFirewallTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFirewallTemplateRequest self = new ModifyFirewallTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFirewallTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyFirewallTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyFirewallTemplateRequest setFirewallTemplateId(String firewallTemplateId) {
        this.firewallTemplateId = firewallTemplateId;
        return this;
    }
    public String getFirewallTemplateId() {
        return this.firewallTemplateId;
    }

    public ModifyFirewallTemplateRequest setFirewallTemplateRule(java.util.List<ModifyFirewallTemplateRequestFirewallTemplateRule> firewallTemplateRule) {
        this.firewallTemplateRule = firewallTemplateRule;
        return this;
    }
    public java.util.List<ModifyFirewallTemplateRequestFirewallTemplateRule> getFirewallTemplateRule() {
        return this.firewallTemplateRule;
    }

    public ModifyFirewallTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyFirewallTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyFirewallTemplateRequestFirewallTemplateRule extends TeaModel {
        /**
         * <p>The ID of the firewall rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eeea34d9867b4d55a4ff8d5fcfbd****</p>
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
         * <p>The remarks of the firewall template rule.</p>
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
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        public static ModifyFirewallTemplateRequestFirewallTemplateRule build(java.util.Map<String, ?> map) throws Exception {
            ModifyFirewallTemplateRequestFirewallTemplateRule self = new ModifyFirewallTemplateRequestFirewallTemplateRule();
            return TeaModel.build(map, self);
        }

        public ModifyFirewallTemplateRequestFirewallTemplateRule setFirewallTemplateRuleId(String firewallTemplateRuleId) {
            this.firewallTemplateRuleId = firewallTemplateRuleId;
            return this;
        }
        public String getFirewallTemplateRuleId() {
            return this.firewallTemplateRuleId;
        }

        public ModifyFirewallTemplateRequestFirewallTemplateRule setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ModifyFirewallTemplateRequestFirewallTemplateRule setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ModifyFirewallTemplateRequestFirewallTemplateRule setRuleProtocol(String ruleProtocol) {
            this.ruleProtocol = ruleProtocol;
            return this;
        }
        public String getRuleProtocol() {
            return this.ruleProtocol;
        }

        public ModifyFirewallTemplateRequestFirewallTemplateRule setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

    }

}
