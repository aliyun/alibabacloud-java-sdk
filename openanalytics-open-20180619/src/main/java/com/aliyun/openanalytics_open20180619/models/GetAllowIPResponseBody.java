// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetAllowIPResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AllowIP")
    public String allowIP;

    @NameInMap("RegionId")
    public String regionId;

    public static GetAllowIPResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAllowIPResponseBody self = new GetAllowIPResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAllowIPResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAllowIPResponseBody setAllowIP(String allowIP) {
        this.allowIP = allowIP;
        return this;
    }
    public String getAllowIP() {
        return this.allowIP;
    }

    public GetAllowIPResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
