// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateAsrVocabRequest extends TeaModel {
    /**
     * <p>Workspace ID</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>Full JSON string. See the details below.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;热词名称&quot;}</p>
     */
    @NameInMap("JsonStr")
    public String jsonStr;

    public static CreateAsrVocabRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAsrVocabRequest self = new CreateAsrVocabRequest();
        return TeaModel.build(map, self);
    }

    public CreateAsrVocabRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public CreateAsrVocabRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
