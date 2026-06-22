// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleUnknownThreatDetectEventRequest extends TeaModel {
    /**
     * <p>The list of event IDs.</p>
     */
    @NameInMap("EventIdList")
    public java.util.List<String> eventIdList;

    /**
     * <p>The event handling status. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Unhandled.</li>
     * <li><strong>2</strong>: Blocked.</li>
     * <li><strong>3</strong>: Ignored.</li>
     * </ul>
     * 
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
