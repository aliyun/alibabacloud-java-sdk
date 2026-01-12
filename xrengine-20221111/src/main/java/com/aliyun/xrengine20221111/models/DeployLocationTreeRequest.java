// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class DeployLocationTreeRequest extends TeaModel {
    @NameInMap("ForceUpdate")
    public Boolean forceUpdate;

    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("SvcId")
    public Long svcId;

    public static DeployLocationTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployLocationTreeRequest self = new DeployLocationTreeRequest();
        return TeaModel.build(map, self);
    }

    public DeployLocationTreeRequest setForceUpdate(Boolean forceUpdate) {
        this.forceUpdate = forceUpdate;
        return this;
    }
    public Boolean getForceUpdate() {
        return this.forceUpdate;
    }

    public DeployLocationTreeRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public DeployLocationTreeRequest setSvcId(Long svcId) {
        this.svcId = svcId;
        return this;
    }
    public Long getSvcId() {
        return this.svcId;
    }

}
