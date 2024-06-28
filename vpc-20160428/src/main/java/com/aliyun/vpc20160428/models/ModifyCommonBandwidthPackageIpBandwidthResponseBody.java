// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyCommonBandwidthPackageIpBandwidthResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>63D187BF-A30A-4DD6-B68D-FF182C96D8A2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCommonBandwidthPackageIpBandwidthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommonBandwidthPackageIpBandwidthResponseBody self = new ModifyCommonBandwidthPackageIpBandwidthResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCommonBandwidthPackageIpBandwidthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
