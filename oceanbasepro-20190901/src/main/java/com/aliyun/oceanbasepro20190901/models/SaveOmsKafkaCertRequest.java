// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class SaveOmsKafkaCertRequest extends TeaModel {
    @NameInMap("CertificationDate")
    public String certificationDate;

    @NameInMap("CertificationType")
    public String certificationType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("InstanceType")
    public String instanceType;

    public static SaveOmsKafkaCertRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveOmsKafkaCertRequest self = new SaveOmsKafkaCertRequest();
        return TeaModel.build(map, self);
    }

    public SaveOmsKafkaCertRequest setCertificationDate(String certificationDate) {
        this.certificationDate = certificationDate;
        return this;
    }
    public String getCertificationDate() {
        return this.certificationDate;
    }

    public SaveOmsKafkaCertRequest setCertificationType(String certificationType) {
        this.certificationType = certificationType;
        return this;
    }
    public String getCertificationType() {
        return this.certificationType;
    }

    public SaveOmsKafkaCertRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SaveOmsKafkaCertRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public SaveOmsKafkaCertRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}
