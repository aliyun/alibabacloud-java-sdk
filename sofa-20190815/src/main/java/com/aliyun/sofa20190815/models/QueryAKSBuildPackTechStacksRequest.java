// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryAKSBuildPackTechStacksRequest extends TeaModel {
    @NameInMap("CafeRegionId")
    public String cafeRegionId;

    public static QueryAKSBuildPackTechStacksRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAKSBuildPackTechStacksRequest self = new QueryAKSBuildPackTechStacksRequest();
        return TeaModel.build(map, self);
    }

    public QueryAKSBuildPackTechStacksRequest setCafeRegionId(String cafeRegionId) {
        this.cafeRegionId = cafeRegionId;
        return this;
    }
    public String getCafeRegionId() {
        return this.cafeRegionId;
    }

}
