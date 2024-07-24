// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AssignReviewerRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;assignmentList&quot;:[{&quot;taskId&quot;:&quot;1C21CF1E-2917-4236-A046-20E37B293B69&quot;,&quot;fileId&quot;:&quot;7981b466fd6a4c70a7065da159739a5b&quot;},{&quot;taskId&quot;:&quot;0111DDBC-5F10-47E0-B7D4-7175F47D626F&quot;,&quot;fileId&quot;:&quot;1814eeae3cff41e989e31ab547f07561&quot;}],&quot;assignments&quot;:[{&quot;reviewer&quot;:&quot;255746168704895558&quot;},{&quot;reviewer&quot;:&quot;268370362815185444&quot;}]}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static AssignReviewerRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignReviewerRequest self = new AssignReviewerRequest();
        return TeaModel.build(map, self);
    }

    public AssignReviewerRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public AssignReviewerRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
