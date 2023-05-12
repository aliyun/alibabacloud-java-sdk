// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateResolverRuleRequest extends TeaModel {
    @NameInMap("ForwardIp")
    public java.util.List<UpdateResolverRuleRequestForwardIp> forwardIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Name")
    public String name;

    @NameInMap("RuleId")
    public String ruleId;

    public static UpdateResolverRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResolverRuleRequest self = new UpdateResolverRuleRequest();
        return TeaModel.build(map, self);
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
        @NameInMap("Ip")
        public String ip;

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
