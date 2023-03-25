// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniSupportRegionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array consisting of the region that is supported by anti-ransomware for databases.</p>
     */
    @NameInMap("UniSupportRegion")
    public java.util.List<String> uniSupportRegion;

    public static DescribeUniSupportRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUniSupportRegionResponseBody self = new DescribeUniSupportRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUniSupportRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUniSupportRegionResponseBody setUniSupportRegion(java.util.List<String> uniSupportRegion) {
        this.uniSupportRegion = uniSupportRegion;
        return this;
    }
    public java.util.List<String> getUniSupportRegion() {
        return this.uniSupportRegion;
    }

}
