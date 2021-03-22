// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class ModifyProtectionRuleCacheStatusRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Defense")
    public String defense;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Region")
    public String region;

    public static ModifyProtectionRuleCacheStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyProtectionRuleCacheStatusRequest self = new ModifyProtectionRuleCacheStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyProtectionRuleCacheStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyProtectionRuleCacheStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyProtectionRuleCacheStatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyProtectionRuleCacheStatusRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyProtectionRuleCacheStatusRequest setDefense(String defense) {
        this.defense = defense;
        return this;
    }
    public String getDefense() {
        return this.defense;
    }

    public ModifyProtectionRuleCacheStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyProtectionRuleCacheStatusRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
