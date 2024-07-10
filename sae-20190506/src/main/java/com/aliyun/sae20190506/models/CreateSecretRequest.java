// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateSecretRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecretData")
    public CreateSecretRequestSecretData secretData;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>registry-auth-acree</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
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
         * <p>This parameter is required.</p>
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
