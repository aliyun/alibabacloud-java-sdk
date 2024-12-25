// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ReleaseRenderingDataPackageResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5BEF36E7-3838-5B92-BA32-87DBF1425ABC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseRenderingDataPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseRenderingDataPackageResponseBody self = new ReleaseRenderingDataPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseRenderingDataPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
