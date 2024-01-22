// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateSecretShrinkRequest extends TeaModel {
    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("SecretData")
    public String secretDataShrink;

    @NameInMap("SecretName")
    public String secretName;

    @NameInMap("SecretType")
    public String secretType;

    public static CreateSecretShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecretShrinkRequest self = new CreateSecretShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecretShrinkRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreateSecretShrinkRequest setSecretDataShrink(String secretDataShrink) {
        this.secretDataShrink = secretDataShrink;
        return this;
    }
    public String getSecretDataShrink() {
        return this.secretDataShrink;
    }

    public CreateSecretShrinkRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public CreateSecretShrinkRequest setSecretType(String secretType) {
        this.secretType = secretType;
        return this;
    }
    public String getSecretType() {
        return this.secretType;
    }

}
