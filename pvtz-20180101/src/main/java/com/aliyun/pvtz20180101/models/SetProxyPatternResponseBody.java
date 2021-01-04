// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class SetProxyPatternResponseBody extends TeaModel {
    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("RequestId")
    public String requestId;

    public static SetProxyPatternResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetProxyPatternResponseBody self = new SetProxyPatternResponseBody();
        return TeaModel.build(map, self);
    }

    public SetProxyPatternResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public SetProxyPatternResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
