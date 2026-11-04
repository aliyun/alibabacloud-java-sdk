// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeletePolarClawSkillResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CD3FA5F3-FAF3-44CA-AFFF-BAF869******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>polarclawhub</p>
     */
    @NameInMap("SkillName")
    public String skillName;

    public static DeletePolarClawSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePolarClawSkillResponseBody self = new DeletePolarClawSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePolarClawSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeletePolarClawSkillResponseBody setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

}
