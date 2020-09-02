// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RemoveCommonBandwidthPackageIpResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RemoveCommonBandwidthPackageIpResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveCommonBandwidthPackageIpResponse self = new RemoveCommonBandwidthPackageIpResponse();
        return TeaModel.build(map, self);
    }

    public RemoveCommonBandwidthPackageIpResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
