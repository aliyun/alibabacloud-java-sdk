// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOmsKafkaCertUploadUrlRequest extends TeaModel {
    @NameInMap("CertificationType")
    public String certificationType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    public static CreateOmsKafkaCertUploadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOmsKafkaCertUploadUrlRequest self = new CreateOmsKafkaCertUploadUrlRequest();
        return TeaModel.build(map, self);
    }

    public CreateOmsKafkaCertUploadUrlRequest setCertificationType(String certificationType) {
        this.certificationType = certificationType;
        return this;
    }
    public String getCertificationType() {
        return this.certificationType;
    }

    public CreateOmsKafkaCertUploadUrlRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateOmsKafkaCertUploadUrlRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public CreateOmsKafkaCertUploadUrlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateOmsKafkaCertUploadUrlRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}
