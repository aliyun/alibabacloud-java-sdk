// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class ModifyAclRuleRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Rules")
    public String rules;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Region")
    public String region;

    public static ModifyAclRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAclRuleRequest self = new ModifyAclRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAclRuleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyAclRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyAclRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyAclRuleRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

    public ModifyAclRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyAclRuleRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
