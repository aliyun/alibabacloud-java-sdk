// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteTaskAssignRuleRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ruleId&quot;: 24}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static DeleteTaskAssignRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTaskAssignRuleRequest self = new DeleteTaskAssignRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTaskAssignRuleRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public DeleteTaskAssignRuleRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
