// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteRuleRequest extends TeaModel {
    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>Specifies whether to delete the rule even if it is associated with a quality check task.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ForceDelete")
    public Boolean forceDelete;

    /**
     * <p>Specifies whether to use the new version of quality check. Valid values: 0: Legacy quality check. 1: New version quality check. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsSchemeData")
    public Integer isSchemeData;

    /**
     * <p>The rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    public static DeleteRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRuleRequest self = new DeleteRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRuleRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public DeleteRuleRequest setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
        return this;
    }
    public Boolean getForceDelete() {
        return this.forceDelete;
    }

    public DeleteRuleRequest setIsSchemeData(Integer isSchemeData) {
        this.isSchemeData = isSchemeData;
        return this;
    }
    public Integer getIsSchemeData() {
        return this.isSchemeData;
    }

    public DeleteRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
