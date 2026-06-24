// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetProjectRequest extends TeaModel {
    @NameInMap("crossRegion")
    public Boolean crossRegion;

    public static GetProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProjectRequest self = new GetProjectRequest();
        return TeaModel.build(map, self);
    }

    public GetProjectRequest setCrossRegion(Boolean crossRegion) {
        this.crossRegion = crossRegion;
        return this;
    }
    public Boolean getCrossRegion() {
        return this.crossRegion;
    }

}
