// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateSecretShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the namespace where the Secret resides. If the namespace is the default namespace, you need to only enter the region ID, such as <code>cn-beijing</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The Secret data.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecretData")
    public String secretDataShrink;

    /**
     * <p>The Secret name. The name can contain digits, letters, and underscores (_). The name must start with a letter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>registry-auth-acree</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>The supported Secret type. Valid values:</p>
     * <ul>
     * <li><strong>kubernetes.io/dockerconfigjson</strong>: the Secret for the username and password of the image repository. The Secret is used for authentication when images are pulled during application deployment.</li>
     * </ul>
     * <p>Valid values:</p>
     * <ul>
     * <li>Opaque</li>
     * <li>kubernetes.io/dockerconfigjson</li>
     * <li>kubernetes.io/tls</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kubernetes.io/dockerconfigjson</p>
     */
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
