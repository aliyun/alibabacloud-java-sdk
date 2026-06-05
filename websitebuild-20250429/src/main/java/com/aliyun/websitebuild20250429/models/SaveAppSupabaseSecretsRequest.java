// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SaveAppSupabaseSecretsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;abc&quot;}</p>
     */
    @NameInMap("SecretsJson")
    public String secretsJson;

    public static SaveAppSupabaseSecretsRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveAppSupabaseSecretsRequest self = new SaveAppSupabaseSecretsRequest();
        return TeaModel.build(map, self);
    }

    public SaveAppSupabaseSecretsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SaveAppSupabaseSecretsRequest setSecretsJson(String secretsJson) {
        this.secretsJson = secretsJson;
        return this;
    }
    public String getSecretsJson() {
        return this.secretsJson;
    }

}
