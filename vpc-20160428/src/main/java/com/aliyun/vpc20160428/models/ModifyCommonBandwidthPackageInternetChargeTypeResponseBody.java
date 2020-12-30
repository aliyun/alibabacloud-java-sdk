// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyCommonBandwidthPackageInternetChargeTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCommonBandwidthPackageInternetChargeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommonBandwidthPackageInternetChargeTypeResponseBody self = new ModifyCommonBandwidthPackageInternetChargeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCommonBandwidthPackageInternetChargeTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
