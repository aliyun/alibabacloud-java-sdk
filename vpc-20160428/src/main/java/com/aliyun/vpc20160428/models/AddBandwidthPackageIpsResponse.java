// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddBandwidthPackageIpsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddBandwidthPackageIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBandwidthPackageIpsResponse self = new AddBandwidthPackageIpsResponse();
        return TeaModel.build(map, self);
    }

    public AddBandwidthPackageIpsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
