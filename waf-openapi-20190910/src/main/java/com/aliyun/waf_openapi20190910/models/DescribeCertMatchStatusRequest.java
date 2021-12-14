// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeCertMatchStatusRequest extends TeaModel {
    @NameInMap("Certificate")
    public String certificate;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PrivateKey")
    public String privateKey;

    public static DescribeCertMatchStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertMatchStatusRequest self = new DescribeCertMatchStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCertMatchStatusRequest setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public DescribeCertMatchStatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeCertMatchStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCertMatchStatusRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

}
