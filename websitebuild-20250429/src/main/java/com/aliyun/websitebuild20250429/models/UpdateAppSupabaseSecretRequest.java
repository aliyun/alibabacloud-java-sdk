// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateAppSupabaseSecretRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WS20250731233102000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SecretKey")
    public String secretKey;

    /**
     * <strong>example:</strong>
     * <p>277356_pre_auth</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <strong>example:</strong>
     * <p>Opaque</p>
     */
    @NameInMap("SecretType")
    public String secretType;

    /**
     * <strong>example:</strong>
     * <p>1231</p>
     */
    @NameInMap("SecretValue")
    public String secretValue;

    public static UpdateAppSupabaseSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppSupabaseSecretRequest self = new UpdateAppSupabaseSecretRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppSupabaseSecretRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateAppSupabaseSecretRequest setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

    public UpdateAppSupabaseSecretRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public UpdateAppSupabaseSecretRequest setSecretType(String secretType) {
        this.secretType = secretType;
        return this;
    }
    public String getSecretType() {
        return this.secretType;
    }

    public UpdateAppSupabaseSecretRequest setSecretValue(String secretValue) {
        this.secretValue = secretValue;
        return this;
    }
    public String getSecretValue() {
        return this.secretValue;
    }

}
