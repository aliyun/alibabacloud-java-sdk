// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSensitiveDefineRuleConfigRequest extends TeaModel {
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

    /**
     * <p>The source of the check rules. Valid values:</p>
     * <ul>
     * <li><strong>image</strong>: image.</li>
     * <li><strong>agentless</strong>: agentless detection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("Source")
    public String source;

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

    public GetSensitiveDefineRuleConfigRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
