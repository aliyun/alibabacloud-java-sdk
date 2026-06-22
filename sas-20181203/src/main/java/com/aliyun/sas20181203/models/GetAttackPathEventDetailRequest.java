// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAttackPathEventDetailRequest extends TeaModel {
    /**
     * <p>The event ID.</p>
     * <blockquote>
     * <p>You can call <a href="~~ListAttackPathEvent~~">ListAttackPathEvent</a> to query event IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("EventId")
    public Long eventId;

    /**
     * <p>The data source. Default value: <strong>default</strong>. Valid values:</p>
     * <ul>
     * <li><strong>caasm</strong>: attack surface</li>
     * <li><strong>default</strong>: attack path.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("EventSource")
    public String eventSource;

    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
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
