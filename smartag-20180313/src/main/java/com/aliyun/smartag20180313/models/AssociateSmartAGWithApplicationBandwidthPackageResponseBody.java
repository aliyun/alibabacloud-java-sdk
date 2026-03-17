// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AssociateSmartAGWithApplicationBandwidthPackageResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AFF2FD9D-66BD-4DD4-8152-C4508119D7B1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateSmartAGWithApplicationBandwidthPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateSmartAGWithApplicationBandwidthPackageResponseBody self = new AssociateSmartAGWithApplicationBandwidthPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateSmartAGWithApplicationBandwidthPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
