// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListGeographicSubRegionsResponseBody extends TeaModel {
    @NameInMap("Count")
    public Long count;

    @NameInMap("GeographicSubRegions")
    public java.util.List<String> geographicSubRegions;

    @NameInMap("RequestId")
    public String requestId;

    public static ListGeographicSubRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGeographicSubRegionsResponseBody self = new ListGeographicSubRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGeographicSubRegionsResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListGeographicSubRegionsResponseBody setGeographicSubRegions(java.util.List<String> geographicSubRegions) {
        this.geographicSubRegions = geographicSubRegions;
        return this;
    }
    public java.util.List<String> getGeographicSubRegions() {
        return this.geographicSubRegions;
    }

    public ListGeographicSubRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
