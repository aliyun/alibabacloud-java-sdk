// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ImportTemplateEventRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("eventTemplateIds")
    public String eventTemplateIds;

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
