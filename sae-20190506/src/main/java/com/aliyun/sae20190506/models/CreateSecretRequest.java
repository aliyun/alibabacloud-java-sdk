// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateSecretRequest extends TeaModel {
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
    public CreateSecretRequestSecretData secretData;

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

    public CreateSecretRequest setSecretData(CreateSecretRequestSecretData secretData) {
        this.secretData = secretData;
        return this;
    }
    public CreateSecretRequestSecretData getSecretData() {
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

    public static class CreateSecretRequestSecretData extends TeaModel {
        /**
         * <p>The information about the key-value pairs of the Secret. This parameter is required. The following formats are supported:</p>
         * <p>{&quot;Data&quot;:&quot;{&quot;k1&quot;:&quot;v1&quot;, &quot;k2&quot;:&quot;v2&quot;}&quot;}</p>
         * <p>k specifies a key and v specifies a value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;.dockerconfigjson&quot;:&quot;eyJhdXRocyI6eyJyZWdpc3RyeS12cGMuY24tYmVpamluZy5hbGl5dW5jcy5jb20iOnsidXNlcm5hbWUiOiJ1c2VybmFtZSIsInBhc3N3b3JkIjoicGFzc3dvcmQiLCJhdXRoIjoiZFhObGNtNWhiV1U2Y0dGemMzZHZjbVE9In0sInJlZ2lzdHJ5LmNuLWJlaWppbmcuYWxpeXVuY3MuY29tIjp7InVzZXJuYW1lIjoidXNlcm5hbWUiLCJwYXNzd29yZCI6InBhc3N3b3JkIiwiYXV0aCI6ImRYTmxjbTVoYldVNmNHRnpjM2R2Y21RPSJ9fX0=&quot;}</p>
         */
        @NameInMap("SecretData")
        public String secretData;

        public static CreateSecretRequestSecretData build(java.util.Map<String, ?> map) throws Exception {
            CreateSecretRequestSecretData self = new CreateSecretRequestSecretData();
            return TeaModel.build(map, self);
        }

        public CreateSecretRequestSecretData setSecretData(String secretData) {
            this.secretData = secretData;
            return this;
        }
        public String getSecretData() {
            return this.secretData;
        }

    }

}
