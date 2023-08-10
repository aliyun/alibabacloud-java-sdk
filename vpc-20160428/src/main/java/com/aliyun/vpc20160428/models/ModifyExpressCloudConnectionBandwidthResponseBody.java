// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyExpressCloudConnectionBandwidthResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyExpressCloudConnectionBandwidthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressCloudConnectionBandwidthResponseBody self = new ModifyExpressCloudConnectionBandwidthResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyExpressCloudConnectionBandwidthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
