// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DeleteSkillRequest extends TeaModel {
    /**
     * <p>The unique identifier of the skill.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1fbb6d8b-8845-4e65-871e-48bc6830****</p>
     */
    @NameInMap("SkillId")
    public String skillId;

    public static DeleteSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSkillRequest self = new DeleteSkillRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSkillRequest setSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }
    public String getSkillId() {
        return this.skillId;
    }

}
