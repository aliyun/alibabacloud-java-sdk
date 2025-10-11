// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBackupRegionsResponseBody extends TeaModel {
    @NameInMap("Regions")
    public java.util.List<String> regions;

    /**
     * <strong>example:</strong>
     * <p>EB07CFF0-D8A4-5C76-AED7-D00E26FC2***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupRegionsResponseBody self = new DescribeBackupRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupRegionsResponseBody setRegions(java.util.List<String> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<String> getRegions() {
        return this.regions;
    }

    public DescribeBackupRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
