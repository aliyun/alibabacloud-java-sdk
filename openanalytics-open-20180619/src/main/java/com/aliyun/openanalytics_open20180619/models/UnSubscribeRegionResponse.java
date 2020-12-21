// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class UnSubscribeRegionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static UnSubscribeRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        UnSubscribeRegionResponse self = new UnSubscribeRegionResponse();
        return TeaModel.build(map, self);
    }

    public UnSubscribeRegionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnSubscribeRegionResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
