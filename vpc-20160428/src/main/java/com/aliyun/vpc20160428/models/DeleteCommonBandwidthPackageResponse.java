// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteCommonBandwidthPackageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteCommonBandwidthPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommonBandwidthPackageResponse self = new DeleteCommonBandwidthPackageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCommonBandwidthPackageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
