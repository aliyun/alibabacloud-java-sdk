// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateFirewallTemplateRequest extends TeaModel {
    /**
     * <p>The description of the firewall template.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The details of the firewall rule.</p>
     */
    @NameInMap("FirewallRule")
    public java.util.List<CreateFirewallTemplateRequestFirewallRule> firewallRule;

    /**
     * <p>The name of the firewall template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID of the simple application server to which the firewall template belongs. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateFirewallTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFirewallTemplateRequest self = new CreateFirewallTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateFirewallTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFirewallTemplateRequest setFirewallRule(java.util.List<CreateFirewallTemplateRequestFirewallRule> firewallRule) {
        this.firewallRule = firewallRule;
        return this;
    }
    public java.util.List<CreateFirewallTemplateRequestFirewallRule> getFirewallRule() {
        return this.firewallRule;
    }

    public CreateFirewallTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFirewallTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateFirewallTemplateRequestFirewallRule extends TeaModel {
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
         * <p>223.166.XX.XX</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        public static CreateFirewallTemplateRequestFirewallRule build(java.util.Map<String, ?> map) throws Exception {
            CreateFirewallTemplateRequestFirewallRule self = new CreateFirewallTemplateRequestFirewallRule();
            return TeaModel.build(map, self);
        }

        public CreateFirewallTemplateRequestFirewallRule setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public CreateFirewallTemplateRequestFirewallRule setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public CreateFirewallTemplateRequestFirewallRule setRuleProtocol(String ruleProtocol) {
            this.ruleProtocol = ruleProtocol;
            return this;
        }
        public String getRuleProtocol() {
            return this.ruleProtocol;
        }

        public CreateFirewallTemplateRequestFirewallRule setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

    }

}
