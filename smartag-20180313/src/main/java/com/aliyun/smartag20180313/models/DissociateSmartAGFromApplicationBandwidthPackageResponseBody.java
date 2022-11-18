// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DissociateSmartAGFromApplicationBandwidthPackageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DissociateSmartAGFromApplicationBandwidthPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DissociateSmartAGFromApplicationBandwidthPackageResponseBody self = new DissociateSmartAGFromApplicationBandwidthPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public DissociateSmartAGFromApplicationBandwidthPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
