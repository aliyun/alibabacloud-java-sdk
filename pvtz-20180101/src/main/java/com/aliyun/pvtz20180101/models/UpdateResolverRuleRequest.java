// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateResolverRuleRequest extends TeaModel {
    /**
     * <p>The ID of the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>hr****</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The IP addresses and ports of external DNS servers. DNS queries are forwarded to these servers. You can specify up to six servers. Both private and public IP addresses are supported.</p>
     * <blockquote>
     * <p>If you specify a public IP address for an external DNS server, and the Elastic Compute Service (ECS) instances in the virtual private cloud (VPC) for the outbound endpoint do not have public IP addresses, enable a NAT Gateway and configure Source Network Address Translation (SNAT) entries for it.</p>
     * </blockquote>
     */
    @NameInMap("ForwardIp")
    public java.util.List<UpdateResolverRuleRequestForwardIp> forwardIp;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh: Chinese.</p>
     * </li>
     * <li><p>en: English.</p>
     * </li>
     * </ul>
     * <p>Default value: en</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the forwarding rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Forwarding rule-test</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("PriorityForwardConfigs")
    public java.util.List<UpdateResolverRuleRequestPriorityForwardConfigs> priorityForwardConfigs;

    /**
     * <p>The ID of the forwarding rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hr****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static UpdateResolverRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResolverRuleRequest self = new UpdateResolverRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResolverRuleRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public UpdateResolverRuleRequest setForwardIp(java.util.List<UpdateResolverRuleRequestForwardIp> forwardIp) {
        this.forwardIp = forwardIp;
        return this;
    }
    public java.util.List<UpdateResolverRuleRequestForwardIp> getForwardIp() {
        return this.forwardIp;
    }

    public UpdateResolverRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateResolverRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateResolverRuleRequest setPriorityForwardConfigs(java.util.List<UpdateResolverRuleRequestPriorityForwardConfigs> priorityForwardConfigs) {
        this.priorityForwardConfigs = priorityForwardConfigs;
        return this;
    }
    public java.util.List<UpdateResolverRuleRequestPriorityForwardConfigs> getPriorityForwardConfigs() {
        return this.priorityForwardConfigs;
    }

    public UpdateResolverRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public static class UpdateResolverRuleRequestForwardIp extends TeaModel {
        /**
         * <p>The IP address of the destination server.</p>
         * <blockquote>
         * <p>The IP addresses in the following ranges are reserved by the system and cannot be used for external DNS servers:
         * 100.100.2.136-100.100.2.138
         * 100.100.2.116-100.100.2.118</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The port number of the destination server.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("Port")
        public Integer port;

        public static UpdateResolverRuleRequestForwardIp build(java.util.Map<String, ?> map) throws Exception {
            UpdateResolverRuleRequestForwardIp self = new UpdateResolverRuleRequestForwardIp();
            return TeaModel.build(map, self);
        }

        public UpdateResolverRuleRequestForwardIp setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public UpdateResolverRuleRequestForwardIp setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class UpdateResolverRuleRequestPriorityForwardConfigs extends TeaModel {
        @NameInMap("AlidnsServiceAddresses")
        public java.util.List<String> alidnsServiceAddresses;

        @NameInMap("CustomAddresses")
        public java.util.List<String> customAddresses;

        @NameInMap("EnableStatus")
        public String enableStatus;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Protocol")
        public String protocol;

        public static UpdateResolverRuleRequestPriorityForwardConfigs build(java.util.Map<String, ?> map) throws Exception {
            UpdateResolverRuleRequestPriorityForwardConfigs self = new UpdateResolverRuleRequestPriorityForwardConfigs();
            return TeaModel.build(map, self);
        }

        public UpdateResolverRuleRequestPriorityForwardConfigs setAlidnsServiceAddresses(java.util.List<String> alidnsServiceAddresses) {
            this.alidnsServiceAddresses = alidnsServiceAddresses;
            return this;
        }
        public java.util.List<String> getAlidnsServiceAddresses() {
            return this.alidnsServiceAddresses;
        }

        public UpdateResolverRuleRequestPriorityForwardConfigs setCustomAddresses(java.util.List<String> customAddresses) {
            this.customAddresses = customAddresses;
            return this;
        }
        public java.util.List<String> getCustomAddresses() {
            return this.customAddresses;
        }

        public UpdateResolverRuleRequestPriorityForwardConfigs setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public UpdateResolverRuleRequestPriorityForwardConfigs setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public UpdateResolverRuleRequestPriorityForwardConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
