// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class SwitchInstanceZoneFailOverResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2D9F3768-EDA9-4811-943E-42C8006E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SwitchInstanceZoneFailOverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchInstanceZoneFailOverResponseBody self = new SwitchInstanceZoneFailOverResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchInstanceZoneFailOverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
