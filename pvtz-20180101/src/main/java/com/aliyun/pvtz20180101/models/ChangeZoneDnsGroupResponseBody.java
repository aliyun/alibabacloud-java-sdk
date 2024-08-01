// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class ChangeZoneDnsGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C6F1D541-E7A6-447A-A2B5-9F7A20B2A8FB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>e0cff188756b1d4579b25e54b66cb830</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static ChangeZoneDnsGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeZoneDnsGroupResponseBody self = new ChangeZoneDnsGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeZoneDnsGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeZoneDnsGroupResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
