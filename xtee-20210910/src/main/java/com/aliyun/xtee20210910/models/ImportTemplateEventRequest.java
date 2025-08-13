// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ImportTemplateEventRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The template ID of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>register</p>
     */
    @NameInMap("eventTemplateIds")
    public String eventTemplateIds;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    public static ImportTemplateEventRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportTemplateEventRequest self = new ImportTemplateEventRequest();
        return TeaModel.build(map, self);
    }

    public ImportTemplateEventRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ImportTemplateEventRequest setEventTemplateIds(String eventTemplateIds) {
        this.eventTemplateIds = eventTemplateIds;
        return this;
    }
    public String getEventTemplateIds() {
        return this.eventTemplateIds;
    }

    public ImportTemplateEventRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
