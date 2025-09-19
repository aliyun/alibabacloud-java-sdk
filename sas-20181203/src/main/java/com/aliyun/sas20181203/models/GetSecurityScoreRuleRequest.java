// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSecurityScoreRuleRequest extends TeaModel {
    /**
     * <p>The old or new version of the security score rule. If you set this parameter to <strong>home_security_score</strong>, the new version of the security score rule is returned. Otherwise, the old version of the security score rule is returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>home_security_score</p>
     */
    @NameInMap("CalType")
    public String calType;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
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
