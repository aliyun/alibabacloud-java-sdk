// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetBuildRiskDefineRuleConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static GetBuildRiskDefineRuleConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBuildRiskDefineRuleConfigRequest self = new GetBuildRiskDefineRuleConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetBuildRiskDefineRuleConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
