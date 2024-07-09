// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DeleteZoneResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E246E023-F2EB-4034-83F7-B13FCF31459C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The global ID of the zone.</p>
     * 
     * <strong>example:</strong>
     * <p>AgIDE1MA_150</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DeleteZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteZoneResponseBody self = new DeleteZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteZoneResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
