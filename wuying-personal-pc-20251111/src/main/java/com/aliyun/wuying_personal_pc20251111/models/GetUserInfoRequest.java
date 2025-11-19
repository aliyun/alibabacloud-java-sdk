// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class GetUserInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    public static GetUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserInfoRequest self = new GetUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetUserInfoRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

}
