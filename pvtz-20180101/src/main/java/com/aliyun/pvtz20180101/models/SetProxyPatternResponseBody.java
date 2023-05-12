// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class SetProxyPatternResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
