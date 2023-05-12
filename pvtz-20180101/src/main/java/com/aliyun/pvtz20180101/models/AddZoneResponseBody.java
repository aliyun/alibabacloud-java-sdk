// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddZoneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>zone ID。</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("ZoneName")
    public String zoneName;

    public static AddZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddZoneResponseBody self = new AddZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public AddZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddZoneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddZoneResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public AddZoneResponseBody setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

}
