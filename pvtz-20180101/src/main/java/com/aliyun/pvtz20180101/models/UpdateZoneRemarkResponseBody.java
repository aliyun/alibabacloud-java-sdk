// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateZoneRemarkResponseBody extends TeaModel {
    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateZoneRemarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateZoneRemarkResponseBody self = new UpdateZoneRemarkResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateZoneRemarkResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public UpdateZoneRemarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
