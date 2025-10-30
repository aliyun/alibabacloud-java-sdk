// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudProtectableCountResponseBody extends TeaModel {
    /**
     * <p>The number of protection nodes that can be added to the hybrid cloud cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProtectableCount")
    public Integer protectableCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6087EA47-C10F-5A0A-A405-DB5B241**B1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHybridCloudProtectableCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudProtectableCountResponseBody self = new DescribeHybridCloudProtectableCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudProtectableCountResponseBody setProtectableCount(Integer protectableCount) {
        this.protectableCount = protectableCount;
        return this;
    }
    public Integer getProtectableCount() {
        return this.protectableCount;
    }

    public DescribeHybridCloudProtectableCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
