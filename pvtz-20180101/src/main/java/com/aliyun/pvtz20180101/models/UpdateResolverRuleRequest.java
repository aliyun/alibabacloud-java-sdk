// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateResolverRuleRequest extends TeaModel {
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The destination IP address and port number.</p>
     */
    @NameInMap("ForwardIp")
    public java.util.List<UpdateResolverRuleRequestForwardIp> forwardIp;

    /**
     * <p>The language.</p>
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
     * <p>forward rule-test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The forwarding rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hra0**</p>
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

    public UpdateResolverRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public static class UpdateResolverRuleRequestForwardIp extends TeaModel {
        /**
         * <p>The destination IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.xx.xx</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The port number.</p>
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

}
