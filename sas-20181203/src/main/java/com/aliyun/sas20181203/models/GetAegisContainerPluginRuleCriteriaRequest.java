// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAegisContainerPluginRuleCriteriaRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The value of the search condition.</p>
     * 
     * <strong>example:</strong>
     * <p>ss</p>
     */
    @NameInMap("Value")
    public String value;

    public static GetAegisContainerPluginRuleCriteriaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAegisContainerPluginRuleCriteriaRequest self = new GetAegisContainerPluginRuleCriteriaRequest();
        return TeaModel.build(map, self);
    }

    public GetAegisContainerPluginRuleCriteriaRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetAegisContainerPluginRuleCriteriaRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
