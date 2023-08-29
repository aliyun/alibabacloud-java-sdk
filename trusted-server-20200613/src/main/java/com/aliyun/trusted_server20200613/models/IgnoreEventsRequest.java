// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class IgnoreEventsRequest extends TeaModel {
    @NameInMap("EventUuids")
    public String eventUuids;

    @NameInMap("HandleStyle")
    public Integer handleStyle;

    public static IgnoreEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        IgnoreEventsRequest self = new IgnoreEventsRequest();
        return TeaModel.build(map, self);
    }

    public IgnoreEventsRequest setEventUuids(String eventUuids) {
        this.eventUuids = eventUuids;
        return this;
    }
    public String getEventUuids() {
        return this.eventUuids;
    }

    public IgnoreEventsRequest setHandleStyle(Integer handleStyle) {
        this.handleStyle = handleStyle;
        return this;
    }
    public Integer getHandleStyle() {
        return this.handleStyle;
    }

}
