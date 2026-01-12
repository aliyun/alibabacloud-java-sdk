// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class GetArEditUgcMaterialRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("MapId")
    public Long mapId;

    public static GetArEditUgcMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        GetArEditUgcMaterialRequest self = new GetArEditUgcMaterialRequest();
        return TeaModel.build(map, self);
    }

    public GetArEditUgcMaterialRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public GetArEditUgcMaterialRequest setMapId(Long mapId) {
        this.mapId = mapId;
        return this;
    }
    public Long getMapId() {
        return this.mapId;
    }

}
