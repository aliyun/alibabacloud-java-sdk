// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyLogServiceStatusRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Enabled")
    public Integer enabled;

    public static ModifyLogServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogServiceStatusRequest self = new ModifyLogServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLogServiceStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyLogServiceStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyLogServiceStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyLogServiceStatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyLogServiceStatusRequest setEnabled(Integer enabled) {
        this.enabled = enabled;
        return this;
    }
    public Integer getEnabled() {
        return this.enabled;
    }

}
