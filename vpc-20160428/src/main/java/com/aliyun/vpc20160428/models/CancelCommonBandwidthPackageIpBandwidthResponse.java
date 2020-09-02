// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CancelCommonBandwidthPackageIpBandwidthResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CancelCommonBandwidthPackageIpBandwidthResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelCommonBandwidthPackageIpBandwidthResponse self = new CancelCommonBandwidthPackageIpBandwidthResponse();
        return TeaModel.build(map, self);
    }

    public CancelCommonBandwidthPackageIpBandwidthResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
