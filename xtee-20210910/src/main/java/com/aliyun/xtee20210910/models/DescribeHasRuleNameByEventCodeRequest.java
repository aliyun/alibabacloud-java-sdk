// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeHasRuleNameByEventCodeRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The event code.</p>
     * 
     * <strong>example:</strong>
     * <p>de_atvmlf7412</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>The ID of the policy to exclude.</p>
     * 
     * <strong>example:</strong>
     * <p>10621</p>
     */
    @NameInMap("excludeRuleId")
    public String excludeRuleId;

    /**
     * <p>The region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>The policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>非常见设备</p>
     */
    @NameInMap("ruleName")
    public String ruleName;

    public static DescribeHasRuleNameByEventCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHasRuleNameByEventCodeRequest self = new DescribeHasRuleNameByEventCodeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHasRuleNameByEventCodeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeHasRuleNameByEventCodeRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public DescribeHasRuleNameByEventCodeRequest setExcludeRuleId(String excludeRuleId) {
        this.excludeRuleId = excludeRuleId;
        return this;
    }
    public String getExcludeRuleId() {
        return this.excludeRuleId;
    }

    public DescribeHasRuleNameByEventCodeRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeHasRuleNameByEventCodeRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
