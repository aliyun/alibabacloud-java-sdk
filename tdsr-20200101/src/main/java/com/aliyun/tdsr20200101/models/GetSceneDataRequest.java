// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetSceneDataRequest extends TeaModel {
    @NameInMap("Token")
    public String token;

    public static GetSceneDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSceneDataRequest self = new GetSceneDataRequest();
        return TeaModel.build(map, self);
    }

    public GetSceneDataRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
