// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddCommonBandwidthPackageIpsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01FDDD49-C4B7-4D2A-A8E5-A93915C450A6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddCommonBandwidthPackageIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCommonBandwidthPackageIpsResponseBody self = new AddCommonBandwidthPackageIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCommonBandwidthPackageIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
