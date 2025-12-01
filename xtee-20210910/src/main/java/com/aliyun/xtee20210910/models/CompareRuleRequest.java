// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CompareRuleRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values:</p>
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
     * <p>Primary key ID of the previous policy version.</p>
     * 
     * <strong>example:</strong>
     * <p>11518</p>
     */
    @NameInMap("previousRuleVersionId")
    public Long previousRuleVersionId;

    /**
     * <p>Region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Primary key ID of the policy version.</p>
     * 
     * <strong>example:</strong>
     * <p>11519</p>
     */
    @NameInMap("ruleVersionId")
    public Long ruleVersionId;

    public static CompareRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CompareRuleRequest self = new CompareRuleRequest();
        return TeaModel.build(map, self);
    }

    public CompareRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CompareRuleRequest setPreviousRuleVersionId(Long previousRuleVersionId) {
        this.previousRuleVersionId = previousRuleVersionId;
        return this;
    }
    public Long getPreviousRuleVersionId() {
        return this.previousRuleVersionId;
    }

    public CompareRuleRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CompareRuleRequest setRuleVersionId(Long ruleVersionId) {
        this.ruleVersionId = ruleVersionId;
        return this;
    }
    public Long getRuleVersionId() {
        return this.ruleVersionId;
    }

}
