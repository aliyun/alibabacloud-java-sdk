// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleUnknownThreatDetectEventRequest extends TeaModel {
    @NameInMap("EventIdList")
    public java.util.List<String> eventIdList;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static HandleUnknownThreatDetectEventRequest build(java.util.Map<String, ?> map) throws Exception {
        HandleUnknownThreatDetectEventRequest self = new HandleUnknownThreatDetectEventRequest();
        return TeaModel.build(map, self);
    }

    public HandleUnknownThreatDetectEventRequest setEventIdList(java.util.List<String> eventIdList) {
        this.eventIdList = eventIdList;
        return this;
    }
    public java.util.List<String> getEventIdList() {
        return this.eventIdList;
    }

    public HandleUnknownThreatDetectEventRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
