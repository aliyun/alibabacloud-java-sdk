// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetAsrVocabRequest extends TeaModel {
    /**
     * <p>Workspace ID</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>A complete JSON string. For details, see the following information.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;vocabId&quot;:&quot;指定热词Id&quot;}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetAsrVocabRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsrVocabRequest self = new GetAsrVocabRequest();
        return TeaModel.build(map, self);
    }

    public GetAsrVocabRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public GetAsrVocabRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
