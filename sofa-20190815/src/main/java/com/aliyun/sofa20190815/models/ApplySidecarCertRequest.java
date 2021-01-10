// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ApplySidecarCertRequest extends TeaModel {
    @NameInMap("CertCsr")
    public String certCsr;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PublicKey")
    public String publicKey;

    @NameInMap("TenantName")
    public String tenantName;

    public static ApplySidecarCertRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplySidecarCertRequest self = new ApplySidecarCertRequest();
        return TeaModel.build(map, self);
    }

    public ApplySidecarCertRequest setCertCsr(String certCsr) {
        this.certCsr = certCsr;
        return this;
    }
    public String getCertCsr() {
        return this.certCsr;
    }

    public ApplySidecarCertRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ApplySidecarCertRequest setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public ApplySidecarCertRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
