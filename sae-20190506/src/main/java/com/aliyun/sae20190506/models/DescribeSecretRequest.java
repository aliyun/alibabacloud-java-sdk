// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeSecretRequest extends TeaModel {
    /**
     * <p>The ID of the namespace in which the Secret instance resides. By default, the namespace ID is the same as the region ID.</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The ID of the Secret instance to be queried. You can call the [ListSecrets](~~466929~~) operation to view the IDs of Secrete instances.</p>
     */
    @NameInMap("SecretId")
    public Long secretId;

    public static DescribeSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecretRequest self = new DescribeSecretRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecretRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public DescribeSecretRequest setSecretId(Long secretId) {
        this.secretId = secretId;
        return this;
    }
    public Long getSecretId() {
        return this.secretId;
    }

}
