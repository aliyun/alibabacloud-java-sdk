// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class GetArEditStsAuthRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("MapId")
    public Long mapId;

    public static GetArEditStsAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        GetArEditStsAuthRequest self = new GetArEditStsAuthRequest();
        return TeaModel.build(map, self);
    }

    public GetArEditStsAuthRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public GetArEditStsAuthRequest setMapId(Long mapId) {
        this.mapId = mapId;
        return this;
    }
    public Long getMapId() {
        return this.mapId;
    }

}
