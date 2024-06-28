// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIpv6InternetBandwidthResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E07E0FE6-5C21-405F-AF82-7613AA81EF92</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIpv6InternetBandwidthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpv6InternetBandwidthResponseBody self = new DeleteIpv6InternetBandwidthResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIpv6InternetBandwidthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
