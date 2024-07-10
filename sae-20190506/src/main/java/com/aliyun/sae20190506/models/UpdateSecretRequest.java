// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateSecretRequest extends TeaModel {
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
         * <p>This parameter is required.</p>
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
