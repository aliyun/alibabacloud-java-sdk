// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RemoveBandwidthPackageIpsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RemoveBandwidthPackageIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveBandwidthPackageIpsResponse self = new RemoveBandwidthPackageIpsResponse();
        return TeaModel.build(map, self);
    }

    public RemoveBandwidthPackageIpsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
