// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class GetApplyStatusForTryOnRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    public static GetApplyStatusForTryOnRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplyStatusForTryOnRequest self = new GetApplyStatusForTryOnRequest();
        return TeaModel.build(map, self);
    }

    public GetApplyStatusForTryOnRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

}
