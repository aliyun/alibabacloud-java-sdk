// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSecurityScoreRuleRequest extends TeaModel {
    /**
     * <p>Specifies whether to query the new or legacy security score rules. If the value is <strong>home_security_score</strong>, the new security score rules are queried. Otherwise, the legacy security score rules are queried by default.</p>
     * 
     * <strong>example:</strong>
     * <p>home_security_score</p>
     */
    @NameInMap("CalType")
    public String calType;

    /**
     * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static GetSecurityScoreRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityScoreRuleRequest self = new GetSecurityScoreRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetSecurityScoreRuleRequest setCalType(String calType) {
        this.calType = calType;
        return this;
    }
    public String getCalType() {
        return this.calType;
    }

    public GetSecurityScoreRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
