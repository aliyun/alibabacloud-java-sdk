// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeResourceSupportRegionsResponseBody extends TeaModel {
    /**
     * <p>Indicates the request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>58FDF266-3D56-5DE8-91E0-96A26BAB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of region IDs supported by transparent proxy mode.</p>
     */
    @NameInMap("SupportRegions")
    public java.util.List<String> supportRegions;

    public static DescribeResourceSupportRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceSupportRegionsResponseBody self = new DescribeResourceSupportRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceSupportRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceSupportRegionsResponseBody setSupportRegions(java.util.List<String> supportRegions) {
        this.supportRegions = supportRegions;
        return this;
    }
    public java.util.List<String> getSupportRegions() {
        return this.supportRegions;
    }

}
