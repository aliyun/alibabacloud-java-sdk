// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeepCopyRuleRequest extends TeaModel {
    /**
     * <p>Creation type</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("CreateType")
    public String createType;

    /**
     * <p>Newly added cumulative variable</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;id&quot;:&quot;1288&quot;,&quot;title&quot;:&quot;新标题&quot;}]</p>
     */
    @NameInMap("CustInsertInfo")
    public String custInsertInfo;

    /**
     * <p>Read cumulative variable</p>
     * 
     * <strong>example:</strong>
     * <p>[1234，2345]</p>
     */
    @NameInMap("CustWriteInfo")
    public String custWriteInfo;

    /**
     * <p>Custom variables to be added</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;id&quot;:&quot;ex_2wxZPcxg3a03&quot;,&quot;title&quot;:&quot;新标题&quot;}]</p>
     */
    @NameInMap("ExpressionVariableInfo")
    public String expressionVariableInfo;

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
     * <p>Custom query variables to be added</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;id&quot;:&quot;ex_2wxZPcxg3a03&quot;,&quot;title&quot;:&quot;新标题&quot;}]</p>
     */
    @NameInMap("QueryExpressionVariableInfo")
    public String queryExpressionVariableInfo;

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
     * <p>Target policy ID</p>
     * 
     * <strong>example:</strong>
     * <p>102125,102129</p>
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

    /**
     * <p>Target event name</p>
     * 
     * <strong>example:</strong>
     * <p>目标事件名称</p>
     */
    @NameInMap("TargetEventName")
    public String targetEventName;

    public static DeepCopyRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeepCopyRuleRequest self = new DeepCopyRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeepCopyRuleRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public DeepCopyRuleRequest setCustInsertInfo(String custInsertInfo) {
        this.custInsertInfo = custInsertInfo;
        return this;
    }
    public String getCustInsertInfo() {
        return this.custInsertInfo;
    }

    public DeepCopyRuleRequest setCustWriteInfo(String custWriteInfo) {
        this.custWriteInfo = custWriteInfo;
        return this;
    }
    public String getCustWriteInfo() {
        return this.custWriteInfo;
    }

    public DeepCopyRuleRequest setExpressionVariableInfo(String expressionVariableInfo) {
        this.expressionVariableInfo = expressionVariableInfo;
        return this;
    }
    public String getExpressionVariableInfo() {
        return this.expressionVariableInfo;
    }

    public DeepCopyRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeepCopyRuleRequest setQueryExpressionVariableInfo(String queryExpressionVariableInfo) {
        this.queryExpressionVariableInfo = queryExpressionVariableInfo;
        return this;
    }
    public String getQueryExpressionVariableInfo() {
        return this.queryExpressionVariableInfo;
    }

    public DeepCopyRuleRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DeepCopyRuleRequest setSourceRuleId(String sourceRuleId) {
        this.sourceRuleId = sourceRuleId;
        return this;
    }
    public String getSourceRuleId() {
        return this.sourceRuleId;
    }

    public DeepCopyRuleRequest setSourceRuleIds(String sourceRuleIds) {
        this.sourceRuleIds = sourceRuleIds;
        return this;
    }
    public String getSourceRuleIds() {
        return this.sourceRuleIds;
    }

    public DeepCopyRuleRequest setTargetEventCode(String targetEventCode) {
        this.targetEventCode = targetEventCode;
        return this;
    }
    public String getTargetEventCode() {
        return this.targetEventCode;
    }

    public DeepCopyRuleRequest setTargetEventName(String targetEventName) {
        this.targetEventName = targetEventName;
        return this;
    }
    public String getTargetEventName() {
        return this.targetEventName;
    }

}
