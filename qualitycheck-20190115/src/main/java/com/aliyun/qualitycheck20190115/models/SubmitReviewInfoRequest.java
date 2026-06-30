// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SubmitReviewInfoRequest extends TeaModel {
    /**
     * <p>Workspace ID</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>The complete JSON string information. See the following details for specific content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;taskId&quot;: &quot;任务ID&quot;,
     *     &quot;vid&quot;: &quot;文件ID&quot;
     * }</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static SubmitReviewInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitReviewInfoRequest self = new SubmitReviewInfoRequest();
        return TeaModel.build(map, self);
    }

    public SubmitReviewInfoRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public SubmitReviewInfoRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
