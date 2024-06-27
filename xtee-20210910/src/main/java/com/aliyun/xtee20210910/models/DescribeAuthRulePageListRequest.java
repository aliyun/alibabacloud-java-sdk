// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAuthRulePageListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("regId")
    public String regId;

    @NameInMap("ruleName")
    public String ruleName;

    @NameInMap("status")
    public String status;

    public static DescribeAuthRulePageListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuthRulePageListRequest self = new DescribeAuthRulePageListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAuthRulePageListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAuthRulePageListRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public DescribeAuthRulePageListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeAuthRulePageListRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DescribeAuthRulePageListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
