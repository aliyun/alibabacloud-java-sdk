// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class PublishArEditProjectRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("MapId")
    public Long mapId;

    public static PublishArEditProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishArEditProjectRequest self = new PublishArEditProjectRequest();
        return TeaModel.build(map, self);
    }

    public PublishArEditProjectRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public PublishArEditProjectRequest setMapId(Long mapId) {
        this.mapId = mapId;
        return this;
    }
    public Long getMapId() {
        return this.mapId;
    }

}
