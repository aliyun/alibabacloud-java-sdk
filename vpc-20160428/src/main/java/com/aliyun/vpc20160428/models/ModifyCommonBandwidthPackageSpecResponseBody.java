// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyCommonBandwidthPackageSpecResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCommonBandwidthPackageSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommonBandwidthPackageSpecResponseBody self = new ModifyCommonBandwidthPackageSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCommonBandwidthPackageSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
