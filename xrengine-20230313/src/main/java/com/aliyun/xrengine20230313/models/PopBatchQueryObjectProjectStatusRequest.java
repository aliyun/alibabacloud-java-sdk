// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopBatchQueryObjectProjectStatusRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("ProjectIds")
    public String projectIds;

    public static PopBatchQueryObjectProjectStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        PopBatchQueryObjectProjectStatusRequest self = new PopBatchQueryObjectProjectStatusRequest();
        return TeaModel.build(map, self);
    }

    public PopBatchQueryObjectProjectStatusRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public PopBatchQueryObjectProjectStatusRequest setProjectIds(String projectIds) {
        this.projectIds = projectIds;
        return this;
    }
    public String getProjectIds() {
        return this.projectIds;
    }

}
