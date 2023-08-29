// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class TrustEventsRequest extends TeaModel {
    @NameInMap("EventUuids")
    public String eventUuids;

    @NameInMap("HandleStyle")
    public Integer handleStyle;

    public static TrustEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        TrustEventsRequest self = new TrustEventsRequest();
        return TeaModel.build(map, self);
    }

    public TrustEventsRequest setEventUuids(String eventUuids) {
        this.eventUuids = eventUuids;
        return this;
    }
    public String getEventUuids() {
        return this.eventUuids;
    }

    public TrustEventsRequest setHandleStyle(Integer handleStyle) {
        this.handleStyle = handleStyle;
        return this;
    }
    public Integer getHandleStyle() {
        return this.handleStyle;
    }

}
