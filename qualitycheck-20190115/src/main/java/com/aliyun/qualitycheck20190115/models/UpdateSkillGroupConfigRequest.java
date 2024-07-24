// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateSkillGroupConfigRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;skillGroupFrom&quot;:0,&quot;name&quot;:&quot;test&quot;,&quot;qualityCheckType&quot;:0,&quot;rid&quot;:&quot;2493,4098&quot;,&quot;vocabId&quot;:267,&quot;skillGroupList&quot;:[{&quot;skillGroupId&quot;:&quot;090311&quot;,&quot;skillGroupName&quot;:&quot;09031&quot;}],&quot;id&quot;:553}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UpdateSkillGroupConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillGroupConfigRequest self = new UpdateSkillGroupConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSkillGroupConfigRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public UpdateSkillGroupConfigRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
