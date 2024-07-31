// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateFirewallRulesRequest extends TeaModel {
    /**
     * <p>The client token.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Details about the firewall rules.</p>
     */
    @NameInMap("FirewallRules")
    public java.util.List<CreateFirewallRulesRequestFirewallRules> firewallRules;

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
     * <p>The region ID of the simple application server. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The tags that you want to add to the firewall. You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateFirewallRulesRequestTag> tag;

    public static CreateFirewallRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFirewallRulesRequest self = new CreateFirewallRulesRequest();
        return TeaModel.build(map, self);
    }

    public CreateFirewallRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateFirewallRulesRequest setFirewallRules(java.util.List<CreateFirewallRulesRequestFirewallRules> firewallRules) {
        this.firewallRules = firewallRules;
        return this;
    }
    public java.util.List<CreateFirewallRulesRequestFirewallRules> getFirewallRules() {
        return this.firewallRules;
    }

    public CreateFirewallRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateFirewallRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateFirewallRulesRequest setTag(java.util.List<CreateFirewallRulesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateFirewallRulesRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateFirewallRulesRequestFirewallRules extends TeaModel {
        /**
         * <p>The port number.</p>
         * <ul>
         * <li>When the transport layer protocol is TCP and/or UDP, the port number range is 1 to 65535. Specify a port range in the format of \<Start port number>/\<End port number>. Example: 1/200.</li>
         * <li>When the transport layer protocol is ICMP, the port number range is -1/-1, which indicates all ports.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The description of the firewall rule.</p>
         * 
         * <strong>example:</strong>
         * <p>TEST</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The transport layer protocol. Valid values:</p>
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
         * <p>The IP address or CIDR block that is allowed in the firewall rule.</p>
         * 
         * <strong>example:</strong>
         * <p>47.101.XX.XX</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        public static CreateFirewallRulesRequestFirewallRules build(java.util.Map<String, ?> map) throws Exception {
            CreateFirewallRulesRequestFirewallRules self = new CreateFirewallRulesRequestFirewallRules();
            return TeaModel.build(map, self);
        }

        public CreateFirewallRulesRequestFirewallRules setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public CreateFirewallRulesRequestFirewallRules setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public CreateFirewallRulesRequestFirewallRules setRuleProtocol(String ruleProtocol) {
            this.ruleProtocol = ruleProtocol;
            return this;
        }
        public String getRuleProtocol() {
            return this.ruleProtocol;
        }

        public CreateFirewallRulesRequestFirewallRules setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

    }

    public static class CreateFirewallRulesRequestTag extends TeaModel {
        /**
         * <p>The tag key. Valid values of N: 1 to 20.</p>
         * <p>The tag key cannot be an empty string. The tag key can be up to 64 characters in length and cannot contain http:// or https://. The tag key cannot start with acs: or aliyun.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. Valid values of N: 1 to 20.</p>
         * <p>The tag value can be an empty string. The tag value can be up to 64 characters in length and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateFirewallRulesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateFirewallRulesRequestTag self = new CreateFirewallRulesRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateFirewallRulesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateFirewallRulesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
