// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateZoneRemarkResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C6F1D541-E7A6-447A-A2B5-9F7A20B2A8FB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AgIDE1MA_149</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static UpdateZoneRemarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateZoneRemarkResponseBody self = new UpdateZoneRemarkResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateZoneRemarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateZoneRemarkResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
