// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class UpdateVolumeRequest extends TeaModel {
    @NameInMap("body")
    public UpdateVolumeInput body;

    /**
     * <strong>example:</strong>
     * <p>9f5a1fe9-****</p>
     */
    @NameInMap("teamID")
    public String teamID;

    public static UpdateVolumeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVolumeRequest self = new UpdateVolumeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVolumeRequest setBody(UpdateVolumeInput body) {
        this.body = body;
        return this;
    }
    public UpdateVolumeInput getBody() {
        return this.body;
    }

    public UpdateVolumeRequest setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

}
