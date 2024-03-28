// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeResourceRegionIdResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The region IDs.</p>
     */
    @NameInMap("ResourceRegionIds")
    public java.util.List<String> resourceRegionIds;

    public static DescribeResourceRegionIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceRegionIdResponseBody self = new DescribeResourceRegionIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceRegionIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceRegionIdResponseBody setResourceRegionIds(java.util.List<String> resourceRegionIds) {
        this.resourceRegionIds = resourceRegionIds;
        return this;
    }
    public java.util.List<String> getResourceRegionIds() {
        return this.resourceRegionIds;
    }

}
