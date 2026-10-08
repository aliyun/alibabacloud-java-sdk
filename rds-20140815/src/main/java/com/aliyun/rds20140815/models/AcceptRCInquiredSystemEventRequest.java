// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AcceptRCInquiredSystemEventRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AcceptRCInquiredSystemEventRequest build(java.util.Map<String, ?> map) throws Exception {
        AcceptRCInquiredSystemEventRequest self = new AcceptRCInquiredSystemEventRequest();
        return TeaModel.build(map, self);
    }

    public AcceptRCInquiredSystemEventRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public AcceptRCInquiredSystemEventRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
