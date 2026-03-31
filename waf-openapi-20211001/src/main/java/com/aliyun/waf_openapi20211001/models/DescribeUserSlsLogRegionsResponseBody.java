// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserSlsLogRegionsResponseBody extends TeaModel {
    /**
     * <p>The region IDs.</p>
     */
    @NameInMap("LogRegions")
    public java.util.List<String> logRegions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9D11AC3A-A10C-56E7-A342-E87EC892****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserSlsLogRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserSlsLogRegionsResponseBody self = new DescribeUserSlsLogRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserSlsLogRegionsResponseBody setLogRegions(java.util.List<String> logRegions) {
        this.logRegions = logRegions;
        return this;
    }
    public java.util.List<String> getLogRegions() {
        return this.logRegions;
    }

    public DescribeUserSlsLogRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
