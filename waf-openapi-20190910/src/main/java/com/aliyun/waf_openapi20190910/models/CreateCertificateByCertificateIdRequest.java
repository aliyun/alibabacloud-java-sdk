// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class CreateCertificateByCertificateIdRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("CertificateId")
    public Long certificateId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateCertificateByCertificateIdRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateByCertificateIdRequest self = new CreateCertificateByCertificateIdRequest();
        return TeaModel.build(map, self);
    }

    public CreateCertificateByCertificateIdRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateCertificateByCertificateIdRequest setCertificateId(Long certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public Long getCertificateId() {
        return this.certificateId;
    }

    public CreateCertificateByCertificateIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
