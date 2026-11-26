// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetLabelAnalysisResultRequest extends TeaModel {
    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>The complete JSON string. For details, see the following information.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetLabelAnalysisResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLabelAnalysisResultRequest self = new GetLabelAnalysisResultRequest();
        return TeaModel.build(map, self);
    }

    public GetLabelAnalysisResultRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public GetLabelAnalysisResultRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
