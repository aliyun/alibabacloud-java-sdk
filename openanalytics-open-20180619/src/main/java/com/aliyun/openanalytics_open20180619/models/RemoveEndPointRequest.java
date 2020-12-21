// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class RemoveEndPointRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("EndPointID")
    @Validation(required = true)
    public String endPointID;

    public static RemoveEndPointRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveEndPointRequest self = new RemoveEndPointRequest();
        return TeaModel.build(map, self);
    }

    public RemoveEndPointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveEndPointRequest setEndPointID(String endPointID) {
        this.endPointID = endPointID;
        return this;
    }
    public String getEndPointID() {
        return this.endPointID;
    }

}
