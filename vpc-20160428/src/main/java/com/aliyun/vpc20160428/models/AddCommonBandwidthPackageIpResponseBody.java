// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddCommonBandwidthPackageIpResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddCommonBandwidthPackageIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCommonBandwidthPackageIpResponseBody self = new AddCommonBandwidthPackageIpResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCommonBandwidthPackageIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
