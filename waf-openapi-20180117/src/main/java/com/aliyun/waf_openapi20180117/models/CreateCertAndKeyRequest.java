// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class CreateCertAndKeyRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Region")
    public String region;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Cert")
    public String cert;

    @NameInMap("Key")
    public String key;

    @NameInMap("HttpsCertName")
    public String httpsCertName;

    public static CreateCertAndKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCertAndKeyRequest self = new CreateCertAndKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateCertAndKeyRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateCertAndKeyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateCertAndKeyRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateCertAndKeyRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateCertAndKeyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateCertAndKeyRequest setCert(String cert) {
        this.cert = cert;
        return this;
    }
    public String getCert() {
        return this.cert;
    }

    public CreateCertAndKeyRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public CreateCertAndKeyRequest setHttpsCertName(String httpsCertName) {
        this.httpsCertName = httpsCertName;
        return this;
    }
    public String getHttpsCertName() {
        return this.httpsCertName;
    }

}
