// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIpv6InternetBandwidthResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D560AF68-4CE8-4A5C-B3FE-469F558094D0</p>
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
