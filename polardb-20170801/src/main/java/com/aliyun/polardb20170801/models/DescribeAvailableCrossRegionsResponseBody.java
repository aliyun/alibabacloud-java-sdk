// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAvailableCrossRegionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[\&quot;cn-beijing\&quot;, \&quot;cn-shanghai\&quot;, \&quot;cn-qingdao\&quot;, \&quot;cn-shenzhen\&quot;, \&quot;cn-hongkong\&quot;]</p>
     */
    @NameInMap("Regions")
    public java.util.List<String> regions;

    /**
     * <strong>example:</strong>
     * <p>D685D479-B36E-52B9-98FF-8402EA01F***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAvailableCrossRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableCrossRegionsResponseBody self = new DescribeAvailableCrossRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableCrossRegionsResponseBody setRegions(java.util.List<String> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<String> getRegions() {
        return this.regions;
    }

    public DescribeAvailableCrossRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
