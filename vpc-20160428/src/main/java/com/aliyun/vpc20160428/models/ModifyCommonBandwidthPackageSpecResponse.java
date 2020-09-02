// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyCommonBandwidthPackageSpecResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyCommonBandwidthPackageSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommonBandwidthPackageSpecResponse self = new ModifyCommonBandwidthPackageSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCommonBandwidthPackageSpecResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
