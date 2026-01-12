// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class GetArEditCommonMaterialRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    public static GetArEditCommonMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        GetArEditCommonMaterialRequest self = new GetArEditCommonMaterialRequest();
        return TeaModel.build(map, self);
    }

    public GetArEditCommonMaterialRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

}
