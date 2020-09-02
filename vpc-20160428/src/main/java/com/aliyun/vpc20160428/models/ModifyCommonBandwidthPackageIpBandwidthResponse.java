// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyCommonBandwidthPackageIpBandwidthResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyCommonBandwidthPackageIpBandwidthResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommonBandwidthPackageIpBandwidthResponse self = new ModifyCommonBandwidthPackageIpBandwidthResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCommonBandwidthPackageIpBandwidthResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
