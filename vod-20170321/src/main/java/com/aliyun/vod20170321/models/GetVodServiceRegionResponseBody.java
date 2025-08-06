// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVodServiceRegionResponseBody extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    public static GetVodServiceRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVodServiceRegionResponseBody self = new GetVodServiceRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVodServiceRegionResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetVodServiceRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
