// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSupportRuleListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    @NameInMap("regId")
    public String regId;

    public static DescribeSupportRuleListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportRuleListRequest self = new DescribeSupportRuleListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSupportRuleListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSupportRuleListRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public DescribeSupportRuleListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
