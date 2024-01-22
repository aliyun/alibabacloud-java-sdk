// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteSecretRequest extends TeaModel {
    /**
     * <p>The ID of the namespace in which the Secret resides. By default, the namespace ID is the same as the region ID.</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The ID of the Secret to be deleted. You can call the [ListSecrets](~~466929~~) operation to view the Secret IDs.</p>
     */
    @NameInMap("SecretId")
    public Long secretId;

    public static DeleteSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecretRequest self = new DeleteSecretRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecretRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public DeleteSecretRequest setSecretId(Long secretId) {
        this.secretId = secretId;
        return this;
    }
    public Long getSecretId() {
        return this.secretId;
    }

}
