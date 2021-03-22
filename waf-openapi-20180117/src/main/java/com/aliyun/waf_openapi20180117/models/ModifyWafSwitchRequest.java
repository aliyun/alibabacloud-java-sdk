// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class ModifyWafSwitchRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Region")
    public String region;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ServiceOn")
    public Integer serviceOn;

    public static ModifyWafSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWafSwitchRequest self = new ModifyWafSwitchRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWafSwitchRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyWafSwitchRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyWafSwitchRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ModifyWafSwitchRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyWafSwitchRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyWafSwitchRequest setServiceOn(Integer serviceOn) {
        this.serviceOn = serviceOn;
        return this;
    }
    public Integer getServiceOn() {
        return this.serviceOn;
    }

}
