// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIpv6InternetBandwidthResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyIpv6InternetBandwidthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpv6InternetBandwidthResponseBody self = new ModifyIpv6InternetBandwidthResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIpv6InternetBandwidthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
