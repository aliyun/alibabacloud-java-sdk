// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreatePolarClawSkillTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EBEAA83D-1734-42E3-85E3-E25F6E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The skill template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pcpg-skill-**************</p>
     */
    @NameInMap("SkillTemplateId")
    public String skillTemplateId;

    public static CreatePolarClawSkillTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePolarClawSkillTemplateResponseBody self = new CreatePolarClawSkillTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePolarClawSkillTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePolarClawSkillTemplateResponseBody setSkillTemplateId(String skillTemplateId) {
        this.skillTemplateId = skillTemplateId;
        return this;
    }
    public String getSkillTemplateId() {
        return this.skillTemplateId;
    }

}
