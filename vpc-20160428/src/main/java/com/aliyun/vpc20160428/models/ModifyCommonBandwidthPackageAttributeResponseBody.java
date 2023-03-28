// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyCommonBandwidthPackageAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCommonBandwidthPackageAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommonBandwidthPackageAttributeResponseBody self = new ModifyCommonBandwidthPackageAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCommonBandwidthPackageAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
