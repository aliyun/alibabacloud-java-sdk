// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetAllowIPResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("AllowIP")
    @Validation(required = true)
    public String allowIP;

    public static GetAllowIPResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllowIPResponse self = new GetAllowIPResponse();
        return TeaModel.build(map, self);
    }

    public GetAllowIPResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAllowIPResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetAllowIPResponse setAllowIP(String allowIP) {
        this.allowIP = allowIP;
        return this;
    }
    public String getAllowIP() {
        return this.allowIP;
    }

}
