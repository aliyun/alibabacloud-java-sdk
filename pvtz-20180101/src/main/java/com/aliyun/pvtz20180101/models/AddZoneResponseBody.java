// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddZoneResponseBody extends TeaModel {
    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>54F10A2A-C3CF-59D4-810F-F18DDD93FE20</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The unique ID of the zone.</p>
     * 
     * <strong>example:</strong>
     * <p>6fc186295683a131f63bb8b0cddc****</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The name of the zone.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
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
