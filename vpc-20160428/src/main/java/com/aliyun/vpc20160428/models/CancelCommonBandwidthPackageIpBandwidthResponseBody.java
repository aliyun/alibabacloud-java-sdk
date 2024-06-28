// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CancelCommonBandwidthPackageIpBandwidthResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>63D187BF-A30A-4DD6-B68D-FF182C96D8A2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelCommonBandwidthPackageIpBandwidthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelCommonBandwidthPackageIpBandwidthResponseBody self = new CancelCommonBandwidthPackageIpBandwidthResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelCommonBandwidthPackageIpBandwidthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
