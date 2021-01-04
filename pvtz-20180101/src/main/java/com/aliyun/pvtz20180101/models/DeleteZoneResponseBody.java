// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DeleteZoneResponseBody extends TeaModel {
    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteZoneResponseBody self = new DeleteZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteZoneResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DeleteZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
