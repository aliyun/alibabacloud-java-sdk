// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class SetProxyPatternResponseBody extends TeaModel {
    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0417DC19-11A0-5597-8717-2F705DE88925</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The global ID of the zone.</p>
     * 
     * <strong>example:</strong>
     * <p>df2d03865266bd9842306db586d3****</p>
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
