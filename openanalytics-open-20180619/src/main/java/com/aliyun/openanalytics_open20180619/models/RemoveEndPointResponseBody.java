// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class RemoveEndPointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RegionId")
    public String regionId;

    public static RemoveEndPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveEndPointResponseBody self = new RemoveEndPointResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveEndPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveEndPointResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
