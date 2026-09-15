// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAegisContainerPluginRuleRequest extends TeaModel {
    /**
     * <p>The ID of the container anti-escape rule.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListAegisContainerPluginRule~~">ListAegisContainerPluginRule</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>Note: This parameter is required. If you do not specify this parameter, the API returns a parameter validation error (HTTP 400).</p>
     * 
     * <strong>example:</strong>
     * <p>1141****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The language type for the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The rule type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: user-defined</li>
     * <li><strong>1</strong>: system built-in</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    public static GetAegisContainerPluginRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAegisContainerPluginRuleRequest self = new GetAegisContainerPluginRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetAegisContainerPluginRuleRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetAegisContainerPluginRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetAegisContainerPluginRuleRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

}
