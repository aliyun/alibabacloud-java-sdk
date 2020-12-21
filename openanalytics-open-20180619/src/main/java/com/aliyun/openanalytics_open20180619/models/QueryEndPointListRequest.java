// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class QueryEndPointListRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static QueryEndPointListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEndPointListRequest self = new QueryEndPointListRequest();
        return TeaModel.build(map, self);
    }

    public QueryEndPointListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
