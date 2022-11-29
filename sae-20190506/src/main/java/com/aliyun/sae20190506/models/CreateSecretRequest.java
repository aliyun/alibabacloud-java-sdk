// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateSecretRequest extends TeaModel {
    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("SecretData")
    public String secretData;

    @NameInMap("SecretName")
    public String secretName;

    @NameInMap("SecretType")
    public String secretType;

    public static CreateSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecretRequest self = new CreateSecretRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecretRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreateSecretRequest setSecretData(String secretData) {
        this.secretData = secretData;
        return this;
    }
    public String getSecretData() {
        return this.secretData;
    }

    public CreateSecretRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public CreateSecretRequest setSecretType(String secretType) {
        this.secretType = secretType;
        return this;
    }
    public String getSecretType() {
        return this.secretType;
    }

}
