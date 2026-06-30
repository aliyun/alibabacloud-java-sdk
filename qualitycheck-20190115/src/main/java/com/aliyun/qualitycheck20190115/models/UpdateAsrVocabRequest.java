// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateAsrVocabRequest extends TeaModel {
    /**
     * <p>The ID of the workspace.</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>The request parameters that are configured as a JSON string. For more information, see the details below.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;vocabId&quot;:&quot;指定热词Id&quot;}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UpdateAsrVocabRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAsrVocabRequest self = new UpdateAsrVocabRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAsrVocabRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public UpdateAsrVocabRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
