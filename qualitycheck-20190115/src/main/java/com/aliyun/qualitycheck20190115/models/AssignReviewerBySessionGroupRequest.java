// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AssignReviewerBySessionGroupRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    @NameInMap("jsonStr")
    public String jsonStr;

    public static AssignReviewerBySessionGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignReviewerBySessionGroupRequest self = new AssignReviewerBySessionGroupRequest();
        return TeaModel.build(map, self);
    }

    public AssignReviewerBySessionGroupRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public AssignReviewerBySessionGroupRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
