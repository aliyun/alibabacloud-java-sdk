// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteAsrVocabRequest extends TeaModel {
    /**
     * <p>BaseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>A complete JSON string. For details, see the table below.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;vocabId&quot;:&quot;指定热词Id&quot;}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static DeleteAsrVocabRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAsrVocabRequest self = new DeleteAsrVocabRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAsrVocabRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public DeleteAsrVocabRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
