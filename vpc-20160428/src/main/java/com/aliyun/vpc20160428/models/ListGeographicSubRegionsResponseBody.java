// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListGeographicSubRegionsResponseBody extends TeaModel {
    /**
     * <p>The number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>The region list.</p>
     */
    @NameInMap("GeographicSubRegions")
    public java.util.List<String> geographicSubRegions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
     */
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
