// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetEndPointRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("EndPointID")
    @Validation(required = true)
    public String endPointID;

    public static GetEndPointRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEndPointRequest self = new GetEndPointRequest();
        return TeaModel.build(map, self);
    }

    public GetEndPointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetEndPointRequest setEndPointID(String endPointID) {
        this.endPointID = endPointID;
        return this;
    }
    public String getEndPointID() {
        return this.endPointID;
    }

}
