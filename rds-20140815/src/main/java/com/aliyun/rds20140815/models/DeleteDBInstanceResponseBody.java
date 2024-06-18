// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDBInstanceResponseBody extends TeaModel {
    /**
     * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/26231.html">DescribeDBInstanceAttribute</a> operation to query region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-1</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>65BDA532-28AF-4122-AA39-B382721EEE64</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBInstanceResponseBody self = new DeleteDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDBInstanceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
