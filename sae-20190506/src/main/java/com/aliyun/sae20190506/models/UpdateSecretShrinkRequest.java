// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateSecretShrinkRequest extends TeaModel {
    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("SecretData")
    public String secretDataShrink;

    @NameInMap("SecretId")
    public Long secretId;

    public static UpdateSecretShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecretShrinkRequest self = new UpdateSecretShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSecretShrinkRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdateSecretShrinkRequest setSecretDataShrink(String secretDataShrink) {
        this.secretDataShrink = secretDataShrink;
        return this;
    }
    public String getSecretDataShrink() {
        return this.secretDataShrink;
    }

    public UpdateSecretShrinkRequest setSecretId(Long secretId) {
        this.secretId = secretId;
        return this;
    }
    public Long getSecretId() {
        return this.secretId;
    }

}
