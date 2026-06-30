// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateSkillGroupConfigRequest extends TeaModel {
    /**
     * <p>Workspace ID</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>A JSON-formatted string. For details, see the following table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;skillGroupFrom&quot;:0,&quot;qualityCheckType&quot;:0,&quot;modelId&quot;:746,&quot;name&quot;:&quot;test&quot;,&quot;rid&quot;:&quot;2493&quot;,&quot;vocabId&quot;:&quot;267&quot;,&quot;skillGroupList&quot;:[{&quot;skillGroupId&quot;:&quot;0903&quot;,&quot;skillGroupName&quot;:&quot;0903&quot;}]}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static CreateSkillGroupConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillGroupConfigRequest self = new CreateSkillGroupConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateSkillGroupConfigRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public CreateSkillGroupConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
