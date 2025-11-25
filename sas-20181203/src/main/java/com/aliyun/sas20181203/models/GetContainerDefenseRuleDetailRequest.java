// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetContainerDefenseRuleDetailRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The rule ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2590599.html">ListContainerDefenseRule</a> operation to query the rule ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>156</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    public static GetContainerDefenseRuleDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContainerDefenseRuleDetailRequest self = new GetContainerDefenseRuleDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetContainerDefenseRuleDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetContainerDefenseRuleDetailRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
