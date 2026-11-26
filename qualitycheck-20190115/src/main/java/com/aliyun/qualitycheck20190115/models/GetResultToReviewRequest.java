// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetResultToReviewRequest extends TeaModel {
    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>The complete JSON string. For more information, see the following details.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;taskId&quot;:&quot;Task ID&quot;,&quot;fileId&quot;:&quot;File ID&quot;}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetResultToReviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResultToReviewRequest self = new GetResultToReviewRequest();
        return TeaModel.build(map, self);
    }

    public GetResultToReviewRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public GetResultToReviewRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
