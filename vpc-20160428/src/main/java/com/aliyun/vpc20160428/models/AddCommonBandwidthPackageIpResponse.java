// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddCommonBandwidthPackageIpResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddCommonBandwidthPackageIpResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCommonBandwidthPackageIpResponse self = new AddCommonBandwidthPackageIpResponse();
        return TeaModel.build(map, self);
    }

    public AddCommonBandwidthPackageIpResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
