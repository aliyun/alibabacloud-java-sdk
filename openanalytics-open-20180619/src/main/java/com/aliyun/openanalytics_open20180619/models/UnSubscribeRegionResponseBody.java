// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class UnSubscribeRegionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RegionId")
    public String regionId;

    public static UnSubscribeRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnSubscribeRegionResponseBody self = new UnSubscribeRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public UnSubscribeRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnSubscribeRegionResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
