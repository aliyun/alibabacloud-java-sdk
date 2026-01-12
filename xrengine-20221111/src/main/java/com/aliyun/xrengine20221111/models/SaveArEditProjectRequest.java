// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class SaveArEditProjectRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("MapId")
    public Long mapId;

    public static SaveArEditProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveArEditProjectRequest self = new SaveArEditProjectRequest();
        return TeaModel.build(map, self);
    }

    public SaveArEditProjectRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public SaveArEditProjectRequest setMapId(Long mapId) {
        this.mapId = mapId;
        return this;
    }
    public Long getMapId() {
        return this.mapId;
    }

}
