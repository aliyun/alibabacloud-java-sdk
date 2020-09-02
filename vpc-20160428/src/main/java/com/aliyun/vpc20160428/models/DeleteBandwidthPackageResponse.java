// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteBandwidthPackageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteBandwidthPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBandwidthPackageResponse self = new DeleteBandwidthPackageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBandwidthPackageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
