// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeSecretRequest extends TeaModel {
    /**
     * <p>The ID of the namespace to which the Secret instance belongs. If the namespace is the default namespace, specify only the RegionId, such as <code>cn-beijing</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>Instance ID of the Secret instance to query. You can call the <a href="https://help.aliyun.com/document_detail/466929.html">ListSecrets</a> operation to obtain instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
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
