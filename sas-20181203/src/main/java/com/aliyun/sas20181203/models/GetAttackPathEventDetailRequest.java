// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAttackPathEventDetailRequest extends TeaModel {
    /**
     * <p>Event ID.</p>
     * <blockquote>
     * <p>You can call <a href="~~ListAttackPathEvent~~">ListAttackPathEvent</a> to query the event ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("EventId")
    public Long eventId;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("EventSource")
    public String eventSource;

    /**
     * <p>The language type for request and response, default is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static GetAttackPathEventDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAttackPathEventDetailRequest self = new GetAttackPathEventDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetAttackPathEventDetailRequest setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public GetAttackPathEventDetailRequest setEventSource(String eventSource) {
        this.eventSource = eventSource;
        return this;
    }
    public String getEventSource() {
        return this.eventSource;
    }

    public GetAttackPathEventDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
