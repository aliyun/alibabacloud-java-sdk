// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSensitiveDefineRuleConfigRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static GetSensitiveDefineRuleConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSensitiveDefineRuleConfigRequest self = new GetSensitiveDefineRuleConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetSensitiveDefineRuleConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
