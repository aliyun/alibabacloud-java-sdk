// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class DeleteDomainConfigRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Region")
    public String region;

    public static DeleteDomainConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainConfigRequest self = new DeleteDomainConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDomainConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DeleteDomainConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteDomainConfigRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DeleteDomainConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteDomainConfigRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
