// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudSupportRegionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>256959D5-3B45-54CD-A66D-F75F11E8E754</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SupportRegions")
    public java.util.List<String> supportRegions;

    public static DescribeHybridCloudSupportRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudSupportRegionsResponseBody self = new DescribeHybridCloudSupportRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudSupportRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHybridCloudSupportRegionsResponseBody setSupportRegions(java.util.List<String> supportRegions) {
        this.supportRegions = supportRegions;
        return this;
    }
    public java.util.List<String> getSupportRegions() {
        return this.supportRegions;
    }

}
