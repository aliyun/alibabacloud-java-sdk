// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSecurityScoreRuleRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static GetSecurityScoreRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityScoreRuleRequest self = new GetSecurityScoreRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetSecurityScoreRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
