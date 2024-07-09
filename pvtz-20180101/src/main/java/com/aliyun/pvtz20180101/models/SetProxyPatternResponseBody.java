// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class SetProxyPatternResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C6F1D541-E7A6-447A-A2B5-9F7A20B2A8FB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The global ID of the zone.</p>
     * 
     * <strong>example:</strong>
     * <p>AgIDE0OQ_149</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static SetProxyPatternResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetProxyPatternResponseBody self = new SetProxyPatternResponseBody();
        return TeaModel.build(map, self);
    }

    public SetProxyPatternResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetProxyPatternResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
