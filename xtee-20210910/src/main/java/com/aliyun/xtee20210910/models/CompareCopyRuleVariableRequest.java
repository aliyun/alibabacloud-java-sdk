// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CompareCopyRuleVariableRequest extends TeaModel {
    /**
     * <p>Creation type</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("CreateType")
    public String createType;

    /**
     * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values: </p>
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
     * <p>Region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <p>Original policy ruleId.</p>
     * 
     * <strong>example:</strong>
     * <p>102125</p>
     */
    @NameInMap("SourceRuleId")
    public String sourceRuleId;

    /**
     * <p>Original policy ruleIds.</p>
     * 
     * <strong>example:</strong>
     * <p>102125,102129</p>
     */
    @NameInMap("SourceRuleIds")
    public String sourceRuleIds;

    /**
     * <p>Target event eventCode.</p>
     * 
     * <strong>example:</strong>
     * <p>de_ajtshf1581</p>
     */
    @NameInMap("TargetEventCode")
    public String targetEventCode;

    public static CompareCopyRuleVariableRequest build(java.util.Map<String, ?> map) throws Exception {
        CompareCopyRuleVariableRequest self = new CompareCopyRuleVariableRequest();
        return TeaModel.build(map, self);
    }

    public CompareCopyRuleVariableRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public CompareCopyRuleVariableRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CompareCopyRuleVariableRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CompareCopyRuleVariableRequest setSourceRuleId(String sourceRuleId) {
        this.sourceRuleId = sourceRuleId;
        return this;
    }
    public String getSourceRuleId() {
        return this.sourceRuleId;
    }

    public CompareCopyRuleVariableRequest setSourceRuleIds(String sourceRuleIds) {
        this.sourceRuleIds = sourceRuleIds;
        return this;
    }
    public String getSourceRuleIds() {
        return this.sourceRuleIds;
    }

    public CompareCopyRuleVariableRequest setTargetEventCode(String targetEventCode) {
        this.targetEventCode = targetEventCode;
        return this;
    }
    public String getTargetEventCode() {
        return this.targetEventCode;
    }

}
