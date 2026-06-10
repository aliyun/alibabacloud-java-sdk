// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DeleteAppSupabaseSecretsRequest extends TeaModel {
    /**
     * <p>Business ID</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250801154628000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>JSON list of keys to be deleted</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;key&quot;}</p>
     */
    @NameInMap("KeysJson")
    public String keysJson;

    public static DeleteAppSupabaseSecretsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppSupabaseSecretsRequest self = new DeleteAppSupabaseSecretsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppSupabaseSecretsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DeleteAppSupabaseSecretsRequest setKeysJson(String keysJson) {
        this.keysJson = keysJson;
        return this;
    }
    public String getKeysJson() {
        return this.keysJson;
    }

}
