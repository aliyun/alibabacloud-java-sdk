// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListRegionsResponseBody extends TeaModel {
    @NameInMap("Regions")
    public java.util.List<Region> regions;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRegionsResponseBody self = new ListRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRegionsResponseBody setRegions(java.util.List<Region> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<Region> getRegions() {
        return this.regions;
    }

    public ListRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
