// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAIQueryResultRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>16896fa8-37f6-4c70-bb32-67fa9817d426</p>
     */
    @NameInMap("analysisId")
    public String analysisId;

    public static GetAIQueryResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAIQueryResultRequest self = new GetAIQueryResultRequest();
        return TeaModel.build(map, self);
    }

    public GetAIQueryResultRequest setAnalysisId(String analysisId) {
        this.analysisId = analysisId;
        return this;
    }
    public String getAnalysisId() {
        return this.analysisId;
    }

}
