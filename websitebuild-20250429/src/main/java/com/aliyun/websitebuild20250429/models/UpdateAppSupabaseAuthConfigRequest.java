// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateAppSupabaseAuthConfigRequest extends TeaModel {
    /**
     * <p>Business ID</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>Configuration JSON</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("ConfigsJson")
    public String configsJson;

    public static UpdateAppSupabaseAuthConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppSupabaseAuthConfigRequest self = new UpdateAppSupabaseAuthConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppSupabaseAuthConfigRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateAppSupabaseAuthConfigRequest setConfigsJson(String configsJson) {
        this.configsJson = configsJson;
        return this;
    }
    public String getConfigsJson() {
        return this.configsJson;
    }

}
