// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateSecretRequest extends TeaModel {
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
    public UpdateSecretRequestSecretData secretData;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("SecretId")
    public Long secretId;

    public static UpdateSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecretRequest self = new UpdateSecretRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSecretRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdateSecretRequest setSecretData(UpdateSecretRequestSecretData secretData) {
        this.secretData = secretData;
        return this;
    }
    public UpdateSecretRequestSecretData getSecretData() {
        return this.secretData;
    }

    public UpdateSecretRequest setSecretId(Long secretId) {
        this.secretId = secretId;
        return this;
    }
    public Long getSecretId() {
        return this.secretId;
    }

    public static class UpdateSecretRequestSecretData extends TeaModel {
        /**
         * <p>The information about the key-value pairs of the Secret. This parameter is required. The following formats are supported:</p>
         * <p>{&quot;Data&quot;:&quot;{&quot;k1&quot;:&quot;v1&quot;, &quot;k2&quot;:&quot;v2&quot;}&quot;}</p>
         * <p>k specifies a key and v specifies a value. For more information, see <a href="https://help.aliyun.com/document_detail/463383.html">Manage a Kubernetes Secret</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;.dockerconfigjson&quot;:&quot;eyJhdXRocyI6eyJyZWdpc3RyeS12cGMuY24tYmVpamluZy5hbGl5dW5jcy5jb20iOnsidXNlcm5hbWUiOiJ1c2VybmFtZSIsInBhc3N3b3JkIjoicGFzc3dvcmQiLCJhdXRoIjoiZFhObGNtNWhiV1U2Y0dGemMzZHZjbVE9In0sInJlZ2lzdHJ5LmNuLWJlaWppbmcuYWxpeXVuY3MuY29tIjp7InVzZXJuYW1lIjoidXNlcm5hbWUiLCJwYXNzd29yZCI6InBhc3N3b3JkIiwiYXV0aCI6ImRYTmxjbTVoYldVNmNHRnpjM2R2Y21RPSJ9fX0=&quot;}</p>
         */
        @NameInMap("SecretData")
        public String secretData;

        public static UpdateSecretRequestSecretData build(java.util.Map<String, ?> map) throws Exception {
            UpdateSecretRequestSecretData self = new UpdateSecretRequestSecretData();
            return TeaModel.build(map, self);
        }

        public UpdateSecretRequestSecretData setSecretData(String secretData) {
            this.secretData = secretData;
            return this;
        }
        public String getSecretData() {
            return this.secretData;
        }

    }

}
