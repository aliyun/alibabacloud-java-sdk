// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOrUpdateAutoTagRuleRequest extends TeaModel {
    /**
     * <p>Specifies whether to check the rule on the backend. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CheckAll")
    public Boolean checkAll;

    /**
     * <p>The expression of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;groups&quot;:&quot;0&quot;,&quot;fieldValueType&quot;:&quot;string&quot;,&quot;field&quot;:&quot;internetIp&quot;,&quot;operator&quot;:&quot;equals&quot;,&quot;value&quot;:&quot;12.0.0.1&quot;}]</p>
     */
    @NameInMap("Expression")
    public String expression;

    /**
     * <p>The description of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>describe</p>
     */
    @NameInMap("RuleDesc")
    public String ruleDesc;

    /**
     * <p>The ID of the rule.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListAutoTagRules~~">ListAutoTagRules</a> operation to query the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>300566</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The name of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>text-001</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The tag specified by the operation type of the rule.</p>
     * <ul>
     * <li>If TagType is set to group, set this parameter to {&quot;groupId&quot;:XXX}. XXX specifies the ID of the group. You can call the <a href="~~DescribeGroupStruct~~">DescribeGroupStruct</a> operation to query the ID.</li>
     * <li>If TagType is set to tag, set this parameter to {&quot;tagId&quot;:XXX}. XXX specifies the ID of the tag. You can call the <a href="~~DescribeGroupedTags~~">DescribeGroupedTags</a> operation to query the ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;tagId&quot;:7804789}</p>
     */
    @NameInMap("TagContext")
    public String tagContext;

    /**
     * <p>The operation type of the rule. Valid values:</p>
     * <ul>
     * <li><strong>group</strong></li>
     * <li><strong>tag</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tag</p>
     */
    @NameInMap("TagType")
    public String tagType;

    public static CreateOrUpdateAutoTagRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateAutoTagRuleRequest self = new CreateOrUpdateAutoTagRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateAutoTagRuleRequest setCheckAll(Boolean checkAll) {
        this.checkAll = checkAll;
        return this;
    }
    public Boolean getCheckAll() {
        return this.checkAll;
    }

    public CreateOrUpdateAutoTagRuleRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public CreateOrUpdateAutoTagRuleRequest setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
        return this;
    }
    public String getRuleDesc() {
        return this.ruleDesc;
    }

    public CreateOrUpdateAutoTagRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public CreateOrUpdateAutoTagRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateOrUpdateAutoTagRuleRequest setTagContext(String tagContext) {
        this.tagContext = tagContext;
        return this;
    }
    public String getTagContext() {
        return this.tagContext;
    }

    public CreateOrUpdateAutoTagRuleRequest setTagType(String tagType) {
        this.tagType = tagType;
        return this;
    }
    public String getTagType() {
        return this.tagType;
    }

}
