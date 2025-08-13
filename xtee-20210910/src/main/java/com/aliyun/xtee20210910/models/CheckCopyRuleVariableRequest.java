// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CheckCopyRuleVariableRequest extends TeaModel {
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
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <p>Source policy ID</p>
     * 
     * <strong>example:</strong>
     * <p>102125</p>
     */
    @NameInMap("SourceRuleId")
    public String sourceRuleId;

    /**
     * <p>Source policy IDs</p>
     * 
     * <strong>example:</strong>
     * <p>02125,102129</p>
     */
    @NameInMap("SourceRuleIds")
    public String sourceRuleIds;

    /**
     * <p>Target event</p>
     * 
     * <strong>example:</strong>
     * <p>de_ajtshf1581</p>
     */
    @NameInMap("TargetEventCode")
    public String targetEventCode;

    public static CheckCopyRuleVariableRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckCopyRuleVariableRequest self = new CheckCopyRuleVariableRequest();
        return TeaModel.build(map, self);
    }

    public CheckCopyRuleVariableRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public CheckCopyRuleVariableRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CheckCopyRuleVariableRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CheckCopyRuleVariableRequest setSourceRuleId(String sourceRuleId) {
        this.sourceRuleId = sourceRuleId;
        return this;
    }
    public String getSourceRuleId() {
        return this.sourceRuleId;
    }

    public CheckCopyRuleVariableRequest setSourceRuleIds(String sourceRuleIds) {
        this.sourceRuleIds = sourceRuleIds;
        return this;
    }
    public String getSourceRuleIds() {
        return this.sourceRuleIds;
    }

    public CheckCopyRuleVariableRequest setTargetEventCode(String targetEventCode) {
        this.targetEventCode = targetEventCode;
        return this;
    }
    public String getTargetEventCode() {
        return this.targetEventCode;
    }

}
