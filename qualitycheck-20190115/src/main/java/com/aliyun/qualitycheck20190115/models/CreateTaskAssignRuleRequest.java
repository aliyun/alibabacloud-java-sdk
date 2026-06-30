// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateTaskAssignRuleRequest extends TeaModel {
    /**
     * <p>Workspace ID.</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>A complete JSON string. For details, see the parameter descriptions below.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;callType&quot;:&quot;0&quot;,&quot;durationMin&quot;:1,&quot;durationMax&quot;:300,&quot;agents&quot;:[{&quot;agentId&quot;:&quot;202526561358712105&quot;,&quot;agentName&quot;:&quot;agent&quot;}],&quot;rules&quot;:[{&quot;rid&quot;:15659}],&quot;reviewers&quot;:[{&quot;reviewerId&quot;:&quot;255746168704895558&quot;,&quot;reviewerName&quot;:&quot;0917质检员&quot;},{&quot;reviewerId&quot;:&quot;268370362815185444&quot;,&quot;reviewerName&quot;:&quot;0710质检员&quot;}],&quot;skillGroups&quot;:[{&quot;skillName&quot;:&quot;客服组&quot;}],&quot;priority&quot;:5}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static CreateTaskAssignRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskAssignRuleRequest self = new CreateTaskAssignRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskAssignRuleRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public CreateTaskAssignRuleRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
