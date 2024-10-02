// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nonstandardopen20240922.models;

import com.aliyun.tea.*;

public class GetTokenRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("appKey")
    public String appKey;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("appSecret")
    public String appSecret;

    public static GetTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTokenRequest self = new GetTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetTokenRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public GetTokenRequest setAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public String getAppSecret() {
        return this.appSecret;
    }

}
