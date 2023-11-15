// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopBatchQueryObjectGenerationProjectStatusRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("ProjectIds")
    public String projectIds;

    public static PopBatchQueryObjectGenerationProjectStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        PopBatchQueryObjectGenerationProjectStatusRequest self = new PopBatchQueryObjectGenerationProjectStatusRequest();
        return TeaModel.build(map, self);
    }

    public PopBatchQueryObjectGenerationProjectStatusRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public PopBatchQueryObjectGenerationProjectStatusRequest setProjectIds(String projectIds) {
        this.projectIds = projectIds;
        return this;
    }
    public String getProjectIds() {
        return this.projectIds;
    }

}
