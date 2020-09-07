// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SignEventActionRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("EventId")
    @Validation(required = true)
    public Integer eventId;

    @NameInMap("EventSig")
    @Validation(required = true)
    public String eventSig;

    public static SignEventActionRequest build(java.util.Map<String, ?> map) throws Exception {
        SignEventActionRequest self = new SignEventActionRequest();
        return TeaModel.build(map, self);
    }

    public SignEventActionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SignEventActionRequest setEventId(Integer eventId) {
        this.eventId = eventId;
        return this;
    }
    public Integer getEventId() {
        return this.eventId;
    }

    public SignEventActionRequest setEventSig(String eventSig) {
        this.eventSig = eventSig;
        return this;
    }
    public String getEventSig() {
        return this.eventSig;
    }

}
