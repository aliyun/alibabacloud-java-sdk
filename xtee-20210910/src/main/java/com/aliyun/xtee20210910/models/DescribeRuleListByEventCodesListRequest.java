// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRuleListByEventCodesListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("eventCodes")
    public String eventCodes;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("regId")
    public String regId;

    public static DescribeRuleListByEventCodesListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleListByEventCodesListRequest self = new DescribeRuleListByEventCodesListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRuleListByEventCodesListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRuleListByEventCodesListRequest setEventCodes(String eventCodes) {
        this.eventCodes = eventCodes;
        return this;
    }
    public String getEventCodes() {
        return this.eventCodes;
    }

    public DescribeRuleListByEventCodesListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
