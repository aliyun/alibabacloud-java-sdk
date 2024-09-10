// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetObjectScanEventRequest extends TeaModel {
    /**
     * <p>The ID of the alert event.</p>
     * 
     * <strong>example:</strong>
     * <p>81****</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The language of the content in the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static GetObjectScanEventRequest build(java.util.Map<String, ?> map) throws Exception {
        GetObjectScanEventRequest self = new GetObjectScanEventRequest();
        return TeaModel.build(map, self);
    }

    public GetObjectScanEventRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public GetObjectScanEventRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
