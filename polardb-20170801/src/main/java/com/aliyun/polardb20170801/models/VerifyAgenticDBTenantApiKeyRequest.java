// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class VerifyAgenticDBTenantApiKeyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pagc_key_cGFnYy1icDFh...kX9mP2vL7wQ3</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static VerifyAgenticDBTenantApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyAgenticDBTenantApiKeyRequest self = new VerifyAgenticDBTenantApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public VerifyAgenticDBTenantApiKeyRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public VerifyAgenticDBTenantApiKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
