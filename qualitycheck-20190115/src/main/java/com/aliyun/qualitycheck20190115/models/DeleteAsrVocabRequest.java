// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteAsrVocabRequest extends TeaModel {
    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>The complete JSON string. For more information, see the following details.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;vocabId&quot;:&quot;Specified hot word ID&quot;}</p>
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
