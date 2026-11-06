// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreatePolarClawSkillResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsUpdate")
    public String isUpdate;

    /**
     * <strong>example:</strong>
     * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>polarclawhub</p>
     */
    @NameInMap("SkillName")
    public String skillName;

    public static CreatePolarClawSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePolarClawSkillResponseBody self = new CreatePolarClawSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePolarClawSkillResponseBody setIsUpdate(String isUpdate) {
        this.isUpdate = isUpdate;
        return this;
    }
    public String getIsUpdate() {
        return this.isUpdate;
    }

    public CreatePolarClawSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePolarClawSkillResponseBody setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

}
